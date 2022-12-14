/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.ngo.ngoManager;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class NGODairyRequestViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGODairyRequestViewJPanel
     */
    
    private JPanel userProcessContainer;
    private CollectionWorkRequest collectionWorkRequest;
    
    public NGODairyRequestViewJPanel(JPanel userProcessContainer, CollectionWorkRequest collectionWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.collectionWorkRequest = collectionWorkRequest;
        populateTable();
        populateData();
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
        lblHeader = new javax.swing.JLabel();
        lblRequestFrom = new javax.swing.JLabel();
        lblRequestFromVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblRequestStatus = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblCostVal = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblRequestDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblHeader.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("NGO Manager - View Request Details");

        lblRequestFrom.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblRequestFrom.setForeground(new java.awt.Color(255, 255, 255));
        lblRequestFrom.setText("Request from:");

        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblRequestDate.setForeground(new java.awt.Color(255, 255, 255));
        lblRequestDate.setText("Request Date:");

        lblRequestDateVal.setText("<request_date>");

        lblRequestStatus.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblRequestStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblRequestStatus.setText("Request status:");

        lblRequestStatusVal.setText("<request_status>");

        lblQuantity.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Food Quantity:");

        lblQuantityVal.setText("<quantity>");

        lblCost.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblCost.setForeground(new java.awt.Color(255, 255, 255));
        lblCost.setText("Pickup Cost:");

        lblCostVal.setText("<cost>");

        tblRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Type", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblRequestDetails);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/ngo/ngoManager/back-button-icon-50.png"))); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(lblRequestFrom)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCost)
                                .addGap(47, 47, 47)
                                .addComponent(lblCostVal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblRequestStatus)
                                            .addGap(26, 26, 26))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblRequestDate)
                                            .addGap(35, 35, 35)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblQuantity)
                                        .addGap(33, 33, 33)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantityVal)
                                    .addComponent(lblRequestDateVal)
                                    .addComponent(lblRequestStatusVal)
                                    .addComponent(lblRequestFromVal)))
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestFrom)
                    .addComponent(lblRequestFromVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(lblCostVal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBack)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostVal;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestFrom;
    private javax.swing.JLabel lblRequestFromVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblRequestDetails;
    // End of variables declaration//GEN-END:variables
    
    
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDetails.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : collectionWorkRequest.getRequestItems()) {
            if (ri.getQuantity() > 0) {
                Object row[] = new Object[3];
                row[0] = ri;
                row[1] = ri.getQuantity();
                row[2] = ri.getHoursToPerish();

                dtm.addRow(row);
            }
        }
    }

    private void populateData() {

        String status = collectionWorkRequest.getStatus();

        lblRequestStatusVal.setText(status);
        lblRequestFromVal.setText(collectionWorkRequest.getRaisedByDairy());
        lblRequestDateVal.setText(collectionWorkRequest.getRequestDate() + "");
        lblQuantityVal.setText(collectionWorkRequest.getTotalQuantity() + " pounds");

        String cost = collectionWorkRequest.getDeliveryCost() == 0 ? "Undelivered" : "$" + collectionWorkRequest.getDeliveryCost();
        lblCostVal.setText(cost);

    }




}
