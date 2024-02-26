/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.ui;

import DuAn.dao.ChuyenDeDAO;
import DuAn.dao.HocVienDAO;//Thêm học viên DAO
import DuAn.dao.KhoaHocDAO;
import DuAn.dao.NguoiHocDAO;
import DuAn.entity.ChuyenDe;
import DuAn.entity.HocVien;//Thêm học viên
import DuAn.entity.KhoaHoc;
import DuAn.entity.NguoiHoc;
import DuAn.utils.Auth;
import DuAn.utils.MsgBox;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author dinhh
 */
public class HocVienJDialog extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiHocVien_Frame
     */
    public HocVienJDialog() {
        initComponents();
        setLocationRelativeTo(null);
        //setIcon();
        setTitle("Quản Lí Học Viên");
        init();
        AutoCompleteDecorator.decorate(cboKhoaHoc);
        AutoCompleteDecorator.decorate(cboChuyenDe);

    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fpt.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        pnlHocVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHocVien = new javax.swing.JTable();
        btnXoaHV = new javax.swing.JButton();
        btnSuaDiem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNguoiHoc = new javax.swing.JTable();
        btnThemHV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        pnKhoaHoc = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÍ HỌC VIÊN");
        setIconImages(null);

        pnChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChuyenDeLayout = new javax.swing.GroupLayout(pnChuyenDe);
        pnChuyenDe.setLayout(pnChuyenDeLayout);
        pnChuyenDeLayout.setHorizontalGroup(
            pnChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, 0, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnChuyenDeLayout.setVerticalGroup(
            pnChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChuyenDeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsMouseClicked(evt);
            }
        });

        tbHocVien.setAutoCreateRowSorter(true);
        tbHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ HV", "MÃ NH", "HỌ TÊN", "ĐIỂM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHocVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHocVien);

        btnXoaHV.setText("Xóa khỏi khóa học");
        btnXoaHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHVActionPerformed(evt);
            }
        });

        btnSuaDiem.setText("Cập nhật điểm");
        btnSuaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHocVienLayout = new javax.swing.GroupLayout(pnlHocVien);
        pnlHocVien.setLayout(pnlHocVienLayout);
        pnlHocVienLayout.setHorizontalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaHV)
                .addGap(43, 43, 43)
                .addComponent(btnSuaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHocVienLayout.setVerticalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaHV)
                    .addComponent(btnSuaDiem))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tabs.addTab("HỌC VIÊN", pnlHocVien);

        tbNguoiHoc.setAutoCreateRowSorter(true);
        tbNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NH", "HỌ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbNguoiHoc);

        btnThemHV.setText("Thêm vào khóa học");
        btnThemHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHVActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Họ và tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnTimKiem)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnTimKiem))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnThemHV))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemHV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("NGƯỜI HỌC", jPanel1);

        pnKhoaHoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KHÓA HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnKhoaHocLayout = new javax.swing.GroupLayout(pnKhoaHoc);
        pnKhoaHoc.setLayout(pnKhoaHocLayout);
        pnKhoaHocLayout.setHorizontalGroup(
            pnKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, 0, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnKhoaHocLayout.setVerticalGroup(
            pnKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKhoaHocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnChuyenDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnKhoaHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHVActionPerformed
        removeHocVien();
    }//GEN-LAST:event_btnXoaHVActionPerformed

    private void btnSuaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDiemActionPerformed
        updateDiem();
    }//GEN-LAST:event_btnSuaDiemActionPerformed

    private void btnThemHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHVActionPerformed
        addHocVien();
    }//GEN-LAST:event_btnThemHVActionPerformed

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        this.fillComboBoxKhoaHoc();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        this.fillTableHocVien();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        this.fillTableHocVien();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        this.fillTableHocVien();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tbHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHocVienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbHocVienMouseClicked

    private void tabsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabsMouseClicked

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
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HocVienJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaDiem;
    private javax.swing.JButton btnThemHV;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaHV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnChuyenDe;
    private javax.swing.JPanel pnKhoaHoc;
    private javax.swing.JPanel pnlHocVien;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbHocVien;
    private javax.swing.JTable tbNguoiHoc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    HocVienDAO hvdao = new HocVienDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();

    void init() {
        this.setLocationRelativeTo(null);
        fillComboBoxChuyenDe();
    }

    void fillComboBoxChuyenDe() {//lấy dữ liệu từ bảng chuyên đề đưa lên combobox

        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();//kết nối cbo với model
        model.removeAllElements();//xóa toàn bộ item
        List<ChuyenDe> list = cddao.selectAll(); //lấy tất cả chuyên đề
        for (ChuyenDe cd : list) {
            if (!cd.isDeleted()) {
                model.addElement(cd);
            }
        }
        this.fillComboBoxKhoaHoc(); //chọn chuyên đề thì khóa học tương ứng sẽ được chọn theo
    }

    void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem(); //lấy chuyên đề được chọn
        if (chuyenDe != null && !chuyenDe.isDeleted()) {
            List<KhoaHoc> list = khdao.selectByChuyenDe(chuyenDe.getMaCD()); //lấy khóa học theo mã chuyên đề
            for (KhoaHoc kh : list) {
                if (!kh.isDeleted()) {
                    model.addElement(kh);
                }
            }
            this.fillTableHocVien();
        }
    }

    void fillTableHocVien() {
        //lấy về MaHV, MaKH, MaNH, Diem, HoTen từ các bảng trong CSDL của các học viên thuộc khóa học (theo maKH)
        DefaultTableModel model = (DefaultTableModel) tbHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        String keyword = txtTimKiem.getText();
        if (khoaHoc != null) {
            List<HocVien> list = hvdao.selectByKhoaHoc(khoaHoc.getMaKH());
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoten = nhdao.selectById(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{
                    i + 1,
                    "HV" + hv.getMaHV(),
                    "NH" + hv.getMaNH(),
                    hoten,
                    hv.getDiem()
                });
            }
        }
        this.fillTableNguoiHoc();

    }

    void fillTableNguoiHoc() { //đỗ dữ liệu từ CSDL lên table nguoihoc
        DefaultTableModel model = (DefaultTableModel) tbNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        if (khoaHoc == null) {
            return;
        }
        String keyword = txtTimKiem.getText(); //tìm kiếm theo tên người học
        List<NguoiHoc> list = nhdao.selectNotInCourse(khoaHoc.getMaKH(), keyword);// Những người không tham gia vào khóa học
        for (NguoiHoc nh : list) {
            if (!nh.isDeleted()) {
                model.addRow(new Object[]{
                    "NH" + nh.getMaNH(),
                    nh.getHoTen(),
                    nh.isGioiTinh() ? "Nam" : "Nữ",
                    nh.getNgaySinh(),
                    nh.getDienThoai(),
                    nh.getEmail()
                });
            }
        }
    }

    void addHocVien() { //thêm học viên vào khóa học
        KhoaHoc khoahoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        int[] rows = tbNguoiHoc.getSelectedRows();
        for (int row : rows) {
            int manh = Integer.valueOf(tbNguoiHoc.getValueAt(row, 0).toString().substring(2));
            HocVien hv = new HocVien();
            hv.setMaKH(khoahoc.getMaKH());
            hv.setDiem(0);
            hv.setMaNH(manh);
            hvdao.insert(hv);
        }
        MsgBox.showMessageDialog(this, "Thêm học viên thành công !");
        this.fillTableHocVien();
        this.tabs.setSelectedIndex(0);
    }

