/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package campusLink;

import static campusLink.AdminFrame.regno;
import net.proteanit.sql.DbUtils;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;

/**
 *
 * @author subod
 */
public class StaffFrame extends javax.swing.JFrame {
    //Admin backend = new Admin();
    /**
     * Creates new form AdminMainFrame
     */
     DefaultTableModel model ;
    int Myindex ;
    protected static final String url = "jdbc:mysql://127.0.0.1:3306/javaportal?zeroDateTimeBehavior=CONVERT_TO_NULL";
    protected static final String usrn = "SAGA";
    protected static final String pass = "JAVASAGA@123";
    String sear_opt = "";
    protected static Long regno = 21000000001L;
    protected static Long fidno = 210001L;
    protected static Long sstaff = 210001L;
    StaffBackEnd abe = new StaffBackEnd();
    
    
    public StaffFrame() {
        initComponents();
        branchcombobox();
        displaybranchcombobox();
        
    }
    
    final void displaybranchcombobox()
    {
        String list = "SELECT * FROM settings";
        try {
            // Load the JDBC driver
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            // Create a statement object to execute the SQL query
            try ( // Establish a connection to the database
                    Connection con = DriverManager.getConnection(url, usrn, pass); // Create a statement object to execute the SQL query
                    Statement st = con.createStatement()) {
                // Execute the query and store the result set
                ResultSet rs = st.executeQuery(list);
                // Iterate through the result set and print each record to the console
                rs.next();
                
                String bn = rs.getString(2); //branchbox
                
                String bm = rs.getString(3).toUpperCase(); //rolebox
                rs.next();
                rs.next();
                String bl = rs.getString(2); //branchbox 
                
                String bk = rs.getString(3).toUpperCase(); //rolebox
                
                System.out.println(bl);
                
                String[] op = bl.split("\\,");
                String[] op1 = bk.split("\\,");
//                for(String s:op)
//                {
//                System.out.println(s);
//                }
//                for(String s:op1)
//                {
//                System.out.println(s);
//                }
                
                ArrayList<String> branchoptions = new ArrayList<>();
                ArrayList<String> roleoptions = new ArrayList<>();
                
                branchoptions.add(bn);
                roleoptions.add(bm);
                
                branchoptions.addAll(Arrays.asList(op));
                roleoptions.addAll(Arrays.asList(op1));
                
                DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(branchoptions.toArray(String[]::new));
                
                DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(roleoptions.toArray(String[]::new));
                rolebox.setModel(model2);
                rolebox1.setModel(model2);
                // Close the ResultSet, Statement, and Connection objects
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    final void branchcombobox()
    {
        String list = "SELECT * FROM settings";
        try {
            // Load the JDBC driver
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            // Create a statement object to execute the SQL query
            try ( // Establish a connection to the database
                    Connection con = DriverManager.getConnection(url, usrn, pass); // Create a statement object to execute the SQL query
                    Statement st = con.createStatement()) {
                // Execute the query and store the result set
                ResultSet rs = st.executeQuery(list);
                // Iterate through the result set and print each record to the console
                rs.next();
                
                String bn = rs.getString(2); //branchbox
                
                String bm = rs.getString(3).toUpperCase(); //rolebox
                rs.next();
                rs.next();
                String bl = rs.getString(2); //branchbox 
                
                String bk = rs.getString(3).toUpperCase(); //rolebox
                
                System.out.println(bl);
                branchBoxEdit.append(bl);
                roleBoxEdit.append(bk);
                String[] op = bl.split("\\,");
                String[] op1 = bk.split("\\,");
//                for(String s:op)
//                {
//                System.out.println(s);
//                }
//                for(String s:op1)
//                {
//                System.out.println(s);
//                }
                
                ArrayList<String> branchoptions = new ArrayList<>();
                ArrayList<String> roleoptions = new ArrayList<>();
                
                branchoptions.add(bn);
                roleoptions.add(bm);
                
                branchoptions.addAll(Arrays.asList(op));
                roleoptions.addAll(Arrays.asList(op1));
                
                DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(branchoptions.toArray(String[]::new));
                
                DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(roleoptions.toArray(String[]::new));
                rolebox.setModel(model2);
                    
                // Close the ResultSet, Statement, and Connection objects
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
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

        search = new javax.swing.ButtonGroup();
        ustaff = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        sideMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cardsL = new javax.swing.JPanel();
        maincard = new javax.swing.JPanel();
        addusrbtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        searchusrbtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcomename = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        addusrcard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        nfirstname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nsurname = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        nmailid = new javax.swing.JTextField();
        idnoLabel = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        phno = new javax.swing.JLabel();
        nphono = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rolebox = new javax.swing.JComboBox<>();
        dayD = new javax.swing.JComboBox<>();
        monthD = new javax.swing.JComboBox<>();
        yearD = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        searchusrcard = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        searchTitle = new javax.swing.JLabel();
        searchEntry = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        attendcard = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        attenTable = new javax.swing.JTable();
        resultcard = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        updatecard = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        searchTitle1 = new javax.swing.JLabel();
        searchEntry1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        ufirstname = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        usurname = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        umailid = new javax.swing.JTextField();
        idnoLabel1 = new javax.swing.JLabel();
        uidno = new javax.swing.JTextField();
        phno1 = new javax.swing.JLabel();
        uphono = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        udob = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        rolebox1 = new javax.swing.JComboBox<>();
        settingscard = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchBoxEdit = new javax.swing.JTextArea();
        branchboxeditsavebtn = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        roleBoxEdit = new javax.swing.JTextArea();
        roleboxeditsavebtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        sideMenu.setBackground(new java.awt.Color(1, 1, 1));

        jLabel2.setBackground(new java.awt.Color(1, 1, 1));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 192, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(1, 1, 1));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 248, 239));
        jButton1.setText("BACK");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 192, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LOGOUT");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(1, 1, 1));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 248, 239));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD USER");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(1, 1, 1));
        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 248, 239));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEARCH USERS");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(1, 1, 1));
        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 248, 239));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("UPDATE USER");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(1, 1, 1));
        jLabel43.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(245, 192, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("SETTINGS");
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sideMenuLayout = new javax.swing.GroupLayout(sideMenu);
        sideMenu.setLayout(sideMenuLayout);
        sideMenuLayout.setHorizontalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideMenuLayout.setVerticalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(76, 76, 76)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(34, 34, 34))
        );

        jSplitPane1.setLeftComponent(sideMenu);

        cardsL.setLayout(new java.awt.CardLayout());

        maincard.setBackground(new java.awt.Color(252, 248, 239));

        addusrbtn.setBackground(new java.awt.Color(245, 192, 0));
        addusrbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addusrbtn.setPreferredSize(new java.awt.Dimension(200, 200));
        addusrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addusrbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addusrbtnMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("ADD USER");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusLink/Resources/adduser_logo.png"))); // NOI18N

        javax.swing.GroupLayout addusrbtnLayout = new javax.swing.GroupLayout(addusrbtn);
        addusrbtn.setLayout(addusrbtnLayout);
        addusrbtnLayout.setHorizontalGroup(
            addusrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addusrbtnLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(addusrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        addusrbtnLayout.setVerticalGroup(
            addusrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addusrbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        searchusrbtn.setBackground(new java.awt.Color(245, 192, 0));
        searchusrbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchusrbtn.setPreferredSize(new java.awt.Dimension(200, 200));
        searchusrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchusrbtnMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setText("SEARCH USERS");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusLink/Resources/searchuser_logo.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout searchusrbtnLayout = new javax.swing.GroupLayout(searchusrbtn);
        searchusrbtn.setLayout(searchusrbtnLayout);
        searchusrbtnLayout.setHorizontalGroup(
            searchusrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchusrbtnLayout.createSequentialGroup()
                .addGroup(searchusrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchusrbtnLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchusrbtnLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        searchusrbtnLayout.setVerticalGroup(
            searchusrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchusrbtnLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(245, 192, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/campusLink/Resources/update_logo.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(1, 1, 1));
        jLabel31.setText("UPDATE USERS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(56, 56, 56))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel31)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 248, 239));
        jLabel1.setText("WELCOME");

        welcomename.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        welcomename.setForeground(new java.awt.Color(245, 192, 0));
        welcomename.setText("SUBODH");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 192, 0));
        jLabel4.setText("ADMIN STAFF ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcomename)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomename)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(1, 1, 1));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(252, 248, 239));
        jLabel40.setText("SETTINGS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel40)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );

        javax.swing.GroupLayout maincardLayout = new javax.swing.GroupLayout(maincard);
        maincard.setLayout(maincardLayout);
        maincardLayout.setHorizontalGroup(
            maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maincardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(maincardLayout.createSequentialGroup()
                        .addGroup(maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addusrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchusrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 553, Short.MAX_VALUE)))
                .addContainerGap())
        );
        maincardLayout.setVerticalGroup(
            maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maincardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addusrbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchusrbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(maincardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        cardsL.add(maincard, "card2");

        addusrcard.setBackground(new java.awt.Color(252, 248, 239));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 1, 1));
        jLabel23.setText("FIRST NAME");

        nfirstname.setBackground(new java.awt.Color(252, 248, 239));
        nfirstname.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        nfirstname.setForeground(new java.awt.Color(1, 1, 1));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 1, 1));
        jLabel24.setText("SURNAME");

        nsurname.setBackground(new java.awt.Color(252, 248, 239));
        nsurname.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        nsurname.setForeground(new java.awt.Color(1, 1, 1));

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 1, 1));
        jLabel25.setText("EMAIL ID");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nmailid.setBackground(new java.awt.Color(252, 248, 239));
        nmailid.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        nmailid.setForeground(new java.awt.Color(1, 1, 1));

        idnoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        idnoLabel.setForeground(new java.awt.Color(1, 1, 1));
        idnoLabel.setText("REGISTRATION NUMBER");

        idno.setBackground(new java.awt.Color(252, 248, 239));
        idno.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        idno.setForeground(new java.awt.Color(1, 1, 1));
        idno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnoActionPerformed(evt);
            }
        });

        phno.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        phno.setForeground(new java.awt.Color(1, 1, 1));
        phno.setText("PHONE NUMBER");

        nphono.setBackground(new java.awt.Color(252, 248, 239));
        nphono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        nphono.setForeground(new java.awt.Color(1, 1, 1));

        jLabel27.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(1, 1, 1));
        jLabel27.setText("DATE OF BIRTH");

        jLabel28.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(1, 1, 1));
        jLabel28.setText("-");

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 1, 1));
        jLabel29.setText("-");

        saveBtn.setBackground(new java.awt.Color(245, 192, 0));
        saveBtn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(1, 1, 1));
        saveBtn.setText("SAVE");
        saveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        saveBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(1, 1, 1));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 248, 239));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rolebox.setBackground(new java.awt.Color(252, 248, 239));
        rolebox.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        rolebox.setForeground(new java.awt.Color(1, 1, 1));
        rolebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleboxActionPerformed(evt);
            }
        });

        dayD.setBackground(new java.awt.Color(252, 248, 239));
        dayD.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        dayD.setForeground(new java.awt.Color(1, 1, 1));
        dayD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthD.setBackground(new java.awt.Color(252, 248, 239));
        monthD.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        monthD.setForeground(new java.awt.Color(1, 1, 1));
        monthD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        yearD.setBackground(new java.awt.Color(252, 248, 239));
        yearD.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        yearD.setForeground(new java.awt.Color(1, 1, 1));
        yearD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idnoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(nfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(nmailid, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(phno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nphono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rolebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dayD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthD, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(nfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(nsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(nmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phno)
                    .addComponent(nphono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(dayD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(monthD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rolebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnoLabel)
                    .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(252, 248, 239));
        jLabel21.setText("ADMIN STAFF > ADD USER");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 192, 0));
        jLabel10.setText("ADD USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        javax.swing.GroupLayout addusrcardLayout = new javax.swing.GroupLayout(addusrcard);
        addusrcard.setLayout(addusrcardLayout);
        addusrcardLayout.setHorizontalGroup(
            addusrcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addusrcardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(addusrcardLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addusrcardLayout.setVerticalGroup(
            addusrcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addusrcardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardsL.add(addusrcard, "card3");

        searchusrcard.setBackground(new java.awt.Color(252, 248, 239));

        dataTable.setBackground(new java.awt.Color(245, 192, 0));
        dataTable.setForeground(new java.awt.Color(1, 1, 1));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "REGISTRATION NUMBER", "EMAIL ID", "DATE OF BIRTH"
            }
        ));
        dataTable.setSelectionBackground(new java.awt.Color(1, 1, 1));
        dataTable.setSelectionForeground(new java.awt.Color(252, 248, 239));
        jScrollPane2.setViewportView(dataTable);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 1, 1));
        jLabel30.setText("NOTE : ENTER ANYTHING TO SEARCH");

        searchTitle.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        searchTitle.setForeground(new java.awt.Color(1, 1, 1));
        searchTitle.setText("SEARCH");

        searchEntry.setBackground(new java.awt.Color(252, 248, 239));
        searchEntry.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        searchEntry.setForeground(new java.awt.Color(1, 1, 1));

        jButton3.setBackground(new java.awt.Color(245, 192, 0));
        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(1, 1, 1));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(1, 1, 1));
        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(252, 248, 239));
        jButton4.setText("CLEAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel30))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(searchTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTitle)
                    .addComponent(searchEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(1, 1, 1));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(245, 192, 0));
        jLabel13.setText("SEARCH USER");

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(252, 248, 239));
        jLabel22.setText("ADMIN STAFF > SEARCH USER");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchusrcardLayout = new javax.swing.GroupLayout(searchusrcard);
        searchusrcard.setLayout(searchusrcardLayout);
        searchusrcardLayout.setHorizontalGroup(
            searchusrcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
            .addGroup(searchusrcardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchusrcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        searchusrcardLayout.setVerticalGroup(
            searchusrcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchusrcardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        cardsL.add(searchusrcard, "card4");

        attendcard.setBackground(new java.awt.Color(245, 192, 0));

        jPanel12.setBackground(new java.awt.Color(1, 1, 1));

        jLabel42.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(245, 192, 0));
        jLabel42.setText("ATTENDANCE");

        jLabel45.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(252, 248, 239));
        jLabel45.setText("ADMIN STAFF > ATTENDANCE POSTING");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel45))
                .addContainerGap(615, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(1, 1, 1));
        jLabel46.setText("DATE [DD/MM/YYYY]");

        jButton8.setBackground(new java.awt.Color(1, 1, 1));
        jButton8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(252, 248, 239));
        jButton8.setText("search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        day.setBackground(new java.awt.Color(252, 248, 239));
        day.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        day.setForeground(new java.awt.Color(1, 1, 1));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        month.setBackground(new java.awt.Color(252, 248, 239));
        month.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        month.setForeground(new java.awt.Color(1, 1, 1));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        year.setBackground(new java.awt.Color(252, 248, 239));
        year.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        year.setForeground(new java.awt.Color(1, 1, 1));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton8))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(524, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(25, 25, 25))
        );

        attenTable.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        attenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        attenTable.setRowHeight(24);
        attenTable.setRowMargin(2);
        attenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attenTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(attenTable);

        javax.swing.GroupLayout attendcardLayout = new javax.swing.GroupLayout(attendcard);
        attendcard.setLayout(attendcardLayout);
        attendcardLayout.setHorizontalGroup(
            attendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendcardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        attendcardLayout.setVerticalGroup(
            attendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendcardLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardsL.add(attendcard, "card6");

        resultcard.setBackground(new java.awt.Color(245, 192, 0));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(1, 1, 1));
        jLabel20.setText("RESULTS");

        javax.swing.GroupLayout resultcardLayout = new javax.swing.GroupLayout(resultcard);
        resultcard.setLayout(resultcardLayout);
        resultcardLayout.setHorizontalGroup(
            resultcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultcardLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel20)
                .addContainerGap(792, Short.MAX_VALUE))
        );
        resultcardLayout.setVerticalGroup(
            resultcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultcardLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel20)
                .addContainerGap(567, Short.MAX_VALUE))
        );

        cardsL.add(resultcard, "card7");

        updatecard.setBackground(new java.awt.Color(252, 248, 239));

        jPanel8.setBackground(new java.awt.Color(1, 1, 1));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(245, 192, 0));
        jLabel32.setText("UPDATE USER");

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(252, 248, 239));
        jLabel38.setText("ADMIN > UPDATE");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        dataTable1.setBackground(new java.awt.Color(245, 192, 0));
        dataTable1.setForeground(new java.awt.Color(1, 1, 1));
        dataTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "REGISTRATION NUMBER", "EMAIL ID", "DATE OF BIRTH"
            }
        ));
        dataTable1.setSelectionBackground(new java.awt.Color(1, 1, 1));
        dataTable1.setSelectionForeground(new java.awt.Color(252, 248, 239));
        dataTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dataTable1);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(1, 1, 1));
        jLabel37.setText("NOTE : ENTER ANYTHING TO SEARCH");

        searchTitle1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        searchTitle1.setForeground(new java.awt.Color(1, 1, 1));
        searchTitle1.setText("FILTER");

        searchEntry1.setBackground(new java.awt.Color(252, 248, 239));
        searchEntry1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        searchEntry1.setForeground(new java.awt.Color(1, 1, 1));

        jButton6.setBackground(new java.awt.Color(1, 1, 1));
        jButton6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(252, 248, 239));
        jButton6.setText("SEARCH");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(searchTitle1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTitle1)
                    .addComponent(searchEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 1, 1));
        jLabel33.setText("FIRST NAME");

        ufirstname.setBackground(new java.awt.Color(252, 248, 239));
        ufirstname.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ufirstname.setForeground(new java.awt.Color(1, 1, 1));

        jLabel34.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 1, 1));
        jLabel34.setText("SURNAME");

        usurname.setBackground(new java.awt.Color(252, 248, 239));
        usurname.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        usurname.setForeground(new java.awt.Color(1, 1, 1));

        jLabel35.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(1, 1, 1));
        jLabel35.setText("EMAIL ID");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        umailid.setBackground(new java.awt.Color(252, 248, 239));
        umailid.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        umailid.setForeground(new java.awt.Color(1, 1, 1));

        idnoLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        idnoLabel1.setForeground(new java.awt.Color(1, 1, 1));
        idnoLabel1.setText("REGISTRATION NUMBER");

        uidno.setBackground(new java.awt.Color(252, 248, 239));
        uidno.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        uidno.setForeground(new java.awt.Color(1, 1, 1));
        uidno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidnoActionPerformed(evt);
            }
        });

        phno1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        phno1.setForeground(new java.awt.Color(1, 1, 1));
        phno1.setText("PHONE NUMBER");

        uphono.setBackground(new java.awt.Color(252, 248, 239));
        uphono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        uphono.setForeground(new java.awt.Color(1, 1, 1));

        jLabel36.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(1, 1, 1));
        jLabel36.setText("DATE OF BIRTH");

        udob.setBackground(new java.awt.Color(252, 248, 239));
        udob.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        udob.setForeground(new java.awt.Color(1, 1, 1));

        jButton5.setBackground(new java.awt.Color(1, 1, 1));
        jButton5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(252, 248, 239));
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(245, 192, 0));
        updateBtn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(1, 1, 1));
        updateBtn.setText("UPDATE");
        updateBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        updateBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(1, 1, 1));
        jButton7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(252, 248, 239));
        jButton7.setText("DELETE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        rolebox1.setBackground(new java.awt.Color(252, 248, 239));
        rolebox1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        rolebox1.setForeground(new java.awt.Color(1, 1, 1));
        rolebox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolebox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ufirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usurname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(umailid, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(idnoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uidno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(phno1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uphono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(udob, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(rolebox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(ufirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(usurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(umailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phno1)
                    .addComponent(uphono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(udob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(rolebox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idnoLabel1)
                            .addComponent(uidno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(updateBtn)))
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout updatecardLayout = new javax.swing.GroupLayout(updatecard);
        updatecard.setLayout(updatecardLayout);
        updatecardLayout.setHorizontalGroup(
            updatecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(updatecardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        updatecardLayout.setVerticalGroup(
            updatecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatecardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
        );

        cardsL.add(updatecard, "card8");

        settingscard.setBackground(new java.awt.Color(245, 192, 0));

        jLabel41.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(1, 1, 1));
        jLabel41.setText("ROLE");

        branchBoxEdit.setBackground(new java.awt.Color(252, 248, 239));
        branchBoxEdit.setColumns(20);
        branchBoxEdit.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        branchBoxEdit.setForeground(new java.awt.Color(1, 1, 1));
        branchBoxEdit.setRows(5);
        branchBoxEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(branchBoxEdit);

        branchboxeditsavebtn.setBackground(new java.awt.Color(1, 1, 1));
        branchboxeditsavebtn.setForeground(new java.awt.Color(245, 192, 0));
        branchboxeditsavebtn.setText("SAVE");
        branchboxeditsavebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchboxeditsavebtnActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(1, 1, 1));
        jLabel44.setText("BRANCH");

        roleBoxEdit.setBackground(new java.awt.Color(252, 248, 239));
        roleBoxEdit.setColumns(20);
        roleBoxEdit.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        roleBoxEdit.setForeground(new java.awt.Color(1, 1, 1));
        roleBoxEdit.setRows(5);
        roleBoxEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(roleBoxEdit);

        roleboxeditsavebtn1.setBackground(new java.awt.Color(1, 1, 1));
        roleboxeditsavebtn1.setForeground(new java.awt.Color(245, 192, 0));
        roleboxeditsavebtn1.setText("SAVE");
        roleboxeditsavebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleboxeditsavebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingscardLayout = new javax.swing.GroupLayout(settingscard);
        settingscard.setLayout(settingscardLayout);
        settingscardLayout.setHorizontalGroup(
            settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingscardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingscardLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roleboxeditsavebtn1))
                    .addGroup(settingscardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel41))
                    .addGroup(settingscardLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branchboxeditsavebtn)))
                .addContainerGap(639, Short.MAX_VALUE))
            .addGroup(settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingscardLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel44)
                    .addContainerGap(881, Short.MAX_VALUE)))
        );
        settingscardLayout.setVerticalGroup(
            settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingscardLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(branchboxeditsavebtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(settingscardLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roleboxeditsavebtn1))
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(settingscardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingscardLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabel44)
                    .addContainerGap(564, Short.MAX_VALUE)))
        );

        cardsL.add(settingscard, "card9");

        jSplitPane1.setRightComponent(cardsL);

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


    private void addusrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addusrbtnMouseClicked
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card3");
        displaybranchcombobox();
        
    }//GEN-LAST:event_addusrbtnMouseClicked

    private void searchusrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchusrbtnMouseClicked
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card4");
        displayAll(dataTable);
        clearEntries();
        
    }//GEN-LAST:event_searchusrbtnMouseClicked

    private void idnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnoActionPerformed
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
           
        String firstname = nfirstname.getText().toUpperCase();
        String surname = nsurname.getText().toUpperCase();
        String roleboxname = rolebox.getSelectedItem().toString();
        
        System.out.println(roleboxname);
        String mail = nmailid.getText();
        String day = dayD.getSelectedItem().toString();
        String month = monthD.getSelectedItem().toString();
        String year = yearD.getSelectedItem().toString();
        
        String phono = nphono.getText();
        String dob = year + month + day ;
        
        abe.AddUserSaveBtn(firstname,surname,roleboxname,mail,phono,dob,idno);
        
    
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nfirstname.setText("");
        nsurname.setText("");
        nmailid.setText("");
        nphono.setText("");
        dayD.setSelectedIndex(1);
        monthD.setSelectedIndex(1);
        yearD.setSelectedIndex(1);
        idno.setText("");
        rolebox.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void displayAll(javax.swing.JTable dataTable)
    {
         String display_query = "SELECT * FROM staffusers ";
        try {
            // Load the MySQL JDBC driver
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            // Print the stack trace if an exception is thrown
            System.out.println(e);
        }
        try {
            // Establish a connection to the database using the URL, username, and password
            Connection con = DriverManager.getConnection(url, usrn, pass);
            try ( // Create a statement object to execute the SQL query
                Statement st = con.createStatement(); ResultSet rs = st.executeQuery(display_query)) {
                //StringBuilder data = new StringBuilder();
                boolean found = false;
                if(rs!=null)
                {
                    found = true;
                   dataTable.setModel(DbUtils.resultSetToTableModel(rs));
                }
                if (!found) {
                    System.out.println("No RECORD FOUND!");
                    JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (HeadlessException | SQLException e) {
            // Print the stack trace if an exception is thrown
            System.out.println(e);
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ref = searchEntry.getText();
        abe.searchUserSearchBtn(ref,dataTable);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        displayAll(dataTable);
        searchEntry.setText("");
        search.clearSelection();
        sear_opt = "";
    }//GEN-LAST:event_jButton4MouseClicked
    protected void clearEntries()
    {
        ufirstname.setText("");
        usurname.setText("");
        umailid.setText("");
        uphono.setText("");
        udob.setText("");
        uidno.setText("");
        ustaff.clearSelection();
        searchEntry.setText("");
        rolebox1.setSelectedIndex(0);
    }
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card8");
        displayAll(dataTable1);
        clearEntries();
        displaybranchcombobox();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void uidnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidnoActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        model =  (DefaultTableModel)dataTable1.getModel();
        Myindex = dataTable1.getSelectedRow();
        
        String firstname = ufirstname.getText().toUpperCase();
        String surname = usurname.getText().toUpperCase();
        String mail = umailid.getText();
        String phono = uphono.getText();
        String dob = udob.getText() ;
        String registrationumber = uidno.getText();
        String id = dataTable1.getValueAt(Myindex,0).toString();
        int idnum = Integer.parseInt(id);
        
        String roles = rolebox1.getSelectedItem().toString();
        
        abe.searchUserUpdBtn(firstname,surname,mail,phono,dob,registrationumber,roles,idnum,dataTable1);
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ufirstname.setText("");
        usurname.setText("");
        umailid.setText("");
        uphono.setText("");
        udob.setText("");
        uidno.setText("");
        ustaff.clearSelection();
        dataTable1.clearSelection();
        rolebox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dataTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTable1MouseClicked
            model =  (DefaultTableModel)dataTable1.getModel();
            Myindex = dataTable1.getSelectedRow();
            ufirstname.setText(dataTable1.getValueAt(Myindex,1).toString());
            usurname.setText(dataTable1.getValueAt(Myindex,2).toString());
            uidno.setText(dataTable1.getValueAt(Myindex,3).toString());
            uphono.setText(dataTable1.getValueAt(Myindex,4).toString());
            udob.setText(dataTable1.getValueAt(Myindex,7).toString());
            umailid.setText(dataTable1.getValueAt(Myindex,6).toString());
            Object roles = dataTable1.getValueAt(Myindex,5);
//            
//            switch (roles) {
//            case "STUDENT" -> rolebox1.setSelectedItem(roles);
//            case "FACULTY" -> rolebox1.setSelectedItem(roles);
//            case "SUPPORT STAFF" -> rolebox1.setSelectedItem(roles);
//            default -> {
//                ustaff.clearSelection();
//                }
//        }
            rolebox1.setSelectedItem(roles);
            
//            switch (branch) {
//            case "STUDENT" -> rolebox1.setSelectedItem(roles);
//            case "FACULTY" -> rolebox1.setSelectedItem(roles);
//            case "SUPPORT STAFF" -> rolebox1.setSelectedItem(roles);
//            default -> {
//                ustaff.clearSelection();
//                }
//        }
            
    }//GEN-LAST:event_dataTable1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        String ref = searchEntry1.getText();
        
        
        String search_query = "SELECT * FROM staffusers WHERE CONCAT_WS(' ',FIRST_NAME,LAST_NAME,REGISTRATION_NUMBER,PHONE_NO,ROLES,EMAIL_ID,DATE_OF_BIRTH) LIKE '%" + ref + "%'";


        try {
            // Load the MySQL JDBC driver
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            // Print the stack trace if an exception is thrown
            System.out.println(e);
        }
        try {
            // Establish a connection to the database using the URL, username, and password
            Connection con = DriverManager.getConnection(url, usrn, pass);
            try ( // Create a statement object to execute the SQL query
                Statement st = con.createStatement(); ResultSet rs = st.executeQuery(search_query)) {
             
                boolean found = false;
                if(rs!=null)
                {
                    found = true;
                   dataTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
                if (!found) {
                    System.out.println("No RECORD FOUND!");
                    JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (HeadlessException | SQLException e) {
            // Print the stack trace if an exception is thrown
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        model =  (DefaultTableModel)dataTable1.getModel();
        Myindex = dataTable1.getSelectedRow();
        int confirmed=0;
        if(ufirstname.getText().isEmpty() || usurname.getText().isEmpty()||uphono.getText().isEmpty()||umailid.getText().equals("") || udob.getText().equals("") || rolebox1.getSelectedItem().toString().equals("ROLE") ) {
            System.out.println("All details are compulsory");
            JOptionPane.showMessageDialog(null, "Kindly fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
        confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmed == JOptionPane.YES_OPTION) {
            String reg = uidno.getText();
            String firstname = ufirstname.getText().toUpperCase();
            String surname = usurname.getText().toUpperCase();
            String id = dataTable1.getValueAt(Myindex,0).toString();
            String role = rolebox1.getSelectedItem().toString();
            abe.searchUsrDelBtn(reg,firstname,surname,id,role,dataTable1);
        } 
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Warning!", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            LoginFrame l = new LoginFrame(); 
        } else {
            //do nothing
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roleboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleboxActionPerformed

    private void rolebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolebox1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card3");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card4");
        displayAll(dataTable);
        clearEntries();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        CardLayout cardLayout = (CardLayout) searchusrcard.getParent().getLayout();
        cardLayout.show(cardsL,"card8");
        displayAll(dataTable1);
        clearEntries();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        CardLayout cardLayout = (CardLayout) resultcard.getParent().getLayout();
        cardLayout.show(cardsL,"card2");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void addusrbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addusrbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addusrbtnMouseEntered

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        CardLayout cardLayout = (CardLayout) resultcard.getParent().getLayout();
        cardLayout.show(cardsL,"card9");
    }//GEN-LAST:event_jLabel43MouseClicked

    private void attenTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attenTableMouseClicked

    }//GEN-LAST:event_attenTableMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String dayD = day.getSelectedItem().toString();
        String monthD = month.getSelectedItem().toString();
        String yearD = year.getSelectedItem().toString();
        String date = "D" +"_"+yearD +"_"+ monthD +"_"+ dayD;
        boolean found = false;

        try (Connection con = DriverManager.getConnection(url, usrn, pass);
            Statement st = con.createStatement()) {

            // Check if the column exists in the table
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet rs = metaData.getColumns(null, null, "attendance", date);
            if (rs.next()) {
                found = true;
            }
            if (found) {
                // Column found, retrieve the data
                String selectQuery = "SELECT FIRST_NAME, LAST_NAME, REGISTRATION_NUMBER, BRANCH, "+date+" FROM attendance";
                PreparedStatement selectStatement = con.prepareStatement(selectQuery);
                rs = selectStatement.executeQuery();
                attenTable.setModel(DbUtils.resultSetToTableModel(rs));
            } else {
                System.out.println("No record found!");
                JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void roleboxeditsavebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleboxeditsavebtn1ActionPerformed
        String text = roleBoxEdit.getText().toUpperCase();
        String[] options = text.split("\\,");

        if(options.length < 2) {
            System.out.println("All details are compulsory");
            JOptionPane.showMessageDialog(null, "Kindly fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                // Load the JDBC driver and establish a connection to the database
                Class.forName("java.sql.Driver");
                // Create a statement object to execute the SQL query to count the number of records in the users table
                try (Connection con = DriverManager.getConnection(url, usrn, pass); // Create a statement object to execute the SQL query to count the number of records in the users table
                    Statement st = con.createStatement()) {
                    // Define a SQL query to insert a new record into the users table
                    String query = "UPDATE settings SET ROLE = '"+String.join(",",options)+"' WHERE id=2";
                    // Execute the query and store the
                    // Execute an update query to insert the new record into the users table and store the number of affected rows in the count variable
                    int count = st.executeUpdate(query);
                    // Print the number of affected rows to the console
                    System.out.println(count + " rows affected.");
                }
                // Print a success message to the console
                System.out.println("Data Has been Added successfully!");

                JOptionPane.showMessageDialog(null, "Data Saved Successfully!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                // If a ClassNotFoundException or SQLException occurs, print the stack trace to the console
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }

        System.out.println("DONE!");

    }//GEN-LAST:event_roleboxeditsavebtn1ActionPerformed

    private void branchboxeditsavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchboxeditsavebtnActionPerformed
        String text = branchBoxEdit.getText();
        String[] options = text.split("\\,");

        if(options.length < 2) {
            System.out.println("All details are compulsory");
            JOptionPane.showMessageDialog(null, "Kindly fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                // Load the JDBC driver and establish a connection to the database
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection(url, usrn, pass);
                // Create a statement object to execute the SQL query to count the number of records in the users table
                Statement st = con.createStatement();
                // Define a SQL query to insert a new record into the users table
                String query = "UPDATE settings SET BRANCH = '"+String.join(",",options)+"' WHERE id=2";
                // Execute the query and store the
                // Execute an update query to insert the new record into the users table and store the number of affected rows in the count variable
                int count = st.executeUpdate(query);
                // Print the number of affected rows to the console
                System.out.println(count + " rows affected.");
                // Close the statement object and database connection to free up resources
                st.close(); con.close();
                // Print a success message to the console
                System.out.println("Data Has been Added successfully!");

                JOptionPane.showMessageDialog(null, "Data Saved Successfully!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                // If a ClassNotFoundException or SQLException occurs, print the stack trace to the console
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }

        System.out.println("DONE!");
    }//GEN-LAST:event_branchboxeditsavebtnActionPerformed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        CardLayout cardLayout = (CardLayout) resultcard.getParent().getLayout();
        cardLayout.show(cardsL,"card9");

    }//GEN-LAST:event_jPanel10MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminMainFrame().setVisible(true);
//            }
//        });
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addusrbtn;
    private javax.swing.JPanel addusrcard;
    private javax.swing.JTable attenTable;
    private javax.swing.JPanel attendcard;
    private javax.swing.JTextArea branchBoxEdit;
    private javax.swing.JButton branchboxeditsavebtn;
    private javax.swing.JPanel cardsL;
    private javax.swing.JTable dataTable;
    private javax.swing.JTable dataTable1;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JComboBox<String> dayD;
    protected javax.swing.JTextField idno;
    private javax.swing.JLabel idnoLabel;
    private javax.swing.JLabel idnoLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel maincard;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> monthD;
    private javax.swing.JTextField nfirstname;
    private javax.swing.JTextField nmailid;
    private javax.swing.JTextField nphono;
    private javax.swing.JTextField nsurname;
    private javax.swing.JLabel phno;
    private javax.swing.JLabel phno1;
    private javax.swing.JPanel resultcard;
    private javax.swing.JTextArea roleBoxEdit;
    private javax.swing.JComboBox<String> rolebox;
    private javax.swing.JComboBox<String> rolebox1;
    private javax.swing.JButton roleboxeditsavebtn1;
    private javax.swing.JButton saveBtn;
    private javax.swing.ButtonGroup search;
    private javax.swing.JTextField searchEntry;
    private javax.swing.JTextField searchEntry1;
    private javax.swing.JLabel searchTitle;
    private javax.swing.JLabel searchTitle1;
    private javax.swing.JPanel searchusrbtn;
    private javax.swing.JPanel searchusrcard;
    private javax.swing.JPanel settingscard;
    private javax.swing.JPanel sideMenu;
    protected javax.swing.JTextField udob;
    protected javax.swing.JTextField ufirstname;
    protected javax.swing.JTextField uidno;
    protected javax.swing.JTextField umailid;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel updatecard;
    private javax.swing.JTextField uphono;
    private javax.swing.ButtonGroup ustaff;
    protected javax.swing.JTextField usurname;
    protected javax.swing.JLabel welcomename;
    private javax.swing.JComboBox<String> year;
    private javax.swing.JComboBox<String> yearD;
    // End of variables declaration//GEN-END:variables

class StaffBackEnd {
    
    protected void AddUserSaveBtn(String firstname,String surname,String roleboxname, String mail, String phono, String dob, javax.swing.JTextField idno)
    {
        if(firstname.isEmpty() || surname.isEmpty()||phono.isEmpty()||mail.equals("") || dob.equals("")) {
            System.out.println("ALL FIELDS ARE COMPULSORY");
            JOptionPane.showMessageDialog(null, "Kindly fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            String registrationumber="";
            try {
                // Load the JDBC driver and establish a connection to the database
                Class.forName("java.sql.Driver");
                // Create a statement object to execute the SQL query to count the number of records in the users table
                try (Connection con = DriverManager.getConnection(url, usrn, pass); // Create a statement object to execute the SQL query to count the number of records in the users table
                    
                    Statement st = con.createStatement()) {
                            ResultSet rs = st.executeQuery("select count(*) from staffusers where REGISTRATION_NUMBER LIKE 'STF%';");
                            rs.next();
                            // Generate a new registration number by concatenating "AP" with the count of records plus a predefined value
                            
                            long co2 = sstaff + Long.valueOf(rs.getString(1));
                            registrationumber = "STF" + co2;
                            idno.setText(registrationumber);
                            String input_query = "insert into staffusers (FIRST_NAME,LAST_NAME,REGISTRATION_NUMBER,PHONE_NO,ROLES,EMAIL_ID,DATE_OF_BIRTH) VALUES ('" + firstname + "','" + surname + "', '" + registrationumber + "', '" + phono + "', '" + roleboxname + "','" + mail + "', '" + dob + "')";
                            // Execute the query and store the
                            // Execute an update query to insert the new record into the users table and store the number of affected rows in the count variable
                            int count = st.executeUpdate(input_query);
                            // Print the number of affected rows to the console
                            System.out.println(count + " rows affected.");
                            String userPass="";
                            try{
                                 userPass = PasswordEncryptDecrypt.encrypt("Srmap@"+phono);
                            }catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            
                            //String create_acc = "INSERT INTO account (userid , pass, role, FIRST_NAME) VALUES ( '" + registrationumber + "', '" + userPass + "','" + roleboxname + "','" + firstname + "');";
                            //int update = st.executeUpdate(create_acc);
                            //System.out.println(update+" Added to accounts");
                            System.out.println("Data Has been Added successfully!");
                            JOptionPane.showMessageDialog(null, "Data Saved Successfully!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                }
                
                // If a ClassNotFoundException or SQLException occurs, print the stack trace to the console
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            }
    }
    
    protected void searchUserSearchBtn(String sear_opt, javax.swing.JTable dataTable)
    {
        if(null != sear_opt)
        {
            
                String search_query = "SELECT * FROM staffusers WHERE CONCAT_WS(' ',FIRST_NAME,LAST_NAME,REGISTRATION_NUMBER,PHONE_NO,ROLES,EMAIL_ID,DATE_OF_BIRTH) LIKE '%" + sear_opt + "%'";
                //String search_query = "SELECT * FROM staffusers WHERE ROLES = '"+sear_opt+"'";
                
                try {
                    // Load the MySQL JDBC driver
                    Class.forName("java.sql.Driver");
                } catch (ClassNotFoundException e) {
                    // Print the stack trace if an exception is thrown
                    System.out.println(e);
                } try {
                    // Establish a connection to the database using the URL, username, and password
                    Connection con = DriverManager.getConnection(url, usrn, pass);
                    try ( // Create a statement object to execute the SQL query
                            Statement st = con.createStatement(); ResultSet rs = st.executeQuery(search_query)) {
                        
                        boolean found = false;
                        if(rs!=null)
                        {
                            found = true;
                            dataTable.setModel(DbUtils.resultSetToTableModel(rs));
                        }
                        if (!found) {
                            System.out.println("No RECORD FOUND!");
                            JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | SQLException e) {
                    // Print the stack trace if an exception is thrown
                    System.out.println(e);
                }                          
        }
        }
    
    
    protected void searchUserUpdBtn(String firstname,String surname,String mail, String phono,String dob,String registrationumber,String roles, int idnum, javax.swing.JTable dataTable1)
    {
        if(firstname.isEmpty() || surname.isEmpty()||phono.isEmpty()||mail.equals("") || dob.equals("")|| roles.equals("ROLE") ) {
            System.out.println("All details are compulsory");
            JOptionPane.showMessageDialog(null, "Kindly fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            try {
                // Load the JDBC driver and establish a connection to the database
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection(url, usrn, pass);
                // Create a statement object to execute the SQL query to count the number of records in the users table
                Statement st = con.createStatement();                   
                        // Define a SQL query to insert a new record into the users table
                        String input_query = "UPDATE staffusers SET FIRST_NAME = '" + firstname + "', LAST_NAME = '" + surname + "', REGISTRATION_NUMBER = '" + registrationumber + "', PHONE_NO = '" + phono + "', ROLES = '" + roles + "', EMAIL_ID = '" + mail + "', DATE_OF_BIRTH = '" + dob + "' WHERE sid = '" + idnum + "' ";
                        // Execute the query and store the
                        // Execute an update query to insert the new record into the users table and store the number of affected rows in the count variable
                        int count = st.executeUpdate(input_query);
                        // Print the number of affected rows to the console
                        System.out.println(count + " rows affected.");
                        // Close the statement object and database connection to free up resources
                        st.close(); con.close();
                        // Print a success message to the console
                        System.out.println("Data Has been Added successfully!");
                    StaffFrame m = new StaffFrame();
                    m.displayAll(dataTable1);
                    m.clearEntries();
                JOptionPane.showMessageDialog(null, "Data Saved Successfully!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            // If a ClassNotFoundException or SQLException occurs, print the stack trace to the console
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            }
    }
    
    protected void searchUsrDelBtn(String reg,String firstname,String surname,String id,String role,javax.swing.JTable dataTable1)
    {
        String delete_query = "DELETE FROM users WHERE REGISTRATION_NUMBER='"+reg+"' AND FIRST_NAME='"+firstname+"' AND LAST_NAME='"+surname+"' AND sid='"+id+"'";
        String delete_query2 = "DELETE FROM account WHERE userid='"+reg+"' AND FIRST_NAME='"+firstname+"'";
        String delete_query3 = "DELETE FROM attendance WHERE REGISTRATION_NUMBER='"+reg+"' AND FIRST_NAME='"+firstname+"'";
        String delete_query4 = "DELETE FROM studentmarks WHERE REGISTRATION_NUMBER='"+reg+"' AND FIRST_NAME='"+firstname+"'";
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            // Print the stack trace if an exception is thrown
            System.out.println(e);
        }
        try {
            // Establish a connection to the database using the URL, username, and password
            Connection con = DriverManager.getConnection(url, usrn, pass);
                // Execute the SQL query and store the number of rows affected
                try ( // Create a statement object to execute the SQL query
                        Statement st = con.createStatement()) {
                    // Execute the SQL query and store the number of rows affected
                    if("STUDENT".equals(role))
                    {
                        int rs3 = st.executeUpdate(delete_query3);
                        int rs4 = st.executeUpdate(delete_query4);
                        System.out.println("Rows Affected : "+rs3+"  "+rs4);
                
                    }
                    int rs = st.executeUpdate(delete_query);
                    int rs2 = st.executeUpdate(delete_query2);
                    // Display the number of rows affected to the user
                    System.out.println("Rows Affected : "+rs);
                    System.out.println("Rows Affected : "+rs2);
                    JOptionPane.showMessageDialog(null, "Data deleted Successfully!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    displayAll(dataTable1);
                    // Close the statement object
                }
                // Display the number of rows affected to the user
        } catch (SQLException e) {
            // Print the stack trace if an exception is thrown
            System.out.println(e);
        }
    }
    
}



}
