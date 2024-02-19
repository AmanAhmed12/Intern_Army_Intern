
package View;

import Controller.StudentController;
import java.awt.Color;
import javax.swing.JOptionPane;


public class userDashboard extends javax.swing.JFrame {
private updateUserDetail u1;
private static userDashboard instance;
   
    public userDashboard() {
        initComponents();
        instance=this;
    }
    
    public static userDashboard getDashboard(){
        return instance;
    }
    
    public void setUserName(String name) {
        lblUser.setText("Welcome  " + name + "  !!!");
    }

    
    private void loadUpdateForm() {
        panelOne.removeAll();

        updateUserDetail u1 = new updateUserDetail();

        panelOne.setLayout(null);

        u1.getPanel().setBounds(0, 0, panelOne.getWidth(), panelOne.getHeight());

        panelOne.add(u1.getPanel());

        panelOne.revalidate();
        panelOne.repaint();
    }

    private void loadQuiz() {
       panelOne.removeAll();

        Quizes q1 = new Quizes();

        panelOne.setLayout(null);

        q1.getPanel().setBounds(0, 0, panelOne.getWidth(), panelOne.getHeight());

        panelOne.add(q1.getPanel());

        panelOne.revalidate();
        panelOne.repaint();
    }
    
     private void loadProgress(Progress p1) {
       panelOne.removeAll();

       

        panelOne.setLayout(null);

        p1.getPanel().setBounds(0, 0, panelOne.getWidth(), panelOne.getHeight());

        panelOne.add(p1.getPanel());

        panelOne.revalidate();
        panelOne.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnProgress = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelOne = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 240, 230));

        jPanel2.setBackground(new java.awt.Color(240, 227, 206));

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

        btnQuiz.setBackground(new java.awt.Color(223, 202, 160));
        btnQuiz.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnQuiz.setText("QUIZZES");
        btnQuiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnQuiz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnQuizFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnQuizFocusLost(evt);
            }
        });
        btnQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuizMouseExited(evt);
            }
        });
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnProgress.setBackground(new java.awt.Color(223, 202, 160));
        btnProgress.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnProgress.setText("SHOW MY PROGRESS");
        btnProgress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnProgress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnProgressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnProgressFocusLost(evt);
            }
        });
        btnProgress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProgressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProgressMouseExited(evt);
            }
        });
        btnProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgressActionPerformed(evt);
            }
        });

        btnLog.setBackground(new java.awt.Color(223, 202, 160));
        btnLog.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnLog.setText("LOGOUT");
        btnLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnLog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnLogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnLogFocusLost(evt);
            }
        });
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogMouseExited(evt);
            }
        });
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userlogo-transformed.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOne.setBackground(new java.awt.Color(242, 240, 230));
        panelOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usegif.gif"))); // NOI18N
        panelOne.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 800, 340));

        lblUser.setFont(new java.awt.Font("Showcard Gothic", 1, 45)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelOne.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 630, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUpdateFocusGained

    }//GEN-LAST:event_btnUpdateFocusGained

    private void btnUpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUpdateFocusLost

    }//GEN-LAST:event_btnUpdateFocusLost

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
     loadUpdateForm();
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnQuizFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnQuizFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuizFocusGained

    private void btnQuizFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnQuizFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuizFocusLost

    private void btnQuizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuizMouseEntered
        btnQuiz.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnQuizMouseEntered

    private void btnQuizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuizMouseExited
        btnQuiz.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnQuizMouseExited

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
       loadQuiz();
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnProgressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnProgressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProgressFocusGained

    private void btnProgressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnProgressFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProgressFocusLost

    private void btnProgressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProgressMouseEntered
        btnProgress.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnProgressMouseEntered

    private void btnProgressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProgressMouseExited
          btnProgress.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnProgressMouseExited

    private void btnProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgressActionPerformed
       StudentController s1=new StudentController();
       Progress p1=new Progress();
       s1.loadProgress(p1.getTable());
        loadProgress(p1);
    }//GEN-LAST:event_btnProgressActionPerformed

    private void btnLogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnLogFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogFocusGained

    private void btnLogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnLogFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogFocusLost

    private void btnLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseEntered
         btnLog.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnLogMouseEntered

    private void btnLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseExited
          btnLog.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnLogMouseExited

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
       int choice = JOptionPane.showOptionDialog(null, "Are you sure yo want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();
            StudentController s1=new StudentController();
            s1.logout();
        }
        
      
   
       
    }//GEN-LAST:event_btnLogActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnProgress;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelOne;
    // End of variables declaration//GEN-END:variables
}
