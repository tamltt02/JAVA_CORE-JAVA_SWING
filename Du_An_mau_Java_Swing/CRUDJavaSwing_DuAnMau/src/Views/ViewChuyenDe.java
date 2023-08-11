/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.ChuyenDeService;
import entities.ChuyenDe;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.ChuyenDeModel;

/**
 *
 * @author ADMIN
 */
public class ViewChuyenDe extends javax.swing.JFrame {

    /**
     * Creates new form ViewChuyenDe
     */
    ChuyenDeService cdService = new ChuyenDeService();
    DefaultTableModel _dTableModel = new DefaultTableModel();

    public ViewChuyenDe() {
        initComponents();
        loaddata(cdService.getlist());

    }

    void loaddata(List<ChuyenDe> list) {

        _dTableModel = (DefaultTableModel) tblCD.getModel();
        _dTableModel.setRowCount(0);
        for (ChuyenDe x : list) {
            _dTableModel.addRow(new Object[]{x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getMoTa()});
        }
    }

    void showdetail(int index) {

        ChuyenDe cd = cdService.getlist().get(index);
        txtMaCD.setText(cd.getMaCD());
        txtTenCD.setText(cd.getTenCD());
        txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
        txtThoiLuong.setText(String.valueOf(cd.getThoiLuong()));
        txtAnh.setText(cd.getHinh());
        txtMoTa.setText(cd.getMoTa());
        ImageIcon imageicon = new ImageIcon(cd.getHinh());
        Image image = (imageicon).getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_SMOOTH);
        imageicon = new ImageIcon(image);
        lblHinh.setIcon(imageicon);
    }

    ChuyenDeModel getGUI() {
        return new ChuyenDeModel(txtMaCD.getText(), txtTenCD.getText(), Double.parseDouble(txtHocPhi.getText()), Integer.parseInt(txtThoiLuong.getText()), txtAnh.getText(), txtMoTa.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCD = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAnh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        lblHinh = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã CD", "Tên CD", "Học Phí", "Thời Lượng", "Mô Tả"
            }
        ));
        tblCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCD);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Quản lý Chuyên Đề");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã CD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 44, 71, 26));
        jPanel1.add(txtMaCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 129, -1));

        jLabel2.setText("Tên CD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 71, 26));
        jPanel1.add(txtHocPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 129, -1));

        jLabel3.setText("Học Phí");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 71, 26));
        jPanel1.add(txtTenCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 129, -1));

        jLabel4.setText("Thời Lượng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 71, 26));
        jPanel1.add(txtThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 129, -1));

        jLabel5.setText("Ảnh");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 46, 71, 26));

        txtAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnhMouseClicked(evt);
            }
        });
        jPanel1.add(txtAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 150, -1));

        jLabel6.setText("Mô tả");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 71, 26));
        jPanel1.add(txtMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 150, -1));

        lblHinh.setMaximumSize(new java.awt.Dimension(186, 231));
        lblHinh.setMinimumSize(new java.awt.Dimension(186, 231));
        lblHinh.setPreferredSize(new java.awt.Dimension(186, 231));
        jPanel1.add(lblHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 190, 180));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 60, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 60, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDMouseClicked
        // TODO add your handling code here:
        showdetail(tblCD.getSelectedRow());
    }//GEN-LAST:event_tblCDMouseClicked

    private void txtAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnhMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("hình ảnh", "png", "jpg");//lọc
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);//cho phép chọn 1 ảnh

        int a = fileChooser.showDialog(this, "Chọn file");// hiển thị hộp chọn
        if (a == JFileChooser.APPROVE_OPTION) // đã chọn
        {

            File f = fileChooser.getSelectedFile();
//            lblHinh.setIcon(new ImageIcon(f.getAbsolutePath()));

            ImageIcon imageicon = new ImageIcon(f.getAbsolutePath());
            Image image = (imageicon).getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_SMOOTH);
            imageicon = new ImageIcon(image);
            lblHinh.setIcon(imageicon);
            txtAnh.setText(f.getAbsolutePath());
        }


    }//GEN-LAST:event_txtAnhMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        cdService.add(getGUI());
        loaddata(cdService.getlist());
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        cdService.update(getGUI());
        loaddata(cdService.getlist());
        JOptionPane.showMessageDialog(this, "Sửa thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        cdService.delete(getGUI());
        loaddata(cdService.getlist());
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtMaCD.setText("");
        txtTenCD.setText("");
        txtHocPhi.setText("");
        txtThoiLuong.setText("");
        txtAnh.setText("");
        txtMoTa.setText("");
        lblHinh.setIcon(new ImageIcon(""));

    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChuyenDe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTable tblCD;
    private javax.swing.JTextField txtAnh;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
}
