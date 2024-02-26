package DuAn.ui;

import DuAn.constant.Constant;
import DuAn.dao.NhanVienDAO;
import DuAn.entity.NhanVien;
import DuAn.utils.Auth;
import DuAn.utils.MsgBox;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author dinhh
 */
public class LoginJDialog extends javax.swing.JFrame {

    public LoginJDialog() {
        if (Auth.first) {
            new ChaoJDialog(this, true).setVisible(true);
            Auth.first = false;
        }
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Đăng Nhập");
        if (Auth.tiengViet) {
            lblTitle.setText("Đăng nhập");
            lblForgetPassword.setText("Quên mật khẩu");
            lblPassword.setText("Mật khẩu");
            lblUsername.setText("Tên đăng nhập");
            chkShowpass.setText("Hiển thị mật khẩu?");
            String[] lang = {"Ngôn ngữ tiếng Việt", "Ngôn ngữ tiếng Anh"};
            btnDangNhap.setText("Đăng nhập");
            btnKetThuc.setText("Kết thúc");
            cboLanguage.setModel(new DefaultComboBoxModel<String>(lang));
        } else {
            lblTitle.setText("Login");
            lblForgetPassword.setText("Forget password");
            lblPassword.setText("Password");
            lblUsername.setText("Username");
            chkShowpass.setText("Show password?");
            btnDangNhap.setText("Login");
            btnKetThuc.setText("Exit");
            String[] lang = {"English language", "Vietnamese language"};
            cboLanguage.setModel(new DefaultComboBoxModel<String>(lang));
        }
        this.setVisible(true);
        txtTenTaiKhoan.requestFocus();
    }

