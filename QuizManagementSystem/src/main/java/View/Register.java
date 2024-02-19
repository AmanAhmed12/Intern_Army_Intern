
package View;

import Controller.AdminController;
import Controller.StudentController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Register extends javax.swing.JFrame {

   
    public Register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 240, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 110)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userlogo-transformed.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 110));

        jPanel2.setBackground(new java.awt.Color(240, 227, 206));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 6, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(242, 240, 230));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 80, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Contact :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 30));

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setText("Enter username");
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        jPanel4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        txtPwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPwd.setForeground(new java.awt.Color(153, 153, 153));
        txtPwd.setText("##########");
        txtPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdFocusLost(evt);
            }
        });
        jPanel4.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 30));

        lblShow.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        lblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow.setText("👁️");
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });
        jPanel4.add(lblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 30, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 100)); // NOI18N
        jLabel2.setText("👥");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Username :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        txtMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMail.setForeground(new java.awt.Color(153, 153, 153));
        txtMail.setText("amn@gmail.com");
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        jPanel4.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Password :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        txtTel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTel.setForeground(new java.awt.Color(153, 153, 153));
        txtTel.setText("07# #######");
        txtTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelFocusLost(evt);
            }
        });
        jPanel4.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 200, 30));

        btnRegister.setBackground(new java.awt.Color(240, 227, 206));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 440));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 440, 480));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 3, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTER HERE !!!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 540, -1));

        btnPrev.setBackground(new java.awt.Color(240, 227, 206));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrev.setText("PREV");
        btnPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Enter username")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);

        }

        txtUser.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().equals("")) {
            txtUser.setText("Enter username");
            txtUser.setForeground(new Color(153, 153, 153));

        }
        txtUser.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusGained
        if (txtPwd.getText().equals("##########")) {
            txtPwd.setText("");
            txtPwd.setForeground(Color.black);

        }

        txtPwd.setBorder(new LineBorder(Color.blue, 2));
        lblShow.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtPwdFocusGained

    private void txtPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusLost
        if (txtPwd.getText().equals("")) {

            txtPwd.setText("    ########");
            txtPwd.setForeground(new Color(153, 153, 153));
        }

        txtPwd.setBorder(new LineBorder(Color.gray, 1));
        lblShow.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPwdFocusLost

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        char echo = txtPwd.getEchoChar();
        if (echo == 0) {
            txtPwd.setEchoChar('●');
        } else {
            txtPwd.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_lblShowMouseClicked

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
      if ( txtMail.getText().equals("amn@gmail.com")) {
             txtMail.setText("");
             txtMail.setForeground(Color.black);

        }

         txtMail.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
          if (txtMail.getText().equals("")) {
            txtMail.setText("amn@gmail.com");
            txtMail.setForeground(new Color(153, 153, 153));

        }
        txtMail.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtMailFocusLost

    private void txtTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelFocusGained
         if (  txtTel.getText().equals("07# #######")) {
              txtTel.setText("");
              txtTel.setForeground(Color.black);

        }

          txtTel.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtTelFocusGained

    private void txtTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelFocusLost
        if (txtTel.getText().equals("")) {
            txtTel.setText("07# #######");
            txtTel.setForeground(new Color(153, 153, 153));

        }
        txtTel.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtTelFocusLost

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.dispose();
        Home h1=new Home();
       h1.setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
      String mail = txtMail.getText();
        String user = txtUser.getText();
        String pass = txtPwd.getText();
        String contact = txtTel.getText();
        
        if (mail.equals("amn@gmail.com") || user.equals("Enter username") || pass.equals("##########") || contact.equals("07# #######")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
        } else {
            StudentController s1 = new StudentController();
            s1.createAccount(mail, user, pass, contact);
        }
        
        txtMail.setText("");
        txtUser.setText("");
        txtPwd.setText("");
        txtTel.setText("");
    }//GEN-LAST:event_btnRegisterActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblShow;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
