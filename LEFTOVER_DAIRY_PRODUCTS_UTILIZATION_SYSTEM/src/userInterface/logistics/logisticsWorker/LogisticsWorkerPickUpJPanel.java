package userInterface.logistics.logisticsWorker;

import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class LogisticsWorkerPickUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorkerPickUpJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;

    public LogisticsWorkerPickUpJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        populateTable();
    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblLogisticsWorker.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : account.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) workRequest;

                Object row[] = new Object[6];

                row[0] = cwr.getRequestDate();
                row[1] = cwr.getRaisedByDairy();
                row[2] = cwr.getRaisedBy().getUsername();
                row[3] = cwr.getTotalQuantity() + " pounds";
                row[4] = cwr.getDeliverToNGO();
                row[5] = cwr;

                dtm.addRow(row);
            }
        }
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
        tblLogisticsWorker = new javax.swing.JTable();
        btnPickup = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        tblLogisticsWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Pickup Location", "Pick up person", "Package Weight", "Drop Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblLogisticsWorker);
        if (tblLogisticsWorker.getColumnModel().getColumnCount() > 0) {
            tblLogisticsWorker.getColumnModel().getColumn(0).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(1).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(2).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(3).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(4).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(5).setResizable(false);
        }

        btnPickup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsWorker/pickupDeliveryIcon (1).jpeg"))); // NOI18N
        btnPickup.setText("Pickup");
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Logistics Worker - Pick up list");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsWorker/back-button-icon-50.png"))); // NOI18N
        btnBack.setText("<< Back");
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
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(337, 337, 337)
                        .addComponent(btnPickup))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(btnPickup))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupActionPerformed

        int selectedRow = tblLogisticsWorker.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to pickup",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblLogisticsWorker.getValueAt(selectedRow, 5);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(3))) {

                LogisticsWorkerPickUpDetailsJPanel logisticsWorkerPickUpDetailsJPanel = new LogisticsWorkerPickUpDetailsJPanel(userProcessContainer, account, request);
                userProcessContainer.add("LogisticsWorkerPickUpDetailsJPanel", logisticsWorkerPickUpDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Pick-up already completed",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btnPickupActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPickup;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblLogisticsWorker;
    // End of variables declaration//GEN-END:variables
}
