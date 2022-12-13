/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainUI;

import Backend.DB4OUtil.DB4OUtil;
import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Resources;
import Backend.Network.Network;
import Backend.Organization.Donations;
import Backend.Organization.Jobs;
import Backend.Organization.Meals;
import Backend.Organization.Organization;
import Backend.Organization.ShelterGovernment;
import Backend.Organization.ShelterNGO;
import Backend.Organization.ShelterPrivate;
import Backend.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shubhamgoyal
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        
        for(UserAccount user: system.getDirectory().getUserAccountList()){
            System.out.println(user.getUsername());
        }
        
    }
    
    public void displayNetwork(javax.swing.JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Network net : system.getNetworkList()){
            Object[] row = new Object[2];
            row[0] = net;
            row[1] = net.getName();
            model.addRow(row);
        }
    }
    
    public void displayResources(javax.swing.JTable table, String r){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        if(r.equals("Meal")){
            for(Organization meal : system.getNetworkList().get(0).getEnterpriseDirectory().getResources().getMeals()){
                Object[] row = new Object[5];
                row[0] = meal;
                row[1] = meal.getName();
                row[2] = "Restaurants";
                row[3] = meal.getAddress();
                row[4] = meal.getPhone();
                model.addRow(row);
            }
        }else{
            for(Organization d : system.getNetworkList().get(0).getEnterpriseDirectory().getResources().getDonations()){
                Object[] row = new Object[2];
                row[0] = d;
                row[1] = d.getName();
                row[2] = "Donation Center";
                row[3] = d.getAddress();
                row[4] = d.getPhone();
                model.addRow(row);
            }
        }
    }
    
    public void displayResources(javax.swing.JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Organization meal : system.getNetworkList().get(0).getEnterpriseDirectory().getResources().getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[5];
            row[0] = meal;
            row[1] = meal.getName();
            row[2] = meal.getType();
            row[3] = meal.getAddress();
            row[4] = meal.getPhone();
            model.addRow(row);
        }
    }
    
    public void displayHealth(javax.swing.JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Organization meal : system.getNetworkList().get(0).getEnterpriseDirectory().getHospitals().getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[5];
            row[0] = meal;
            row[1] = meal.getName();
            row[2] = meal.getType();
            row[3] = meal.getAddress();
            row[4] = meal.getPhone();
            model.addRow(row);
        }
    }
    
    public void displayShelters(javax.swing.JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Organization meal : system.getNetworkList().get(0).getEnterpriseDirectory().getShelters().getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[5];
            row[0] = meal.getName();
            row[1] = meal.getType();
            row[2] = meal.getAddress();
            row[3] = meal.getPhone();
//            row[4] = meal.getPhone();
//            row[5] = meal.getGender();
            model.addRow(row);
        }
    }
    
    public void displayJobs(javax.swing.JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Organization meal : system.getNetworkList().get(0).getEnterpriseDirectory().getJobs().getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[5];
            row[0] = meal.getName();
            row[1] = meal.getType();
            row[2] = meal.getAddress();
            row[3] = meal.getPhone();
//            row[4] = meal.getPhone();
//            row[5] = meal.getGender();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        workJPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCreateProfile = new javax.swing.JButton();
        btnSysAdmin = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        SystemAdmin = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        btnNetwork = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnResources = new javax.swing.JButton();
        btnJobs = new javax.swing.JButton();
        btnHealth = new javax.swing.JButton();
        btnHomeless1 = new javax.swing.JButton();
        btnShelters1 = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        NetworkPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        txtNetwork = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        AdminPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxNetwork = new javax.swing.JComboBox<>();
        jComboBoxEnterprise = new javax.swing.JComboBox<>();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        btnSub = new javax.swing.JButton();
        HomelessPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHomeless = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtName4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblphoto1 = new javax.swing.JLabel();
        SheltersPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblShelter = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        jComboBoxshelter = new javax.swing.JComboBox<>();
        Address1 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        ResourcesPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblResources = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxshelter1 = new javax.swing.JComboBox<>();
        btnAdd2 = new javax.swing.JButton();
        Address2 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        Address3 = new javax.swing.JLabel();
        txtMobile1 = new javax.swing.JTextField();
        JobsPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblResources1 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        txtname2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Address4 = new javax.swing.JLabel();
        txtMobile2 = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        Address5 = new javax.swing.JLabel();
        btnAdd3 = new javax.swing.JButton();
        txtType = new javax.swing.JTextField();
        HealthPanel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblResources2 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txtname3 = new javax.swing.JTextField();
        Address6 = new javax.swing.JLabel();
        txtAddress3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        Address7 = new javax.swing.JLabel();
        txtMobile3 = new javax.swing.JTextField();
        btnAdd4 = new javax.swing.JButton();
        jComboBoxHealth = new javax.swing.JComboBox<>();
        ShelterPanel = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        leftpanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        rightpanel = new javax.swing.JPanel();
        NGOPanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblNGO = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        txtname4 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtGender1 = new javax.swing.JTextField();
        txtAddress4 = new javax.swing.JTextField();
        Address9 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jComboBoxshelter2 = new javax.swing.JComboBox<>();
        btnAdd5 = new javax.swing.JButton();
        btnAdd6 = new javax.swing.JButton();
        btnView3 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        txtGender4 = new javax.swing.JTextField();
        PrivatePanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblPrivate = new javax.swing.JTable();
        txtname5 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtGender2 = new javax.swing.JTextField();
        btnAdd8 = new javax.swing.JButton();
        btnAdd9 = new javax.swing.JButton();
        txtMobile9 = new javax.swing.JTextField();
        Address14 = new javax.swing.JLabel();
        Address15 = new javax.swing.JLabel();
        txtAddress5 = new javax.swing.JTextField();
        jComboBoxshelter3 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        btnView2 = new javax.swing.JButton();
        GovtPanel = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblgovt = new javax.swing.JTable();
        txtname6 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtGender3 = new javax.swing.JTextField();
        btnAdd11 = new javax.swing.JButton();
        btnAdd12 = new javax.swing.JButton();
        txtMobile12 = new javax.swing.JTextField();
        Address18 = new javax.swing.JLabel();
        Address19 = new javax.swing.JLabel();
        txtAddress6 = new javax.swing.JTextField();
        jComboBoxshelter4 = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        btnview1 = new javax.swing.JButton();
        RequestPanel = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblrequests = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        txtRequest = new javax.swing.JTextField();
        jComboBoxShelter = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        MainResourcePanel = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        workarea = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        displaypanel = new javax.swing.JPanel();
        MealsPanel = new javax.swing.JPanel();
        btnAdd7 = new javax.swing.JButton();
        Address20 = new javax.swing.JLabel();
        txtAddress7 = new javax.swing.JTextField();
        Address21 = new javax.swing.JLabel();
        txtname7 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMeals = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        btnAdd10 = new javax.swing.JButton();
        txtMobile13 = new javax.swing.JFormattedTextField();
        btnAdd13 = new javax.swing.JButton();
        DonationsPanel = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblDonations = new javax.swing.JTable();
        txtname8 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        Address23 = new javax.swing.JLabel();
        txtAddress8 = new javax.swing.JTextField();
        Address24 = new javax.swing.JLabel();
        btnAdd15 = new javax.swing.JButton();
        btnAdd16 = new javax.swing.JButton();
        txtMobile15 = new javax.swing.JFormattedTextField();
        btnAdd27 = new javax.swing.JButton();
        EmployementPanel = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblResources3 = new javax.swing.JTable();
        txtname9 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        Address26 = new javax.swing.JLabel();
        txtAddress9 = new javax.swing.JTextField();
        txtMobile17 = new javax.swing.JTextField();
        Address27 = new javax.swing.JLabel();
        btnAdd17 = new javax.swing.JButton();
        btnAdd18 = new javax.swing.JButton();
        btnAdd19 = new javax.swing.JButton();
        PanelHealth = new javax.swing.JPanel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        MedicalPanel = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblMedical = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        txtname10 = new javax.swing.JTextField();
        Address28 = new javax.swing.JLabel();
        txtAddress10 = new javax.swing.JTextField();
        Address29 = new javax.swing.JLabel();
        txtMobile18 = new javax.swing.JTextField();
        jComboBoxHealth1 = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        btnAdd20 = new javax.swing.JButton();
        btnAdd21 = new javax.swing.JButton();
        btnAdd22 = new javax.swing.JButton();
        CounsellingPanel = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblCouncelling = new javax.swing.JTable();
        btnAdd23 = new javax.swing.JButton();
        btnAdd24 = new javax.swing.JButton();
        btnAdd25 = new javax.swing.JButton();
        txtMobile19 = new javax.swing.JTextField();
        jComboBoxHealth2 = new javax.swing.JComboBox<>();
        txtname11 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        Address30 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        txtAddress11 = new javax.swing.JTextField();
        Address31 = new javax.swing.JLabel();
        RequestsPanel = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblrequests1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtRequest1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxStatus1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxShelter1 = new javax.swing.JComboBox<>();
        btnview2 = new javax.swing.JButton();
        btnsubmit1 = new javax.swing.JButton();
        PanelHomelessPerson = new javax.swing.JPanel();
        jSplitPane6 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ResourcePanel = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblResources5 = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        HealthViewPanel = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblResources4 = new javax.swing.JTable();
        jButton28 = new javax.swing.JButton();
        ShelterViewPanel = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblShelter1 = new javax.swing.JTable();
        jButton27 = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        txtpass = new javax.swing.JTextField();
        btnLogin1 = new javax.swing.JButton();
        CreatePanel = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        txtName5 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txtgender1 = new javax.swing.JTextField();
        txtuserid1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtage1 = new javax.swing.JTextField();
        btnAdd26 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCreateProfile.setText("Create Profile");
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        btnSysAdmin.setText("Home");
        btnSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSysAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workJPanelLayout = new javax.swing.GroupLayout(workJPanel);
        workJPanel.setLayout(workJPanelLayout);
        workJPanelLayout.setHorizontalGroup(
            workJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSysAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        workJPanelLayout.setVerticalGroup(
            workJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workJPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnSysAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateProfile)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(workJPanel);

        displayJPanel.setLayout(new java.awt.CardLayout());

        defaultPanel.setBackground(new java.awt.Color(255, 102, 102));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 70)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("iShelter");

        jLabel77.setText("Your one stop shop for all resources offered near you!");

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        displayJPanel.add(defaultPanel, "homepane");

        btnNetwork.setText("Manage Network");
        btnNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkActionPerformed(evt);
            }
        });

        btnAdmin.setText("Manage Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnResources.setText("Manage Resources");
        btnResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesActionPerformed(evt);
            }
        });

        btnJobs.setText("Manage Jobs");
        btnJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobsActionPerformed(evt);
            }
        });

        btnHealth.setText("Manage Health");
        btnHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthActionPerformed(evt);
            }
        });

        btnHomeless1.setText("Manage Homeless");
        btnHomeless1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeless1ActionPerformed(evt);
            }
        });

        btnShelters1.setText("Manage Shelters");
        btnShelters1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelters1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHomeless1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResources, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJobs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnShelters1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnNetwork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHomeless1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShelters1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResources)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnJobs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHealth)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Network Management");

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Network", "Network Name"
            }
        ));
        tblNetwork.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblNetwork);
        tblNetwork.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblNetwork.getColumnModel().getColumnCount() > 0) {
            tblNetwork.getColumnModel().getColumn(0).setMinWidth(0);
            tblNetwork.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel2.setText("Network Name:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NetworkPanelLayout = new javax.swing.GroupLayout(NetworkPanel);
        NetworkPanel.setLayout(NetworkPanelLayout);
        NetworkPanelLayout.setHorizontalGroup(
            NetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NetworkPanelLayout.createSequentialGroup()
                .addGroup(NetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NetworkPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(NetworkPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NetworkPanelLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NetworkPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(249, 249, 249))
        );
        NetworkPanelLayout.setVerticalGroup(
            NetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NetworkPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(NetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        rightPanel.add(NetworkPanel, "card2");

        jLabel3.setText("Manage Enterprise Admin");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "Network", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setText("Enterpirse");

        jLabel5.setText("Password");

        jLabel6.setText("Network");

        jLabel7.setText("Username");

        jComboBoxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSub.setText("Submit");

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(jComboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28))
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSub)
                            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxEnterprise, 0, 101, Short.MAX_VALUE)
                                .addComponent(txtusername)
                                .addComponent(txtpassword)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnSub)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        rightPanel.add(AdminPanel, "card3");

        jLabel8.setText("Manage Homeless Residents");

        tblHomeless.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Shelter", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblHomeless);

        jLabel17.setText("Name");

        jLabel18.setText("Age");

        jLabel19.setText("Gender");

        jLabel20.setText("UserID");

        jLabel22.setText("Photo");

        jButton4.setText("Click to Capture");

        btnAdd.setText("Add");

        lblphoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto1.setText("Photo");

        javax.swing.GroupLayout HomelessPanelLayout = new javax.swing.GroupLayout(HomelessPanel);
        HomelessPanel.setLayout(HomelessPanelLayout);
        HomelessPanelLayout.setHorizontalGroup(
            HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomelessPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomelessPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd)
                    .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(HomelessPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(HomelessPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(HomelessPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(HomelessPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HomelessPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(HomelessPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblphoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(67, 67, 67))
        );
        HomelessPanelLayout.setVerticalGroup(
            HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomelessPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jButton4))
                .addGroup(HomelessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomelessPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAdd))
                    .addGroup(HomelessPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblphoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        rightPanel.add(HomelessPanel, "card4");

        tblShelter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Gender", "Address", "Mobile", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblShelter);

        jLabel16.setText("Manage Shelters");

        jLabel23.setText("Name");

        jLabel24.setText("Gender");

        Address.setText("Address");

        jLabel28.setText("Type");

        btnAdd1.setText("Add");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        jComboBoxshelter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NGO", "Private", "Government" }));
        jComboBoxshelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxshelterActionPerformed(evt);
            }
        });

        Address1.setText("Mobile");

        javax.swing.GroupLayout SheltersPanelLayout = new javax.swing.GroupLayout(SheltersPanel);
        SheltersPanel.setLayout(SheltersPanelLayout);
        SheltersPanelLayout.setHorizontalGroup(
            SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SheltersPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SheltersPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd1)
                        .addGroup(SheltersPanelLayout.createSequentialGroup()
                            .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(SheltersPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SheltersPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(SheltersPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxshelter, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13))
                                .addGroup(SheltersPanelLayout.createSequentialGroup()
                                    .addComponent(Address)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SheltersPanelLayout.createSequentialGroup()
                                    .addComponent(Address1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        SheltersPanelLayout.setVerticalGroup(
            SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SheltersPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jComboBoxshelter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(SheltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address1)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAdd1)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        rightPanel.add(SheltersPanel, "card5");

        jLabel26.setText("Manage Resources");

        tblResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Address", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblResources);

        jLabel27.setText("Name");

        jLabel29.setText("Type");

        jComboBoxshelter1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meals", "Donations" }));

        btnAdd2.setText("Add");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        Address2.setText("Address");

        Address3.setText("Mobile");

        javax.swing.GroupLayout ResourcesPanelLayout = new javax.swing.GroupLayout(ResourcesPanel);
        ResourcesPanel.setLayout(ResourcesPanelLayout);
        ResourcesPanelLayout.setHorizontalGroup(
            ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResourcesPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResourcesPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd2)
                        .addGroup(ResourcesPanelLayout.createSequentialGroup()
                            .addGroup(ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ResourcesPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ResourcesPanelLayout.createSequentialGroup()
                                    .addComponent(Address2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ResourcesPanelLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxshelter1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResourcesPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Address3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        ResourcesPanelLayout.setVerticalGroup(
            ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResourcesPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jComboBoxshelter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address2)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address3)
                    .addComponent(txtMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btnAdd2)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        rightPanel.add(ResourcesPanel, "card6");

        jLabel30.setText("Manage Jobs");

        tblResources1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Description", "Address", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblResources1);

        jLabel32.setText("Comapany Name");

        jLabel33.setText("Description");

        Address4.setText("Mobile");

        Address5.setText("Address");

        btnAdd3.setText("Add");

        javax.swing.GroupLayout JobsPanelLayout = new javax.swing.GroupLayout(JobsPanel);
        JobsPanel.setLayout(JobsPanelLayout);
        JobsPanelLayout.setHorizontalGroup(
            JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JobsPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JobsPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd3)
                        .addGroup(JobsPanelLayout.createSequentialGroup()
                            .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JobsPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(JobsPanelLayout.createSequentialGroup()
                                    .addComponent(Address5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JobsPanelLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel33)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JobsPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Address4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMobile2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        JobsPanelLayout.setVerticalGroup(
            JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JobsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address5)
                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address4)
                    .addComponent(txtMobile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btnAdd3)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        rightPanel.add(JobsPanel, "card7");

        jLabel35.setText("Manage Health Centers");

        tblResources2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Type", "Address", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblResources2);

        jLabel36.setText("Name");

        Address6.setText("Address");

        jLabel37.setText("Location");

        jButton8.setText("Set Location");

        jLabel38.setText("Type");

        Address7.setText("Mobile");

        btnAdd4.setText("Add");

        jComboBoxHealth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical", "Counselling" }));

        javax.swing.GroupLayout HealthPanelLayout = new javax.swing.GroupLayout(HealthPanel);
        HealthPanel.setLayout(HealthPanelLayout);
        HealthPanelLayout.setHorizontalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HealthPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd4)
                        .addGroup(HealthPanelLayout.createSequentialGroup()
                            .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(HealthPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtname3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(HealthPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(HealthPanelLayout.createSequentialGroup()
                                    .addComponent(Address6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel38)
                                .addComponent(Address7))
                            .addGap(18, 18, 18)
                            .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMobile3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        HealthPanelLayout.setVerticalGroup(
            HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jComboBoxHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address6)
                    .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address7)
                    .addComponent(txtMobile3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(HealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jButton8))
                .addGap(28, 28, 28)
                .addComponent(btnAdd4)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        rightPanel.add(HealthPanel, "card8");

        jSplitPane2.setRightComponent(rightPanel);

        javax.swing.GroupLayout SystemAdminLayout = new javax.swing.GroupLayout(SystemAdmin);
        SystemAdmin.setLayout(SystemAdminLayout);
        SystemAdminLayout.setHorizontalGroup(
            SystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        SystemAdminLayout.setVerticalGroup(
            SystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        displayJPanel.add(SystemAdmin, "adminpane");

        jButton1.setText("NGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Private");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setText("Government");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Requests");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftpanelLayout = new javax.swing.GroupLayout(leftpanel);
        leftpanel.setLayout(leftpanelLayout);
        leftpanelLayout.setHorizontalGroup(
            leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        leftpanelLayout.setVerticalGroup(
            leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        jSplitPane3.setLeftComponent(leftpanel);

        rightpanel.setLayout(new java.awt.CardLayout());

        jLabel39.setText("Manage NGO Shelters");

        tblNGO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Address", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblNGO);

        jLabel40.setText("Name");

        jLabel41.setText("Gender");

        Address9.setText("Address");

        jLabel43.setText("Type");

        jComboBoxshelter2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NGO" }));

        btnAdd5.setText("Add");
        btnAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd5ActionPerformed(evt);
            }
        });

        btnAdd6.setText("Update");

        btnView3.setText("View");
        btnView3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView3ActionPerformed(evt);
            }
        });

        jLabel42.setText("Phone");

        javax.swing.GroupLayout NGOPanelLayout = new javax.swing.GroupLayout(NGOPanel);
        NGOPanel.setLayout(NGOPanelLayout);
        NGOPanelLayout.setHorizontalGroup(
            NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NGOPanelLayout.createSequentialGroup()
                        .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NGOPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NGOPanelLayout.createSequentialGroup()
                                        .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(NGOPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(NGOPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel40)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtname4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(35, 35, 35)
                                        .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(NGOPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel43)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBoxshelter2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                            .addGroup(NGOPanelLayout.createSequentialGroup()
                                                .addComponent(Address9)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(NGOPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(25, 25, 25)
                                        .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGender4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(NGOPanelLayout.createSequentialGroup()
                                                .addComponent(btnAdd5)
                                                .addGap(69, 69, 69)
                                                .addComponent(btnView3)
                                                .addGap(53, 53, 53)
                                                .addComponent(btnAdd6)))))))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NGOPanelLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(256, 256, 256))))
        );
        NGOPanelLayout.setVerticalGroup(
            NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jComboBoxshelter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address9)
                    .addComponent(txtAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtGender4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(NGOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd5)
                    .addComponent(btnAdd6)
                    .addComponent(btnView3))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        rightpanel.add(NGOPanel, "card2");

        jLabel44.setText("Manage Private Shelters");

        tblPrivate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Address", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblPrivate);

        jLabel45.setText("Name");

        jLabel46.setText("Gender");

        btnAdd8.setText("Add");
        btnAdd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd8ActionPerformed(evt);
            }
        });

        btnAdd9.setText("Update");

        Address14.setText("Phone");

        Address15.setText("Address");

        jComboBoxshelter3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private" }));

        jLabel48.setText("Type");

        btnView2.setText("View");
        btnView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrivatePanelLayout = new javax.swing.GroupLayout(PrivatePanel);
        PrivatePanel.setLayout(PrivatePanelLayout);
        PrivatePanelLayout.setHorizontalGroup(
            PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrivatePanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrivatePanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrivatePanelLayout.createSequentialGroup()
                        .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PrivatePanelLayout.createSequentialGroup()
                                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PrivatePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGender2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PrivatePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtname5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PrivatePanelLayout.createSequentialGroup()
                                        .addComponent(Address14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMobile9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PrivatePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxshelter3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addGroup(PrivatePanelLayout.createSequentialGroup()
                                        .addComponent(Address15)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrivatePanelLayout.createSequentialGroup()
                        .addComponent(btnAdd8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd9)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrivatePanelLayout.createSequentialGroup()
                        .addComponent(btnView2)
                        .addGap(40, 40, 40))))
        );
        PrivatePanelLayout.setVerticalGroup(
            PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrivatePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView2)
                .addGap(9, 9, 9)
                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jComboBoxshelter3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtGender2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address15)
                    .addComponent(txtAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address14)
                    .addComponent(txtMobile9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(PrivatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd8)
                    .addComponent(btnAdd9))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        rightpanel.add(PrivatePanel, "card3");

        jLabel49.setText("Manage Government Shelters");

        tblgovt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Address", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tblgovt);

        jLabel50.setText("Name");

        jLabel51.setText("Gender");

        btnAdd11.setText("Add");
        btnAdd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd11ActionPerformed(evt);
            }
        });

        btnAdd12.setText("Update");

        Address18.setText("Phone");

        Address19.setText("Address");

        jComboBoxshelter4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Government" }));

        jLabel53.setText("Type");

        btnview1.setText("View");
        btnview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnview1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GovtPanelLayout = new javax.swing.GroupLayout(GovtPanel);
        GovtPanel.setLayout(GovtPanelLayout);
        GovtPanelLayout.setHorizontalGroup(
            GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GovtPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GovtPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GovtPanelLayout.createSequentialGroup()
                        .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(GovtPanelLayout.createSequentialGroup()
                                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(GovtPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGender3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GovtPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtname6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GovtPanelLayout.createSequentialGroup()
                                        .addComponent(Address18)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMobile12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(GovtPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxshelter4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addGroup(GovtPanelLayout.createSequentialGroup()
                                        .addComponent(Address19)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GovtPanelLayout.createSequentialGroup()
                        .addComponent(btnAdd11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd12)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GovtPanelLayout.createSequentialGroup()
                        .addComponent(btnview1)
                        .addGap(40, 40, 40))))
        );
        GovtPanelLayout.setVerticalGroup(
            GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GovtPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnview1)
                .addGap(9, 9, 9)
                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jComboBoxshelter4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtGender3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address19)
                    .addComponent(txtAddress6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address18)
                    .addComponent(txtMobile12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(GovtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd11)
                    .addComponent(btnAdd12))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        rightpanel.add(GovtPanel, "card4");

        jLabel54.setText("Manage Shelter Requests");

        tblrequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestID", "Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblrequests);

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jComboBoxShelter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("RequestID");

        jLabel11.setText("Assign Shelter");

        jLabel12.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Pending", "WIP", "Reject" }));

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestPanelLayout = new javax.swing.GroupLayout(RequestPanel);
        RequestPanel.setLayout(RequestPanelLayout);
        RequestPanelLayout.setHorizontalGroup(
            RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestPanelLayout.createSequentialGroup()
                .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnview)
                            .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RequestPanelLayout.createSequentialGroup()
                                    .addGap(156, 156, 156)
                                    .addComponent(jLabel54)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RequestPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRequest))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxShelter, 0, 217, Short.MAX_VALUE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsubmit)
                .addGap(83, 83, 83))
        );
        RequestPanelLayout.setVerticalGroup(
            RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnview)
                .addGap(37, 37, 37)
                .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsubmit)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        rightpanel.add(RequestPanel, "card5");

        jSplitPane3.setRightComponent(rightpanel);

        javax.swing.GroupLayout ShelterPanelLayout = new javax.swing.GroupLayout(ShelterPanel);
        ShelterPanel.setLayout(ShelterPanelLayout);
        ShelterPanelLayout.setHorizontalGroup(
            ShelterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
        ShelterPanelLayout.setVerticalGroup(
            ShelterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        displayJPanel.add(ShelterPanel, "shelterpane");

        jButton14.setText("Meals");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Donations");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workareaLayout = new javax.swing.GroupLayout(workarea);
        workarea.setLayout(workareaLayout);
        workareaLayout.setHorizontalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workareaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        workareaLayout.setVerticalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workareaLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jButton14)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(workarea);

        displaypanel.setLayout(new java.awt.CardLayout());

        btnAdd7.setText("Add");
        btnAdd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd7ActionPerformed(evt);
            }
        });

        Address20.setText("Address");

        Address21.setText("Mobile");

        jLabel57.setText("Name");

        tblMeals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ResourceID", "Name", "Type", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMeals.setColumnSelectionAllowed(true);
        tblMeals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMealsMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblMeals);
        tblMeals.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblMeals.getColumnModel().getColumnCount() > 0) {
            tblMeals.getColumnModel().getColumn(0).setMinWidth(0);
            tblMeals.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel58.setText("Manage Meals");

        btnAdd10.setText("Update");
        btnAdd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd10ActionPerformed(evt);
            }
        });

        try {
            txtMobile13.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAdd13.setText("Delete");
        btnAdd13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MealsPanelLayout = new javax.swing.GroupLayout(MealsPanel);
        MealsPanel.setLayout(MealsPanelLayout);
        MealsPanelLayout.setHorizontalGroup(
            MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MealsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MealsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(18, 18, 18)
                        .addComponent(txtname7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MealsPanelLayout.createSequentialGroup()
                        .addComponent(Address20)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(Address21)
                .addGap(27, 27, 27)
                .addComponent(txtMobile13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(MealsPanelLayout.createSequentialGroup()
                .addGroup(MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MealsPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MealsPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel58))
                    .addGroup(MealsPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnAdd7)
                        .addGap(44, 44, 44)
                        .addComponent(btnAdd10)
                        .addGap(37, 37, 37)
                        .addComponent(btnAdd13)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        MealsPanelLayout.setVerticalGroup(
            MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MealsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address20)
                    .addComponent(txtAddress7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address21)
                    .addComponent(txtMobile13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(MealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd7)
                    .addComponent(btnAdd10)
                    .addComponent(btnAdd13))
                .addGap(128, 128, 128))
        );

        displaypanel.add(MealsPanel, "mealpane");

        jLabel59.setText("Manage Donations");

        tblDonations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DonationID", "Name", "Type", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDonations.setColumnSelectionAllowed(true);
        tblDonations.getTableHeader().setReorderingAllowed(false);
        tblDonations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonationsMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblDonations);
        tblDonations.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblDonations.getColumnModel().getColumnCount() > 0) {
            tblDonations.getColumnModel().getColumn(0).setMinWidth(0);
            tblDonations.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel60.setText("Name");

        Address23.setText("Address");

        Address24.setText("Mobile");

        btnAdd15.setText("Add");
        btnAdd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd15ActionPerformed(evt);
            }
        });

        btnAdd16.setText("Update");
        btnAdd16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd16ActionPerformed(evt);
            }
        });

        try {
            txtMobile15.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAdd27.setText("Delete");
        btnAdd27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DonationsPanelLayout = new javax.swing.GroupLayout(DonationsPanel);
        DonationsPanel.setLayout(DonationsPanelLayout);
        DonationsPanelLayout.setHorizontalGroup(
            DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonationsPanelLayout.createSequentialGroup()
                .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonationsPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DonationsPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel59)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DonationsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DonationsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(txtname8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Address24))
                    .addGroup(DonationsPanelLayout.createSequentialGroup()
                        .addComponent(Address23)
                        .addGap(18, 18, 18)
                        .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DonationsPanelLayout.createSequentialGroup()
                                .addComponent(btnAdd15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd16))
                            .addComponent(txtAddress8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonationsPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMobile15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DonationsPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAdd27)))
                .addGap(142, 142, 142))
        );
        DonationsPanelLayout.setVerticalGroup(
            DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonationsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address23)
                    .addComponent(txtAddress8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address24)
                    .addComponent(txtMobile15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(DonationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd15)
                    .addComponent(btnAdd16)
                    .addComponent(btnAdd27))
                .addGap(128, 128, 128))
        );

        displaypanel.add(DonationsPanel, "donationpane");

        jSplitPane4.setRightComponent(displaypanel);

        javax.swing.GroupLayout MainResourcePanelLayout = new javax.swing.GroupLayout(MainResourcePanel);
        MainResourcePanel.setLayout(MainResourcePanelLayout);
        MainResourcePanelLayout.setHorizontalGroup(
            MainResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
        MainResourcePanelLayout.setVerticalGroup(
            MainResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );

        displayJPanel.add(MainResourcePanel, "resourcepane");

        jLabel61.setText("Employment Manager");

        tblResources3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Type", "Address", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tblResources3);

        jLabel62.setText("Comapany Name");

        Address26.setText("Address");

        Address27.setText("Mobile");

        btnAdd17.setText("Add");
        btnAdd17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd17ActionPerformed(evt);
            }
        });

        btnAdd18.setText("Update");
        btnAdd18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd18ActionPerformed(evt);
            }
        });

        btnAdd19.setText("View");
        btnAdd19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmployementPanelLayout = new javax.swing.GroupLayout(EmployementPanel);
        EmployementPanel.setLayout(EmployementPanelLayout);
        EmployementPanelLayout.setHorizontalGroup(
            EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployementPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployementPanelLayout.createSequentialGroup()
                        .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd17)
                            .addGroup(EmployementPanelLayout.createSequentialGroup()
                                .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(EmployementPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtname9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(EmployementPanelLayout.createSequentialGroup()
                                        .addComponent(Address26)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(257, 257, 257)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployementPanelLayout.createSequentialGroup()
                                .addComponent(btnAdd19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployementPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnAdd18)))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(EmployementPanelLayout.createSequentialGroup()
                        .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EmployementPanelLayout.createSequentialGroup()
                                .addComponent(Address27)
                                .addGap(18, 18, 18)
                                .addComponent(txtMobile17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(EmployementPanelLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel61)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EmployementPanelLayout.setVerticalGroup(
            EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployementPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EmployementPanelLayout.createSequentialGroup()
                        .addComponent(btnAdd19)
                        .addGap(171, 171, 171)
                        .addComponent(btnAdd18))
                    .addGroup(EmployementPanelLayout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Address27)
                                .addComponent(txtMobile17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel62)
                                .addComponent(txtname9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(EmployementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address26)
                            .addComponent(txtAddress9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(btnAdd17)))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        displayJPanel.add(EmployementPanel, "employmentpane");

        jButton19.setText("Medical");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Counselling");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Requests");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton19)
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jSplitPane5.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel65.setText("Manage Medical Centers");

        tblMedical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Address", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(tblMedical);

        jLabel66.setText("Name");

        Address28.setText("Address");

        Address29.setText("Mobile");

        jComboBoxHealth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical" }));

        jLabel68.setText("Type");

        btnAdd20.setText("Add");

        btnAdd21.setText("View");

        btnAdd22.setText("Update");

        javax.swing.GroupLayout MedicalPanelLayout = new javax.swing.GroupLayout(MedicalPanel);
        MedicalPanel.setLayout(MedicalPanelLayout);
        MedicalPanelLayout.setHorizontalGroup(
            MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalPanelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd20)
                        .addGroup(MedicalPanelLayout.createSequentialGroup()
                            .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(MedicalPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel66)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtname10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MedicalPanelLayout.createSequentialGroup()
                                    .addComponent(Address28)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAddress10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel68)
                                .addComponent(Address29))
                            .addGap(18, 18, 18)
                            .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMobile18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxHealth1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAdd22)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd21)
                        .addGap(51, 51, 51))))
        );
        MedicalPanelLayout.setVerticalGroup(
            MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MedicalPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(txtname10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)
                            .addComponent(jComboBoxHealth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address28)
                            .addComponent(txtAddress10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address29)
                            .addComponent(txtMobile18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(btnAdd20))
                    .addGroup(MedicalPanelLayout.createSequentialGroup()
                        .addComponent(btnAdd21)
                        .addGap(143, 143, 143)
                        .addComponent(btnAdd22)))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jPanel2.add(MedicalPanel, "card2");

        jLabel69.setText("Manage Counselling Centers");

        tblCouncelling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Address", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(tblCouncelling);

        btnAdd23.setText("View");

        btnAdd24.setText("Update");

        btnAdd25.setText("Add");

        jComboBoxHealth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Counselling" }));

        txtname11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname11ActionPerformed(evt);
            }
        });

        jLabel70.setText("Type");

        Address30.setText("Mobile");

        jLabel71.setText("Name");

        txtAddress11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress11ActionPerformed(evt);
            }
        });

        Address31.setText("Address");

        javax.swing.GroupLayout CounsellingPanelLayout = new javax.swing.GroupLayout(CounsellingPanel);
        CounsellingPanel.setLayout(CounsellingPanelLayout);
        CounsellingPanelLayout.setHorizontalGroup(
            CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CounsellingPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel69)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CounsellingPanelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd25)
                        .addGroup(CounsellingPanelLayout.createSequentialGroup()
                            .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CounsellingPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel71)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtname11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CounsellingPanelLayout.createSequentialGroup()
                                    .addComponent(Address31)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAddress11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel70)
                                .addComponent(Address30))
                            .addGap(18, 18, 18)
                            .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMobile19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxHealth2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CounsellingPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAdd24)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CounsellingPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd23)
                        .addGap(51, 51, 51))))
        );
        CounsellingPanelLayout.setVerticalGroup(
            CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CounsellingPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CounsellingPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(txtname11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70)
                            .addComponent(jComboBoxHealth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CounsellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address31)
                            .addComponent(txtAddress11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address30)
                            .addComponent(txtMobile19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(btnAdd25))
                    .addGroup(CounsellingPanelLayout.createSequentialGroup()
                        .addComponent(btnAdd23)
                        .addGap(143, 143, 143)
                        .addComponent(btnAdd24)))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jPanel2.add(CounsellingPanel, "card3");

        jLabel73.setText("Manage Health Requests");

        tblrequests1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestID", "Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(tblrequests1);

        jLabel13.setText("RequestID");

        jLabel14.setText("Status");

        jComboBoxStatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Pending", "WIP", "Reject" }));

        jLabel15.setText("Assign Center");

        jComboBoxShelter1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnview2.setText("View");
        btnview2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnview2ActionPerformed(evt);
            }
        });

        btnsubmit1.setText("Submit");
        btnsubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestsPanelLayout = new javax.swing.GroupLayout(RequestsPanel);
        RequestsPanel.setLayout(RequestsPanelLayout);
        RequestsPanelLayout.setHorizontalGroup(
            RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestsPanelLayout.createSequentialGroup()
                .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestsPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnview2)
                            .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RequestsPanelLayout.createSequentialGroup()
                                    .addGap(156, 156, 156)
                                    .addComponent(jLabel73)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RequestsPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxStatus1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRequest1))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxShelter1, 0, 220, Short.MAX_VALUE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsubmit1)
                .addGap(83, 83, 83))
        );
        RequestsPanelLayout.setVerticalGroup(
            RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnview2)
                .addGap(37, 37, 37)
                .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxShelter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(RequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsubmit1)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jPanel2.add(RequestsPanel, "card4");

        jSplitPane5.setRightComponent(jPanel2);

        javax.swing.GroupLayout PanelHealthLayout = new javax.swing.GroupLayout(PanelHealth);
        PanelHealth.setLayout(PanelHealthLayout);
        PanelHealthLayout.setHorizontalGroup(
            PanelHealthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5)
        );
        PanelHealthLayout.setVerticalGroup(
            PanelHealthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5)
        );

        displayJPanel.add(PanelHealth, "healthpane");

        jButton24.setText("Resources");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("Health");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("Shelters");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton24))
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        jSplitPane6.setLeftComponent(jPanel3);

        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel76.setText(" Resources");

        tblResources5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ResourceID", "Name", "Type", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResources5.setColumnSelectionAllowed(true);
        tblResources5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResources5MouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(tblResources5);
        tblResources5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblResources5.getColumnModel().getColumnCount() > 0) {
            tblResources5.getColumnModel().getColumn(0).setMinWidth(0);
            tblResources5.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jButton29.setText("Place Request");

        javax.swing.GroupLayout ResourcePanelLayout = new javax.swing.GroupLayout(ResourcePanel);
        ResourcePanel.setLayout(ResourcePanelLayout);
        ResourcePanelLayout.setHorizontalGroup(
            ResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResourcePanelLayout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResourcePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResourcePanelLayout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResourcePanelLayout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addGap(278, 278, 278))))
        );
        ResourcePanelLayout.setVerticalGroup(
            ResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResourcePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton29)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel4.add(ResourcePanel, "resourcecard");

        jLabel75.setText("Health Centers");

        tblResources4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Company Name", "Type", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResources4.setColumnSelectionAllowed(true);
        tblResources4.getTableHeader().setReorderingAllowed(false);
        tblResources4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResources4MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(tblResources4);
        tblResources4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblResources4.getColumnModel().getColumnCount() > 0) {
            tblResources4.getColumnModel().getColumn(0).setMinWidth(0);
            tblResources4.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jButton28.setText("Place Request");

        javax.swing.GroupLayout HealthViewPanelLayout = new javax.swing.GroupLayout(HealthViewPanel);
        HealthViewPanel.setLayout(HealthViewPanelLayout);
        HealthViewPanelLayout.setHorizontalGroup(
            HealthViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HealthViewPanelLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(HealthViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HealthViewPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel75)))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HealthViewPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton28)
                .addGap(279, 279, 279))
        );
        HealthViewPanelLayout.setVerticalGroup(
            HealthViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthViewPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton28)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel4.add(HealthViewPanel, "healthcard");

        jLabel74.setText("Shelters");

        tblShelter1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShelter1.setColumnSelectionAllowed(true);
        tblShelter1.getTableHeader().setReorderingAllowed(false);
        tblShelter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShelter1MouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(tblShelter1);
        tblShelter1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblShelter1.getColumnModel().getColumnCount() > 0) {
            tblShelter1.getColumnModel().getColumn(0).setMinWidth(0);
            tblShelter1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jButton27.setText("Place Request");

        javax.swing.GroupLayout ShelterViewPanelLayout = new javax.swing.GroupLayout(ShelterViewPanel);
        ShelterViewPanel.setLayout(ShelterViewPanelLayout);
        ShelterViewPanelLayout.setHorizontalGroup(
            ShelterViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShelterViewPanelLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel74)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShelterViewPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(302, 302, 302))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShelterViewPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        ShelterViewPanelLayout.setVerticalGroup(
            ShelterViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShelterViewPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(96, 96, 96))
        );

        jPanel4.add(ShelterViewPanel, "shelterscard");

        jSplitPane6.setRightComponent(jPanel4);

        javax.swing.GroupLayout PanelHomelessPersonLayout = new javax.swing.GroupLayout(PanelHomelessPerson);
        PanelHomelessPerson.setLayout(PanelHomelessPersonLayout);
        PanelHomelessPersonLayout.setHorizontalGroup(
            PanelHomelessPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane6)
        );
        PanelHomelessPersonLayout.setVerticalGroup(
            PanelHomelessPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane6)
        );

        displayJPanel.add(PanelHomelessPerson, "homelesspane");

        jLabel78.setText("UserName");

        jLabel79.setText("Password");

        jLabel80.setText("Role");

        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Meal Manager", "Shelter Manager", "Volunteers", "Health Manager", "Employment Manager", "User", "Resource Manager" }));

        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel78))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(18, 18, 18)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin1)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(txtpass))
                .addGap(27, 27, 27)
                .addComponent(btnLogin1)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        displayJPanel.add(LoginPanel, "loginpane");

        jLabel81.setText("Name");

        jLabel82.setText("Gender");

        jLabel83.setText("UserID");

        jButton30.setText("Click to Capture");

        jLabel84.setText("Photo");

        jLabel86.setText("Age");

        btnAdd26.setText("Add");
        btnAdd26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd26ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel87.setText("Create Homeless Profile");

        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setText("Photo");

        javax.swing.GroupLayout CreatePanelLayout = new javax.swing.GroupLayout(CreatePanel);
        CreatePanel.setLayout(CreatePanelLayout);
        CreatePanelLayout.setHorizontalGroup(
            CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CreatePanelLayout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd26)
                        .addGroup(CreatePanelLayout.createSequentialGroup()
                            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CreatePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel86)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtage1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CreatePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel81)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CreatePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel82)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtgender1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtuserid1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(214, Short.MAX_VALUE)))
        );
        CreatePanelLayout.setVerticalGroup(
            CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel87)
                .addGap(152, 152, 152)
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CreatePanelLayout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81)
                        .addComponent(txtName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel82)
                        .addComponent(txtgender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel86)
                        .addComponent(txtage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83)
                        .addComponent(txtuserid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84)
                        .addComponent(jButton30))
                    .addGap(28, 28, 28)
                    .addComponent(btnAdd26)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );

        displayJPanel.add(CreatePanel, "newaccountpane");

        jSplitPane1.setRightComponent(displayJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeless1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeless1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card4");
//        displayHomeless(tblHomeless);
    }//GEN-LAST:event_btnHomeless1ActionPerformed

    private void btnView3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView3ActionPerformed

    private void btnView2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView2ActionPerformed

    private void btnview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnview1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnview1ActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnview2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnview2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnview2ActionPerformed

    private void btnsubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmit1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)displayJPanel.getLayout();
        card.show(displayJPanel, "loginpane");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSysAdminActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)displayJPanel.getLayout();
        card.show(displayJPanel, "homepane");
    }//GEN-LAST:event_btnSysAdminActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)displayJPanel.getLayout();
        card.show(displayJPanel, "newaccountpane");
    }//GEN-LAST:event_btnCreateProfileActionPerformed

    private void btnShelters1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelters1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card5");
        displayShelters(tblShelter);
    }//GEN-LAST:event_btnShelters1ActionPerformed

    private void jComboBoxshelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxshelterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxshelterActionPerformed

    private void txtAddress11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress11ActionPerformed

    private void txtname11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname11ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        String accountType = jComboBoxRole.getSelectedItem().toString();
        if(null != accountType)switch (accountType) {
            case "System Admin":
            //JOptionPane.showMessageDialog(null, "Here");'
            String role = system.getDirectory().getUser(txtuser.getText()).getRole();
            System.out.println(Objects.equals(role, "SystemAdmin"));
            if(Objects.equals(role, "SystemAdmin")){
                userAccount = system.getDirectory().getUser(txtuser.getText());
                if(userAccount.getPassword().equals(txtpass.getText())){
                    System.out.println("hello");
                    CardLayout card = (CardLayout)displayJPanel.getLayout();
                    card.show(displayJPanel, "adminpane");
                    displayNetwork(tblNetwork);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User not found.");
            }break;
            case "Resource Manager":
            if(system.getDirectory().getUser(txtuser.getText()).getRole().equals("ResourceDonator")){
                userAccount = system.getDirectory().getUser(txtuser.getText());
                if(userAccount.getPassword().equals(txtpass.getText())){
                    CardLayout card = (CardLayout)displayJPanel.getLayout();
                    card.show(displayJPanel, "resourcepane");
                    displayResources(tblMeals, "Meal");
                    //displayResources(tblDonations, "Donation");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User not found.");
            }break;
            case "User":
            if(system.getDirectory().getUser(txtuser.getText()).getRole().equals("HomelessPerson")){
                userAccount = system.getDirectory().getUser(txtuser.getText());
                if(userAccount.getPassword().equals(txtpass.getText())){
                    CardLayout card = (CardLayout)displayJPanel.getLayout();
                    card.show(displayJPanel, "homelesspane");
                    displayNetwork(tblNetwork);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User not found.");
            }break;
            case "Shelter Manager":
            if(system.getDirectory().getUser(txtuser.getText()).getRole().equals("ShelterManager")){
                userAccount = system.getDirectory().getUser(txtuser.getText());
                if(userAccount.getPassword().equals(txtpass.getText())){
                    CardLayout card = (CardLayout)displayJPanel.getLayout();
                    card.show(displayJPanel, "shelterpane");
                    displayNetwork(tblNetwork);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User not found.");
            }break;
            case "Employment Manager":
            if(system.getDirectory().getUser(txtuser.getText()).getRole().equals("EmploymentManager")){
                userAccount = system.getDirectory().getUser(txtuser.getText());
                if(userAccount.getPassword().equals(txtpass.getText())){
                    CardLayout card = (CardLayout)displayJPanel.getLayout();
                    card.show(displayJPanel, "employmentpane");
                    displayJobs(tblResources3);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User not found.");
            }break;
            case "Health Manager":
            if(system.getDirectory().getUser(txtuser.getText()).getRole().equals("HealthManager")){
                userAccount = system.getDirectory().getUser(txtuser.getText());
                if(userAccount.getPassword().equals(txtpass.getText())){
                    CardLayout card = (CardLayout)displayJPanel.getLayout();
                    card.show(displayJPanel, "healthpane");
                    displayNetwork(tblNetwork);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User not found.");
            }break;
            default:
            break;
            
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card3");
//        displayAdmins(jTable1);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightpanel.getLayout();
        card.show(rightpanel, "card5");
//        displayRequests(tblrequests);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)displaypanel.getLayout();
        card.show(displaypanel, "mealpane");
        displayResources(tblMeals, "Meal");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)displaypanel.getLayout();
        card.show(displaypanel, "donationpane");
        displayResources(tblDonations, "Donation");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tblMealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMealsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblMeals.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblMeals.getModel();
        Meals p = (Meals) model.getValueAt(selectedRowIndex, 0);
        
        txtname7.setText(p.getName());
        txtAddress7.setText(p.getAddress());
        txtMobile13.setText(p.getPhone());
    }//GEN-LAST:event_tblMealsMouseClicked

    private void btnAdd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd7ActionPerformed
        // TODO add your handling code here:
        Meals m = (Meals)system.getNetworkList().get(0).getEnterpriseDirectory().getResources().addResources(Organization.Type.Meals, txtname7.getText(), txtAddress7.getText());
        m.setPhone(txtMobile13.getValue().toString());
        txtname7.setText("");
        txtAddress7.setText("");
        txtMobile13.setText("");
        displayResources(tblMeals, "Meal");
        JOptionPane.showMessageDialog(this,"Restaurant Added!");
    }//GEN-LAST:event_btnAdd7ActionPerformed

    private void btnAdd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd10ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblMeals.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblMeals.getModel();
        Meals p = (Meals) model.getValueAt(selectedRowIndex, 0);
        
        p.setName(txtname7.getText());
        p.setAddress(txtAddress7.getText());
        p.setPhone(txtMobile13.getValue().toString());
        txtname7.setText("");
        txtAddress7.setText("");
        txtMobile13.setText("");
                JOptionPane.showMessageDialog(this,"Restaurant updated!");
        displayResources(tblMeals, "Meal");
    }//GEN-LAST:event_btnAdd10ActionPerformed

    private void tblDonationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonationsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDonations.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        Meals p = (Meals) model.getValueAt(selectedRowIndex, 0);
        
        txtname8.setText(p.getName());
        txtAddress8.setText(p.getAddress());
        txtMobile15.setText(p.getPhone());
    }//GEN-LAST:event_tblDonationsMouseClicked

    private void btnAdd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd15ActionPerformed
        // TODO add your handling code here:
        Donations m = (Donations)system.getNetworkList().get(0).getEnterpriseDirectory().getResources().addResources(Organization.Type.Donations, txtname8.getText(), txtAddress8.getText());
        m.setPhone(txtMobile15.getText());
        txtname8.setText("");
        txtAddress8.setText("");
        txtMobile15.setText("");
                JOptionPane.showMessageDialog(this,"Donation Center Added!");

        displayResources(tblDonations, "Donation");
    }//GEN-LAST:event_btnAdd15ActionPerformed

    private void btnAdd16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd16ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDonations.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        Donations p = (Donations) model.getValueAt(selectedRowIndex, 0);
        
        p.setName(txtname8.getText());
        p.setAddress(txtAddress8.getText());
        p.setPhone(txtMobile15.getText());
        
        txtname8.setText("");
        txtAddress8.setText("");
        txtMobile15.setText("");
                JOptionPane.showMessageDialog(this,"Donation Center Updated!");

        displayResources(tblDonations, "Donation");
    }//GEN-LAST:event_btnAdd16ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel4.getLayout();
        card.show(jPanel4, "shelterscard");
        displayShelters(tblShelter1);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel4.getLayout();
        card.show(jPanel4, "resourcecard");
        displayResources(tblResources5);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void tblResources5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResources5MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDonations.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        Organization p = (Organization) model.getValueAt(selectedRowIndex, 0);
    }//GEN-LAST:event_tblResources5MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel4.getLayout();
        card.show(jPanel4, "healthcard");
        displayHealth(tblResources4);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void tblResources4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResources4MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDonations.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        Organization p = (Organization) model.getValueAt(selectedRowIndex, 0);
    }//GEN-LAST:event_tblResources4MouseClicked

    private void tblShelter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShelter1MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDonations.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        Organization p = (Organization) model.getValueAt(selectedRowIndex, 0);
    }//GEN-LAST:event_tblShelter1MouseClicked

    private void btnNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card2");
        displayNetwork(tblNetwork);
    }//GEN-LAST:event_btnNetworkActionPerformed

    private void btnResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResourcesActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card6");
        displayResources(tblResources);
