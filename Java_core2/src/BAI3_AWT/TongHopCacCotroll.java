/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BAI3_AWT;

import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class TongHopCacCotroll extends javax.swing.JFrame {

    /**
     * Creates new form TongHopCacCotroll
     */
    public TongHopCacCotroll() {
        initComponents();
        setLocationRelativeTo(null);
        volume();
        month();
    }

    void month() {
        Hashtable ha = new Hashtable();
        String[] arrThang = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < 12; i++) {
            ha.put(i, new JLabel(arrThang[i]));
        }
        jslider_Month.setLabelTable(ha);
    }

    void volume() {
        jsslider_volume.setPaintTicks(true); //cho phép sử sụng major
        jsslider_volume.setMajorTickSpacing(10);// khoảng cách giữa vạch

        //Thêm nhãn cho nó
        jsslider_volume.setPaintLabels(true);
        Hashtable ha = jsslider_volume.createStandardLabels(20);
        jsslider_volume.setLabelTable(ha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_mess = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        btn_op1 = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        btn_op2 = new javax.swing.JButton();
        txt_input = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_fpoly = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jsslider_volume = new javax.swing.JSlider();
        btn_mess1 = new javax.swing.JButton();
        lbl_volume = new javax.swing.JLabel();
        jslider_Month = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dialog"));

        btn_mess.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mess.setText("Message");
        btn_mess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_messActionPerformed(evt);
            }
        });

        btn_confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_confirm.setText("Comfirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        btn_op1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_op1.setText(" Option 1");
        btn_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op1ActionPerformed(evt);
            }
        });

        btn_input.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_input.setText("Input");
        btn_input.setToolTipText("");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_op2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_op2.setText("Option 2");
        btn_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_confirm)
                        .addComponent(btn_mess))
                    .addComponent(btn_op1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_input, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btn_op2)
                    .addComponent(btn_input))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mess)
                    .addComponent(btn_input))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirm)
                    .addComponent(btn_op2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_op1)
                    .addComponent(txt_input, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Img Button"));

        btn_fpoly.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_fpoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAI3_AWT/gimp-icon.png"))); // NOI18N
        btn_fpoly.setText("FPOLY");
        btn_fpoly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fpolyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_fpoly)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_fpoly)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Slider"));

        jsslider_volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsslider_volumeStateChanged(evt);
            }
        });

        btn_mess1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mess1.setText("Volume");
        btn_mess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mess1ActionPerformed(evt);
            }
        });

        lbl_volume.setText("Volume");

        jslider_Month.setMaximum(11);
        jslider_Month.setPaintLabels(true);
        jslider_Month.setPaintTicks(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lbl_volume, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_mess1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jsslider_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jslider_Month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_mess1)
                    .addComponent(jsslider_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_volume, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jslider_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op2ActionPerformed
        // TODO add your handling code here:
        Object[] obs = {"C#", "Java3", "Java4", "C#3"};
        int chon = JOptionPane.showOptionDialog(this, "Bạn thích ngôn ngữ nào? ", "Câu hỏi ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, obs, obs[0]);
        switch (chon) {
            case 0:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + obs[0]);
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + obs[1]);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + obs[2]);

                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + obs[3]);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_op2ActionPerformed

    private void btn_messActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_messActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Hi");
    }//GEN-LAST:event_btn_messActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Bạn có muốn học lại JAva k");
        txt_input.setText(input);
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn học lại k?");
        if (chon == 1) {
            JOptionPane.showMessageDialog(this, "Bạn đồng ý 1");
        } else if (chon == 0) {
            JOptionPane.showMessageDialog(this, "Bạn đồng ý 0");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đồng ý 2");

        }

    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op1ActionPerformed
        // TODO add your handling code here:
        Object[] obs = {"Có", "Chưa"};
        int chon = JOptionPane.showOptionDialog(this, "Bạn có ny chưa? ", "Câu hỏi ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, obs, obs[0]);
        if (chon == 0) {
            JOptionPane.showMessageDialog(this, " Bạn chọn có");
            return;
        } else {
            JOptionPane.showMessageDialog(this, " Bạn chọn k");

        }
    }//GEN-LAST:event_btn_op1ActionPerformed

    private void btn_fpolyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fpolyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_fpolyActionPerformed

    private void btn_mess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mess1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mess1ActionPerformed

    private void jsslider_volumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsslider_volumeStateChanged
        // TODO add your handling code here:
        if (jsslider_volume.getValueIsAdjusting()) {
            return;//trong khi chưa dừng kéo thì k chạy
        }
        lbl_volume.setText(String.valueOf(jsslider_volume.getValue()));
    }//GEN-LAST:event_jsslider_volumeStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TongHopCacCotroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TongHopCacCotroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TongHopCacCotroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TongHopCacCotroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TongHopCacCotroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_fpoly;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_mess;
    private javax.swing.JButton btn_mess1;
    private javax.swing.JButton btn_op1;
    private javax.swing.JButton btn_op2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jslider_Month;
    private javax.swing.JSlider jsslider_volume;
    private javax.swing.JLabel lbl_volume;
    private javax.swing.JTextField txt_input;
    // End of variables declaration//GEN-END:variables
}
