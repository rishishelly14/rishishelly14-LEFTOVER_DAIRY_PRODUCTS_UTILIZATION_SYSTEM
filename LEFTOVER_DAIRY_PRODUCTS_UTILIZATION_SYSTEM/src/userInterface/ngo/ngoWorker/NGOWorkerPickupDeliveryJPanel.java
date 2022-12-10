
package userInterface.ngo.ngoWorker;

import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.userAccount.UserAccount;
import business.util.request.RequestItem;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class NGOWorkerPickupDeliveryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkerPickupDeliveryJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private NGOEnterprise enterprise;

    public NGOWorkerPickupDeliveryJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = (NGOEnterprise) enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCollect = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NGO Worker - Pickup Delivery");

        btnCollect.setText("Collect");
        btnCollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(230, 230, 230)
                                .addComponent(btnCollect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnView))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCollect)
                    .addComponent(btnView)
                    .addComponent(btnBack))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to work",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblDetails.getValueAt(selectedRow, 1);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(5))) {

                request.setStatus(RequestStatus.getPickupStatusMessage(6));
                for (RequestItem ri : request.getRequestItems()) {
                    enterprise.getInventory().addRequestItem(ri);
                }

                JOptionPane.showMessageDialog(null, "Added to inventory", "Information", JOptionPane.INFORMATION_MESSAGE);
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request already processed by you",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btnCollectActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to work",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblDetails.getValueAt(selectedRow, 1);

            NGOWorkerViewRequestJPanel nGOWorkerViewRequestJPanel = new NGOWorkerViewRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("NGOWorkerViewRequestJPanel", nGOWorkerViewRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCollect;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : account.getWorkQueue().getWorkRequestList()) {
            CollectionWorkRequest cwr = (CollectionWorkRequest) workRequest;
            Object row[] = new Object[2];
            row[0] = cwr.getRaisedByDairy();
            row[1] = cwr;
            dtm.addRow(row);
        }
    }
}
