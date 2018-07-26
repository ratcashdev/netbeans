/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.javaee.project.dd.ear;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.templates.support.Templates;
import org.openide.WizardDescriptor;
import org.openide.filesystems.FileObject;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

/**
 * Adopted from {@link org.netbeans.modules.j2ee.ejbcore.ejb.wizard.dd.EjbJarXmlWizardPanel1}.
 * @author Martin Adamek
 */
public class ApplicationXmlWizardPanel1 implements WizardDescriptor.Panel {

    // generated by apisupport wizard

    /**
     * The visual component that displays this panel. If you need to access the
     * component from this class, just use getComponent().
     */
    private final Set<ChangeListener> listeners = new HashSet<ChangeListener>(1);
    private final ApplicationXmlVisualPanel1 component = new ApplicationXmlVisualPanel1();
    private WizardDescriptor wizardDescriptor;
    private Project project;

    public ApplicationXmlWizardPanel1() {
        component.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                fireChangeEvent();
            }
        });
    }

    FileObject getSelectedLocation() {
        return component.getSelectedLocation();
    }

    Project getProject() {
        return project;
    }

    public Component getComponent() {
        return component;
    }

    public HelpCtx getHelp() {
        return HelpCtx.DEFAULT_HELP;
    }

    public boolean isValid() {
        if (component.getSelectedLocation() == null
                || component.getCreatedFile() == null
                || component.getCreatedFile().canRead()) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE, NbBundle.getMessage(ApplicationXmlWizardPanel1.class,"ERR_FileExistsOrNoValidLocation")); //NOI18N
            return false;
        }
        wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE, " "); //NOI18N
        return true;
    }

    public final void addChangeListener(ChangeListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    public final void removeChangeListener(ChangeListener listener) {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }

    protected final void fireChangeEvent() {
        Iterator<ChangeListener> listenersIterator;
        synchronized (listeners) {
            listenersIterator = new HashSet<ChangeListener>(listeners).iterator();
        }
        ChangeEvent changeEvent = new ChangeEvent(this);
        while (listenersIterator.hasNext()) {
            listenersIterator.next().stateChanged(changeEvent);
        }
    }

    public void readSettings(Object settings) {
        wizardDescriptor = (WizardDescriptor) settings;
        if (project == null) {
            project = Templates.getProject(wizardDescriptor);
            component.setProject(project);
        }

        wizardDescriptor.putProperty ("NewFileWizard_Title", // NOI18N
            NbBundle.getMessage(ApplicationXmlWizardPanel1.class, "TITLE_StdDdFile"));
        
    }

    public void storeSettings(Object settings) {}

}

