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
import java.util.ArrayList;
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
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class AddTbl extends javax.swing.JFrame {

    public static ArrayList<String> courses = new ArrayList<String>() ;
    public static ArrayList<String> profs = new ArrayList<String>() ;
    public static ArrayList<String> weeksf = new ArrayList<String>() ;
    public static ArrayList<String> weekst = new ArrayList<String>() ;
    public static ArrayList<String> classf = new ArrayList<String>() ;
    public static ArrayList<String> classt = new ArrayList<String>() ;
    public static ArrayList<String> credits = new ArrayList<String>() ;
    public static ArrayList<String> days = new ArrayList<String>() ;
    
    int xx,xy;
    
    public static ArrayList<JTextField> txts = new ArrayList<JTextField>();
    public static ArrayList<JTextField> txts2 = new ArrayList<JTextField>();
    public static ArrayList<JTextField> txts3 = new ArrayList<JTextField>();
    public static ArrayList<JRadioButton> radios1 = new ArrayList<JRadioButton>();
    public static ArrayList<JRadioButton> radios2 = new ArrayList<JRadioButton>();
    public static ArrayList<JComboBox> combos = new ArrayList<JComboBox>();
    
    public static int size = 0;
    
    boolean exited = false;
    
    int posy = 0;
    
    
    public AddTbl() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(10, 10, 740, 390, 50, 50));
        this.setLocationRelativeTo(null);
        
        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setRenderer(new DefaultListCellRenderer(){
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            result.setOpaque(false);
            return result;
        }});
        
        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setRenderer(new DefaultListCellRenderer(){
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            result.setOpaque(false);
            return result;
        }});
        
        jComboBox3.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setRenderer(new DefaultListCellRenderer(){
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            result.setOpaque(false);
            return result;
        }});
        
        jComboBox4.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setRenderer(new DefaultListCellRenderer(){
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            result.setOpaque(false);
            return result;
        }});
        
        GraphicsEnvironment ge = 
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        //If translucent windows aren't supported, exit.
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            System.err.println(
                "Translucency is not supported");
                System.exit(0);
        }
        
        this.setOpacity(0.92f);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jList2 = new javax.swing.JList<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BckGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(850, 520));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 16, 113, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("From");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 48, 26));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("From");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 48, 26));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Credits");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 26));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255,0,0,150)
        );
        jLabel8.setText("Fill all informations before moving on");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("To");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 48, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("To");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 48, 26));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 AM", "9 AM", "10 AM", "11 AM", "12 / 2 PM", "3 PM", "4 PM", "5 PM", "6 PM" }));
        jComboBox3.setToolTipText("");
        jComboBox3.setFocusable(false);
        jComboBox3.setOpaque(false);
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 104, -1));

        jList1.setBackground(new java.awt.Color(0,0,0,0));
        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1.0", "2.0", "3.0", "4.0", "5.0", "6.0" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFocusable(false);
        jList1.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jList1.setOpaque(false);
        jPanel2.add(jList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 20, 130));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "week1", "week2", "week3", "week4", "week5", "week6", "week7", "week8", "week9", "week10", "week11", "week12", "week13", "week14", "week15" }));
        jComboBox1.setFocusable(false);
        jComboBox1.setOpaque(false);
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 104, -1));

        jButton1.setBackground(new java.awt.Color(0,0,0,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/add.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/addClicked.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 60, 60));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setCaretColor(new java.awt.Color(255, 51, 153));
        jTextField3.setOpaque(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 350, 30));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setCaretColor(new java.awt.Color(255, 51, 153));
        jTextField2.setOpaque(false);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 310, 30));

        jList2.setBackground(new java.awt.Color(0,0,0,0));
        jList2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setFocusable(false);
        jList2.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jList2.setOpaque(false);
        jPanel2.add(jList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, 130));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "week1", "week2", "week3", "week4", "week5", "week6", "week7", "week8", "week9", "week10", "week11", "week12", "week13", "week14", "week15" }));
        jComboBox2.setFocusable(false);
        jComboBox2.setOpaque(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 104, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 AM", "9 AM", "10 AM", "11 AM", "12 / 2 PM", "3 PM", "4 PM", "5 PM", "6 PM" }));
        jComboBox4.setToolTipText("");
        jComboBox4.setFocusable(false);
        jComboBox4.setOpaque(false);
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 104, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Professor's name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 30));

        BckGround.setBackground(new java.awt.Color(255,255,255,10));
        BckGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/backGround.png"))); // NOI18N
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
        jPanel2.add(BckGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        this.show(false);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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

    public static String classes(int x)
    {
        switch(x)
        {
            case 0:
                return "8 AM";
            case 1:
                return "9 AM";
            case 2:
                return "10 AM";
            case 3:
                return "11 AM";
            case 4:
                return "12 / 2 PM";
            case 5:
                return "3 PM";
            case 6:
                return "4 PM";
            case 7:
                return "5 PM";
            case 8:
                return "6 PM";
        }
        return "";
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String courseName = jTextField3.getText();
        String profName = jTextField2.getText();
        int weekFrom = jComboBox1.getSelectedIndex();
        int weekTo = jComboBox2.getSelectedIndex();;
        int classFrom = jComboBox3.getSelectedIndex();; //drawn
        int classTo = jComboBox4.getSelectedIndex();;   //drawn
        String credit = jList1.getSelectedValue();
        String day = jList2.getSelectedValue();     //drawn
        
        courses.add(courseName);
        profs.add(profName);
        weeksf.add("week"+(int)(weekFrom+1));
        weekst.add("week"+(int)(weekTo+1));
        classf.add(classes(classFrom));
        classt.add(classes(classTo));
        credits.add(credit);
        days.add(day);
        
        jLabel2 = new JLabel(courseName + " (" + credit + ")");
        jLabel11 = new JLabel("week " + (int)(weekFrom+1) + " - " + (int)(weekTo+1));
        jLabel12 = new JLabel(profName);

        if(courseName.compareTo("") == 0 || profName.compareTo("") == 0 || (weekFrom == 0 && weekTo == 0)
            || (weekFrom > weekTo) || classFrom == 0 && classTo == 0 || (classFrom > classTo) || credit == null || day == null)
        {
            JOptionPane.showMessageDialog( null, "Please fill all blanks (correctly)");
        }
        else
        {
            jPanel2 = new JPanel();
            jPanel2.setBackground(new Color(0,0,0,150));
            jPanel2.setBounds(0, 5+30*(classFrom), 100, 30*(classTo - classFrom));
            jLabel2.setBounds(20, 5+30*(classFrom), 100, 20);
            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
            jLabel2.setForeground(Color.white);
            
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
                Main.tt.jPanel1.add(jLabel2);
                Main.tt.jPanel1.add(jLabel11);
                Main.tt.jPanel1.add(jLabel12);
                Main.tt.jPanel1.add(jPanel2);
                Main.tt.jPanel1.repaint();
                Main.tt.jPanel1.revalidate();
                break;
                case "tuesday":
                Main.tt.jPanel3.add(jLabel2);
                Main.tt.jPanel3.add(jLabel11);
                Main.tt.jPanel3.add(jLabel12);
                Main.tt.jPanel3.add(jPanel2);
                Main.tt.jPanel3.repaint();
                Main.tt.jPanel3.revalidate();
                break;
                case "wednesday":
                Main.tt.jPanel5.add(jLabel2);
                Main.tt.jPanel5.add(jLabel11);
                Main.tt.jPanel5.add(jLabel12);
                Main.tt.jPanel5.add(jPanel2);
                Main.tt.jPanel5.repaint();
                Main.tt.jPanel5.revalidate();
                break;
                case "thursday":
                Main.tt.jPanel6.add(jLabel2);
                Main.tt.jPanel6.add(jLabel11);
                Main.tt.jPanel6.add(jLabel12);
                Main.tt.jPanel6.add(jPanel2);
                Main.tt.jPanel6.repaint();
                Main.tt.jPanel6.revalidate();
                break;
                case "friday":
                Main.tt.jPanel7.add(jLabel2);
                Main.tt.jPanel7.add(jLabel11);
                Main.tt.jPanel7.add(jLabel12);
                Main.tt.jPanel7.add(jPanel2);
                Main.tt.jPanel7.repaint();
                Main.tt.jPanel7.revalidate();
                break;
                case "saturday":
                Main.tt.jPanel8.add(jLabel2);
                Main.tt.jPanel8.add(jLabel11);
                Main.tt.jPanel8.add(jLabel12);
                Main.tt.jPanel8.add(jPanel2);
                Main.tt.jPanel8.repaint();
                Main.tt.jPanel8.revalidate();
                break;
            }
            
        this.show(false);
        }
        
        
        System.out.println("Course Name : " + courseName
            +"\nProfessor Name : " + profName
            +"\nFrom week: " + weekFrom
            +"\nTo week : " + weekTo
            +"\nFrom class: " + classFrom
            +"\nTo class : " + classTo
            +"\nCredit : " + credit
            +"\nDay : " + day);
    }//GEN-LAST:event_jButton1ActionPerformed

    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JToggleButton tgl1;
    private javax.swing.JToggleButton tgl2;
    private javax.swing.JRadioButton radioB1;
    private javax.swing.JRadioButton radioB2;
    JLabel jLabel2;
    JLabel jLabel11;
    JLabel jLabel12; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BckGround;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
