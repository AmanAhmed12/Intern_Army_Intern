
package View;

import Database.Database;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Login extends javax.swing.JFrame {
 private static  Database d1=new Database();
  private static String userName;
  private static String accountType;
    public Login() {
        initComponents();
   
    }
    
    public static String getUsername() {
        return userName;
    }
     public static String getAccountType() {
        return accountType;
    }

    public boolean adminLogin() {
        String user = txtUser.getText();
        String pwd = txtPwd.getText();
        boolean result = false;
        try (Connection con = d1.getConnection()) {
            String selectQuery = "SELECT * FROM admin_details WHERE username = ? AND password = ? AND Status = 'active'";
            try (PreparedStatement pstmt = con.prepareStatement(selectQuery)) {
                pstmt.setString(1, user);
                pstmt.setString(2, pwd);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {

                        updateStatus(con, "admin_details", user);
                        result = true;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public boolean stuLogin() {
        String user = txtUser.getText();
        String pwd = txtPwd.getText();
        boolean result = false;
        try (Connection con = d1.getConnection()) {
            String selectQuery = "SELECT * FROM student_details WHERE username = ? AND password = ? AND Status = 'active'";
            try (PreparedStatement pstmt = con.prepareStatement(selectQuery)) {
                pstmt.setString(1, user);
                pstmt.setString(2, pwd);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {

                        updateStatus(con, "student_details", user);
                        result = true;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private void updateStatus(Connection con, String tableName, String username) throws SQLException {
        String updateQuery = "UPDATE " + tableName + " SET Status = 'logged in' WHERE username = ?";
        try (PreparedStatement pstmt = con.prepareStatement(updateQuery)) {
            pstmt.setString(1, username);
            pstmt.executeUpdate();
        }
    }



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLog = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();
        lblPwdI = new javax.swing.JLabel();
        lblUserI = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 240, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 110)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("👥");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(242, 240, 230));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 6, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/INTERNARMY (2).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 340, 310));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 420));

        jPanel4.setBackground(new java.awt.Color(242, 240, 230));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 3, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN !!!");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 310, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Username :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 30));

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

        btnLog.setBackground(new java.awt.Color(240, 227, 206));
        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLog.setText("LOGIN");
        btnLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel4.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 90)); // NOI18N
        jLabel7.setText("👥");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 110));

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
        jPanel4.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 200, 30));

        lblShow.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        lblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow.setText("👁️");
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });
        jPanel4.add(lblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 30, 30));

        lblPwdI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPwdI.setForeground(new java.awt.Color(153, 0, 0));
        jPanel4.add(lblPwdI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 200, 20));

        lblUserI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserI.setForeground(new java.awt.Color(153, 0, 0));
        jPanel4.add(lblUserI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 200, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("👤");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 20, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("🔒");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 410, 420));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 780, 440));

        btnPrev.setBackground(new java.awt.Color(240, 227, 206));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrev.setText("PREV");
        btnPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 630));

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
        
            txtPwd.setText("########");
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

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
       this.dispose();
         Home h1=new Home();
       h1.setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        String user = txtUser.getText();
        String pwd = txtPwd.getText();
        if (user.equals("Enter username") || pwd.equals("##########")) {
            if (user.equals("Enter username")) {
                lblUserI.setText("Fields cannot be empty!!!");
            } else {
                lblPwdI.setText("Fields cannot be empty!!!");
            }
        } else if (adminLogin()) {
            JOptionPane.showMessageDialog(null, "Welcome!!! ADMIN!!!");
            AdminDashboard a1 = new AdminDashboard();
            a1.setUserName(user);
            this.dispose();
            a1.setVisible(true);
            userName = user;
            accountType="Admin";


        } else if (stuLogin()) {
            JOptionPane.showMessageDialog(null, "Welcome!!!"+ user+"!!!");
            userDashboard l1 = new userDashboard();
            l1.setUserName(user);
            this.dispose();
            l1.setVisible(true);
            userName = user;
            accountType="Student";

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username or password!!!");
        }

    }//GEN-LAST:event_btnLogActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblPwdI;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblUserI;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