    NhanVienDAO dao = new NhanVienDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        cboLanguage = new javax.swing.JComboBox<>();
        lblImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        lblLoiTen = new javax.swing.JLabel();
        lblLoiMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        lblForgetPassword = new javax.swing.JLabel();
        btnKetThuc = new javax.swing.JButton();
        chkShowpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCity.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 0, 0));
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCity.setText("LapTrinhCity");
        jPanel1.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, -1));

        cboLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngôn ngữ tiếng việt", "Ngôn ngữ tiếng anh" }));
        cboLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLanguageActionPerformed(evt);
            }
        });
        jPanel1.add(cboLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/images/bg.gif"))); // NOI18N
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsername.setText("Tên đăng nhập");

        txtTenTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenTaiKhoanKeyPressed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setText("Mật khẩu");

        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/login.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lblLoiTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLoiTen.setForeground(new java.awt.Color(255, 51, 51));
        lblLoiTen.setText("            ");

        lblLoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLoiMatKhau.setForeground(new java.awt.Color(255, 51, 51));
        lblLoiMatKhau.setText("               ");

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/school.png"))); // NOI18N
        lblTitle.setText("Đăng Nhập");

        lblForgetPassword.setForeground(new java.awt.Color(51, 102, 255));
        lblForgetPassword.setText("Quên mật khẩu?");
        lblForgetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgetPasswordMouseClicked(evt);
            }
        });

        btnKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/logout.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        chkShowpass.setBackground(new java.awt.Color(255, 255, 255));
        chkShowpass.setText("Hiển thị mật khẩu?");
        chkShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenTaiKhoan)
                    .addComponent(lblLoiTen, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkShowpass)
                            .addComponent(btnDangNhap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblForgetPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKetThuc, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoiTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoiMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkShowpass)
                    .addComponent(lblForgetPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        dangNhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void chkShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowpassActionPerformed
        //show hoặc ẩn  password
        if (chkShowpass.isSelected()) {
            txtMatKhau.setEchoChar((char) 0);
        } else {
            txtMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_chkShowpassActionPerformed

    private void txtTenTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenTaiKhoanKeyPressed
        // TODO add your handling code here:
        lblLoiTen.setText("");
        txtTenTaiKhoan.setBorder(Constant.GRAY_BORDER);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dangNhap();
        }
    }//GEN-LAST:event_txtTenTaiKhoanKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        lblLoiMatKhau.setText("");
        txtMatKhau.setBorder(Constant.GRAY_BORDER);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dangNhap();
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void cboLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLanguageActionPerformed
        // TODO add your handling code here:
        String cboSelected = (String) cboLanguage.getSelectedItem();
        if (cboSelected.equalsIgnoreCase("ngôn ngữ tiếng việt") || cboSelected.equalsIgnoreCase("Vietnamese language")) {
            Auth.tiengViet = true;
        } else {
            Auth.tiengViet = false;
        }
        new LoginJDialog();
        this.dispose();
    }//GEN-LAST:event_cboLanguageActionPerformed

    private void lblForgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetPasswordMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new QuenMatKhauJDialog();
    }//GEN-LAST:event_lblForgetPasswordMouseClicked
    public void kiemTra() {
        if (txtTenTaiKhoan.getText().equals("")) {
            lblLoiTen.setText("Tên đăng nhập không được bỏ trống");
        } else {
            lblLoiTen.setText(" ");
        }
        if (txtMatKhau.getText().equals("")) {
            lblLoiMatKhau.setText("Mật khẩu không được bỏ trống");
        } else {
            lblLoiMatKhau.setText(" ");
        }
    }

    public boolean validateLogin() {
        String username = txtTenTaiKhoan.getText();
        String password = new String(txtMatKhau.getPassword());
        String error = "";

        if (password.isBlank()) {
            error += "\nMật khẩu không được để trống";
            txtMatKhau.setBorder(Constant.RED_BORDER);
            txtMatKhau.requestFocus();
        }

        if (username.isBlank()) {
            error += "Tài khoản không được để trống";
            txtTenTaiKhoan.setBorder(Constant.RED_BORDER);
            txtTenTaiKhoan.requestFocus();
        }

        if (!error.isBlank()) {
            MsgBox.showErrorDialog(this, error, "Lỗi");
            return false;
        }

        return true;
    }

    public void dangNhap() {
        if (!validateLogin()) {
            return;
        }
        if (!this.txtTenTaiKhoan.getText().substring(0, 2).equals("NV")) {
            MsgBox.showErrorDialog(this, "Thông tin đăng nhập không chính xác!", "Lỗi");
            return;
        }
        String maNV = txtTenTaiKhoan.getText().substring(2);
        String matKhau = new String(txtMatKhau.getPassword());

        try {
            NhanVien nv = dao.selectById(Integer.parseInt(maNV));

            if (nv == null) {
                kiemTra();
                MsgBox.showErrorDialog(this, "Tài khoản hoặc mật khẩu không chính xác!", "Lỗi");
                txtTenTaiKhoan.requestFocus();
                txtMatKhau.setBorder(Constant.RED_BORDER);
                txtTenTaiKhoan.setBorder(Constant.RED_BORDER);
            } else if (!matKhau.equals(nv.getMatKhau())) {
                kiemTra();
                MsgBox.showErrorDialog(this, "Tài khoản hoặc mật khẩu không chính xác!", "Lỗi");
                txtTenTaiKhoan.requestFocus();
                txtMatKhau.setBorder(Constant.RED_BORDER);
                txtTenTaiKhoan.setBorder(Constant.RED_BORDER);
            } else {
                Auth.user = nv;
                if (Auth.user.isDeleted()) {
                    MsgBox.showMessageDialog(this,
                            "Tài khoản này đã bị khóa");
                    return;
                }
                MsgBox.showMessageDialog(this,
                        "Đăng nhập thành công !\nNgười dùng " + "'NV" + Auth.user.getMaNV() + "'");
                if (Auth.user.isKichHoat()) {
                    new MainJDialog().setVisible(true);
                } else {
                    new XacNhanEmailJDialog().setVisible(true);
                }
                this.dispose();
            }
        } catch (NumberFormatException ex) {
            MsgBox.showErrorDialog(this, "Thông tin đăng nhập không chính xác!", "Lỗi");
            txtMatKhau.setBorder(Constant.RED_BORDER);
            txtTenTaiKhoan.setBorder(Constant.RED_BORDER);
        }

    }

    public void ketThuc() {
        if (MsgBox.showConfirmDialog(this, "Bạn có muốn kết thúc ứng dụng")) {
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JComboBox<String> cboLanguage;
    private javax.swing.JCheckBox chkShowpass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblForgetPassword;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLoiMatKhau;
    private javax.swing.JLabel lblLoiTen;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
