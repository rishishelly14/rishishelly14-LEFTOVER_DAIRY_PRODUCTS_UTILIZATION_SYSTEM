
package userInterface;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.dairy.DairyWorkerOrganization;
import business.userAccount.UserAccount;
import business.util.food.Food;
import business.util.request.RequestStatus;
import business.util.validation.Validation;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;


public class MainJFrame extends javax.swing.JFrame implements Runnable {

    private final int MINUTES = 2;
    public EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        RequestStatus.initalizePickupRequestStatusMap();
        RequestStatus.initializeInvoiceStatusMap();
        RequestStatus.initializeShortageStatusListMap();
        Food.initializeFood();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        mainPagePanel = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblGif = new javax.swing.JLabel();
        lblGIF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPane.setBackground(new java.awt.Color(0, 102, 102));

        lblUserName.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User Name:");

        lblPassword.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/login123 (1).png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/271-2715210_logout-button-icon-png (1).png"))); // NOI18N
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Panel");

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPaneLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(leftPaneLayout.createSequentialGroup()
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUserName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword)))))
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addContainerGap())
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(31, 31, 31)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(286, 286, 286))
        );

        splitPane.setLeftComponent(leftPane);

        userProcessContainer.setBackground(new java.awt.Color(204, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        mainPagePanel.setBackground(new java.awt.Color(102, 153, 255));

        lblHeading.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("LEFTOVER DAIRY PRODUCTS UTILIZATION");
        lblHeading.setToolTipText("");

        lblText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/srisakun-khacheecheet-source.gif"))); // NOI18N

        javax.swing.GroupLayout mainPagePanelLayout = new javax.swing.GroupLayout(mainPagePanel);
        mainPagePanel.setLayout(mainPagePanelLayout);
        mainPagePanelLayout.setHorizontalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading)
                    .addComponent(lblGIF, javax.swing.GroupLayout.PREFERRED_SIZE, 1596, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGif, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblText)
                .addGap(989, 989, 989))
        );
        mainPagePanelLayout.setVerticalGroup(
            mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPagePanelLayout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGif, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(mainPagePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGIF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        userProcessContainer.add(mainPagePanel, "card2");

        splitPane.setRightComponent(userProcessContainer);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String userName = null;
        if (Validation.validateStringInput(txtUserName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        char[] passChar = txtPassword.getPassword();
        if (passChar == null) {
            JOptionPane.showMessageDialog(null,
                    "Input cannot be blank",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            txtPassword.setBackground(Color.RED);
            return;
        }

        UserAccount ua = new UserAccount();
        String password = ua.encodePassword(String.valueOf(passChar));

        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        Network network = null;

        ua = system.getUserAccountDirectory().searchUser(userName, password);

        if (ua == null) {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    ua = e.getUserAccountDirectory().searchUser(userName, password);
                    if (ua == null) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            ua = o.getUserAccountDirectory().searchUser(userName, password);
                            if (ua != null) {
                                inEnterprise = e;
                                inOrganization = o;
                                network = n;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = e;
                        network = n;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (network != null) {
                    break;
                }
            }
        }

        if (ua == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("WorkArea", ua.getRole().createWorkArea(userProcessContainer, ua, inOrganization, inEnterprise, system, network));
            layout.next(userProcessContainer);

        }
        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        btnLogin.setEnabled(true);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);

        txtUserName.setText("");
        txtPassword.setText("");

        userProcessContainer.removeAll();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        MainPageJPanel mpjp = new MainPageJPanel();
        userProcessContainer.add("NGORequestViewJPanel", mpjp);
        layout.next(userProcessContainer);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame jFrame = new MainJFrame();
                jFrame.setVisible(true);
                Thread thread = new Thread(jFrame);
                thread.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblGIF;
    private javax.swing.JLabel lblGif;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel leftPane;
    private javax.swing.JPanel mainPagePanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("********* INSIDE PERISHABLE UPDATE *********");
                Thread.sleep(1000 * 60 * MINUTES);
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                        // Update perishable time for all the Dairy worker's work queue
                        if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Dairy)) {
                            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                if (o instanceof DairyWorkerOrganization) {
                                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                        for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                                            CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                                            System.out.println("\n********** Updating Perishable **********");
                                            cwr.updatePerishable();
                                            System.out.println("\n ********** Update Complete **********");
                                        }
                                    }
                                }
                            }
                        }

                        // Update NGO's inventory after perishable update
                        if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO)) {
                            NGOEnterprise enterprise = (NGOEnterprise) e;
                            System.out.println("\nNGO name " + enterprise.getName());
                            enterprise.updateInventory();
                        }
                    }
                }
            } catch (InterruptedException ex) {
                // Thread sleep failed
            }
        }
    }
}
