/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.MedicalRecord;
import Business.Person;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class MedicalRecordInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalRecordInformationJPanel
     */
    
    private Person person;
    private JPanel nextJPanel;
    private MedicalRecord medicalRecordInfo = new MedicalRecord();

    
    public MedicalRecordInformationJPanel(Person person, JPanel displayJPanel) {
        initComponents();
        this.person = person;
        nextJPanel =  displayJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medicalRecordNoTextField = new javax.swing.JTextField();
        allery1TextField = new javax.swing.JTextField();
        allergy2TextField = new javax.swing.JTextField();
        allery3TextField = new javax.swing.JTextField();
        saveMedicalRecordInformationButton = new javax.swing.JButton();
        viewMedicalInformationButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Medical Record Information");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Medical Record Number");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Allergy1");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Allergy2");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Allergy3");

        medicalRecordNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRecordNoTextFieldActionPerformed(evt);
            }
        });

        allergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergy2TextFieldActionPerformed(evt);
            }
        });

        saveMedicalRecordInformationButton.setBackground(new java.awt.Color(204, 255, 255));
        saveMedicalRecordInformationButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveMedicalRecordInformationButton.setText("Submit");
        saveMedicalRecordInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMedicalRecordInformationButtonActionPerformed(evt);
            }
        });

        viewMedicalInformationButton.setBackground(new java.awt.Color(204, 255, 255));
        viewMedicalInformationButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        viewMedicalInformationButton.setText("View");
        viewMedicalInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicalInformationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(viewMedicalInformationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(medicalRecordNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(allery1TextField)
                    .addComponent(allergy2TextField)
                    .addComponent(allery3TextField)
                    .addComponent(saveMedicalRecordInformationButton))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medicalRecordNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(allery1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(allergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(allery3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveMedicalRecordInformationButton)
                    .addComponent(viewMedicalInformationButton))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalRecordNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRecordNoTextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_medicalRecordNoTextFieldActionPerformed
    
    private void clearFields() {
        medicalRecordNoTextField.setText(null);
        allery1TextField.setText(null);
        allergy2TextField.setText(null);
        allery3TextField.setText(null);
    }
    
    private void saveMedicalRecordInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMedicalRecordInformationButtonActionPerformed
        // TODO add your handling code here:
        medicalRecordInfo.setMedicalRecordNumber(medicalRecordNoTextField.getText());
        medicalRecordInfo.setAllergy1(allery1TextField.getText());
        medicalRecordInfo.setAllergy2(allergy2TextField.getText());
        medicalRecordInfo.setAllergy3(allery3TextField.getText());
        person.setMedicalRecordInfo(medicalRecordInfo);
        JOptionPane.showMessageDialog(null, "Medical Information Saved Successfully...Your form has been submitted.");
        clearFields();
    }//GEN-LAST:event_saveMedicalRecordInformationButtonActionPerformed

    private void allergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergy2TextFieldActionPerformed

    private void viewMedicalInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicalInformationButtonActionPerformed
        // TODO add your handling code here:
       medicalRecordNoTextField.setText(medicalRecordInfo.getMedicalRecordNumber());
       allery1TextField.setText(medicalRecordInfo.getAllergy1());
       allergy2TextField.setText(medicalRecordInfo.getAllergy2());
       allery3TextField.setText(medicalRecordInfo.getAllergy3());
    }//GEN-LAST:event_viewMedicalInformationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField allergy2TextField;
    private javax.swing.JTextField allery1TextField;
    private javax.swing.JTextField allery3TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicalRecordNoTextField;
    private javax.swing.JButton saveMedicalRecordInformationButton;
    private javax.swing.JButton viewMedicalInformationButton;
    // End of variables declaration//GEN-END:variables
}