//        displayResources(tblResources, "Donation");
    }//GEN-LAST:event_btnResourcesActionPerformed

    private void btnJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobsActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card7");
//        displayJobs(tblResources1);
    }//GEN-LAST:event_btnJobsActionPerformed

    private void btnHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightPanel.getLayout();
        card.show(rightPanel, "card8");
//        displayHealth(tblResources2);
    }//GEN-LAST:event_btnHealthActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightpanel.getLayout();
        card.show(rightpanel, "card2");
        displayShelters(tblNGO);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)rightpanel.getLayout();
        card.show(rightpanel, "card3");
        displayShelters(tblPrivate);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:\
        CardLayout card = (CardLayout)rightpanel.getLayout();
        card.show(rightpanel, "card4");
        displayShelters(tblgovt);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel2.getLayout();
        card.show(jPanel2, "card2");
//        displayHealth(tblMedical);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel2.getLayout();
        card.show(jPanel2, "card3");
//        displayHealth(tblCouncelling);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel2.getLayout();
        card.show(jPanel2, "card4");
//        displaydisplayHealth(tblrequests1);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void btnAdd26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd26ActionPerformed

    private void btnAdd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd11ActionPerformed
        // TODO add your handling code here:
        ShelterGovernment m = (ShelterGovernment)system.getNetworkList().get(0).getEnterpriseDirectory().getShelters().addShelter(Organization.Type.GovernmentShelter, txtname6.getText(), txtAddress6.getText());
        m.setGender((txtGender3.getText()));
        m.setPhone(txtMobile12.getText());        
