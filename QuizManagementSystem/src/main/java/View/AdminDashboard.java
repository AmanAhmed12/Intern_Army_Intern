
package View;

import Controller.AdminController;
import Controller.StudentController;
import java.awt.Color;
import javax.swing.JOptionPane;


public class AdminDashboard extends javax.swing.JFrame {
private static AdminDashboard instance;
   
    public AdminDashboard() {
        initComponents();
       
        instance=this;
    }
    public void setUserName(String name) {
        lblUser.setText(name + "  !!!");
    }
     public static AdminDashboard getDashboard(){
        return instance;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOne = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnLog4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOne.setBackground(new java.awt.Color(242, 240, 230));
        panelOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(223, 202, 160));

        lblUser.setFont(new java.awt.Font("Showcard Gothic", 1, 27)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnLog4.setBackground(new java.awt.Color(223, 202, 160));
        btnLog4.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnLog4.setText("LOGOUT");
        btnLog4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnLog4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnLog4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnLog4FocusLost(evt);
            }
        });
        btnLog4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLog4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLog4MouseExited(evt);
            }
        });
        btnLog4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLog4ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnLog4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnLog4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        panelOne.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 490));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("~ ADMIN DASHBOARD ~");
        panelOne.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 560, 80));

        btnUpdate.setBackground(new java.awt.Color(223, 202, 160));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnUpdate.setText("UPDATE PROFILE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnUpdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnUpdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnUpdateFocusLost(evt);
            }
        });
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelOne.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 220, 50));

        btnView.setBackground(new java.awt.Color(223, 202, 160));
        btnView.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnView.setText("VIEW QUIZ DETAILS");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnViewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnViewFocusLost(evt);
            }
        });
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewMouseExited(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        panelOne.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 200, 50));

        btnManage.setBackground(new java.awt.Color(223, 202, 160));
        btnManage.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnManage.setText("MANAGE STUDENTS");
        btnManage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnManage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnManageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnManageFocusLost(evt);
            }
        });
        btnManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageMouseExited(evt);
            }
        });
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        panelOne.add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 210, 50));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- ADMIN -");
        panelOne.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1084, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUpdateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateFocusGained

    private void btnUpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUpdateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateFocusLost

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
     updateUserDetail u1=new updateUserDetail();
     this.dispose();
     u1.setVisible(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnViewFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewFocusGained

    private void btnViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnViewFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewFocusLost

    private void btnViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMouseEntered

    private void btnViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMouseExited

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
     QuizDetails q1=new QuizDetails();
     this.dispose();
     q1.setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnManageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnManageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageFocusGained

    private void btnManageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnManageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageFocusLost

    private void btnManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageMouseEntered

    private void btnManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageMouseExited

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
      AdminController a1=new AdminController();
      ManageStudent m1=new ManageStudent();
      a1.loadUserAccountDetails(  m1.getTable());
      this.dispose();
      m1.setVisible(true);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnLog4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnLog4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLog4FocusGained

    private void btnLog4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnLog4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLog4FocusLost

    private void btnLog4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLog4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLog4MouseEntered

    private void btnLog4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLog4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLog4MouseExited

    private void btnLog4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLog4ActionPerformed
      int choice = JOptionPane.showOptionDialog(null, "Are you sure yo want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();
            AdminController a1=new AdminController();
            a1.logout();
        }
    }//GEN-LAST:event_btnLog4ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog4;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelOne;
    // End of variables declaration//GEN-END:variables
}
