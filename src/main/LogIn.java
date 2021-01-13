package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(10, 10, 840, 510, 50, 50));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setCaretColor(new java.awt.Color(255, 51, 153));
        jTextField2.setNextFocusableComponent(jPasswordField2);
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 350, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Or");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, 20));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UniAssist");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 210, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log In");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 140, 40));

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 20, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Help students all arround the world");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 190, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPasswordField2.setCaretColor(new java.awt.Color(255, 51, 153));
        jPasswordField2.setOpaque(false);
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 350, 30));

        jToggleButton1.setBackground(new java.awt.Color(0,0,0,0));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/showPswd38.png"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.setFocusable(false);
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/hidePswd38.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/backGround.png"))); // NOI18N
        BackGround.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackGroundMouseDragged(evt);
            }
        });
        BackGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackGroundMousePressed(evt);
            }
        });
        BackGround.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackGroundKeyPressed(evt);
            }
        });
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setCaretColor(new java.awt.Color(255, 51, 153));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 350, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackGroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackGroundKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackGroundKeyPressed

     int xx,xy;
    private void BackGroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_BackGroundMouseDragged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void BackGroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BackGroundMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main.signbg.setLocation(getX(), getY());
        Main.signpop.setLocation(getX() + 850/2 - 330/2, getY() + 520/2 - 480/2);
        Main.signbg.show();
        Main.signpop.show();
        this.show(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM account";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            while(rs.next())
            {
                if(jTextField2.getText().compareTo(rs.getString("Username")) == 0
                        &&
                   jPasswordField2.getText().compareTo(rs.getString("Password")) == 0)
                {
                    setNotes();
                    setExams();
                    setPswdKeep();
                    setTt();
                    Main.home.show();
                    Main.home.setLocation(this.location());
                    this.show(false);
                    conn.close();
                }   
            }
            JOptionPane.showMessageDialog(null, "Username or Password incorrect!");
            conn.close();
        }
        catch(Exception ex){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setNotes()
    {
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM notes WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            System.out.println("SELECT * FROM notes WHERE `user` = " + Main.login.jTextField2.getText());
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            while(rs.next())
            {
                System.out.println("Notes loaded");
                Main.notes.txt1 = new JTextField();
                Main.notes.txt1.setBounds(100, 60 + Main.notes.posy, 620, 45);
                Main.notes.txt1.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.notes.txt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                Main.notes.txt1.setForeground(new java.awt.Color(255, 255, 255));
                Main.notes.txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
                Main.notes.txt1.setCaretColor(new java.awt.Color(255, 51, 153));
                Main.notes.txt1.setOpaque(false);
                Main.notes.txt1.setText(rs.getString("content"));
                Main.notes.txts.add(Main.notes.txt1);

                Notes.chkbox1 = new JCheckBox();
                Main.notes.chks.add(Main.notes.chkbox1);
                Main.notes.chkbox1.setBounds(0, Main.notes.posy +65, 63, 50);
                Main.notes.chkbox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/unchecked.png"))); // NOI18N
                Main.notes.chkbox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/checked.png"))); // NOI18N
                Main.notes.chkbox1.setOpaque(false);
                Main.notes.chkbox1.setSelected(rs.getBoolean("checked"));
                Main.notes.posy += 60;

                Main.notes.jPanel3.setPreferredSize(new Dimension(Main.notes.jScrollPane2.getWidth(), Main.notes.jScrollPane2.getHeight() +Main.notes.posy));
                Main.notes.size++;

                Main.notes.jPanel3.add(Main.notes.chkbox1);
                Main.notes.jPanel3.add(Main.notes.txt1);
                Main.notes.jPanel3.revalidate();
                Main.notes.jPanel3.repaint();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    private void setExams()
    {
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM exam WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            while(rs.next())
            {
                System.out.println("Exams loaded");
                Main.exams.txt1 = new javax.swing.JTextField();
                Main.exams.txt1.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.exams.txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                Main.exams.txt1.setForeground(new java.awt.Color(255, 255, 255));
                Main.exams.txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
                Main.exams.txt1.setCaretColor(new java.awt.Color(255, 51, 153));
                Main.exams.txt1.setBounds(10, 35 + Main.exams.posy, 260, 35);
                Main.exams.txt1.setOpaque(false);
                Main.exams.txt1.setText(rs.getString("course"));
                Main.exams.txts.add(Main.exams.txt1);

                Main.exams.jComboBox1 = new javax.swing.JComboBox<>();
                Main.exams.jComboBox1.setOpaque(false);
                Main.exams.jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
                Main.exams.jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                Main.exams.jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
                Main.exams.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "2.0", "3.0", "4.0", "5.0", "6.0" }));
                Main.exams.jComboBox1.setRenderer(new DefaultListCellRenderer(){
                public Component getListCellRendererComponent(JList list, Object value,
                        int index, boolean isSelected, boolean cellHasFocus) {
                    JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    result.setOpaque(false);
                    return result;
                }});
                Main.exams.jComboBox1.setBounds(290, 35 + Main.exams.posy, 80, 35);
                Main.exams.jComboBox1.setSelectedItem(rs.getString("credits"));
                Main.exams.combos.add(Main.exams.jComboBox1);

                Main.exams.radioB1 = new javax.swing.JRadioButton();
                Main.exams.radioB1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/unchecked.png"))); // NOI18N
                Main.exams.radioB1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/checked.png"))); // NOI18N
                Main.exams.radioB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/uncheckedRadio.png"))); // NOI18N
                Main.exams.radioB1.setOpaque(false);
                Main.exams.radioB1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/clickedUncheckedRadio.png"))); // NOI18N
                Main.exams.radioB1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/checkedRadio.png"))); // NOI18N
                Main.exams.radioB1.setBounds(430, 28 + Main.exams.posy, 55, 50);
                Main.exams.radios1.add(Main.exams.radioB1);

                Main.exams.radioB2 = new javax.swing.JRadioButton();
                Main.exams.radioB2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/unchecked.png"))); // NOI18N
                Main.exams.radioB2.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/checked.png"))); // NOI18N
                Main.exams.radioB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/uncheckedRadio.png"))); // NOI18N
                Main.exams.radioB2.setOpaque(false);
                Main.exams.radioB2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/clickedUncheckedRadio.png"))); // NOI18N
                Main.exams.radioB2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/checkedRadio.png"))); // NOI18N
                Main.exams.radioB2.setBounds(530, 28 + Main.exams.posy, 55, 50);
                Main.exams.radios2.add(Main.exams.radioB2);
                if(rs.getBoolean("pass"))
                    Main.exams.radioB1.setSelected(true);
                else
                    Main.exams.radioB2.setSelected(true);
                
                ButtonGroup bg = new ButtonGroup();
                bg.add(Main.exams.radioB1);
                bg.add(Main.exams.radioB2);

                Main.exams.txt3 = new javax.swing.JTextField();
                Main.exams.txt3.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.exams.txt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                Main.exams.txt3.setForeground(new java.awt.Color(255, 255, 255));
                Main.exams.txt3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
                Main.exams.txt3.setCaretColor(new java.awt.Color(255, 51, 153));
                Main.exams.txt3.setBounds(708, 35 + Main.exams.posy, 60, 35);
                Main.exams.txt3.setOpaque(false);
                Main.exams.txts3.add(Main.exams.txt3);
                Main.exams.txt3.setText(rs.getString("score"));

                Main.exams.posy += 60;

                Main.exams.jPanel3.setPreferredSize(new Dimension(Main.exams.jScrollPane2.getWidth(), Main.exams.jScrollPane2.getHeight() +Main.exams.posy));
                Main.exams.size++;

                Main.exams.jPanel3.add(Main.exams.txt1);
                Main.exams.jPanel3.add(Main.exams.jComboBox1);
                Main.exams.jPanel3.add(Main.exams.txt3);
                Main.exams.jPanel3.add(Main.exams.radioB1);
                Main.exams.jPanel3.add(Main.exams.radioB2);
                Main.exams.jPanel3.revalidate();
                Main.exams.jPanel3.repaint();
            }
        }catch(Exception e){}
    }
    
    private void setPswdKeep()
    {
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM `password keeper` WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            while(rs.next())
            {
                System.out.println("Pswd Loaded");
                Main.passkeep.txt1 = new javax.swing.JTextField();
                Main.passkeep.txt1.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.passkeep.txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                Main.passkeep.txt1.setForeground(new java.awt.Color(255, 255, 255));
                Main.passkeep.txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
                Main.passkeep.txt1.setCaretColor(new java.awt.Color(255, 51, 153));
                Main.passkeep.txt1.setBounds(30, 35 + Main.passkeep.posy, 280, 35);
                Main.passkeep.txt1.setOpaque(false);
                Main.passkeep.txt1.setText(rs.getString("domaine name"));
                Main.passkeep.txts.add(Main.passkeep.txt1);

                Main.passkeep.txt2 = new javax.swing.JTextField();
                Main.passkeep.txt2.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.passkeep.txt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                Main.passkeep.txt2.setForeground(new java.awt.Color(255, 255, 255));
                Main.passkeep.txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
                Main.passkeep.txt2.setCaretColor(new java.awt.Color(255, 51, 153));
                Main.passkeep.txt2.setBounds(330, 35 + Main.passkeep.posy, 180, 35);
                Main.passkeep.txt2.setOpaque(false);
                Main.passkeep.txt2.setText(rs.getString("username"));
                Main.passkeep.txts2.add(Main.passkeep.txt2);

                Main.passkeep.psw1 = new javax.swing.JPasswordField();
                Main.passkeep.psw1.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.passkeep.psw1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                Main.passkeep.psw1.setForeground(new java.awt.Color(255, 255, 255));
                Main.passkeep.psw1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
                Main.passkeep.psw1.setCaretColor(new java.awt.Color(255, 51, 153));
                Main.passkeep.psw1.setBounds(540, 35 + Main.passkeep.posy, 220, 35);
                Main.passkeep.psw1.setOpaque(false);
                Main.passkeep.psw1.setText(rs.getString("password"));
                Main.passkeep.pswds.add(Main.passkeep.psw1);

                Main.passkeep.tgl1 = new javax.swing.JToggleButton();
                Main.passkeep.tgl1.setBackground(new java.awt.Color(255, 255, 255, 0));
                Main.passkeep.tgl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/showPswd.png"))); // NOI18N
                Main.passkeep.tgl1.setBorderPainted(false);
                Main.passkeep.tgl1.setContentAreaFilled(false);
                Main.passkeep.tgl1.setFocusable(false);
                Main.passkeep.tgl1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/hidePswd.png"))); // NOI18N
                Main.passkeep.tgl1.setBounds(770, 35 + Main.passkeep.posy, 45, 45);
                Main.passkeep.tgls.add(Main.passkeep.tgl1);

                Main.passkeep.posy += 60;

                Main.passkeep.jPanel3.setPreferredSize(new Dimension(Main.passkeep.jScrollPane2.getWidth(), Main.passkeep.jScrollPane2.getHeight() +Main.passkeep.posy));
                Main.passkeep.size++;


                Main.passkeep.jPanel3.add(Main.passkeep.psw1);
                Main.passkeep.jPanel3.add(Main.passkeep.txt1);
                Main.passkeep.jPanel3.add(Main.passkeep.txt2);
                Main.passkeep.jPanel3.add(Main.passkeep.tgl1);
                Main.passkeep.jPanel3.revalidate();
                Main.passkeep.jPanel3.repaint();
            }
        }catch(Exception e){}
    }
    
    private int weeks(ResultSet rs, String s) throws SQLException
    {
        switch(rs.getString(s))
        {
            case "week1":
                return 0;
            case "week2":
                return 1;
            case "week3":
                return 2;
            case "week4":
                return 3;
            case "week5":
                return 4;
            case "week6":
                return 5;
            case "week7":
                return 6;
            case "week8":
                return 7;
            case "week9":
                return 8;
            case "week10":
                return 9;
            case "week11":
                return 10;
            case "week12":
                return 11;
            case "week13":
                return 12;
            case "week14":
                return 13;
            case "week15":
                return 14;
        }
        return -1;
    }        
    
    private int classes(ResultSet rs, String s) throws SQLException
    {
        switch(rs.getString(s))
        {
            case "8 AM":
                return 0;
            case "9 AM":
                return 1;
            case "10 AM":
                return 2;
            case "11 AM":
                return 3;
            case "12 / 2 PM":
                return 4;
            case "3 PM":
                return 5;
            case "4 PM":
                return 6;
            case "5 PM":
                return 7;
            case "6 PM":
                return 8;
        }
        return -1;
    }        
    
    private void setTt()
    {
        try {
            System.out.println("Timetables loaded");
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM `timetable` WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            while(rs.next())
            {
                String courseName = rs.getString("course");
                String profName = rs.getString("professor");
                int weekFrom = weeks(rs, "weekFrom");
                int weekTo = weeks(rs, "weekTo");
                int classFrom = classes(rs, "classFrom");
                int classTo = classes(rs, "classTo");
                String credit = rs.getString("credits");
                String day = rs.getString("day");

                //.addT.courses.add(courseName);
                Main.addT.profs.add(profName);
                Main.addT.weeksf.add("week"+(int)(weekFrom+1));
                Main.addT.weekst.add("week"+(int)(weekTo+1));
                Main.addT.classf.add(Main.addT.classes(classFrom));
                Main.addT.classt.add(Main.addT.classes(classTo));
                Main.addT.credits.add(credit);
                Main.addT.days.add(day);
                
                jLabel7 = new JLabel(courseName + " (" + credit + ")");
                jLabel11 = new JLabel("week " + (int)(weekFrom+1) + " - " + (int)(weekTo+1));
                jLabel12 = new JLabel(profName);

                jPanel2 = new JPanel();
                jPanel2.setBackground(new Color(0,0,0,150));
                jPanel2.setBounds(0, 5+30*(classFrom), 100, 30*(classTo - classFrom));
                jLabel7.setBounds(20, 5+30*(classFrom), 100, 20);
                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
                jLabel7.setForeground(Color.white);

                jLabel11.setBounds(30, 5+20 + 30*(classFrom), 100, 20);
                jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
                jLabel11.setForeground(Color.white);

                jLabel12.setBounds(20, 5+40 + 30*(classFrom), 100, 20);
                jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
                jLabel12.setForeground(Color.white);
                jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

                switch(day)
                {
                    case "monday":
                    Main.tt.jPanel1.add(jLabel7);
                    Main.tt.jPanel1.add(jLabel11);
                    Main.tt.jPanel1.add(jLabel12);
                    Main.tt.jPanel1.add(jPanel2);
                    Main.tt.jPanel1.repaint();
                    Main.tt.jPanel1.revalidate();
                    break;
                    case "tuesday":
                    Main.tt.jPanel3.add(jLabel7);
                    Main.tt.jPanel3.add(jLabel11);
                    Main.tt.jPanel3.add(jLabel12);
                    Main.tt.jPanel3.add(jPanel2);
                    Main.tt.jPanel3.repaint();
                    Main.tt.jPanel3.revalidate();
                    break;
                    case "wednesday":
                    Main.tt.jPanel5.add(jLabel7);
                    Main.tt.jPanel5.add(jLabel11);
                    Main.tt.jPanel5.add(jLabel12);
                    Main.tt.jPanel5.add(jPanel2);
                    Main.tt.jPanel5.repaint();
                    Main.tt.jPanel5.revalidate();
                    break;
                    case "thursday":
                    Main.tt.jPanel6.add(jLabel7);
                    Main.tt.jPanel6.add(jLabel11);
                    Main.tt.jPanel6.add(jLabel12);
                    Main.tt.jPanel6.add(jPanel2);
                    Main.tt.jPanel6.repaint();
                    Main.tt.jPanel6.revalidate();
                    break;
                    case "friday":
                    Main.tt.jPanel7.add(jLabel7);
                    Main.tt.jPanel7.add(jLabel11);
                    Main.tt.jPanel7.add(jLabel12);
                    Main.tt.jPanel7.add(jPanel2);
                    Main.tt.jPanel7.repaint();
                    Main.tt.jPanel7.revalidate();
                    break;
                    case "saturday":
                    Main.tt.jPanel8.add(jLabel7);
                    Main.tt.jPanel8.add(jLabel11);
                    Main.tt.jPanel8.add(jLabel12);
                    Main.tt.jPanel8.add(jPanel2);
                    Main.tt.jPanel8.repaint();
                    Main.tt.jPanel8.revalidate();
                    break;
                }
            }
        }catch(Exception e){}
    }
    
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBorderPainted(true); //to make the borders transparent
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBorderPainted(false); //to make the borders transparent
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBorderPainted(true); //to make the borders transparent
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBorderPainted(false); //to make the borders transparent
    }//GEN-LAST:event_jButton1MouseExited

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMousePressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected())
        {
            jPasswordField2.setEchoChar((char)0);
        }
        else
        {
            jPasswordField2.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordField2;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
