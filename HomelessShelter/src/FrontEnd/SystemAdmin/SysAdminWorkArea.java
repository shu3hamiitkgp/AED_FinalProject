/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FrontEnd.SystemAdmin;

import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author shubhamgoyal
 */
public class SysAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminWorkArea
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SysAdminWorkArea(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        System.out.println("here");
        this.userProcessContainer=userProcessContainer;        
        this.ecosystem=ecosystem;
        manageNetwork();
        populateTree();
        
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree1.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
    
    private void manageNetwork(){
//        manageNetworkPanel.setBackground(new Color(236,113,107));
//        manageEnterprise.setBackground(new Color(215,81,81));
//        manageEnterpriseAdmin.setBackground(new Color(215,81,81));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
        ManageNetwork manageNetworkPanel = new ManageNetwork(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageNetworkJPanel",manageNetworkPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
     }
    
    private void manageEnterprise(){
//        manageEnterprise.setBackground(new Color(236,113,107));
//        manageNetworkPanel.setBackground(new Color(215,81,81));
//        manageEnterpriseAdmin.setBackground(new Color(215,81,81));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
        ManageEnterprise manageEnterprise = new ManageEnterprise(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageEnterpriseJPanel",manageEnterprise);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
        
    }
    
    private void manageEnterpriseAdmin(){
        
//        manageEnterpriseAdmin.setBackground(new Color(236,113,107));
//        manageEnterprise.setBackground(new Color(215,81,81));
//        manageNetworkPanel.setBackground(new Color(215,81,81));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
        ManageEnterpriseAdmin manageEnterpriseAdmin = new ManageEnterpriseAdmin(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageEnterpriseAdminJPanel",manageEnterpriseAdmin);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
//    private void sceneDetails(){
//        
//        viewGraphScene.setBackground(new Color(236,113,107));
//        manageEnterpriseAdmin.setBackground(new Color(215,81,81));
//        manageEnterprise.setBackground(new Color(215,81,81));
//        manageNetworkPanel.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
//        userinterface.SystemAdminWorkArea.SceneDetailsGraph sceneDetailsGraph = new userinterface.SystemAdminWorkArea.SceneDetailsGraph(rightSystemAdminPanel, ecosystem);
//        rightSystemAdminPanel.add("SceneDetailsGraph",sceneDetailsGraph);
//        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
//        layout.next(rightSystemAdminPanel);
//    }
//    private void noOfSceneGraph(){
//        noOfSceneGraph.setBackground(new Color(236,113,107));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        manageEnterpriseAdmin.setBackground(new Color(215,81,81));
//        manageEnterprise.setBackground(new Color(215,81,81));
//        manageNetworkPanel.setBackground(new Color(215,81,81));
//        userinterface.SystemAdminWorkArea.NoOfScenesGraph noOfScenesGraph = new userinterface.SystemAdminWorkArea.NoOfScenesGraph(rightSystemAdminPanel, ecosystem);
//        rightSystemAdminPanel.add("NoOfScenesGraph",noOfScenesGraph);
//        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
//        layout.next(rightSystemAdminPanel);
//        
//    }
    
    public SysAdminWorkArea() {
        initComponents();
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
        jPanel6 = new javax.swing.JPanel();
        manageNetwork3 = new javax.swing.JLabel();
        manageEnterpriseLabel = new javax.swing.JLabel();
        manageEnterpriseAdminLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        rightSystemAdminPanel = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel6.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetwork3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageNetwork3.setText("Manage Network");
        manageNetwork3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageNetwork3MousePressed(evt);
            }
        });
        jPanel6.add(manageNetwork3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 225, 36));

        manageEnterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEnterpriseLabel.setText("Manage Enterprise");
        manageEnterpriseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseLabelMousePressed(evt);
            }
        });
        jPanel6.add(manageEnterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 229, 38));

        manageEnterpriseAdminLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageEnterpriseAdminLabel.setText("Manage Enterprise Admin");
        manageEnterpriseAdminLabel.setPreferredSize(new java.awt.Dimension(115, 16));
        jPanel6.add(manageEnterpriseAdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 225, 37));

        jTree1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTree1.setForeground(new java.awt.Color(0, 0, 0));
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 270));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetwork3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetwork3MousePressed
        manageNetwork();
    }//GEN-LAST:event_manageNetwork3MousePressed

    private void manageEnterpriseLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseLabelMousePressed
        manageEnterprise();
    }//GEN-LAST:event_manageEnterpriseLabelMousePressed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        // TODO add your handling code here:
//        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
//        if(selectedNode!=null){
//            lblSelectedNode1.setText(selectedNode.toString());
//        }
    }//GEN-LAST:event_jTree1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel manageEnterpriseAdminLabel;
    private javax.swing.JLabel manageEnterpriseLabel;
    private javax.swing.JLabel manageNetwork;
    private javax.swing.JLabel manageNetwork1;
    private javax.swing.JLabel manageNetwork2;
    private javax.swing.JLabel manageNetwork3;
    private javax.swing.JPanel manageNetworkPanel;
    private javax.swing.JPanel manageNetworkPanel1;
    private javax.swing.JPanel manageNetworkPanel2;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
