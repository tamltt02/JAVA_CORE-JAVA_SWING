/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import View.ViewChuyenDee;
import View.ViewHocVien;
import View.ViewKhoaHoc;
import View.ViewNguoiHoc;
import View.ViewNhanVienn;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNV = new javax.swing.JButton();
        btnCD = new javax.swing.JButton();
        btnNH = new javax.swing.JButton();
        btnKH = new javax.swing.JButton();
        btnHV = new javax.swing.JButton();
        pn = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ ");

        btnNV.setBackground(new java.awt.Color(255, 255, 255));
        btnNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNV.setText("NHÂN VIÊN");
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });

        btnCD.setBackground(new java.awt.Color(255, 255, 255));
        btnCD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCD.setText("CHUYÊN ĐỀ");
        btnCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDActionPerformed(evt);
            }
        });

        btnNH.setBackground(new java.awt.Color(255, 255, 255));
        btnNH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNH.setText("NGƯỜI HỌC");
        btnNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNHActionPerformed(evt);
            }
        });

        btnKH.setBackground(new java.awt.Color(255, 255, 255));
        btnKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKH.setText("KHÓA HỌC");
        btnKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKHActionPerformed(evt);
            }
        });

        btnHV.setBackground(new java.awt.Color(255, 255, 255));
        btnHV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHV.setText("HỌC VIÊN");
        btnHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHVActionPerformed(evt);
            }
        });

        pn.setLayout(new javax.swing.BoxLayout(pn, javax.swing.BoxLayout.LINE_AXIS));

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNH, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNH, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed
        // TODO add your handling code here:
        pn.removeAll();
        pn.add(new ViewNhanVienn());
        pn.validate();
        btnNV.setBackground(Color.red);
        btnCD.setBackground(Color.WHITE);
        btnKH.setBackground(Color.WHITE);
        btnNH.setBackground(Color.WHITE);
        btnHV.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnNVActionPerformed

    private void btnCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDActionPerformed
        // TODO add your handling code here:
        pn.removeAll();
        pn.add(new ViewChuyenDee());
        pn.validate();
        btnCD.setBackground(Color.red);
        btnNV.setBackground(Color.WHITE);
        btnKH.setBackground(Color.WHITE);
        btnNH.setBackground(Color.WHITE);
        btnHV.setBackground(Color.WHITE);
    
    }//GEN-LAST:event_btnCDActionPerformed

    private void btnNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNHActionPerformed
        // TODO add your handling code here:
        pn.removeAll();
        pn.add(new ViewNguoiHoc());
        pn.validate();
        btnNH.setBackground(Color.red);
        btnCD.setBackground(Color.WHITE);
        btnKH.setBackground(Color.WHITE);
        btnNV.setBackground(Color.WHITE);
        btnHV.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnNHActionPerformed

    private void btnKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKHActionPerformed
        // TODO add your handling code here:
        pn.removeAll();
        pn.add(new ViewKhoaHoc());
        pn.validate();
        btnKH.setBackground(Color.red);
        btnNH.setBackground(Color.WHITE);
        btnCD.setBackground(Color.WHITE);
        btnNV.setBackground(Color.WHITE);
        btnHV.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnKHActionPerformed

    private void btnHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHVActionPerformed
        pn.removeAll();
        pn.add(new ViewHocVien());
        pn.validate();
        btnHV.setBackground(Color.red);
        btnKH.setBackground(Color.WHITE);
        btnNH.setBackground(Color.WHITE);
        btnCD.setBackground(Color.WHITE);
        btnNV.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnHVActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
      int a =  JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?");
      if(a==0){
        this.dispose();
        new Login().setVisible(true);
      }
    }//GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCD;
    private javax.swing.JButton btnHV;
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnNH;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnThoat;
    private javax.swing.JPanel pn;
    // End of variables declaration//GEN-END:variables
}