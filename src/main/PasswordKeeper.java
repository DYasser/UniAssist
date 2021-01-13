package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PasswordKeeper extends javax.swing.JFrame {

    int xx,xy;
 
    public static ArrayList<JTextField> txts = new ArrayList<JTextField>();
    public static ArrayList<JTextField> txts2 = new ArrayList<JTextField>();
    public static ArrayList<JToggleButton> tgls = new ArrayList<JToggleButton>();
    public static ArrayList<JPasswordField> pswds = new ArrayList<JPasswordField>();
    
    public static int size = 0;
    
    public PasswordKeeper() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(10, 10, 840, 510, 50, 50));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder(0,10,10,10)); 
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        this.setLocationRelativeTo(null);
        
        jLabel11.show(false);
        jLabel12.show(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(850, 520));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Website/ Domaine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 850, 40));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(837, 350));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/add.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/addClicked.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/min.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/minClicked.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0,0,0,0)
        );
        jPanel5.setFocusable(false);
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0,0,0,150)
        );
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/redDot.png"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0,0,0,150)
        );
        jLabel12.setText("Save");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/save.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 63));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE)
                .addGap(121, 121, 121)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(106, 106, 106))))
        );

        jScrollPane2.setViewportView(jPanel3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 174, 850, 350));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0, 50));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 20, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/University.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 60));

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Home");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 90, 60, 30));

        jLabel17.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PASSW     RD KEEPER");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 400, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/lockO.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 40, -1, 70));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/backGround.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jLabel11.show();
        jLabel12.show();
        txt1 = new javax.swing.JTextField();
        txt1.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt1.setCaretColor(new java.awt.Color(255, 51, 153));
        txt1.setBounds(30, 35 + posy, 280, 35);
        txt1.setOpaque(false);
        txts.add(txt1);

        txt2 = new javax.swing.JTextField();
        txt2.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt2.setCaretColor(new java.awt.Color(255, 51, 153));
        txt2.setBounds(330, 35 + posy, 180, 35);
        txt2.setOpaque(false);
        txts2.add(txt2);

        psw1 = new javax.swing.JPasswordField();
        psw1.setBackground(new java.awt.Color(255, 255, 255, 0));
        psw1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        psw1.setForeground(new java.awt.Color(255, 255, 255));
        psw1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        psw1.setCaretColor(new java.awt.Color(255, 51, 153));
        psw1.setBounds(540, 35 + posy, 220, 35);
        psw1.setOpaque(false);
        pswds.add(psw1);
        
        
        
        tgl1 = new javax.swing.JToggleButton();
        tgl1.setBackground(new java.awt.Color(255, 255, 255, 0));
        tgl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/hidePswd38.png"))); // NOI18N
        tgl1.setBorderPainted(false);
        tgl1.setContentAreaFilled(false);
        tgl1.setFocusable(false);
        tgl1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/showPswd38.png"))); // NOI18N
        tgl1.setBounds(775, 38 + posy, 45, 45);
        tgl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(tgl1.isSelected())
                    psw1.setEchoChar('\u25CF');
                else
                    psw1.setEchoChar((char)0); 
            }
        });
        tgls.add(tgl1);
        
        posy += 60;
        
        jPanel3.setPreferredSize(new Dimension(jScrollPane2.getWidth(), jScrollPane2.getHeight() +posy));
        size++;
        
        jPanel3.add(psw1);
        jPanel3.add(txt1);
        jPanel3.add(txt2);
        jPanel3.add(tgl1);
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    boolean exited = false;
    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        for(int i = 0; i < txts.size() ; i++){
            if(tgls.get(i).isSelected()){
                pswds.get(i).setEchoChar('\u25CF');
            }
            else
                pswds.get(i).setEchoChar((char)0);
        }
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited

        for(int i = 0; i < txts.size() ; i++){
            if(tgls.get(i).isSelected()){
                pswds.get(i).setEchoChar('\u25CF');
            }
            else
                pswds.get(i).setEchoChar((char)0);
        }
    }//GEN-LAST:event_jPanel3MouseExited

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        Main.home.show();
        Main.home.setLocation(this.getLocation());
        this.show(false);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jLabel11.show();
        jLabel12.show();
        
        if((size > 0) ){
        size--;
        }
        try{
            jPanel3.remove(txts.get(size));
            jPanel3.remove(txts2.get(size));
            jPanel3.remove(tgls.get(size));
            jPanel3.remove(pswds.get(size));
            txts.remove(size);
            txts2.remove(size);
            pswds.remove(size);
            tgls.remove(size);
            posy -= 60;
            jPanel3.setPreferredSize(new Dimension(jScrollPane2.getWidth(), jScrollPane2.getHeight() +posy));
            jPanel3.revalidate();
            jPanel3.repaint();
            
        }catch(Exception e) {
            System.out.println("End of the list");}   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM `password keeper` WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            PreparedStatement preparedStmt;
            while(rs.next())
            {
                System.out.println("deleted!");
                query = "DELETE FROM `password keeper` WHERE 1";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
            }

            query = "INSERT INTO `password keeper`(`user`, `domaine name`, `username`, `password`)"
            + "VALUES (\""+ Main.login.jTextField2.getText()+"\",?,?,?)";
            preparedStmt = conn.prepareStatement(query);
            int count = 0;

            System.out.println("Size: " + txts.size());

            while(count < txts.size())
            {
                System.out.println(count);
                preparedStmt.setString (1, txts.get(count).getText());
                preparedStmt.setString   (2, txts2.get(count).getText());
                preparedStmt.setString (3, pswds.get(count).getText());
                preparedStmt.execute();
                count++;
            }
            conn.close();
            jLabel11.show(false);
            jLabel12.show(false);
            Main.saved.show();
            Main.saved.setLocation(this.getX() + 850/2 - 330/2, this.getY() + 520/2 - 180/2);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    public static int posy = 0;
                        
    public static javax.swing.JTextField txt1;
    public static javax.swing.JTextField txt2;
    public static javax.swing.JPasswordField psw1;
    public static javax.swing.JToggleButton tgl1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
