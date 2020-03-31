/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Order.Order;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dikshadesai
 */
public class ConfirmOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConfirmOrderJPanel
     */
    JPanel userProcessContainer;
    Restaurant rest;
    RestaurantDirectory rd;
    Map<String, Float> cartMap;
    Customer customer;
    float total =0;
    Menu m = null;
    UserAccount userAccount;
    List<Menu> foodItem = new ArrayList();
    List<Order> orderList = new ArrayList();
    WorkRequest workRequest ;
    
    public ConfirmOrderJPanel(JPanel userProcessContainer, UserAccount userAccount, RestaurantDirectory restaurantDirectory, Restaurant rest, Map<String,Float> cartMap) {
        initComponents();
        this.userAccount = userAccount;
        this.rd  = restaurantDirectory;
        this.userProcessContainer = userProcessContainer;
        this.cartMap = cartMap;
        this.rest = rest;
        this.populateTable();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void populateTable()
    {

        totalTextField.setEditable(false);
        orderConfirmTable.setFocusable(false);
        orderConfirmTable.setEnabled(false);
        
       if(this.cartMap != null)
            {
               
                DefaultTableModel dtm = (DefaultTableModel) orderConfirmTable.getModel();
                dtm.setRowCount(0);

                Iterator itr = this.cartMap.entrySet().iterator();

                while (itr.hasNext()) 
                { 
                    Map.Entry mapElement = (Map.Entry)itr.next(); 
                    Object row[] = new Object[2];
                    row[0] = mapElement.getKey();
                    row[1] = mapElement.getValue();
                    dtm.addRow(row);
                    
                    total += (float) mapElement.getValue();
//                    foodItem.add((Menu)mapElement.getKey());
                } 
            }
       totalTextField.setText(String.valueOf(total));
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderConfirmTable = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Confirm order:");

        orderConfirmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Order Items", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderConfirmTable);

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        jLabel3.setText("Total:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(36, 36, 36))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addGap(201, 201, 201)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalTextField)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(299, 299, 299))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder)
                    .addComponent(btnBack))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
            Order order = new Order(cartMap, total);
            order.setOrderId();
            workRequest = new WorkRequest();
            this.userAccount.getCustomer().getCustOrders().add(order);
            workRequest.setReceiver(null);
            workRequest.setSender(this.userAccount);
            workRequest.setStatus("Order Placed/Sent");
            workRequest.setOrder(order);
            //customer places order that goes to workrequest
            this.userAccount.getWorkQueue().getWorkRequestList().add(workRequest);
            //restaurant has workrequest that has order placed by customers
            rest.getWorkQueue().getWorkRequestList().add(workRequest);  
            JOptionPane.showMessageDialog(null, "Order placed successfully.");

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CustomerAreaJPanel customerAreaJPanel = new CustomerAreaJPanel(userProcessContainer, userAccount, customer, this.rd);
        userProcessContainer.add("customerAreaJPanel",customerAreaJPanel);
       
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderConfirmTable;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
