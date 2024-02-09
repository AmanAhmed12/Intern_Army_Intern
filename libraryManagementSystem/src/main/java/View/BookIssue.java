
package View;

import Controller.LibrarianController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


public class BookIssue extends javax.swing.JFrame {

    public BookIssue() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnIssue = new javax.swing.JButton();
        txtStuName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISSUE BOOKS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 180)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("📖");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 130)); // NOI18N
        jLabel8.setText("📖");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, 160));

        btnPrev.setBackground(new java.awt.Color(0, 51, 102));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("PREV");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Book ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Student Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 210, 30));

        btnIssue.setBackground(new java.awt.Color(0, 51, 102));
        btnIssue.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIssue.setForeground(new java.awt.Color(255, 255, 255));
        btnIssue.setText("ISSUE");
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });
        jPanel1.add(btnIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 100, 40));

        txtStuName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtStuName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStuNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStuNameFocusLost(evt);
            }
        });
        jPanel1.add(txtStuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.dispose();
        LibDashboard l1=new LibDashboard();
        l1.setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
        txtId.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
        txtId.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtIdFocusLost

    private void txtStuNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStuNameFocusGained
       txtStuName.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtStuNameFocusGained

    private void txtStuNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStuNameFocusLost
       txtStuName.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtStuNameFocusLost

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        String bookId = txtId.getText();
        String stuName = txtStuName.getText();

        if (bookId.equals("") || stuName.equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty !!!");
        } else {
            LibrarianController l1 = new LibrarianController();
            l1.issueBook(bookId, stuName);

        }

        txtId.setText("");
        txtStuName.setText("");
    }//GEN-LAST:event_btnIssueActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookIssue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtStuName;
    // End of variables declaration//GEN-END:variables
}
