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
package org.netbeans.modules.php.editor.indent.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;
import org.netbeans.modules.php.editor.indent.FmtOptions;
import org.netbeans.modules.php.editor.indent.FmtOptions.CategorySupport;
import static org.netbeans.modules.php.editor.indent.FmtOptions.CategorySupport.OPTION_ID;

/**
 *
 * @author Ondrej Brejla <obrejla@netbeans.org>
 */
public class FmtUses extends javax.swing.JPanel {

    private static final Logger LOGGER = Logger.getLogger(FmtUses.class.getName());

    public FmtUses() {
        initComponents();
        preferFullyQualifiedNamesCheckBox.putClientProperty(OPTION_ID, FmtOptions.PREFER_FULLY_QUALIFIED_NAMES);
        preferMultipleUseStatementsCombinedCheckBox.putClientProperty(OPTION_ID, FmtOptions.PREFER_MULTIPLE_USE_STATEMENTS_COMBINED);
        preferGroupUsesCheckBox.putClientProperty(OPTION_ID, FmtOptions.PREFER_GROUP_USES);
        startUseWithNamespaceSeparatorCheckBox.putClientProperty(OPTION_ID, FmtOptions.START_USE_WITH_NAMESPACE_SEPARATOR);
        aliasesCapitalsOfNamespacesCheckBox.putClientProperty(OPTION_ID, FmtOptions.ALIASES_CAPITALS_OF_NAMESPACES);
    }

    public static PreferencesCustomizer.Factory getController() {
        String preview = "";
        try {
            preview = Utils.loadPreviewText(FmtUses.class.getClassLoader().getResourceAsStream("org/netbeans/modules/php/editor/indent/ui/Uses.php"));
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, null, ex);
        }
        return new CategorySupport.Factory("uses", FmtUses.class, preview);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preferFullyQualifiedNamesCheckBox = new javax.swing.JCheckBox();
        preferMultipleUseStatementsCombinedCheckBox = new javax.swing.JCheckBox();
        preferGroupUsesCheckBox = new javax.swing.JCheckBox();
        startUseWithNamespaceSeparatorCheckBox = new javax.swing.JCheckBox();
        aliasesCapitalsOfNamespacesCheckBox = new javax.swing.JCheckBox();

        setName(org.openide.util.NbBundle.getMessage(FmtUses.class, "LBL_Uses")); // NOI18N
        setOpaque(false);

        preferFullyQualifiedNamesCheckBox.setMnemonic('F');
        org.openide.awt.Mnemonics.setLocalizedText(preferFullyQualifiedNamesCheckBox, org.openide.util.NbBundle.getMessage(FmtUses.class, "FmtUses.preferFullyQualifiedNamesCheckBox.text")); // NOI18N

        preferMultipleUseStatementsCombinedCheckBox.setMnemonic('M');
        org.openide.awt.Mnemonics.setLocalizedText(preferMultipleUseStatementsCombinedCheckBox, org.openide.util.NbBundle.getMessage(FmtUses.class, "FmtUses.preferMultipleUseStatementsCombinedCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(preferGroupUsesCheckBox, org.openide.util.NbBundle.getMessage(FmtUses.class, "FmtUses.preferGroupUsesCheckBox.text")); // NOI18N

        startUseWithNamespaceSeparatorCheckBox.setMnemonic('S');
        org.openide.awt.Mnemonics.setLocalizedText(startUseWithNamespaceSeparatorCheckBox, org.openide.util.NbBundle.getMessage(FmtUses.class, "FmtUses.startUseWithNamespaceSeparatorCheckBox.text")); // NOI18N

        aliasesCapitalsOfNamespacesCheckBox.setMnemonic('g');
        org.openide.awt.Mnemonics.setLocalizedText(aliasesCapitalsOfNamespacesCheckBox, org.openide.util.NbBundle.getMessage(FmtUses.class, "FmtUses.aliasesCapitalsOfNamespacesCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preferFullyQualifiedNamesCheckBox)
                    .addComponent(preferMultipleUseStatementsCombinedCheckBox)
                    .addComponent(startUseWithNamespaceSeparatorCheckBox)
                    .addComponent(aliasesCapitalsOfNamespacesCheckBox)
                    .addComponent(preferGroupUsesCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preferFullyQualifiedNamesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preferMultipleUseStatementsCombinedCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preferGroupUsesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startUseWithNamespaceSeparatorCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aliasesCapitalsOfNamespacesCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aliasesCapitalsOfNamespacesCheckBox;
    private javax.swing.JCheckBox preferFullyQualifiedNamesCheckBox;
    private javax.swing.JCheckBox preferGroupUsesCheckBox;
    private javax.swing.JCheckBox preferMultipleUseStatementsCombinedCheckBox;
    private javax.swing.JCheckBox startUseWithNamespaceSeparatorCheckBox;
    // End of variables declaration//GEN-END:variables
}
