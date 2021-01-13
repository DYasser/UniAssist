package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Notes extends javax.swing.JFrame {

    int xx,xy;
 
    public static ArrayList<JTextField> txts = new ArrayList<JTextField>();;
    public static ArrayList<JCheckBox> chks = new ArrayList<JCheckBox>();
    
    public static int size = 0;
    
    boolean exited = false;
    
    public Notes() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(10, 10, 840, 510, 50, 50));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder(0,10,10,10)); 
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        this.setLocationRelativeTo(null);
        
        jLabel11.show(false);
        jLabel10.show(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(850, 520));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.setBackground(new java.awt.Color(0,0,0,0)
        );
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0,0,0,150)
        );
        jLabel10.setText("Save");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0,0,0,150)
        );
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/redDot.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/save.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 59));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );

        jScrollPane2.setViewportView(jPanel3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 850, 380));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0, 50));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
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
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 20, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/University.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jLabel17.setText("NOTES");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/backGround.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        for(int i = 0; i < txts.size() ; i++){
            if(chks.get(i).isSelected())
                {
                    Font font = new Font("Segoe UI", 0, 18);
                    Map fontAttr = font.getAttributes();
                    fontAttr.put (TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                    Font myFont = new Font(fontAttr);
                    txts.get(i).setFont(myFont);
                    txts.get(i).setEditable(false);
                    txts.get(i).setFocusable(false);
                }else
                {
                    txts.get(i).setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                    txts.get(i).setEditable(true);
                    txts.get(i).setFocusable(true);
                }
        }
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited

        for(int i = 0; i < txts.size() ; i++){
            if(chks.get(i).isSelected())
                {
                    Font font = new Font("Segoe UI", 0, 18);
                    Map fontAttr = font.getAttributes();
                    fontAttr.put (TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                    Font myFont = new Font(fontAttr);
                    txts.get(i).setFont(myFont);
                    txts.get(i).setEditable(false);
                    txts.get(i).setFocusable(false);
                }else
                {
                    txts.get(i).setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                    txts.get(i).setEditable(true);
                    txts.get(i).setFocusable(true);
                }
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel10.show();
        jLabel11.show();
        
        txt1 = new JTextField();
        txt1.setBounds(100, 60 + posy, 620, 45);
        txt1.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt1.setCaretColor(new java.awt.Color(255, 51, 153));
        txt1.setOpaque(false);
        txts.add(txt1);

        chkbox1 = new JCheckBox();
        chks.add(chkbox1);
        chkbox1.setBounds(0, posy +65, 63, 50);
        chkbox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/unchecked.png"))); // NOI18N
        chkbox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/checked.png"))); // NOI18N
        chkbox1.setOpaque(false);
        posy += 60;
        chkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(chkbox1.isSelected())
                {
                    Font font = new Font("Segoe UI", 0, 18);
                    Map fontAttr = font.getAttributes();
                    fontAttr.put (TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                    Font myFont = new Font(fontAttr);
                    txt1.setFont(myFont);
                    txt1.setEditable(false);
                    txt1.setFocusable(false);
                }else
                {
                    txt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                    txt1.setEditable(true);
                    txt1.setFocusable(true);
                }
            }

            private Object Font(String segoe_UI, int i, int i0) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        jPanel3.setPreferredSize(new Dimension(jScrollPane2.getWidth(), jScrollPane2.getHeight() +posy));
        size++;

        jPanel3.add(chkbox1);
        jPanel3.add(txt1);
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jLabel10.show();
        jLabel11.show();
        
        if((size > 0) ){
            size--;
        }
        try{

            jPanel3.remove(txts.get(size));
            jPanel3.remove(chks.get(size));
            txts.remove(size);
            chks.remove(size);
            posy -= 60;
            jPanel3.setPreferredSize(new Dimension(jScrollPane2.getWidth(), jScrollPane2.getHeight() +posy));
            jPanel3.revalidate();
            jPanel3.repaint();

        }catch(Exception e) {
            System.out.println("End of the list");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jLabel10.show(false);
        jLabel11.show(false);
        
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

            System.out.println("Size: " + txts.size());

            while(count < txts.size())
            {
                System.out.println(count);
                preparedStmt.setBoolean   (1, chks.get(count).isSelected());
                preparedStmt.setString (2, txts.get(count).getText());
                preparedStmt.execute();
                count++;
            }
            conn.close();
            Main.saved.show();
            Main.saved.setLocation(this.getX() + 850/2 - 330/2, this.getY() + 520/2 - 180/2);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    int posy = 0;
    
    private JLabel label;
    public static javax.swing.JTextField txt1;
    public static javax.swing.JCheckBox chkbox1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
