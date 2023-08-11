/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import Object.ChucVu;
import Object.DongSP;
import Object.SanPham;
import Service.CVservice;
import Service.DongSPService;
import Service.SanPhamService;
import Utilities.Utiliti;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormDongSanPham extends javax.swing.JPanel {

    /**
     * Creates new form FormDongSanPham
     */
    DongSPService _cDongSPService;
    DefaultTableModel _dModel;
    DongSP cv;
    SanPhamService _spPhamService = new SanPhamService();
    Utilities.Utiliti _uUtiliti;

    public FormDongSanPham() {
        initComponents();
        _cDongSPService = new DongSPService();
        _dModel = new DefaultTableModel();
        _uUtiliti = new Utiliti();
        Loaddata(_cDongSPService.getlist());
        rdb();
         for (SanPham x : _spPhamService.getlist()) {
            System.out.println(x.toString());
         }
        
    }

    void Loaddata(List<DongSP> list) {
        if (list.isEmpty()) {
            _dModel.setRowCount(0);
            return;
        }
        _dModel = (DefaultTableModel) tbl_dong.getModel();
        _dModel.setRowCount(0);

        int stt = 1;
        for (DongSP x : list) {
            _dModel.addRow(new Object[]{stt, x.getMa(), x.getTen(), x.getWeb()});
            stt++;
        }
    }

    DongSP getGUI() {
        return new DongSP(1, txt_ma.getText(), txt_ten.getText(), txt_web.getText());
    }

    void rdb() {
        ButtonGroup btn = new ButtonGroup();
        btn.add(rdb_asc);
        btn.add(rdb_desc);
        rdb_asc.setSelected(true);

    }
     String getSP(int a) {
        for (DongSP x : _cDongSPService.getlist()) {
            System.out.println(x.toString());
            if (x.getId()== a) {
                return x.getMa();    
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_ma = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        txt_web = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dong = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        rdb_asc = new javax.swing.JRadioButton();
        rdb_desc = new javax.swing.JRadioButton();
        btn_clear = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_ma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, 30));

        txt_ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));

        txt_web.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_web, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã DSP");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên DSP");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Web");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        tbl_dong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_dong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã", "Tên", "Web"
            }
        ));
        tbl_dong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dong);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 580, 180));

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 80, 30));

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 80, 30));

        rdb_asc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdb_asc.setText("ASC");
        rdb_asc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdb_ascMouseClicked(evt);
            }
        });
        add(rdb_asc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        rdb_desc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdb_desc.setText("DESC");
        rdb_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_descActionPerformed(evt);
            }
        });
        add(rdb_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 80, 30));

        btn_sua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 80, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("Tìm kiếm");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 190, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("QUẢN LÝ DÒNG SẢN PHẨM");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 320, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        int count = 0;
        txt_ma.setEnabled(true);

        if (txt_ma.getText().isEmpty() || _cDongSPService.getIndexByMa(txt_ma.getText()) != -3) {
            JOptionPane.showMessageDialog(this, "Mời bạn nhập lại mã");
            count++;
        }
        if (_uUtiliti.checkSo(txt_ten.getText()) || txt_ten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời bạn nhập lại tên");
            count++;
        }
        if (txt_web.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời bạn nhập web");
            count++;
        }

        if (count == 0) {
            int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn INSERT không");
            if (a == 0) {
                JOptionPane.showMessageDialog(this, _cDongSPService.store(getGUI(), "INSERT"));
            }
            Loaddata(_cDongSPService.getlist());
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
     
        int index = tbl_dong.getSelectedRow();
        
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Bạn phải chọn");
            return;
        }
        for 
                (int i = 0; i < _spPhamService.getlist().size(); i++) {
             if(_cDongSPService.getlist().get(index).getMa().equals(getSP(_spPhamService.getlist().get(i).getIdDSP()))){
             JOptionPane.showMessageDialog(this, "Bạn phải xóa ở bảng SP");
              return;
          }
        }
         

        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn DELETE không");
        if (a == 0) {
            JOptionPane.showMessageDialog(this, _cDongSPService.store(getGUI(), "DELETE"));
            Loaddata(_cDongSPService.getlist());
            btn_clearActionPerformed(evt);
        }

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void rdb_ascMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdb_ascMouseClicked
        // TODO add your handling code here:
        _cDongSPService.sort(1);
        Loaddata(_cDongSPService.getlist());
        JOptionPane.showMessageDialog(this, "Bạn đã sắp xếp từ A-Z");

    }//GEN-LAST:event_rdb_ascMouseClicked

    private void rdb_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_descActionPerformed
        _cDongSPService.sort(2);
        Loaddata(_cDongSPService.getlist());
        JOptionPane.showMessageDialog(this, "Bạn đã sắp xếp từ Z-A");
    }//GEN-LAST:event_rdb_descActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_ma.setEnabled(true);
        txt_ma.setText("");
        txt_ten.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int index = tbl_dong.getSelectedRow();
        int count = 0;
        if (_uUtiliti.checkSo(txt_ten.getText()) || txt_ten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời bạn nhập lại tên");
            count++;
        }
        if (txt_web.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời bạn nhập web");
            count++;
        }
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Bạn phải chọn");
            return;
        }
        if (count == 0) {
            int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn UPDATE không?");
            if (a == 0) {
                JOptionPane.showMessageDialog(this, _cDongSPService.store(getGUI(), "UPDATE"));
                Loaddata(_cDongSPService.getlist());
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void tbl_dongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dongMouseClicked
        // TODO add your handling code here:
        txt_ma.setEnabled(false);
        int index = tbl_dong.getSelectedRow();
        txt_ma.setText(tbl_dong.getModel().getValueAt(index, 1).toString());
        txt_ten.setText(tbl_dong.getModel().getValueAt(index, 2).toString());
        txt_web.setText(tbl_dong.getModel().getValueAt(index, 3).toString());


    }//GEN-LAST:event_tbl_dongMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rdb_asc;
    private javax.swing.JRadioButton rdb_desc;
    private javax.swing.JTable tbl_dong;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_web;
    // End of variables declaration//GEN-END:variables
}
