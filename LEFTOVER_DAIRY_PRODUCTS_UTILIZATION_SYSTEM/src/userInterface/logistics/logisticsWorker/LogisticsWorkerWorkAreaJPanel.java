package userInterface.logistics.logisticsWorker;

import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class LogisticsWorkerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorkerJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;

    public LogisticsWorkerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;
        lblName.setText(account.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblSalutation = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnPickup = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        lblHeader.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Logistics Worker - Work Area");

        lblSalutation.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblSalutation.setForeground(new java.awt.Color(255, 255, 255));
        lblSalutation.setText("Welcome:");

        btnPickup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsWorker/requests (1).png"))); // NOI18N
        btnPickup.setText("Pickup Requests");
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });

        btnDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsWorker/requests (1).png"))); // NOI18N
        btnDelivery.setText("Delivery Requests");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(btnPickup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblSalutation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHeader)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalutation)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnPickup, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        LogisticsWorkerDeliveryJPanel logsiticsWorkerDeliveryJPanel = new LogisticsWorkerDeliveryJPanel(userProcessContainer, account, enterprise, network);
        userProcessContainer.add("LogsiticsWorkerDeliveryJPanel", logsiticsWorkerDeliveryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupActionPerformed

        LogisticsWorkerPickUpJPanel logisticsWorkerPickUpJPanel = new LogisticsWorkerPickUpJPanel(userProcessContainer, account);
        userProcessContainer.add("LogisticsWorkerPickUpJPanel", logisticsWorkerPickUpJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnPickupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnPickup;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSalutation;
    // End of variables declaration//GEN-END:variables
}