//    void removeHocVien(){//xóa học viên ra khỏi khóa học
//        if (!Auth.isManager()) {
//            MsgBox.showMessageDialog(this, "Bạn không có quyền xóa học viên");
//        }
//        else{
//            int[] rows = tbHocVien.getSelectedRows();
//            if (rows.length > 0 && MsgBox.showConfirmDialog(this, "Bạn chắc chắn muốn xóa các học viên được chọn ?")) {
//                for (int row : rows) {
//                    int mahv =(Integer) tbHocVien.getValueAt(row, 0);
//                    hvdao.delete(mahv);
//                }
//                MsgBox.showMessageDialog(this, "Xóa học viên thành công ");
//                this.fillTableHocVien();
//            }
//        }
//    }
    void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.showMessageDialog(this, "Bạn không có quyền xóa học viên");
        } else {
            int[] rows = tbHocVien.getSelectedRows();
            String error = "";
            boolean check = false;
            if (rows.length > 0 && MsgBox.showConfirmDialog(this, "Bạn muốn xóa các học viên được chọn?")) {
                try {
                    for (int row : rows) {
                        double diem = Double.valueOf(tbHocVien.getValueAt(row, 4).toString()); // Lấy giá trị của cột "DIEM" (cột thứ 5)
                        if (diem != 0.0) {
                            // Nếu giá trị của cột "DIEM" khác 0, thông báo lỗi và không xóa
                            if (error == "") {
                                error += "Học viên có mã (";
                            }
                            error += tbHocVien.getValueAt(row, 1) + ", ";
                        } else {
                            int mahv = Integer.valueOf(tbHocVien.getValueAt(row, 1).toString().substring(2));
                            check = true;
                            hvdao.delete(mahv, true);
                        }
                    }
                    if (error != "") {
                        error = error.substring(0, error.length() - 2);
                        error += ") có điểm khác 0, không thể xóa";
                        if (check) {
                            error += ". Còn lại xóa";
                        }
                        MsgBox.showMessageDialog(this, error);
                    } else {
                        if (check) {
                            MsgBox.showMessageDialog(this, "Xóa thành công học viên đã chọn");
                        }
                    }
                    this.fillTableHocVien();
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.showMessageDialog(this, "Vui lòng nhập đúng điểm, không được nhập chữ");
                }

            }
        }
    }

//    void updateDiem(){ //cập nhập điểm học viên
//        int n = tbHocVien.getRowCount();
//        for (int i = 0; i < n; i++) {
//            int mahv = (Integer) tbHocVien.getValueAt(i, 1);
//            double diem =(Double) tbHocVien.getValueAt(i, 4);
//            HocVien hv = hvdao.selectById(mahv);
//            hv.setDiem(diem);
//            hvdao.update(hv);
//        }
//        MsgBox.showMessageDialog(this, "Cập nhật điểm thành công !");
//        this.fillTableHocVien();
//    }
    void updateDiem() {
        int n = tbHocVien.getRowCount();
        String error = "";
        boolean check = false;
        for (int i = 0; i < n; i++) {
            HocVien hv = hvdao.selectById(Integer.parseInt(tbHocVien.getValueAt(i, 1).toString().substring(2)));
            Double gpa = Double.parseDouble(tbHocVien.getValueAt(i, 4).toString());

            if (gpa < 0 || gpa > 10) {
                if (error == "") {
                    error += "Điểm phải từ 0-10 ( Mã học viên thêm điểm sai: ";
                }
                error += "HV" + hv.getMaHV();
                error += ", ";
                continue;
            }
            hv.setDiem(Double.parseDouble(tbHocVien.getValueAt(i, 4).toString()));
            hvdao.update(hv);
            check = true;
        }
        if (error != "") {
            error = error.substring(0, error.length() - 2);
            error += ")";
            if (check) {
                error += ", Còn lại đúng";
            }
            MsgBox.showMessageDialog(this, error);
        } else {
            MsgBox.showMessageDialog(this, "Cập nhật điểm thành công!");
        }
        this.fillTableHocVien();
    }
}
