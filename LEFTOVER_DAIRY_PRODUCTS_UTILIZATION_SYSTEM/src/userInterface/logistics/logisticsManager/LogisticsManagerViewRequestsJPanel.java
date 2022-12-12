
package userInterface.logistics.logisticsManager;

import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class LogisticsManagerViewRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManagerViewRequestsJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;

    public LogisticsManagerViewRequestsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        populateTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblRequests.getModel();
        dtm.setRowCount(0);

        // Display organization's work queue
        for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) workRequest;

                // If status other than newly raised and assigned to Organization, then show
                if (cwr.getStatus().equals(RequestStatus.getPickupStatusMessage(2))) {
                    // if (cwr.getDeliveredToNGO().equals(organization.getName())) {
                    Object row[] = new Object[4];

                    row[0] = cwr.getRaisedBy();
                    row[1] = cwr.getRaisedByDairy();
                    row[2] = cwr.getDeliverToNGO();
                    row[3] = cwr;

                    dtm.addRow(row);

                }
                //   } // If status is newly raised by Dairy, then display
                /*       else {
                    Object row[] = new Object[4];

                    row[0] = cwr.getSender();
                    row[1] = cwr.getRaisedBy();
                    row[2] = cwr.getDeliverTo();
                    row[3] = cwr;

                    dtm.addRow(row);
                }*/
            }
        }

        /*
        // Display own work queue
        for (WorkRequest workRequest : account.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) workRequest;

                Object row[] = new Object[4];

                row[0] = cwr.getSender();
                row[1] = cwr.getRaisedBy();
                row[2] = cwr.getDeliverTo();
                row[3] = cwr;

                dtm.addRow(row);
            }

        } */
    }

    private void populateComboBox() {
        cmbWorker.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                if (user.getRole().getRoleType().getValue().equals(Role.RoleType.LogisticsWorker.getValue())) {
                    cmbWorker.addItem(user);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnAssigntoEmployee = new javax.swing.JButton();
        cmbWorker = new javax.swing.JComboBox();
        lblWorker = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        lblHeader.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Logistics Manager Work Area - Requests");

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request from", "Pickup", "Drop", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblRequests);
        if (tblRequests.getColumnModel().getColumnCount() > 0) {
            tblRequests.getColumnModel().getColumn(0).setResizable(false);
            tblRequests.getColumnModel().getColumn(1).setResizable(false);
            tblRequests.getColumnModel().getColumn(2).setResizable(false);
            tblRequests.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAssigntoEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsManager/assignIcon (1).png"))); // NOI18N
        btnAssigntoEmployee.setText("Assign to Employee");
        btnAssigntoEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigntoEmployeeActionPerformed(evt);
            }
        });

        cmbWorker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblWorker.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblWorker.setForeground(new java.awt.Color(255, 255, 255));
        lblWorker.setText("Worker:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsManager/back-button-icon-50.png"))); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsManager/viewitem.png"))); // NOI18N
        btnDetails.setText("View Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWorker)
                                .addGap(80, 80, 80)
                                .addComponent(cmbWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAssigntoEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHeader)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorker)
                    .addComponent(cmbWorker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssigntoEmployee))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssigntoEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigntoEmployeeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblRequests.getValueAt(selectedRow, 3);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(2))) {
                request.setSender(account);
                request.setStatus(RequestStatus.getPickupStatusMessage(3));
                request.setDeliveredBy((UserAccount) cmbWorker.getSelectedItem());

                // Assign to own queue
                account.getWorkQueue().getWorkRequestList().add(request);

                // Assign to selected worker's queue
                UserAccount acc = (UserAccount) cmbWorker.getSelectedItem();
                acc.getWorkQueue().getWorkRequestList().add(request);

                request.setReceiver(acc);
                JOptionPane.showMessageDialog(null, "Request forwarded to logistics worker", "Information", JOptionPane.INFORMATION_MESSAGE);

                populateTable();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not in the proper state to be processed",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btnAssigntoEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblRequests.getValueAt(selectedRow, 3);

            LogisticsManagerViewRequestDetailsJPanel logisticsManagerViewRequestDetailsJPanel = new LogisticsManagerViewRequestDetailsJPanel(userProcessContainer, request);
            userProcessContainer.add("LogisticsManagerViewRequestDetailsJPanel", logisticsManagerViewRequestDetailsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssigntoEmployee;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetails;
    private javax.swing.JComboBox cmbWorker;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblWorker;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
