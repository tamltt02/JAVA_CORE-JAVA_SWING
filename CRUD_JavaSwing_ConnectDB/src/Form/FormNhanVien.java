/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import Object.ChucVu;
import Object.NhanVien;
import Service.CVservice;
import Service.NhanVienService;
import Utilities.Utiliti;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form FormNhanVien
     */
    
    CVservice _cvCVservice = new CVservice();
    NhanVienService _nvService;
    DefaultTableModel _dDefaultTableModel;
    Utilities.Utiliti _utUtiliti;
    NhanVien _nvNhanVien;
    
    public FormNhanVien() {
        initComponents();
        date_choose.setDateFormatString("yyyy-MM-dd");
        _utUtiliti = new Utiliti();
        _nvService = new NhanVienService();
        add();
        addnv();
        rdb();
        rdbsx();
        loaddata(_nvService.getlist());
        _dDefaultTableModel = new DefaultTableModel();
    }

    void add() {
        cbc_Chucvu.removeAllItems();
        for (ChucVu x : _cvCVservice.getlist()) {
            cbc_Chucvu.addItem(x.getTen());
        }
//             if (cbc_Chucvu.getItemCount() == 1) {
//            cbc_Chucvu.setSelectedIndex(0);
//        }
    }

    int getidcv(String txt) {
        for (ChucVu x : _cvCVservice.getlist()) {
            if (x.getTen().equals(txt)) {
                return x.getId();
            }
        }
        return -1;
    }

    String getTencv(int a) {
        for (ChucVu x : _cvCVservice.getlist()) {
            if (x.getId() == (a)) {
                return x.getTen();
            }
        }
        return null;
    }

    void addnv() {
        cbc_nguoiBaocao.removeAllItems();
        for (NhanVien x : _nvService.getlist()) {
            cbc_nguoiBaocao.addItem(x.getTen());
        }
        if (cbc_nguoiBaocao.getItemCount() == 1) {
            cbc_nguoiBaocao.setSelectedIndex(0);
        }
    }

    int getidnv(String txt) {
        for (NhanVien x : _nvService.getlist()) {
            if (x.getTen().equals(txt)) {
                return x.getId();
            }
        }
        return -1;
    }

    String getTennv(int a) {
        for (NhanVien x : _nvService.getlist()) {
            if (x.getId() == (a)) {
                return x.getTen();
            }
        }
        return null;
    }

    void rdb() {
        ButtonGroup btn = new ButtonGroup();
        btn.add(rdb_nam);
        btn.add(rdb_nu);
        rdb_nu.setSelected(true);
    }

    void rdbsx() {
        ButtonGroup btn = new ButtonGroup();
        btn.add(rdb_asc);
        btn.add(rdb_dessc);
        rdb_asc.setSelected(true);
    }

    public void loaddata(List<NhanVien> lits) {
        addnv();
        if (lits.isEmpty()) {
            return;
        }
        _dDefaultTableModel = (DefaultTableModel) tbl_nv.getModel();
        _dDefaultTableModel.setRowCount(0);
        int stt = 1;
        for (NhanVien x : lits) {
            _dDefaultTableModel.addRow(new Object[]{stt,
                x.getMa(),
                x.getTenHo(),
                x.getTenDem(),
                x.getTen(),
                x.getNgaySinh(),
                x.getGioiTinh(),
                getTencv(x.getIdCV()),
                getTennv(x.getIdNguoiBaoCao())});
            stt++;
        }
    }

    NhanVien getGUI() throws ParseException {
        return new NhanVien(1, txt_ma.getText(), txt_tenho.getText(), txt_tendem.getText(), txt_ten.getText(), rdb_nam.isSelected() == true ? "Nam" : "Nữ",date_choose.getDate(), getidcv(cbc_Chucvu.getItemAt(cbc_Chucvu.getSelectedIndex())), getidnv(cbc_nguoiBaocao.getItemAt(cbc_nguoiBaocao.getSelectedIndex())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tenho = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        txt_tendem = new javax.swing.JTextField();
        rdb_nam = new javax.swing.JRadioButton();
        rdb_nu = new javax.swing.JRadioButton();
        btn_clear = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        cbc_Chucvu = new javax.swing.JComboBox<>();
        cbc_nguoiBaocao = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rdb_asc = new javax.swing.JRadioButton();
        rdb_dessc = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nv = new javax.swing.JTable();
        date_choose = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 73, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên Họ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 73, -1));

        txt_ma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 160, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giới Tính");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 73, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Chức vụ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 73, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 73, 30));

        txt_timkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_timkiem.setText("Tìm kiếm");
        txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timkiemCaretUpdate(evt);
            }
        });
        add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 220, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tên Đệm");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 73, -1));

        txt_tenho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_tenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tên ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 73, -1));

        txt_ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));

        txt_tendem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_tendem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, 30));

        rdb_nam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdb_nam.setText("Nam");
        add(rdb_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        rdb_nu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdb_nu.setText("Nữ");
        add(rdb_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 50, -1));

        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 70, 40));

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, 40));

        btn_sua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, 40));

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 70, 40));

        cbc_Chucvu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbc_Chucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbc_Chucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbc_ChucvuActionPerformed(evt);
            }
        });
        add(cbc_Chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 220, 30));

        cbc_nguoiBaocao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbc_nguoiBaocao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbc_nguoiBaocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 220, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Người Báo Cáo");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 100, -1));

        rdb_asc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdb_asc.setText("A-Z");
        rdb_asc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_ascActionPerformed(evt);
            }
        });
        add(rdb_asc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        rdb_dessc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdb_dessc.setText("Z-A");
        rdb_dessc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_desscActionPerformed(evt);
            }
        });
        add(rdb_dessc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("QUẢN LÝ NHÂN VIÊN");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 210, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 5, -1, -1));

        tbl_nv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã", "Tên Họ", "Tên Đệm", "Tên ", "Ngày sinh", "Giới tính", "Chức vụ", "ng báo cáo"
            }
        ));
        tbl_nv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nv);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 140));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 760, 180));
        add(date_choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_ma.setEnabled(true);
        txt_ma.setText("");
        txt_ten.setText("");
        txt_tenho.setText("");
        txt_tendem.setText("");
        date_choose.setDateFormatString("");

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            int count = 0;
            if (txt_ma.getText().isEmpty() || txt_ten.getText().isEmpty() || txt_tenho.getText().isEmpty() || txt_tendem.getText().isEmpty() || date_choose.getDateFormatString().isEmpty()) {
                count++;
                JOptionPane.showMessageDialog(this, "Dữ liệu không được null mời bạn nhập lại");
                return;
            }
            if (_nvService.getIndexByMa(txt_ma.getText()) != -3) {
                JOptionPane.showMessageDialog(this, "Trùng mã");
                count++;
                return;
            }
            if (_utUtiliti.checkSo(txt_ten.getText()) || _utUtiliti.checkSo(txt_tendem.getText()) || _utUtiliti.checkSo(txt_tenho.getText())) {
                count++;
                JOptionPane.showMessageDialog(this, "Tên là chữ. Mời bạn nhập lại");
                return;
            }
            if (count == 0) {
                int a = JOptionPane.showConfirmDialog(this, " Bạn có muốn INSERT không?");
                if (a == 0) {
                    JOptionPane.showMessageDialog(this, _nvService.store(getGUI(), "INSERT"));
                    loaddata(_nvService.getlist());
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_themActionPerformed

    private void cbc_ChucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbc_ChucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbc_ChucvuActionPerformed

    private void tbl_nvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nvMouseClicked
        // TODO add your handling code here:
        txt_ma.setEnabled(false);
        int index = tbl_nv.getSelectedRow();
        txt_ma.setText(tbl_nv.getModel().getValueAt(index, 1).toString());
        txt_tenho.setText(tbl_nv.getModel().getValueAt(index, 2).toString());
        txt_tendem.setText(tbl_nv.getModel().getValueAt(index, 3).toString());
        txt_ten.setText(tbl_nv.getModel().getValueAt(index, 4).toString());
try {
            date_choose.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tbl_nv.getModel().getValueAt(index, 5).toString()));
        } catch (ParseException ex) {
           
        }
        for (int i = 0; i < cbc_Chucvu.getItemCount(); i++) {
            if (getTencv(_nvService.getlist().get(index).getIdCV()).equalsIgnoreCase(cbc_Chucvu.getItemAt(i))) {
                cbc_Chucvu.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < cbc_nguoiBaocao.getItemCount(); i++) {
            if (getTennv(_nvService.getlist().get(index).getIdNguoiBaoCao()).equalsIgnoreCase(cbc_nguoiBaocao.getItemAt(i))) {
                cbc_nguoiBaocao.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tbl_nvMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int index = tbl_nv.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Bạn phải chọn");
            return;
        }
        try {
            // TODO add your handling code here:
            int count = 0;
            if (txt_ma.getText().isEmpty() || txt_ten.getText().isEmpty() || txt_tenho.getText().isEmpty() || txt_tendem.getText().isEmpty() || date_choose.getDateFormatString().isEmpty()) {
                count++;
                JOptionPane.showMessageDialog(this, "Dữ liệu không được null mời bạn nhập lại");
                return;
            }
            if ( _utUtiliti.checkSo(txt_ten.getText()) || _utUtiliti.checkSo(txt_tendem.getText()) || _utUtiliti.checkSo(txt_tenho.getText())) {
                count++;
                JOptionPane.showMessageDialog(this, "Tên là chữ.Ngày định dạng yyyy-MM-dd. Mời bạn nhập lại");
                return;
            }

            if (count == 0) {
                int a = JOptionPane.showConfirmDialog(this, " Bạn có muốn UPDATE không?");
                if (a == 0) {
                    JOptionPane.showMessageDialog(this, _nvService.store(getGUI(), "UPDATE"));
                    loaddata(_nvService.getlist());
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int index = tbl_nv.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Bạn phải chọn");
            return;
        }

        for (int i = 0; i < _nvService.getlist().size(); i++) {
            if (_nvService.getlist().get(index).getTen().equals(getTennv(_nvService.getlist().get(i).getIdNguoiBaoCao()))) {
                JOptionPane.showMessageDialog(this, "Bạn phải xóa người báo cáo.");
                return;
            }
        }

        int a = JOptionPane.showConfirmDialog(this, " Bạn có muốn DELETE không?");
        if (a == 0) {
            try {
                JOptionPane.showMessageDialog(this, _nvService.store(getGUI(), "DELETE"));
            } catch (ParseException ex) {
                Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            loaddata(_nvService.getlist());
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
        // TODO add your handling code here:
        loaddata(_nvService.find(txt_timkiem.getText()));
    }//GEN-LAST:event_txt_timkiemCaretUpdate

    private void rdb_ascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_ascActionPerformed
        // TODO add your handling code here:
        loaddata(_nvService.sort(1));
    }//GEN-LAST:event_rdb_ascActionPerformed

    private void rdb_desscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_desscActionPerformed
        // TODO add your handling code here:
        loaddata(_nvService.sort(1));
    }//GEN-LAST:event_rdb_desscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbc_Chucvu;
    private javax.swing.JComboBox<String> cbc_nguoiBaocao;
    private com.toedter.calendar.JDateChooser date_choose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_asc;
    private javax.swing.JRadioButton rdb_dessc;
    private javax.swing.JRadioButton rdb_nam;
    private javax.swing.JRadioButton rdb_nu;
    private javax.swing.JTable tbl_nv;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tendem;
    private javax.swing.JTextField txt_tenho;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
