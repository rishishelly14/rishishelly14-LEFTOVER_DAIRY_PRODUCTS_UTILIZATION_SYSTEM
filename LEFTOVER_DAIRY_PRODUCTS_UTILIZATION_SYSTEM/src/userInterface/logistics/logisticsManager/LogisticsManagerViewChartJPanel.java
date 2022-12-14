
package userInterface.logistics.logisticsManager;

import business.userAccount.UserAccount;
import business.workQueue.PaymentWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class LogisticsManagerViewChartJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;

    /**
     * Creates new form LogisticsManagerViewChartJPanel
     */
    public LogisticsManagerViewChartJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        populateChart();
    }

    public void populateChart() {

        DefaultPieDataset dataSet = new DefaultPieDataset();
        int paid = 0, unpaid = 0;
        double paidAmount = 0, unpaidAmount = 0;

        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PaymentWorkRequest) {
                PaymentWorkRequest pwr = (PaymentWorkRequest) wr;
                if (pwr.getCollectionWorkRequest().getInvoiceGenerated()) {
                    if (pwr.getCollectionWorkRequest().getPaid()) {
                        paid++;
                        paidAmount += pwr.getCollectionWorkRequest().getDeliveryCost();
                    } else {
                        unpaid++;
                        unpaidAmount += pwr.getCollectionWorkRequest().getDeliveryCost();
                    }
                }
            }
        }

        dataSet.setValue("Paid", paid);
        dataSet.setValue("Unpaid", unpaid);

        JFreeChart chart = ChartFactory.createPieChart("Paid and Unpaid Invoices",
                dataSet, true, true, true);

        PiePlot plot = (PiePlot) chart.getPlot();

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartPanel, BorderLayout.CENTER);
        pnlChart.validate();

        lblPaidVal.setText("$ " + paidAmount);
        lblUnPaidVal.setText("$ " + unpaidAmount);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChart = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblPaid = new javax.swing.JLabel();
        lblPaidVal = new javax.swing.JLabel();
        lblUnPaid = new javax.swing.JLabel();
        lblUnPaidVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        pnlChart.setBackground(new java.awt.Color(153, 204, 255));
        pnlChart.setLayout(new java.awt.BorderLayout());

        lblHeader.setBackground(new java.awt.Color(255, 255, 255));
        lblHeader.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Logistics Manager - View Invoice Payement Status");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/logistics/logisticsManager/back-button-icon-50.png"))); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPaid.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblPaid.setForeground(new java.awt.Color(255, 255, 255));
        lblPaid.setText("Total Amount Received (Paid) :");

        lblPaidVal.setText("<paid>");

        lblUnPaid.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblUnPaid.setForeground(new java.awt.Color(255, 255, 255));
        lblUnPaid.setText("Total Amount Pending (Un-Paid) :");

        lblUnPaidVal.setText("<un-paid>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUnPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPaidVal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUnPaidVal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaidVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnPaid)
                    .addComponent(lblUnPaidVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnBack)
                .addGap(217, 217, 217))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPaid;
    private javax.swing.JLabel lblPaidVal;
    private javax.swing.JLabel lblUnPaid;
    private javax.swing.JLabel lblUnPaidVal;
    private javax.swing.JPanel pnlChart;
    // End of variables declaration//GEN-END:variables
}
