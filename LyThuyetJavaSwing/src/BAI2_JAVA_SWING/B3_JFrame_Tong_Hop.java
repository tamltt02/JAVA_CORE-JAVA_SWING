/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_JAVA_SWING;

import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungna89
 */
public class B3_JFrame_Tong_Hop extends javax.swing.JFrame {

  Vector _vtcHeader;
  Vector _vtcData;

  public B3_JFrame_Tong_Hop() {
    initComponents();
    fillDataNamSinh();
    radioButtonNamNu();
    cbcNamNu();
    _vtcHeader = new Vector();
    loadHeader();
    _vtcData = new Vector();
  }

  private void loadHeader() {
    //Vector chứa header   
    _vtcHeader.add("Tên Crush");
    _vtcHeader.add("Năm sinh");
    _vtcHeader.add("Tuổi");
    _vtcHeader.add("Giới tính");
    tbl_NY.setModel(new DefaultTableModel(_vtcHeader, 0));

  }

  private void cbcNamNu() {
    DefaultComboBoxModel dcb = new DefaultComboBoxModel();
    dcb.addElement("Nam");
    dcb.addElement("Nữ");
    dcb.addElement("Không xác định");
    cbc_NamNu.setModel(dcb);//Gám data cho cbc
  }

  private void radioButtonNamNu() {
    //Nhóm control RadioButton lại và chỉ cho phép được click 1 trong 2
    ButtonGroup bt = new ButtonGroup();
    bt.add(rdb_Nu);
    bt.add(rdb_Nam);
    rdb_Nu.setSelected(true);//Set mặc định chọn là nữ
  }

  private void fillDataNamSinh() {
    cbc_NamSinh.setModel(new DefaultComboBoxModel(getAllYears()));
    //cbc_NamSinh.setSelectedIndex(1); Hiển thị mặc định theo index   
    cbc_NamSinh.setSelectedItem("2000");//Hiển thị mặc định theo 1 item bên trong cbc  
  }

  private String[] getAllYears() {
    String[] arrNamSinh = new String[2022 - 1800];
    int temp = 1800;
    for (int i = 0; i < arrNamSinh.length; i++) {
      arrNamSinh[i] = String.valueOf(temp);
      temp++;
    }
    return arrNamSinh;
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbl_HienThi = new javax.swing.JLabel();
    btn_BamVaoDay = new javax.swing.JButton();
    txt_ten = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    cbc_NamSinh = new javax.swing.JComboBox<>();
    rdb_Nu = new javax.swing.JRadioButton();
    rdb_Nam = new javax.swing.JRadioButton();
    cbc_NamNu = new javax.swing.JComboBox<>();
    jCheckBox1 = new javax.swing.JCheckBox();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_NY = new javax.swing.JTable();
    btn_Logout = new javax.swing.JButton();
    txt_Ns = new javax.swing.JTextField();
    txt_Name = new javax.swing.JTextField();
    txt_NamNu = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lbl_HienThi.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    lbl_HienThi.setText("Nhập tên:");

    btn_BamVaoDay.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_BamVaoDay.setText("Bấm vào đây");
    btn_BamVaoDay.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_BamVaoDayActionPerformed(evt);
      }
    });

    txt_ten.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel2.setText("Nhập tên:");

    cbc_NamSinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    cbc_NamSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    rdb_Nu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_Nu.setText("NỮ");

    rdb_Nam.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_Nam.setText("NAM");

    cbc_NamNu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    cbc_NamNu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jCheckBox1.setText("jCheckBox1");

    tbl_NY.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tbl_NY.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_NYMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_NY);

    btn_Logout.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Logout.setText("Logout");
    btn_Logout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_LogoutActionPerformed(evt);
      }
    });

    txt_Ns.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    txt_Name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    txt_NamNu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCheckBox1)
          .addComponent(lbl_HienThi)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn_BamVaoDay)
            .addGap(18, 18, 18)
            .addComponent(cbc_NamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(rdb_Nam)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(rdb_Nu)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cbc_NamNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(81, 81, 81)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txt_Ns, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_NamNu, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btn_Logout)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn_BamVaoDay)
          .addComponent(jLabel2)
          .addComponent(cbc_NamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(rdb_Nam)
          .addComponent(rdb_Nu)
          .addComponent(cbc_NamNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(lbl_HienThi)
            .addGap(18, 18, 18)
            .addComponent(jCheckBox1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Logout)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txt_Ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txt_NamNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_BamVaoDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BamVaoDayActionPerformed
    //Check khoảng trắng và rỗng
    if (txt_ten.getText().isBlank() || txt_ten.getText().isEmpty()) {
      //Show ra thông báo
      JOptionPane.showMessageDialog(this, "Bạn không đc để trống và khoảng trắng");
      txt_ten.setText("");//Set lại "" cho ô text box
      return;
    }
    var name = txt_ten.getText();//Lấy giá trị tại ô text box
    lbl_HienThi.setText("Chào bạn: " + name + "| Bạn làm NY mình nhé?");
    //Loại thông báo YES NO
    while (true) {
      int getChoice = JOptionPane.showConfirmDialog(this, "Chào bạn: " + name + "| Bạn làm NY mình nhé?", "Mời bạn chọn", JOptionPane.YES_NO_OPTION);
      if (getChoice == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Ok thế về nhà nhé");
        break;
      } else {
        JOptionPane.showMessageDialog(this, "Mời bạn chọn lại lần nữa");
      }
    }
    //Đẩy dữ liệu vào bảng sau khi người ta đồng ý
    Vector vtcDataRow1 = new Vector();
    vtcDataRow1.add(txt_ten.getText());
    vtcDataRow1.add(cbc_NamSinh.getSelectedItem());
    vtcDataRow1.add(2022 - Integer.parseInt(cbc_NamSinh.getSelectedItem().toString()));
    vtcDataRow1.add(rdb_Nam.isSelected() ? "NAM" : "NỮ");
    _vtcData.add(vtcDataRow1);
    tbl_NY.setModel(new DefaultTableModel(_vtcData, _vtcHeader));
  }//GEN-LAST:event_btn_BamVaoDayActionPerformed

  private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
    new B4_Login().setVisible(true);//Hiển thị form B4 lên
    this.dispose();//Ẩn form hiện tại

  }//GEN-LAST:event_btn_LogoutActionPerformed

  private void tbl_NYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NYMouseClicked
    int index = tbl_NY.getSelectedRow();//Vị trí dòng bấm
    System.out.println("Dòng bấm số: " + index);
    Vector vtc1 = (Vector) _vtcData.get(index);
    txt_Name.setText(String.valueOf(vtc1.get(0)));
    txt_Ns.setText(String.valueOf(vtc1.get(1)));
    txt_NamNu.setText(String.valueOf(vtc1.get(2)));
  }//GEN-LAST:event_tbl_NYMouseClicked

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
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new B3_JFrame_Tong_Hop().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_BamVaoDay;
  private javax.swing.JButton btn_Logout;
  private javax.swing.JComboBox<String> cbc_NamNu;
  private javax.swing.JComboBox<String> cbc_NamSinh;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbl_HienThi;
  private javax.swing.JRadioButton rdb_Nam;
  private javax.swing.JRadioButton rdb_Nu;
  private javax.swing.JTable tbl_NY;
  private javax.swing.JTextField txt_NamNu;
  private javax.swing.JTextField txt_Name;
  private javax.swing.JTextField txt_Ns;
  private javax.swing.JTextField txt_ten;
  // End of variables declaration//GEN-END:variables
}