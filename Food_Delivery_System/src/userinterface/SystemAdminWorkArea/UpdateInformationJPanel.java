/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dikshadesai
 */
public class UpdateInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateInformationJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    String user;
    // List userList = new ArrayList();
    String username;

    public UpdateInformationJPanel(JPanel userProcessContainer, EcoSystem system, String user, String username) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        this.username = username;
        this.populateData();
        this.usernameTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        usernameTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Username");

        jLabel3.setText("Password ");

        jLabel2.setText("Name");

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Update Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(submitJButton)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGap(66, 66, 66)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(passwordTextField)))))
                        .addComponent(backJButton))
                    .addContainerGap(154, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(submitJButton)
                .addGap(99, 99, 99))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(backJButton)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void populateData() {

        usernameTextField.setText(this.username);
        if (this.user.equals("Customer")) {
            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    System.out.println("username: " + ua.getUsername());
                    System.err.println("name: " + ua.getCustomer().getName());

                    Iterator userCustIterator = system.getUserCust().entrySet().iterator();
                    while (userCustIterator.hasNext()) 
                    {
                        Map.Entry mapElement = (Map.Entry) userCustIterator.next();
                        Customer cust = ((Customer) mapElement.getValue());
                        UserAccount ua1 = ((UserAccount) mapElement.getKey());
                        if(ua1.equals(ua))
                        {
                            System.out.println("user1 " + ua1.getUsername());
                            System.out.println("usera " + ua.getUsername());
                            nameTextField.setText(ua1.getCustomer().getName());
                            passwordTextField.setText(ua1.getPassword());
                            break;
                        }
                    }
                }
            }

        } else if (this.user.equals("DeliveryMan")) {
            for (DeliveryMan d : system.getDeliveryManDirectory().getDeliverymanList()) {
                if (d.getUsername().equals(this.username)) {
                    DeliveryMan dm = d;
                    nameTextField.setText(dm.getName());
                }
            }

            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    UserAccount userAccount = ua;
                    passwordTextField.setText(userAccount.getPassword());
                }
            }
        } else {
            //
        }

    }

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (this.user.equals("DeliveryMan")) 
        {
            ManageDeliveryManJPanel manageDeliveryManJPanel = (ManageDeliveryManJPanel) component;
            manageDeliveryManJPanel.populateTable();
        }
        else if(this.user.equals("Customer")) 
        {
            ManageAllCustomersJPanel manageCustomers = (ManageAllCustomersJPanel) component;
            manageCustomers.populateTable();
        }
        else
        {
            //
        }

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String name = nameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());
        if (this.user.equals("Customer")) 
        {
            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    Iterator userCustIterator = system.getUserCust().entrySet().iterator();
                    while (userCustIterator.hasNext()) 
                    {
                        Map.Entry mapElement = (Map.Entry) userCustIterator.next();
                        Customer cust = ((Customer) mapElement.getValue());
                        UserAccount ua1 = ((UserAccount) mapElement.getKey());
                        if(ua.getUsername().equals(ua1.getUsername()))
                        {
                            ua.getCustomer().setName(nameTextField.getText());
                            ua.setPassword(String.valueOf(passwordTextField.getPassword()));
                            break;
                        }
                    }
                }
            }
        } 
            else if (this.user.equals("DeliveryMan")) {
            DeliveryMan d = null;
            for (DeliveryMan dm : system.getDeliveryManDirectory().getDeliverymanList()) {
                if (dm.getUsername().equals(this.username)) {
                    d = dm;
                    d.setName(name);
                    break;
                }
            }
            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    UserAccount userAccount = ua;
                    userAccount.setPassword(password);
                    break;
                }
            }
            String name1 = d.getName();
            for (Employee emp : system.getEmployeeDirectory().getEmployeeList()) {
                if (name1.equals(emp.getName())) {
                    emp.setName(name);
                }
            }
            JOptionPane.showMessageDialog(null, "Delivery Man updated successfully");
        } else {
            //
        }
        nameTextField.setText("");
        passwordTextField.setText("");
        usernameTextField.setText("");
        System.out.println("Print" + system.getEmployeeDirectory().getEmployeeList());

    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
