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

package org.netbeans.modules.tomcat5.customizer;

import org.netbeans.api.java.platform.PlatformsCustomizer;

/**
 * Customizer JVM (Platform) tab.
 *
 * @author  sherold
 */
public class CustomizerJVM extends javax.swing.JPanel {

    private CustomizerDataSupport custData;

    /** Creates new form CustomizerJVM */
    public CustomizerJVM(CustomizerDataSupport custData) {
        this.custData = custData;
        initComponents();
        
        /*
         * mnemonics generated in the guarded block do not work
         * because of change of the model after mnemonic setting
         * remove the workaround after completion of issue 111094
         */
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_SecurityMan")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(proxyCheckBox, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "LBL_HttpProxy", new Object[] {})); // NOI18N
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jvmLabel = new javax.swing.JLabel();
        jvmButton = new javax.swing.JButton();
        jvmComboBox = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        proxyCheckBox = new javax.swing.JCheckBox();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jvmLabel.setLabelFor(jvmComboBox);
        org.openide.awt.Mnemonics.setLocalizedText(jvmLabel, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_JVM")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        jPanel1.add(jvmLabel, gridBagConstraints);
        jvmLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCN_JVM")); // NOI18N
        jvmLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCD_JavaPlatform")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jvmButton, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_ManagePlatforms")); // NOI18N
        jvmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvmButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 12);
        jPanel1.add(jvmButton, gridBagConstraints);
        jvmButton.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCN_ManagerPlatform")); // NOI18N
        jvmButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCD_JavaPlatform")); // NOI18N

        jvmComboBox.setModel(custData.getJvmModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 0);
        jPanel1.add(jvmComboBox, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_SecurityMan")); // NOI18N
        jCheckBox1.setIconTextGap(5);
        jCheckBox1.setModel(custData.getSecManagerModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel1.add(jCheckBox1, gridBagConstraints);
        jCheckBox1.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCN_SecManager")); // NOI18N
        jCheckBox1.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCD_SecManager")); // NOI18N

        jLabel1.setLabelFor(jTextField1);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_VMOptions")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);
        jLabel1.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCN_VMOpts")); // NOI18N
        jLabel1.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCD_VMOpts")); // NOI18N

        jTextField1.setColumns(30);
        jTextField1.setDocument(custData.getJavaOptsModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 12);
        jPanel1.add(jTextField1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_VMOptionsEG")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);
        jLabel2.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCN_VMOptEG")); // NOI18N
        jLabel2.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCD_VmOptsEG")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "TXT_NoteChangesTakeAffect")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 12, 0);
        jPanel1.add(jLabel3, gridBagConstraints);
        jLabel3.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCN_Note")); // NOI18N
        jLabel3.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ASCD_Note")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(proxyCheckBox, org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "LBL_HttpProxy", new Object[] {})); // NOI18N
        proxyCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        proxyCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        proxyCheckBox.setModel(custData.getProxyModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 0, 0);
        jPanel1.add(proxyCheckBox, gridBagConstraints);
        proxyCheckBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ACCSName_HttpProxy", new Object[] {})); // NOI18N
        proxyCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(CustomizerJVM.class, "ACCSDesc_HttpProxy", new Object[] {})); // NOI18N

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jvmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvmButtonActionPerformed
        PlatformsCustomizer.showCustomizer(null);
        custData.loadJvmModel();
    }//GEN-LAST:event_jvmButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jvmButton;
    private javax.swing.JComboBox jvmComboBox;
    private javax.swing.JLabel jvmLabel;
    private javax.swing.JCheckBox proxyCheckBox;
    // End of variables declaration//GEN-END:variables
    
}
