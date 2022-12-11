/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FrontEnd.ShelterGovernment;

import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author shubhamgoyal
 */
public class GovtShelterWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form GovtSupervisorWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    public GovtShelterWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        populateAlerts();
        manageScene();
    }
    
    public void populateAlerts() {
        
        JTextField txtField;
        JTextArea textArea;
        alertPanel.setLayout(new GridLayout(20, 1));
        int pos = 0;
        boolean showAlertMsg = false;
        
        ArrayList<BroadcastAlertRequest> bb = new ArrayList<>();
        for(WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof BroadcastAlertRequest) {
                bb.add((BroadcastAlertRequest)wr);
            }
        }
        Collections.sort(bb, (o1, o2) -> o2.getRequestDate().compareTo(o1.getRequestDate()));
        
        for(BroadcastAlertRequest wr : bb) {
            if(wr instanceof BroadcastAlertRequest) {
                if(!((BroadcastAlertRequest) wr).isIsAlertSeen()) {
                    showAlertMsg = true;
                    ((BroadcastAlertRequest) wr).setIsAlertSeen(true);
                }
                txtField = new JTextField(wr.getRequestDate() + ": Broadcasted by: " + wr.getSender().getEmployee().getName());
                txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
                txtField.setEditable(false);
                txtField.setVisible(true);
                textArea = new JTextArea("Network: " + ((BroadcastAlertRequest) wr).getInNetwork().getName() + "\nAlert: " + ((BroadcastAlertRequest) wr).getAlertMessage());
                textArea.setEditable(false);
                textArea.setVisible(true);
                alertPanel.add(txtField,pos);
                alertPanel.add(textArea,++pos);
                ++pos;
            }
        }
        if(showAlertMsg) {
            JOptionPane.showMessageDialog(null, "You have a new alert broadcasted.");
        }
        
    }
    
        private void manageResident(){
//        manageScenePanel.setBackground(new Color(236,113,107));
//        manageRequestPanel.setBackground(new Color(215,81,81));
        GovtShelterManageResident manageResident = new GovtShelterManageResident( rightPanel,  enterprise,  system,  organization,  network, account);
        rightPanel.add("ManageResidentJPanel", manageResident);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }
        
        private void manageVolu(){
        manageScenePanel.setBackground(new Color(236,113,107));
        manageRequestPanel.setBackground(new Color(215,81,81));
        NGOAdminManageSceneJPanel manageScene = new NGOAdminManageSceneJPanel( rightSystemAdminPanel,  enterprise,  system,  organization,  network, account);
        rightSystemAdminPanel.add("ManageHospitalSceneJPanel", manageScene);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
        private void manageRequest(){
        manageRequestPanel.setBackground(new Color(236,113,107));
        manageScenePanel.setBackground(new Color(215,81,81));
       NGOAdminWorkRequestJPanel manageIndividualWorkRequest = new NGOAdminWorkRequestJPanel( rightSystemAdminPanel,  account,  organization,  enterprise,  network,  system);
        rightSystemAdminPanel.add("IndividualAdminWorkAreaJPanel", manageIndividualWorkRequest);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
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
        lblManageResidents = new javax.swing.JLabel();
        lblManageReq = new javax.swing.JLabel();
        lblManageVolu = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();

        lblManageResidents.setText("Manage Residents");
        lblManageResidents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageResidentsMousePressed(evt);
            }
        });

        lblManageReq.setText("Manage Request");
        lblManageReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageReqMousePressed(evt);
            }
        });

        lblManageVolu.setText("Manage Volunteers");
        lblManageVolu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageVoluMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblManageReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManageResidents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManageVolu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblManageResidents, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblManageVolu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblManageReq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(753, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageResidentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageResidentsMousePressed
        // TODO add your handling code here:
        manageResident():
    }//GEN-LAST:event_lblManageResidentsMousePressed

    private void lblManageReqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageReqMousePressed
        // TODO add your handling code here:
        manageRequest();
    }//GEN-LAST:event_lblManageReqMousePressed

    private void lblManageVoluMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageVoluMousePressed
        // TODO add your handling code here:
        manageVolu();
    }//GEN-LAST:event_lblManageVoluMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblManageReq;
    private javax.swing.JLabel lblManageResidents;
    private javax.swing.JLabel lblManageVolu;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
