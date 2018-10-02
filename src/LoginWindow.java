
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jdatepicker.DateModel;


public class LoginWindow extends javax.swing.JFrame {

    public LoginWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 30, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 20, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1049, 583));

        jTabbedPane1.addTab("Home", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setToolTipText("");

        jPanel6.setBackground(new java.awt.Color(204, 255, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration Form", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Yu Mincho Demibold", 0, 24), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel11.setText("Family Head Name:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel13.setText("User ID:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel14.setText("Password:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel15.setText("Gender:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel16.setText("Birth date:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel17.setText("Contact no.:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel18.setText("Occupation:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel19.setText("No. Of. Family Members:");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPasswordField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton1.setText("Female");

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton2.setText("Male");

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton5.setText("CANCEL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        jDatePicker1.setBackground(new java.awt.Color(255, 255, 255));
        jDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatePicker1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jPasswordField3)
                            .addComponent(jTextField5)
                            .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton4)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5)))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(25, 25, 25))
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 590, 480));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b7.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 973, 586));

        jTabbedPane1.addTab("New Registration", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 980, 610));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("USER ID");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("PASSWORD");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 990, 50));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("W E L C O M E   T O   M A I N T E N A N C E   S O C I E T Y   P O R T A L");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1010, 30));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 27)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static String userId;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           userId=jTextField1.getText();
           char cha[]=jPasswordField1.getPassword();
           String pass= new String(cha);
           if(userId.equalsIgnoreCase("admin")){
               try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/msportal","root","sourabh");
                    PreparedStatement st=con.prepareStatement("select * from adminlogin where aid=? and password=?");
                    st.setString(1,userId);
                    st.setString(2,pass);
                    ResultSet sr=st.executeQuery();
                if(sr.next())
                {
                    JOptionPane.showMessageDialog(this, "Welcome");
                    AdminWindow ref=new AdminWindow();
                    ref.setVisible(true);
                    dispose();
                }  
                else{
                    JOptionPane.showMessageDialog(this, "Invalid id/Password");
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    }
                }catch(ClassNotFoundException|SQLException ex) {}
           }
           else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/msportal","root","sourabh");
                    PreparedStatement st=con.prepareStatement("select * from regtable where userId=? and password=?");
                    st.setString(1,userId);
                    st.setString(2,pass);
                    ResultSet sr=st.executeQuery();
                    if(sr.next()){
                        JOptionPane.showMessageDialog(this, "Welcome");
                        FeedSugComForm fsc=new FeedSugComForm();
                        fsc.setVisible(true);
                          dispose();     
                    }
                else{
                     JOptionPane.showMessageDialog(this, "Invalid id/Password");
                     jTextField1.setText("");
                     jPasswordField1.setText("");
                    }
                }catch(ClassNotFoundException|SQLException ex) {
                    ex.printStackTrace();
                    }   
                }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        userId=jTextField1.getText();
           char cha[]=jPasswordField1.getPassword();
           String pass= new String(cha);
           try{
               Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/msportal","root","sourabh");
                PreparedStatement st=con.prepareStatement("select * from userlogin where userId=? and password=?");
                st.setString(1,userId);
                st.setString(2,pass);
                ResultSet sr=st.executeQuery();
                if(sr.next()){
                        JOptionPane.showMessageDialog(this, "Welcome");
                        FeedSugComForm fsc=new FeedSugComForm();
                        fsc.setVisible(true);
                          dispose();
                }
                else{
                     JOptionPane.showMessageDialog(this, "Invalid id/Password");
                     jTextField1.setText("");
                     jPasswordField1.setText("");
                }
            }catch(ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String headName=jTextField3.getText();
        String userId=jTextField4.getText();
        char ch[]=jPasswordField3.getPassword();
        String password=new String(ch);
        String gender="";
        if(jRadioButton1.isSelected())
        gender="Female";
        if(jRadioButton2.isSelected())
        gender="Male";
        DateModel dt=jDatePicker1.getModel();
        String birthDate=dt.getYear()+"/"+dt.getMonth()+"/"+dt.getDay();
        Long contact=Long.parseLong(jTextField5.getText());
        String occupation=jTextField6.getText();
        String familyMember=(String)jComboBox1.getSelectedItem();
        if(headName.equals("")){
            JOptionPane.showMessageDialog(this, "headname required");
        }
        else if(userId.equals("")){
            JOptionPane.showMessageDialog(this, "userId is required");
        }
        else if(password.equals("")){
            JOptionPane.showMessageDialog(this, "password is required");
        }
        else if(gender.equals("")){
            JOptionPane.showMessageDialog(this, "gender is required");
        }
        else if(birthDate.equals("")){
            JOptionPane.showMessageDialog(this, "birthdate is required");
        }
        else if(contact < 1111111111l && contact > 9999999999l){
            JOptionPane.showMessageDialog(this, "Invalid Contact number");
        }
        else if(occupation.equals("")){
            JOptionPane.showMessageDialog(this, "Occupation is required");
        }
        else if(familyMember.equals("")){
            JOptionPane.showMessageDialog(this, "No. of family member field required");
        }
        
        else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/msportal","root","sourabh");
                PreparedStatement ps=con.prepareStatement("insert into regtable value(?,?,?,?,?,?,?,?)");
                ps.setString(1,headName);
                ps.setString(2, userId);
                ps.setString(3, password);
                ps.setString(4, gender);
                ps.setString(5, birthDate);
                ps.setLong(6, contact);
                ps.setString(7, occupation);
                ps.setString(8, familyMember);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "submitted");
                LoginWindow lw=new LoginWindow();
                lw.setVisible(true);
                dispose();
            }catch(ClassNotFoundException|SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        String headName=jTextField3.getText();
        String userId=jTextField4.getText();
        char ch[]=jPasswordField3.getPassword();
        String password=new String(ch);
        String gender="";
        if(jRadioButton1.isSelected())
        gender="Female";
        if(jRadioButton2.isSelected())
        gender="Male";
        DateModel dt=jDatePicker1.getModel();
        String birthDate=dt.getYear()+"/"+dt.getMonth()+"/"+dt.getDay();
        Long contact=Long.parseLong(jTextField5.getText());

        String occupation=jTextField6.getText();
        String familyMember=(String)jComboBox1.getSelectedItem();
        if(headName.equals("")){
            JOptionPane.showMessageDialog(this, "headname required");
        }
        else if(userId.equals("")){
            JOptionPane.showMessageDialog(this, "userId is required");
        }
        else if(password.equals("")){
            JOptionPane.showMessageDialog(this, "password is required");
        }
        else if(gender.equals("")){
            JOptionPane.showMessageDialog(this, "gender is required");
        }
        else if(birthDate.equals("")){
            JOptionPane.showMessageDialog(this, "birthdate is required");
        }
        else if(contact < 1111111111L && contact > 9999999999L){
            JOptionPane.showMessageDialog(this, "Invalid Contact number");
        }
        else if(occupation.equals("")){
            JOptionPane.showMessageDialog(this, "Occupation is required");
        }
        else if(familyMember.equals("")){
            JOptionPane.showMessageDialog(this, "No. of family member field required");
        }
        else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/msportal","root","sourabh");
                PreparedStatement ps=con.prepareStatement("insert into regtable value(?,?,?,?,?,?,?,?)");
                ps.setString(1,headName);
                ps.setString(2, userId);
                ps.setString(3, password);
                ps.setString(4, gender);
                ps.setString(5, birthDate);
                ps.setLong(6, contact);
                ps.setString(7, occupation);
                ps.setString(8, familyMember);
                ps.executeUpdate();

                PreparedStatement sp=con.prepareStatement("insert into userlogin value(?,?)");
                sp.setString(1,userId);
                sp.setString(2,password);
                sp.executeUpdate();
                JOptionPane.showMessageDialog(this, "submitted");
                LoginWindow lw=new LoginWindow();
                lw.setVisible(true);
                dispose();
            }catch(ClassNotFoundException|SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField4.setText("");
        jPasswordField3.setText("");
        jDatePicker1.setVisible(false);
        jDatePicker1.setVisible(true);
        //jDatePicker1.setTextfieldColumns(0);
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField4.setText("");
        jPasswordField3.setText("");

        jDatePicker1.setVisible(true);
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new LoginWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
        new LoginWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5KeyPressed

    private void jDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDatePicker1ActionPerformed
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private org.jdatepicker.JDatePicker jDatePicker2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
