/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DuAn.ui;

import DuAn.dao.NhanVienDAO;
import DuAn.entity.NhanVien;
import DuAn.utils.Auth;
import DuAn.utils.MsgBox;
import DuAn.utils.XMail;
import java.awt.event.KeyEvent;

/**
 *
 * @author dinhh
 */
public class QuenMatKhauJDialog extends javax.swing.JFrame {

    /**
     * Creates new form QuenMatKhauJDialog
     */
    private String email;
    NhanVien nv;

    public QuenMatKhauJDialog() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        pnlPassword.setVisible(false);
        pnlMa.setVisible(false);
        pnlEmail.setVisible(true);

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
        pnlPassword = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhau1 = new javax.swing.JPasswordField();
        pnlEmail = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        btnEmail = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pnlMa = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        btnMa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        btnOK.setText("OK");
        btnOK.setEnabled(false);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đổi mật khẩu");

        txtMatKhau.setBorder(javax.swing.BorderFactory.createTitledBorder("Xác nhận mật khẩu"));
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyReleased(evt);
            }
        });

        txtMatKhau1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mật khẩu mới"));
        txtMatKhau1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhau1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKhau1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPasswordLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK)
                            .addComponent(txtMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(pnlPassword, "card2");

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        btnEmail.setText("Lấy mã");
        btnEmail.setEnabled(false);
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });
        btnEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnEmailKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nhập email");

        javax.swing.GroupLayout pnlEmailLayout = new javax.swing.GroupLayout(pnlEmail);
        pnlEmail.setLayout(pnlEmailLayout);
        pnlEmailLayout.setHorizontalGroup(
            pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailLayout.createSequentialGroup()
                .addGroup(pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmailLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmailLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmailLayout.setVerticalGroup(
            pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmail)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel1.add(pnlEmail, "card3");

        txtMa.setBorder(javax.swing.BorderFactory.createTitledBorder("Mã xác nhận"));
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });
        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKeyReleased(evt);
            }
        });

        btnMa.setText("OK");
        btnMa.setEnabled(false);
        btnMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaActionPerformed(evt);
            }
        });
        btnMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnMaKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nhập mã xác nhận");

        javax.swing.GroupLayout pnlMaLayout = new javax.swing.GroupLayout(pnlMa);
        pnlMa.setLayout(pnlMaLayout);
        pnlMaLayout.setHorizontalGroup(
            pnlMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlMaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnlMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMaLayout.setVerticalGroup(
            pnlMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMa)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel1.add(pnlMa, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private boolean isValidEmail(String email) {
        // Regular expression for a more comprehensive email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        return email.matches(emailRegex);
    }


    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
        if (!isValidEmail(txtEmail.getText())) {
            MsgBox.showErrorDialog(this, "Vui lòng nhập đúng email", "Lỗi xác nhận email");
            return;
        }
        if (dao.getByEmail(txtEmail.getText()) == null) {
            MsgBox.showMessageDialog(this, "Email chưa được đăng ký trong chương trình");
            return;
        }
        String ma = dao.layMaQuenMatKhau(txtEmail.getText());
        XMail.sendMail(txtEmail.getText(), "Mã quên mật khẩu", "Vui lòng nhập chính xác mã: " + ma);
        email = txtEmail.getText();
        nv = dao.getByEmail(email);
        pnlEmail.setVisible(false);
        pnlPassword.setVisible(false);
        pnlMa.setVisible(true);
    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        if(txtMatKhau.getText().isBlank() || txtMatKhau1.getText().isBlank()){
         MsgBox.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường!");
         return;
        }
        if (txtMatKhau.getText().equals(txtMatKhau1.getText())) {
            nv.setMatKhau(txtMatKhau.getText());
            dao.update(nv);
            Auth.user = nv;
            if(nv.isDeleted()){
                MsgBox.showMessageDialog(this, "Tài khoản này đã bị khóa");
                new LoginJDialog();
                this.dispose();
                return;
            }
            this.dispose();
            new MainJDialog();
        } else {
            MsgBox.showMessageDialog(this, "Mật khẩu và xác nhận mật khẩu phải giống nhau");
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void btnMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().equals(nv.getQuenMatKhau())) {
            pnlPassword.setVisible(true);
            pnlMa.setVisible(false);
            pnlEmail.setVisible(false);
        } else {
            MsgBox.showErrorDialog(this, "Sai mã xác nhận", "Lỗi");
        }
    }//GEN-LAST:event_btnMaActionPerformed

    private void txtMatKhau1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhau1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOKActionPerformed(null);
        }
    }//GEN-LAST:event_txtMatKhau1KeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOKActionPerformed(null);
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtMatKhau1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhau1KeyReleased
        // TODO add your handling code here:
        if (!txtMatKhau.getText().isBlank() && !txtMatKhau1.getText().isBlank()) {
            btnOK.setEnabled(true);
        } else {
            btnOK.setEnabled(false);
        }
    }//GEN-LAST:event_txtMatKhau1KeyReleased

    private void txtMatKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyReleased
        // TODO add your handling code here:
        if (!txtMatKhau.getText().isBlank() && !txtMatKhau1.getText().isBlank()) {
            btnOK.setEnabled(true);
        } else {
            btnOK.setEnabled(false);
        }
    }//GEN-LAST:event_txtMatKhauKeyReleased

    private void btnMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMaKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnMaKeyReleased

    private void btnEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEmailKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEmailKeyReleased

    private void btnEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmailKeyTyped

    private void btnEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEmailKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEmailKeyPressed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if (!txtEmail.getText().isBlank()) {
            btnEmail.setEnabled(true);
        } else {
            btnEmail.setEnabled(false);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyReleased
        // TODO add your handling code here:
        if (!txtMa.getText().isBlank()) {
            btnMa.setEnabled(true);
        } else {
            btnMa.setEnabled(false);
        }
    }//GEN-LAST:event_txtMaKeyReleased

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed
    private final NhanVienDAO dao = new NhanVienDAO();

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
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhauJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnMa;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlEmail;
    private javax.swing.JPanel pnlMa;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhau1;
    // End of variables declaration//GEN-END:variables
}
