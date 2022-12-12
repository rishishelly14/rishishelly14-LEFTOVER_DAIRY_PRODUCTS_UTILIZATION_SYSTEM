/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.government.governmentMayor;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GovernmentMayorViewChartJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;

    /**
     * Creates new form GovernmentMayorViewChart
     */
    public GovernmentMayorViewChartJPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        populateChart();
    }

    public void populateChart() {

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        double wastageAvoided = 0;

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Dairy) {
                String name = e.getName();
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if ((ua.getRole().getRoleType().getValue()).equals(Role.RoleType.DairyWorker.getValue())) {
                            for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                                if (wr instanceof CollectionWorkRequest) {
                                    CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                                    wastageAvoided += cwr.getTotalQuantity();
                                }
                            }
                        }
                    }
                    dataSet.setValue(wastageAvoided, "Wastage Avoided", name);
                    wastageAvoided = 0;
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Wastage Avoided by each Dairy",
                "Dairy",
                "Wastage Avoided (In Pounds)",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartPanel, BorderLayout.CENTER);
        pnlChart.validate();

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
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        pnlChart.setBackground(new java.awt.Color(204, 204, 255));
        pnlChart.setLayout(new java.awt.BorderLayout());

        lblHeader.setBackground(new java.awt.Color(204, 204, 255));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Mayor Work Area - Dairy Wastage Avoided Chart");

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/government/governmentMayor/back-button-arrow-icon-52394.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblHeader)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBack1)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel pnlChart;
    // End of variables declaration//GEN-END:variables
}
