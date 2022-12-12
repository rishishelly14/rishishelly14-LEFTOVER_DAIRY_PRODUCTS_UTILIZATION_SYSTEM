
package userInterface.logistics.logisticsAdmin;

import business.organization.Organization;
import business.organization.Organization.Type;
import business.organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class LogisticsManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManageOrganizationJPanel
     */
    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;

    public LogisticsManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        cmbOrganization.removeAllItems();
        for (Organization.Type type : Organization.Type.values()) {
            if ((!type.getValue().equals(Organization.Type.LogisticsAdmin.getValue())) && (type.getValue().indexOf("Logistics") >= 0)) {
                cmbOrganization.addItem(type);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
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
        tblOrganization = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        lblOrg = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        btnAddOrganization = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblOrganization);

        lblHeader.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Logistics Adminstrative Work Area - Manage Organization");

        lblOrg.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblOrg.setForeground(new java.awt.Color(255, 255, 255));
        lblOrg.setText("Organization Type: ");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsAdmin/back-button-icon-50.png"))); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsAdmin/organization.jpg"))); // NOI18N
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269)
                                .addComponent(btnAddOrganization))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrg)
                                .addGap(110, 110, 110)
                                .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrg)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddOrganization))
                .addContainerGap(378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed

        Type type = (Type) cmbOrganization.getSelectedItem();

        if (type == null) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            return;
        }

        organizationDirectory.addOrganization(type);

        JOptionPane.showMessageDialog(null, "Organziation created successfully!");
        populateTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
