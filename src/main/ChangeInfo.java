package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ChangeInfo extends javax.swing.JFrame {

    
    public static ArrayList<JTextField> txts = new ArrayList<JTextField>();
    public static ArrayList<JTextField> txts2 = new ArrayList<JTextField>();
    public static ArrayList<JTextField> txts3 = new ArrayList<JTextField>();
    public static ArrayList<JRadioButton> radios1 = new ArrayList<JRadioButton>();
    public static ArrayList<JRadioButton> radios2 = new ArrayList<JRadioButton>();
    public static ArrayList<JComboBox> combos = new ArrayList<JComboBox>();
    
    private int size = 0;
    
    boolean exited = false;
    
    int posy = 0;
    
    
    public ChangeInfo() {
        initComponents();
        this.setLocation(Main.signbg.getLocation());
        this.setShape(new RoundRectangle2D.Double(10, 10, 320, 470, 50, 50));
        
        GraphicsEnvironment ge = 
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        //If translucent windows aren't supported, exit.
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            System.err.println(
                "Translucency is not supported");
                System.exit(0);
        }
        
        this.setOpacity(0.98f);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BckGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(850, 520));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 40));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setCaretColor(new java.awt.Color(255, 51, 153));
        jTextField2.setOpaque(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPasswordField1.setCaretColor(new java.awt.Color(255, 51, 153));
        jPasswordField1.setOpaque(false);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Change Info");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 60));

        jToggleButton1.setBackground(new java.awt.Color(0,0,0,0));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 50, 40));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setCaretColor(new java.awt.Color(255, 51, 153));
        jTextField3.setOpaque(false);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 150, 50));

        BckGround.setBackground(new java.awt.Color(255,255,255,0));
        BckGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/SignInpopup.png"))); // NOI18N
        BckGround.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BckGroundMouseDragged(evt);
            }
        });
        BckGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BckGroundMousePressed(evt);
            }
        });
        jPanel2.add(BckGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx,xy; 
    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        this.show(false);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBorderPainted(true); //to make the borders transparent
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBorderPainted(false); //to make the borders transparent
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        END:try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/uniassist";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT * FROM account";
            Statement ps2 = conn.createStatement();
            ResultSet rs = ps2.executeQuery(query);
            if(rs.next())   //first time user
            {
                System.out.println(Main.sett.nameBefore);
                System.out.println(jTextField3.getText().compareTo(Main.sett.nameBefore) == 0);
                if(jTextField3.getText().compareTo(rs.getString("Username")) == 0 && !(jTextField3.getText().compareTo(Main.sett.nameBefore) == 0))
                {
                    JOptionPane.showMessageDialog(null, "Username Taken, please try to change ur username");
                    break END;
                } 
                else if(jTextField3.getText().length() < 5)
                {
                    JOptionPane.showMessageDialog(null, "Username too short, please at least 5 characters");
                    break END;
                }
                else if(jPasswordField1.getText().length() < 5)
                {
                    JOptionPane.showMessageDialog(null, "Password too short, please at least 5 characters");
                    break END;
                }
                else if(!isValidEmailAddress(jTextField2.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Email address not supported, please enter an usable addresse such as @gmail.com for example");
                    break END;
                }
                else if(jTextField2.getText().compareTo(rs.getString("Email")) == 0 && !(jTextField2.getText().compareTo(Main.sett.emailBefore) == 0))
                {
                    JOptionPane.showMessageDialog(null, "Email address already used");
                    break END;
                }
                else    //no user found
                {
                    query = "UPDATE `account` SET `Username`=?,`Password`=?,`Email`=? WHERE Username = \"" + Main.login.jTextField2.getText() + "\"";
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString (1, jTextField3.getText());
                    preparedStmt.setString (2, jPasswordField1.getText());
                    preparedStmt.setString   (3, jTextField2.getText());
                    preparedStmt.execute();
                    Main.sett.nameBefore = jTextField3.getText();
                    Main.login.jTextField2.setText(jTextField3.getText());
                    Main.login.jPasswordField2.setText(jPasswordField1.getText());
                    Main.login.jTextField3.setText(jTextField2.getText());
                    jTextField3.setText("");
                    jPasswordField1.setText("");
                    jTextField2.setText("");
                    Main.saved.show();
                    Main.saved.setLocation(Main.sett.getX() + 850/2 - 330/2,Main.sett.getY() + 520/2 - 180/2);
                    this.show(false);
                    conn.close();
                    break END;
                }
            } else    //no user found
                {
                    query = "UPDATE `account` SET `Username`=?,`Password`=?,`Email`=? WHERE Username = \"" + Main.login.jTextField2.getText() + "\"";
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString (1, jTextField3.getText());
                    preparedStmt.setString (2, jPasswordField1.getText());
                    preparedStmt.setString   (3, jTextField2.getText());
                    preparedStmt.execute();
                    Main.sett.nameBefore = jTextField3.getText();
                    Main.login.jTextField2.setText(jTextField3.getText());
                    Main.login.jPasswordField2.setText(jPasswordField1.getText());
                    Main.login.jTextField3.setText(jTextField2.getText());
                    jTextField3.setText("");
                    jPasswordField1.setText("");
                    jTextField2.setText("");
                    Main.saved.show();
                    Main.saved.setLocation(Main.sett.getX() + 850/2 - 330/2,Main.sett.getY() + 520/2 - 180/2);
                    this.show(false);
                    conn.close();
                    break END;
            }
        } catch (Exception ex ) {
            JOptionPane.showMessageDialog(null, "Username Taken, please try to change ur username");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

     public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    private void BckGroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BckGroundMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BckGroundMousePressed

    private void BckGroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BckGroundMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy);
    }//GEN-LAST:event_BckGroundMouseDragged

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if(jTextField3.getText().length()> 24)
        {
            jTextField3.setText(jTextField3.getText().substring(0, 24));
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if(jPasswordField1.getText().length()> 127)
        {
            jPasswordField1.setText(jPasswordField1.getText().substring(0, 127));
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(jTextField2.getText().length()> 319)
        {
            jTextField2.setText(jTextField2.getText().substring(0, 319));
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
        }
        else
        {
            jPasswordField1.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BckGround;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
