/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

public class NGOWorkerViewWastageInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewInventoryJPanel
     */


    public NGOWorkerViewWastageInventoryJPanel() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblQuantity = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food", "Quantity", "Wastage Amount(In pounds)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInventory.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblInventory);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(1).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
        }

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("NGO Manager - Wastage Records");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantity.setText("Total Quantity :");

        lblQuantityVal.setText("<quantity>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuantityVal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblHeader)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables

}