//        enterprises.getShelters().addShelter
    }//GEN-LAST:event_btnAdd11ActionPerformed

    private void btnAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd5ActionPerformed
        // TODO add your handling code here:
        
        ShelterNGO m = (ShelterNGO)system.getNetworkList().get(0).getEnterpriseDirectory().getShelters().addShelter(Organization.Type.NGOShelter, txtname4.getText(), txtAddress4.getText());
        m.setGender((txtGender1.getText()));
        m.setPhone(txtGender4.getText());   
    }//GEN-LAST:event_btnAdd5ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnAdd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd8ActionPerformed
        // TODO add your handling code here:
        ShelterPrivate m = (ShelterPrivate)system.getNetworkList().get(0).getEnterpriseDirectory().getShelters().addShelter(Organization.Type.PrivateShelter, txtname5.getText(), txtAddress5.getText());
        m.setGender((txtGender2.getText()));
        m.setPhone(txtMobile9.getText()); 
    }//GEN-LAST:event_btnAdd8ActionPerformed

    private void btnAdd17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd17ActionPerformed
        // TODO add your handling code here:
        Jobs m = (Jobs)system.getNetworkList().get(0).getEnterpriseDirectory().getJobs().addJob(Organization.Type.Jobs, txtname9.getText(), txtAddress9.getText());
