/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.ui;

import DuAn.dao.NhanVienDAO;
import DuAn.utils.Auth;
import DuAn.utils.MsgBox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author dinhh
 */
public class DoiMatKhauJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // setIcon();
        setLocationRelativeTo(null);
    }

    private void setIcon() {
        //Image iconImage = Toolkit.getDefaultToolkit().getImage("QuanLyKhoaHoc_DuAnMau\\QuanLyKhoaHoc\\src\\DuAn\\fpt.png");
        ImageIcon icon = new ImageIcon(getClass().getResource("/DuAn.icon/fpt.png"));
        Image image = icon.getImage();
        setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        btnHuyBo = new javax.swing.JButton();
        btnThayDoi = new javax.swing.JButton();
        txtMatKhau1 = new javax.swing.JPasswordField();
        txtMatKhau2 = new javax.swing.JPasswordField();
        txtMatKhauHT = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ĐỔI MẬT KHẨU");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("ĐỔI MẬT KHẨU ");

        btnHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/logout.png"))); // NOI18N
        btnHuyBo.setText("Exit");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        btnThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/Refresh.png"))); // NOI18N
        btnThayDoi.setText("Change");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });

        txtMatKhau1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mật khẩu mới"));
        txtMatKhau1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhau1KeyPressed(evt);
            }
        });

        txtMatKhau2.setBorder(javax.swing.BorderFactory.createTitledBorder("Xác nhận mật khẩu"));
        txtMatKhau2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhau2FocusGained(evt);
            }
        });
        txtMatKhau2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhau2KeyPressed(evt);
            }
        });

        txtMatKhauHT.setBorder(javax.swing.BorderFactory.createTitledBorder("Mật khẩu hiện tại"));
        txtMatKhauHT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauHTFocusGained(evt);
            }
        });
        txtMatKhauHT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauHTKeyPressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/images/ong140.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHuyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhauHT, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMatKhau2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtMatKhauHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThayDoi)
                            .addComponent(btnHuyBo))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhau2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhau2FocusGained
        txtMatKhau2.setBackground(Color.white);
    }//GEN-LAST:event_txtMatKhau2FocusGained

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        if (validateForm()) {
            this.doimatkhau();
        } else {
            MsgBox.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_btnThayDoiActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        this.huy();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void txtMatKhauHTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauHTFocusGained
        txtMatKhauHT.setBackground(Color.white);
    }//GEN-LAST:event_txtMatKhauHTFocusGained

    private void txtMatKhauHTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauHTKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnThayDoiActionPerformed(null);
        }

    }//GEN-LAST:event_txtMatKhauHTKeyPressed

    private void txtMatKhau1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhau1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnThayDoiActionPerformed(null);
        }
    }//GEN-LAST:event_txtMatKhau1KeyPressed

    private void txtMatKhau2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhau2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnThayDoiActionPerformed(null);
        }
    }//GEN-LAST:event_txtMatKhau2KeyPressed

    public boolean validateForm() {
        if (txtMatKhau1.getText().isEmpty() || txtMatKhau2.getText().isEmpty() || txtMatKhauHT.getText().isEmpty()) {
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhauJDialog dialog = new DoiMatKhauJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPasswordField txtMatKhau1;
    private javax.swing.JPasswordField txtMatKhau2;
    private javax.swing.JPasswordField txtMatKhauHT;
    // End of variables declaration//GEN-END:variables

    private void doimatkhau() {
        int manv = Auth.user.getMaNV();
        String matkhau = new String(txtMatKhauHT.getPassword());
        String matkhaumoi = new String(txtMatKhau1.getPassword());
        String matkhau2 = new String(txtMatKhau2.getPassword());

        if (!(manv == Auth.user.getMaNV())) {
            MsgBox.showMessageDialog(this, "Sai tên đăng nhập !");
        } else if (!matkhau.equals(Auth.user.getMatKhau())) {
            MsgBox.showMessageDialog(this, "Mật khẩu hiện tại không đúng !");
            txtMatKhauHT.setBackground(Color.pink);
        } else if (!matkhaumoi.equals(matkhau2)) {
            MsgBox.showMessageDialog(this, "Mật khẩu không trùng khớp");
            txtMatKhau2.setBackground(Color.pink);
        } else {
            NhanVienDAO dao = new NhanVienDAO();
            Auth.user.setMatKhau(matkhaumoi);
            dao.update(Auth.user);
            MsgBox.showMessageDialog(this, "Đổi mật khẩu thành công");
            this.dispose();
        }
    }

    void huy() {
        this.dispose();
    }
}
