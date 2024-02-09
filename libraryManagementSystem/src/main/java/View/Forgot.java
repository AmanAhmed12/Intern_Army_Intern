
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


public class Forgot extends javax.swing.JFrame {

 
    public Forgot() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPwdN = new javax.swing.JPasswordField();
        txtPwdC = new javax.swing.JPasswordField();
        btnChange = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblShow = new javax.swing.JLabel();
        lblShow1 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Change Password !!!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 320, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setText("Enter ID Number");
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 30));

        txtPwdN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPwdN.setText("########");
        txtPwdN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdNFocusLost(evt);
            }
        });
        jPanel1.add(txtPwdN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 30));

        txtPwdC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPwdC.setText("########");
        txtPwdC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPwdCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPwdCFocusLost(evt);
            }
        });
        jPanel1.add(txtPwdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, 30));

        btnChange.setBackground(new java.awt.Color(0, 51, 102));
        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel1.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 180, 20));

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
        jPanel1.add(lblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 30, 30));

        lblShow1.setBackground(new java.awt.Color(255, 255, 255));
        lblShow1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblShow1.setForeground(new java.awt.Color(255, 255, 255));
        lblShow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow1.setText("👁️");
        lblShow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        lblShow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShow1MouseClicked(evt);
            }
        });
        jPanel1.add(lblShow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 30, 30));

        btnPrev.setBackground(new java.awt.Color(0, 51, 102));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("PREV");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
        if (txtId.getText().equals("Enter ID Number")) {
            txtId.setText("");
            txtId.setForeground(Color.black);

        }
        txtId.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
      if (txtId.getText().equals("")) {
            txtId.setText("Enter ID Number");
            txtId.setForeground(new Color(153, 153, 153));

        }
        txtId.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtIdFocusLost

    private void txtPwdNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdNFocusGained
         if (txtPwdN.getText().equals("########")) {
            txtPwdN.setText("");
            txtPwdN.setForeground(Color.black);

        }
        txtPwdN.setBorder(new LineBorder(Color.blue, 2));
        lblShow.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtPwdNFocusGained

    private void txtPwdNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdNFocusLost
        if (txtPwdN.getText().equals("")) {
        
            txtPwdN.setText("########");
            txtPwdN.setForeground(new Color(153, 153, 153));
        }


      
       txtPwdN.setBorder(new LineBorder(Color.gray, 1));
         lblShow.setBorder(new LineBorder(Color.gray, 1));

       
      
    }//GEN-LAST:event_txtPwdNFocusLost

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        char echo = txtPwdN.getEchoChar();
        if (echo == 0) {
            txtPwdN.setEchoChar('●'); // Set it to the default bullet character to hide characters
        } else {
            txtPwdN.setEchoChar((char) 0); // Set it to 0 to make characters visible
        }
    }//GEN-LAST:event_lblShowMouseClicked

    private void lblShow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow1MouseClicked
        char echo = txtPwdC.getEchoChar();
        if (echo == 0) {
            txtPwdC.setEchoChar('●'); // Set it to the default bullet character to hide characters
        } else {
            txtPwdC.setEchoChar((char) 0); // Set it to 0 to make characters visible
        }
    }//GEN-LAST:event_lblShow1MouseClicked

    private void txtPwdCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdCFocusGained
        if (txtPwdC.getText().equals("########")) {
            txtPwdC.setText("");
            txtPwdC.setForeground(Color.black);

        }
        txtPwdC.setBorder(new LineBorder(Color.blue, 2));
        lblShow1.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtPwdCFocusGained

    private void txtPwdCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPwdCFocusLost
        if (txtPwdC.getText().equals("")) {
        
            txtPwdC.setText("########");
            txtPwdC.setForeground(new Color(153, 153, 153));
        }


      
       txtPwdC.setBorder(new LineBorder(Color.gray, 1));
         lblShow1.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtPwdCFocusLost

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.dispose();
       Login l1=new Login();
        l1.setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        Database d1 = new Database();
        String id = txtId.getText();
        String pwd = txtPwdN.getText();
        String confirmpwd = txtPwdC.getText();

        try {
            if (pwd.equals("") || confirmpwd.equals("") || id.equals("")) {
                JOptionPane.showMessageDialog(null, "Fields cannot be empty!!!");
            } else if (!pwd.equals(confirmpwd)) {
                JOptionPane.showMessageDialog(null, "Password does not match!!!");
            } else {
                Connection con = d1.getConnection();
                PreparedStatement pstmt = null;
                con = d1.getConnection();
                String updateQuery = "";
                if (isIdExistsInTable(con, id, "admin_details")) {
                    updateQuery = "UPDATE admin_details SET password = ? WHERE admin_Id = ?";
                       JOptionPane.showMessageDialog(null, "Account ID:"+id+",password changed successfully!!!");
                } else if (isIdExistsInTable(con, id, "librarian_details")) {
                    updateQuery = "UPDATE librarian_details SET password = ? WHERE lib_Id = ?";
                     JOptionPane.showMessageDialog(null, "Account ID:"+id+",password changed successfully!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "ID does not exist!");
                    return; // Exit the method if ID does not exist in any table
                }
                pstmt = con.prepareStatement(updateQuery);
                pstmt.setString(1, confirmpwd);
                pstmt.setString(2, id);
                pstmt.executeUpdate();
                Login l1 = new Login();
                l1.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Forgot.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_btnChangeActionPerformed
private boolean isIdExistsInTable(Connection con, String id, String tableName) throws SQLException {
    ResultSet rs =null;
    
    if (tableName.equals("admin_details")) {
        String query = "SELECT admin_Id FROM " + tableName + " WHERE admin_Id = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();
       
    }
    else{
         String query = "SELECT lib_Id FROM " + tableName + " WHERE lib_Id= ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();
    }
    return rs.next();
    
}
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblShow1;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPwdC;
    private javax.swing.JPasswordField txtPwdN;
    // End of variables declaration//GEN-END:variables
}