//        m.setGender((txtGender2.getText()));
        m.setPhone(txtMobile17.getText()); 
    }//GEN-LAST:event_btnAdd17ActionPerformed

    private void btnAdd18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd18ActionPerformed
        // TODO add your handling code here:
        int selectedHospital= tblResources3.getSelectedRow();

            DefaultTableModel model = (DefaultTableModel) tblResources3.getModel();
            Jobs hospital = (Jobs) model.getValueAt(selectedHospital, 0);

            hospital.setName(txtname9.getText());
            hospital.setAddress(txtAddress9.getText());
            hospital.setPhone(txtMobile17.getText());
            //            house.setLastUpdatedDate(new Date());
            JOptionPane.showMessageDialog(this, "Successfully Saved");
            txtname9.setText("");
            txtAddress9.setText("");
            txtMobile17.setText("");
        
    }//GEN-LAST:event_btnAdd18ActionPerformed

    private void btnAdd19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd19ActionPerformed
        // TODO add your handling code here:
        int selectedCommunity = tblResources3.getSelectedRow();
        if(selectedCommunity < 0) {
            JOptionPane.showMessageDialog(this,"Please select a Community to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblResources3.getModel();
//        Jobs community = (Jobs) model.getValueAt(selectedCommunity, 0);

        txtname9.setText((String) model.getValueAt(selectedCommunity, 0));
        txtAddress9.setText((String) model.getValueAt(selectedCommunity, 2));
        txtMobile17.setText((String) model.getValueAt(selectedCommunity, 3));
                
    }//GEN-LAST:event_btnAdd19ActionPerformed

    private void btnAdd13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd13ActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = tblMeals.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblMeals.getModel();
        Meals p = (Meals) model.getValueAt(selectedRowIndex, 0);
        system.getNetworkList().get(0).getEnterpriseDirectory().getResources().deleteMeal(p);
        txtname7.setText("");
        txtAddress7.setText("");
        txtMobile13.setText("");
                JOptionPane.showMessageDialog(this,"Restaurant removed!");

        displayResources(tblMeals, "Meal");
    }//GEN-LAST:event_btnAdd13ActionPerformed

    private void btnAdd27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd27ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDonations.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        Donations p = (Donations) model.getValueAt(selectedRowIndex, 0);
        system.getNetworkList().get(0).getEnterpriseDirectory().getResources().deleteDonation(p);
        txtname8.setText("");
        txtAddress8.setText("");
        txtMobile15.setText("");
                JOptionPane.showMessageDialog(this,"Donation center removed!");

        displayResources(tblDonations, "Donation");
        
    }//GEN-LAST:event_btnAdd27ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Address1;
    private javax.swing.JLabel Address14;
    private javax.swing.JLabel Address15;
    private javax.swing.JLabel Address18;
    private javax.swing.JLabel Address19;
    private javax.swing.JLabel Address2;
    private javax.swing.JLabel Address20;
    private javax.swing.JLabel Address21;
    private javax.swing.JLabel Address23;
    private javax.swing.JLabel Address24;
    private javax.swing.JLabel Address26;
    private javax.swing.JLabel Address27;
    private javax.swing.JLabel Address28;
    private javax.swing.JLabel Address29;
    private javax.swing.JLabel Address3;
    private javax.swing.JLabel Address30;
    private javax.swing.JLabel Address31;
    private javax.swing.JLabel Address4;
    private javax.swing.JLabel Address5;
    private javax.swing.JLabel Address6;
    private javax.swing.JLabel Address7;
    private javax.swing.JLabel Address9;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel CounsellingPanel;
    private javax.swing.JPanel CreatePanel;
    private javax.swing.JPanel DonationsPanel;
    private javax.swing.JPanel EmployementPanel;
    private javax.swing.JPanel GovtPanel;
    private javax.swing.JPanel HealthPanel;
    private javax.swing.JPanel HealthViewPanel;
    private javax.swing.JPanel HomelessPanel;
    private javax.swing.JPanel JobsPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainResourcePanel;
    private javax.swing.JPanel MealsPanel;
    private javax.swing.JPanel MedicalPanel;
    private javax.swing.JPanel NGOPanel;
    private javax.swing.JPanel NetworkPanel;
    private javax.swing.JPanel PanelHealth;
    private javax.swing.JPanel PanelHomelessPerson;
    private javax.swing.JPanel PrivatePanel;
    private javax.swing.JPanel RequestPanel;
    private javax.swing.JPanel RequestsPanel;
    private javax.swing.JPanel ResourcePanel;
    private javax.swing.JPanel ResourcesPanel;
    private javax.swing.JPanel ShelterPanel;
    private javax.swing.JPanel ShelterViewPanel;
    private javax.swing.JPanel SheltersPanel;
    private javax.swing.JPanel SystemAdmin;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd10;
    private javax.swing.JButton btnAdd11;
    private javax.swing.JButton btnAdd12;
    private javax.swing.JButton btnAdd13;
    private javax.swing.JButton btnAdd15;
    private javax.swing.JButton btnAdd16;
    private javax.swing.JButton btnAdd17;
    private javax.swing.JButton btnAdd18;
    private javax.swing.JButton btnAdd19;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd20;
    private javax.swing.JButton btnAdd21;
    private javax.swing.JButton btnAdd22;
    private javax.swing.JButton btnAdd23;
    private javax.swing.JButton btnAdd24;
    private javax.swing.JButton btnAdd25;
    private javax.swing.JButton btnAdd26;
    private javax.swing.JButton btnAdd27;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnAdd4;
    private javax.swing.JButton btnAdd5;
    private javax.swing.JButton btnAdd6;
    private javax.swing.JButton btnAdd7;
    private javax.swing.JButton btnAdd8;
    private javax.swing.JButton btnAdd9;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JButton btnHealth;
    private javax.swing.JButton btnHomeless1;
    private javax.swing.JButton btnJobs;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnNetwork;
    private javax.swing.JButton btnResources;
    private javax.swing.JButton btnShelters1;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSysAdmin;
    private javax.swing.JButton btnView2;
    private javax.swing.JButton btnView3;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton btnsubmit1;
    private javax.swing.JButton btnview;
    private javax.swing.JButton btnview1;
    private javax.swing.JButton btnview2;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JPanel displaypanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxEnterprise;
    private javax.swing.JComboBox<String> jComboBoxHealth;
    private javax.swing.JComboBox<String> jComboBoxHealth1;
    private javax.swing.JComboBox<String> jComboBoxHealth2;
    private javax.swing.JComboBox<String> jComboBoxNetwork;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JComboBox<String> jComboBoxShelter;
    private javax.swing.JComboBox<String> jComboBoxShelter1;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxStatus1;
    private javax.swing.JComboBox<String> jComboBoxshelter;
    private javax.swing.JComboBox<String> jComboBoxshelter1;
    private javax.swing.JComboBox<String> jComboBoxshelter2;
    private javax.swing.JComboBox<String> jComboBoxshelter3;
    private javax.swing.JComboBox<String> jComboBoxshelter4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblphoto1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JTable tblCouncelling;
    private javax.swing.JTable tblDonations;
    private javax.swing.JTable tblHomeless;
    private javax.swing.JTable tblMeals;
    private javax.swing.JTable tblMedical;
    private javax.swing.JTable tblNGO;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTable tblPrivate;
    private javax.swing.JTable tblResources;
    private javax.swing.JTable tblResources1;
    private javax.swing.JTable tblResources2;
    private javax.swing.JTable tblResources3;
    private javax.swing.JTable tblResources4;
    private javax.swing.JTable tblResources5;
    private javax.swing.JTable tblShelter;
    private javax.swing.JTable tblShelter1;
    private javax.swing.JTable tblgovt;
    private javax.swing.JTable tblrequests;
    private javax.swing.JTable tblrequests1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress10;
    private javax.swing.JTextField txtAddress11;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddress3;
    private javax.swing.JTextField txtAddress4;
    private javax.swing.JTextField txtAddress5;
    private javax.swing.JTextField txtAddress6;
    private javax.swing.JTextField txtAddress7;
    private javax.swing.JTextField txtAddress8;
    private javax.swing.JTextField txtAddress9;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtGender2;
    private javax.swing.JTextField txtGender3;
    private javax.swing.JTextField txtGender4;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtMobile1;
    private javax.swing.JTextField txtMobile12;
    private javax.swing.JFormattedTextField txtMobile13;
    private javax.swing.JFormattedTextField txtMobile15;
    private javax.swing.JTextField txtMobile17;
    private javax.swing.JTextField txtMobile18;
    private javax.swing.JTextField txtMobile19;
    private javax.swing.JTextField txtMobile2;
    private javax.swing.JTextField txtMobile3;
    private javax.swing.JTextField txtMobile9;
    private javax.swing.JTextField txtName4;
    private javax.swing.JTextField txtName5;
    private javax.swing.JTextField txtNetwork;
    private javax.swing.JTextField txtRequest;
    private javax.swing.JTextField txtRequest1;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtage1;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtgender1;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtname10;
    private javax.swing.JTextField txtname11;
    private javax.swing.JTextField txtname2;
    private javax.swing.JTextField txtname3;
    private javax.swing.JTextField txtname4;
    private javax.swing.JTextField txtname5;
    private javax.swing.JTextField txtname6;
    private javax.swing.JTextField txtname7;
    private javax.swing.JTextField txtname8;
    private javax.swing.JTextField txtname9;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtuserid1;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel workJPanel;
    private javax.swing.JPanel workarea;
    // End of variables declaration//GEN-END:variables
}
