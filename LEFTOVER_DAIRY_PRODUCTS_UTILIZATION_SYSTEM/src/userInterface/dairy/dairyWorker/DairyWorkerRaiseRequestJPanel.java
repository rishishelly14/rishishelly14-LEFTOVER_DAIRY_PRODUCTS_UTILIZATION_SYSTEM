
package userInterface.dairy.dairyWorker;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.ngo.NGOManagerOrganization;
import business.userAccount.UserAccount;
import business.util.food.Food;
import business.util.food.FoodQuantity;
import business.util.request.RequestItem;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class DairyWorkerRaiseRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    private String enterpriseName;

    /**
     * Creates new form DairyWorkerRaiseRequestJPanel
     */
    public DairyWorkerRaiseRequestJPanel(JPanel userProcessContainer, UserAccount account, String enterpriseName, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        this.enterpriseName = enterpriseName;
        
        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.setRowCount(0);

        populateFoodCombo();
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
        lblSubHeader = new javax.swing.JLabel();
        lblFoodType = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        lblPerishTime = new javax.swing.JLabel();
        spnPerishTime = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblFoodItems = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRaiseRequest = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        cmbFood = new javax.swing.JComboBox<>();
        lblWarning = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Dairy Worker Work Area - Collection Request");

        lblSubHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubHeader.setText("Add Food Items :");

        lblFoodType.setText("Food Type:");

        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblPerishTime.setText("Hours to perish*:");

        spnPerishTime.setModel(new javax.swing.SpinnerNumberModel(4, 4, null, 1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblFoodItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblFoodItems);

        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRaiseRequest.setText("Raise Request");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        lbMessage.setText("Message:");

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblWarning.setText("<HTML>* Considering the logsitics, we only accept food which would last for atleast 4 hours.</HTML>");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRemove)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbMessage)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addGap(407, 407, 407)
                                        .addComponent(btnRaiseRequest))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSubHeader)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblQuantity)
                                                    .addComponent(lblPerishTime)
                                                    .addComponent(lblFoodType))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spnPerishTime, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(50, 50, 50)
                .addComponent(lblSubHeader)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFoodType)
                    .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerishTime)
                    .addComponent(spnPerishTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaiseRequest)
                    .addComponent(btnBack))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
     public void populateFoodCombo() {

        cmbFood.removeAllItems();

        Set foodNames = Food.getFoodMap().keySet();

        for (Object name : foodNames) {
            cmbFood.addItem((String) name);
        }

    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String food = cmbFood.getSelectedItem().toString();
        int quantity = (Integer) spnQuantity.getValue();
        int hours = (Integer) spnPerishTime.getValue();

        if (quantity < 1) {
            JOptionPane.showMessageDialog(null,
                "Quantity of food cannot be less than 1",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (hours < 4) {
            JOptionPane.showMessageDialog(null,
                "Food items perishable under 4 hours not accepted!",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        Object row[] = new Object[3];
        row[0] = food;
        row[1] = quantity;
        row[2] = hours;

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.addRow(row);

        //        JOptionPane.showMessageDialog(null, "Food Item Added");
        cmbFood.setSelectedIndex(0);
        spnQuantity.setValue(1);
        spnPerishTime.setValue(4);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed

        String message = txtMessage.getText();

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();

        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No food items selected to be distributed");
            return;
        }

        ArrayList<RequestItem> requestList = new ArrayList();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String food = (String) dtm.getValueAt(i, 0);
            int quantity = (Integer) dtm.getValueAt(i, 1);
            int hours = (Integer) dtm.getValueAt(i, 2);

            RequestItem ri = new RequestItem(food, quantity, hours);
            requestList.add(ri);
        }

        CollectionWorkRequest request = new CollectionWorkRequest();
        request.setSender(account);
        request.setMessage(message);
        request.setRequestItems(requestList);
        request.setStatus(RequestStatus.getPickupStatusMessage(1));
        request.setTotalQuantity(FoodQuantity.calculateQuantity(request.getRequestItems()));
        request.setRaisedBy(account);
        request.setRaisedByDairy(enterpriseName);

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof NGOManagerOrganization) {
                    o.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }

        account.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Request raised with NGO for further processing", "Information", JOptionPane.INFORMATION_MESSAGE);
        dtm.setRowCount(0);

        txtMessage.setText("");
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = tblFoodItems.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                "Please select an item to be removed",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.removeRow(selectedRow);

    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbFood;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lblFoodType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPerishTime;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSubHeader;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JSpinner spnPerishTime;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblFoodItems;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
