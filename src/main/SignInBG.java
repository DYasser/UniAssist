package main;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

public class SignInBG extends javax.swing.JFrame {

    public SignInBG() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(10, 10, 840, 510, 50, 50));
        this.setFocusable(false);
        this.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackGround = new javax.swing.JLabel();

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

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/signInBg.png"))); // NOI18N
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
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void BackGroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackGroundKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackGroundKeyPressed

    private void BackGroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackGroundMousePressed

    private void BackGroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BackGroundMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
