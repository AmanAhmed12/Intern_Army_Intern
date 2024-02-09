
package View;

import Controller.AdminController;
import Controller.LibrarianController;
import javax.swing.JOptionPane;


public class LibDashboard extends javax.swing.JFrame {

   
    public LibDashboard() {
        initComponents();
       
    }
    
    public void setUserName(String name){
         lblUser.setText("Welcome  "+name+"  !!!");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bthAdd = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnViewIssue = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnIssue = new javax.swing.JButton();
        btnView1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DASHBOARD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-LIBRARIAN-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        bthAdd.setBackground(new java.awt.Color(0, 51, 102));
        bthAdd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bthAdd.setForeground(new java.awt.Color(255, 255, 255));
        bthAdd.setText("ADD BOOK");
        bthAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthAddActionPerformed(evt);
            }
        });
        jPanel2.add(bthAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 40));

        btnReturn.setBackground(new java.awt.Color(0, 51, 102));
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("RETURN BOOKS");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel2.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 270, 40));

        btnViewIssue.setBackground(new java.awt.Color(0, 51, 102));
        btnViewIssue.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnViewIssue.setForeground(new java.awt.Color(255, 255, 255));
        btnViewIssue.setText("VIEW ISSUE BOOKS");
        btnViewIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewIssueActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 270, 40));

        btnLog.setBackground(new java.awt.Color(0, 51, 102));
        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("LOGOUT");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel2.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 140, 40));

        btnIssue.setBackground(new java.awt.Color(0, 51, 102));
        btnIssue.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIssue.setForeground(new java.awt.Color(255, 255, 255));
        btnIssue.setText("ISSUE");
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });
        jPanel2.add(btnIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 270, 40));

        btnView1.setBackground(new java.awt.Color(0, 51, 102));
        btnView1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnView1.setForeground(new java.awt.Color(255, 255, 255));
        btnView1.setText("VIEW BOOK");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 270, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 350)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("👤");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 360, 370));

        lblUser.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        lblUser.setForeground(new java.awt.Color(153, 153, 153));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 530, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back1.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 630));

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

    private void bthAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthAddActionPerformed
      this.dispose();
      AddBook a1=new AddBook();
      a1.setVisible(true);
    }//GEN-LAST:event_bthAddActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
     this.dispose();
     BookIssue b1=new BookIssue();
     b1.setVisible(true);
    }//GEN-LAST:event_btnIssueActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed

        this.dispose();
        ViewBook v1 = new ViewBook();
        LibrarianController l1 = new LibrarianController();
        l1.viewBooks(v1.getTable(), v1);

    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnViewIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewIssueActionPerformed
     this.dispose();
     ViewIssueBook v1=new ViewIssueBook();
     LibrarianController l1=new LibrarianController();
     l1.viewIssueBook(v1.getTable(),v1);
     
    }//GEN-LAST:event_btnViewIssueActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
        ReturnBook r1=new ReturnBook();
        r1.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
       int choice = JOptionPane.showOptionDialog(null, "Are you sure yo want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();
            LibrarianController l1 = new LibrarianController();
            l1.logout();
        }
    }//GEN-LAST:event_btnLogActionPerformed

   
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthAdd;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnView1;
    private javax.swing.JButton btnViewIssue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
