
package View;
import Database.Database;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

public class Login extends javax.swing.JFrame {
 private static String userName;
 
 
 private static  Database d1=new Database();
 
    public Login() {
        initComponents();
        makeCircular(jPanel1);
    }
    public  static String getUsername(){
        return userName;
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

    public boolean libLogin() {
        String user = txtUser.getText();
        String pwd = txtPwd.getText();
        boolean result = false;
        try (Connection con = d1.getConnection()) {
            String selectQuery = "SELECT * FROM librarian_details WHERE username = ? AND password = ? AND Status = 'active'";
            try (PreparedStatement pstmt = con.prepareStatement(selectQuery)) {
                pstmt.setString(1, user);
                pstmt.setString(2, pwd);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                       
                        updateStatus(con, "librarian_details", user);
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

    
    
   private void makeCircular(JPanel panel) {
    panel.setOpaque(false);
    panel.setLayout(new BorderLayout());

    
    JPanel circularPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            if (g instanceof Graphics2D) {
                final int width = getWidth();
                final int height = getHeight();
                final int diameter = Math.min(width, height);
                final int x = (width - diameter) / 2;
                final int y = (height - diameter) / 2;

                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
              
                g2d.setColor(new Color(0, 0, 0, 50)); 
                
               
                g2d.fill(new Ellipse2D.Double(x, y, diameter, diameter));
                g2d.dispose();
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200); 
        }
    };
    circularPanel.setOpaque(false); 

   
    jPanel1.add(circularPanel, BorderLayout.CENTER);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnForgot = new javax.swing.JButton();
        lblUserI = new javax.swing.JLabel();
        lblPwdI = new javax.swing.JLabel();
        lblShow = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login !!!");

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Username");

        lblPwd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(255, 255, 255));
        lblPwd.setText("Password");

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setText("   Enter username");
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("👤");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("🔒");

        btnLog.setBackground(new java.awt.Color(0, 51, 102));
        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("Login");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Forgot Password ??");

        btnForgot.setBackground(new java.awt.Color(0, 51, 102));
        btnForgot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnForgot.setForeground(new java.awt.Color(255, 255, 255));
        btnForgot.setText("Click Here !!!");
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        lblUserI.setForeground(new java.awt.Color(204, 0, 0));

        lblPwdI.setForeground(new java.awt.Color(204, 0, 0));

        lblShow.setBackground(new java.awt.Color(255, 255, 255));
        lblShow.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblShow.setForeground(new java.awt.Color(255, 255, 255));
        lblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow.setText("👁️");
        lblShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });

        txtPwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPwd.setForeground(new java.awt.Color(153, 153, 153));
        txtPwd.setText("    ########");
        txtPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblUserI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(lblPwdI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnForgot)))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblUserI, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPwd)
                        .addComponent(jLabel4)
                        .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblPwdI, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLog)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnForgot))
                .addGap(93, 93, 93))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 770, 560));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("   Enter username")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);

        }
        lblPwdI.setText("");
        txtUser.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
     if (txtUser.getText().equals("")) {
            txtUser.setText("   Enter username");
            txtUser.setForeground(new Color(153, 153, 153));

        }
        txtUser.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdFocusGained
     if (txtPwd.getText().equals("    ########")) {
            txtPwd.setText("");
            txtPwd.setForeground(Color.black);

        }
        lblUserI.setText(   "");
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

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
       this.dispose();
        Forgot f1=new Forgot();
     f1.setVisible(true);
    }//GEN-LAST:event_btnForgotActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        String user = txtUser.getText();
        String pwd = txtPwd.getText();
        if(user.equals("   Enter username")|| pwd.equals("    ########")){
          if(user.equals("   Enter username")){
              lblUserI.setText("Fields cannot be empty!!!");
          }
          else{
              lblPwdI.setText("Fields cannot be empty!!!");
          }
        }
        else if(adminLogin()){
            JOptionPane.showMessageDialog(null, "Welcome!!! ADMIN!!!");
            AdminDashboard a1=new AdminDashboard();
            this.dispose();
            a1.setVisible(true);
            userName=user;
            
        }
        else if (libLogin()) {
            JOptionPane.showMessageDialog(null, "Welcome!!! Librarian!!!");
            LibDashboard l1 = new LibDashboard();
            l1.setUserName(user);
            this.dispose();
            l1.setVisible(true);
            userName=user;
             
        }
        else{
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
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblPwdI;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserI;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
