
package userInterface.systemAdminWorkArea;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.role.Role;
import business.role.government.GovernmentAdminRole;
import business.role.logistics.LogisticsAdminRole;
import business.role.ngo.NGOAdminRole;
import business.role.dairy.DairyAdminRole;
import business.userAccount.UserAccount;
import business.util.validation.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;

    /**
     * Creates new form ManagerEnterpriseAdminJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;

        populateTable();
        populateNetworkComboBox();
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
        tblEnterprise = new javax.swing.JTable();
        jSeparator = new javax.swing.JSeparator();
        lblNetwork = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox();
        lblEnterprise = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAddEnterprise = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblNetworkList = new javax.swing.JLabel();
        lblCreateNetwork = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblEnterprise);

        lblNetwork.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblNetwork.setText("Network");

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        lblEnterprise.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setText("Enterprise");

        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUserName.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Username");

        lblPassword.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        lblName.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/systemAdminWorkArea/back-button-icon-50.png"))); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddEnterprise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/systemAdminWorkArea/administration-vector-icon (1).jpg"))); // NOI18N
        btnAddEnterprise.setText("ADD");
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("System Admin Work Area - Create Enterprise Admin");

        lblNetworkList.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblNetworkList.setForeground(new java.awt.Color(255, 255, 255));
        lblNetworkList.setText("Enterprise admin list:");

        lblCreateNetwork.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblCreateNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateNetwork.setText("Create New Enterprise:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNetworkList, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(443, 443, 443)
                                .addComponent(btnAddEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNetwork)
                                    .addComponent(lblEnterprise))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUserName)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPassword)
                                        .addComponent(lblName))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblHeader)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblNetworkList)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCreateNetwork)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprise)
                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEnterprise)
                    .addComponent(btnBack))
                .addGap(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

        Network network = (Network) cmbNetwork.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed

        Enterprise enterprise = (Enterprise) cmbEnterprise.getSelectedItem();
        
        if (enterprise == null) {
                JOptionPane.showMessageDialog(null, "Invalid input!");
        }
            

        String userName = null;
        if (Validation.validateStringInput(txtUserName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        String name = null;
        if (Validation.validateStringInput(txtName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        char[] passChar = txtPassword.getPassword();
        if (passChar == null || passChar.length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Password cannot be blank",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            txtPassword.setBackground(Color.RED);
            return;
        }

        if (business.checkIfUserNameIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "User name already exists. Please select a different one.");
            return;
        }

        Employee employee = enterprise.getEmployeeDirectory().addEmployee(name);
        UserAccount account = new UserAccount();

        String password = account.encodePassword(String.valueOf(passChar));

        if (null != enterprise.getEnterpriseType()) {
            switch (enterprise.getEnterpriseType()) {
                case Logistics:
                    account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new LogisticsAdminRole());
                    break;
                case NGO:
                    account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new NGOAdminRole());
                    break;
                case Dairy:
                    account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new DairyAdminRole());
                    break;
                case Government:
                    account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new GovernmentAdminRole());
                    break;
                default:
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Enterprise admin added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        txtUserName.setText("");
        txtName.setText("");
        txtPassword.setText("");

        populateTable();

    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
        dtm.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    dtm.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        cmbNetwork.removeAllItems();

        for (Network network : business.getNetworkList()) {
            cmbNetwork.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        cmbEnterprise.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            cmbEnterprise.addItem(enterprise);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblCreateNetwork;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblNetworkList;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
