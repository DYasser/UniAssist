package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Settings extends javax.swing.JFrame {

    public Settings() {
        
        initComponents();
        jPanel9.setBackground(new Color(255,255,255,10));
        this.setShape(new RoundRectangle2D.Double(10, 10, 840, 510, 50, 50));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/exam.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 80, 80));

        jPanel8.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/timetable.png"))); // NOI18N
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 80, 80));

        jPanel7.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/lock.png"))); // NOI18N
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, 80));

        jPanel4.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/notes.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, 80));

        jPanel5.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("More about");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 80, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/info.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 560, 100));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setOpaque(false);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Change info");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/user.png"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 560, 100));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0, 50));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel9MouseDragged(evt);
            }
        });
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 20, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/University.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 60));

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Home");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 90, 60, 30));

        jLabel17.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Settings");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Individual");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/reset.png"))); // NOI18N
        jLabel9.setAlignmentX(0.5F);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 60, 60));

        jPanel2.setBackground(new java.awt.Color(0,0,0,0));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setEnabled(false);
        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 560, 100));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Default");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("All");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/backGround.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Default");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx,xy;
    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        Main.home.show();
        Main.home.setLocation(this.getLocation());
        this.show(false);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jPanel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel9MouseDragged

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel9MousePressed

    public static String nameBefore = Main.login.jTextField2.getText();
    public static String emailBefore = "";
    
    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        nameBefore = Main.login.jTextField2.getText();
        Main.changeInfo.jTextField3.setText(nameBefore);  
        Main.changeInfo.jPasswordField1.setText(Main.login.jPasswordField2.getText());  
          
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM account WHERE Username = \"" + nameBefore + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            if(rs.next())
            {
                emailBefore = rs.getString("Email");
                Main.changeInfo.jTextField2.setText(emailBefore);
            }
        }catch(Exception e)
        {
            Main.changeInfo.jTextField2.setText(Main.login.jTextField3.getText());
        }
        
        Main.changeInfo.show();
        Main.changeInfo.setLocation(getX() + 850/2 - 330/2, getY() + 520/2 - 480/2);
        
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        jPanel6.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here
        jPanel6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        
        new Info().show();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        jPanel5.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        
        while((Main.notes.size > 0) ){
            Main.notes.size--;
            try{

                Main.notes.jPanel3.remove(Main.notes.txts.get(Main.notes.size));
                Main.notes.jPanel3.remove(Main.notes.chks.get(Main.notes.size));
                Main.notes.txts.remove(Main.notes.size);
                Main.notes.chks.remove(Main.notes.size);
                Main.notes.posy -= 60;
                Main.notes.jPanel3.setPreferredSize(new Dimension(Main.notes.jScrollPane2.getWidth(), Main.notes.jScrollPane2.getHeight() +Main.notes.posy));
                Main.notes.jPanel3.revalidate();
                Main.notes.jPanel3.repaint();

            }catch(Exception e) {
                System.out.println("End of the list");}
        }
        
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM `notes` WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            PreparedStatement preparedStmt;
            while(rs.next())
            {
                System.out.println("deleted!");
                query = "DELETE FROM `notes` WHERE 1";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
            }

            query = "INSERT INTO  `notes`(`user`, `checked`, `content`)"
            + "VALUES (\""+ Main.login.jTextField2.getText()+"\",?,?)";
            preparedStmt = conn.prepareStatement(query);
            int count = 0;

            System.out.println("Size: " + Main.notes.txts.size());

            while(count < Main.notes.txts.size())
            {
                System.out.println(count);
                preparedStmt.setBoolean   (1, Main.notes.chks.get(count).isSelected());
                preparedStmt.setString (2, Main.notes.txts.get(count).getText());
                preparedStmt.execute();
                count++;
            }
            conn.close();
            Main.reseted.show();
            Main.reseted.setLocation(this.getX() + 850/2 - 330/2, this.getY() + 520/2 - 180/2);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.white, 0));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
        while((Main.passkeep.size > 0) ){
            Main.passkeep.size--;

            try{
                Main.passkeep.jPanel3.remove(Main.passkeep.txts.get(Main.passkeep.size));
                Main.passkeep.jPanel3.remove(Main.passkeep.txts2.get(Main.passkeep.size));
                Main.passkeep.jPanel3.remove(Main.passkeep.tgls.get(Main.passkeep.size));
                Main.passkeep.jPanel3.remove(Main.passkeep.pswds.get(Main.passkeep.size));
                Main.passkeep.txts.remove(Main.passkeep.size);
                Main.passkeep.txts2.remove(Main.passkeep.size);
                Main.passkeep.pswds.remove(Main.passkeep.size);
                Main.passkeep.tgls.remove(Main.passkeep.size);
                Main.passkeep.posy -= 60;
                Main.passkeep.jPanel3.setPreferredSize(new Dimension(Main.passkeep.jScrollPane2.getWidth(), Main.passkeep.jScrollPane2.getHeight() +Main.passkeep.posy));
                Main.passkeep.jPanel3.revalidate();
                Main.passkeep.jPanel3.repaint();

            }catch(Exception e) {
                System.out.println("End of the list");}  
        }
        
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

            System.out.println("Size: " + Main.passkeep.txts.size());

            while(count < Main.passkeep.txts.size())
            {
                System.out.println(count);
                preparedStmt.setString (1, Main.passkeep.txts.get(count).getText());
                preparedStmt.setString   (2, Main.passkeep.txts2.get(count).getText());
                preparedStmt.setString (3, Main.passkeep.pswds.get(count).getText());
                preparedStmt.execute();
                count++;
            }
            conn.close();
            Main.reseted.show();
            Main.reseted.setLocation(this.getX() + 850/2 - 330/2, this.getY() + 520/2 - 180/2);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        jPanel8.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        jPanel8.setBorder(BorderFactory.createLineBorder(Color.white, 0));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        // TODO add your handling code here:
        Main.tt.jPanel1.removeAll();
        Main.tt.jPanel3.removeAll();
        Main.tt.jPanel5.removeAll();
        Main.tt.jPanel6.removeAll();
        Main.tt.jPanel7.removeAll();
        Main.tt.jPanel8.removeAll();
        
        Main.addT.courses.clear();
        
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM `timetable` WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            PreparedStatement preparedStmt;
            while(rs.next())
            {
                System.out.println("deleted!");
                query = "DELETE FROM `timetable` WHERE 1";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
            }
        }catch(Exception ex){}
        
        Main.reseted.show();
        Main.reseted.setLocation(this.getX() + 850/2 - 330/2, this.getY() + 520/2 - 180/2);        
    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        jPanel10.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
        jPanel10.setBorder(BorderFactory.createLineBorder(Color.white, 0));
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
        while((Main.exams.size > 0) ){
        Main.exams.size--;
        try{
            Main.exams.jPanel3.remove(Main.exams.txts.get(Main.exams.size));
            Main.exams.jPanel3.remove(Main.exams.combos.get(Main.exams.size));
            Main.exams.jPanel3.remove(Main.exams.txts3.get(Main.exams.size));
            Main.exams.jPanel3.remove(Main.exams.radios1.get(Main.exams.size));
            Main.exams.jPanel3.remove(Main.exams.radios2.get(Main.exams.size));
            Main.exams.txts.remove(Main.exams.size);
            Main.exams.combos.remove(Main.exams.size);
            Main.exams.txts3.remove(Main.exams.size);
            Main.exams.radios1.remove(Main.exams.size);
            Main.exams.radios2.remove(Main.exams.size);
            Main.exams.posy -= 60;
            Main.exams.jPanel3.setPreferredSize(new Dimension(Main.exams.jScrollPane2.getWidth(), Main.exams.jScrollPane2.getHeight() +Main.exams.posy));
            Main.exams.jPanel3.revalidate();
            Main.exams.jPanel3.repaint();
            
        }catch(Exception e) {
            System.out.println("End of the list");}   
        }
        
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM `exam` WHERE `user` = \"" + Main.login.jTextField2.getText() + "\"";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            PreparedStatement preparedStmt;
            while(rs.next())
            {
                System.out.println("deleted!");
                query = "DELETE FROM `exam` WHERE 1";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.execute();
            }
             
            query = "INSERT INTO `exam`(`user`, `course`, `credits`, `pass`, `score`) "
                    + "VALUES (\""+ Main.login.jTextField2.getText()+"\",?,?,?,?)";
            preparedStmt = conn.prepareStatement(query);
            int count = 0;
            
            System.out.println("Size: " + Main.exams.txts.size());
            
            while(count < Main.exams.txts.size())
            {
                System.out.println(count);
                preparedStmt.setString (1, Main.exams.txts.get(count).getText());
                preparedStmt.setString   (2, (int)(Main.exams.combos.get(count).getItemCount()-1) + ".0");
                preparedStmt.setBoolean (3, Main.exams.radios1.get(count).isSelected());
                preparedStmt.setString   (4, Main.exams.txts3.get(count).getText());
                preparedStmt.execute();
                count++;
            }
            conn.close();
            Main.reseted.show();
            Main.reseted.setLocation(this.getX() + 850/2 - 330/2, this.getY() + 520/2 - 180/2);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.white, 0));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        jPanel4MousePressed(evt);
        jPanel7MousePressed(evt);
        jPanel8MousePressed(evt);
        jPanel10MousePressed(evt);
    }//GEN-LAST:event_jLabel9MousePressed

     public void setColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(255, 255, 255, 100));
    }

    public void resetColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(255,255,255,0));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
