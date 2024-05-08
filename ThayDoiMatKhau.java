/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UITParking.GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static UITParking.GUI.EmailForm.pEmailSentEmail;
import UITParking.GUI.DangNhap;
import static UITParking.GUI.InitPublic.getHashPassword;
import java.awt.Color;
import java.awt.Toolkit;
/**
 *
 * @author @author Pham Hoang Ngoc Anh
 */
public class ThayDoiMatKhau extends javax.swing.JFrame {
 Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * Creates new form modifypassword
     */
    public ThayDoiMatKhau() {
        initComponents();
        setIconImage();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmPasswordModified = new javax.swing.JPasswordField();
        txtNewPasswordModified = new javax.swing.JPasswordField();
        btnSubmitModifiedPassword = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UIT Parking");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/imgonline-com-ua-resize-jBK7d2d1Gw9qgN.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 54, 204));
        jLabel1.setText("Change Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Confirm New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("New Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        txtConfirmPasswordModified.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtConfirmPasswordModified, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 270, 30));

        txtNewPasswordModified.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtNewPasswordModified, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 270, 30));

        btnSubmitModifiedPassword.setBackground(new java.awt.Color(12, 33, 250));
        btnSubmitModifiedPassword.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnSubmitModifiedPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitModifiedPassword.setText("Submit");
        btnSubmitModifiedPassword.setBorder(null);
        btnSubmitModifiedPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmitModifiedPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitModifiedPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitModifiedPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitModifiedPasswordMouseExited(evt);
            }
        });
        btnSubmitModifiedPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitModifiedPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmitModifiedPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 811, 351));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitModifiedPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitModifiedPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitModifiedPasswordActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnSubmitModifiedPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitModifiedPasswordMouseClicked
        // TODO add your handling code here:
          try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "UITParking", "uitparking");
            String sql = "UPDATE NGUOIDUNG SET MatKhau =  ? WHERE Email = ?";
            ps = conn.prepareStatement(sql);
            StringBuilder sb = new StringBuilder();
            if (!new String(txtNewPasswordModified.getPassword()).equals(new String(txtConfirmPasswordModified.getPassword()))) {
                sb.append("Mật khẩu xác nhận không hợp lệ");
            }
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb);
                return;
            }
            ps.setString(1, getHashPassword(new String(txtNewPasswordModified.getPassword())));
            ps.setString(2, pEmailSentEmail);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu thành công!");
            DangNhap _login = new DangNhap();
            _login.show();
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSubmitModifiedPasswordMouseClicked

    private void btnSubmitModifiedPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitModifiedPasswordMouseEntered
       btnSubmitModifiedPassword.setBackground(new Color(80, 60, 244));

    }//GEN-LAST:event_btnSubmitModifiedPasswordMouseEntered

    private void btnSubmitModifiedPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitModifiedPasswordMouseExited
        btnSubmitModifiedPassword.setBackground(new Color(12, 33, 250));
    }//GEN-LAST:event_btnSubmitModifiedPasswordMouseExited

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
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThayDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThayDoiMatKhau().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitModifiedPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPasswordModified;
    private javax.swing.JPasswordField txtNewPasswordModified;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/parking.png")));

    }
}