
package View;

import Controller.AdminController;
import Controller.StudentController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class updateUserDetail extends javax.swing.JFrame {

 
    public updateUserDetail() {
        initComponents();
         if(Login.getAccountType().equals("Student")){
               btnPrev.setVisible(false);
        }
      
    }
    
    public JPanel getPanel(){
        return panelTwo;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTwo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtConfirm = new javax.swing.JTextField();
        txtVal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbOption = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTwo.setBackground(new java.awt.Color(242, 240, 230));
        panelTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 110)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("👥");
        panelTwo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 120));

        jPanel2.setBackground(new java.awt.Color(242, 240, 230));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 6, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(242, 240, 230));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 3, 37)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("UPDATE  DETAILS !!!");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Select Option :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        btnUpdate.setBackground(new java.awt.Color(240, 227, 206));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 90)); // NOI18N
        jLabel7.setText("👥");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Confirm value :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 30));

        txtConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtConfirm.setForeground(new java.awt.Color(153, 153, 153));
        txtConfirm.setText("Enter value");
        txtConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmFocusLost(evt);
            }
        });
        jPanel4.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 200, 30));

        txtVal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtVal.setForeground(new java.awt.Color(153, 153, 153));
        txtVal.setText("Enter value");
        txtVal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValFocusLost(evt);
            }
        });
        jPanel4.add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 200, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Value :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 30));

        cmbOption.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "username", "password" }));
        jPanel4.add(cmbOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 272, 200, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 410, 460));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/INTERNARMY (2).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 360));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 460));

        panelTwo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 750, 480));

        btnPrev.setBackground(new java.awt.Color(240, 227, 206));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrev.setText("PREV");
        btnPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        panelTwo.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusGained
        if ( txtConfirm.getText().equals("Enter value")) {
             txtConfirm.setText("");
             txtConfirm.setForeground(Color.black);

        }
      
         txtConfirm.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtConfirmFocusGained

    private void txtConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusLost
          if (txtConfirm.getText().equals("")) {
            txtConfirm.setText("Enter value");
            txtConfirm.setForeground(new Color(153, 153, 153));

        }
        txtConfirm.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtConfirmFocusLost

    private void txtValFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValFocusGained
        if (txtVal.getText().equals("Enter value")) {
            txtVal.setText("");
            txtVal.setForeground(Color.black);

        }
      
        txtVal.setBorder(new LineBorder(Color.blue, 2));
    }//GEN-LAST:event_txtValFocusGained

    private void txtValFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValFocusLost
    if (txtVal.getText().equals("")) {
            txtVal.setText("Enter value");
            txtVal.setForeground(new Color(153, 153, 153));

        }
        txtVal.setBorder(new LineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtValFocusLost

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       String option = (String) cmbOption.getSelectedItem();
        String value = txtVal.getText();
        String confirm= txtConfirm.getText();

        if (value.equals("") || confirm.equals("") || option.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty!!!");
        } else if (!value.equals(confirm)) {
            JOptionPane.showMessageDialog(null, "value Field does not match!!!");
        } else {
          
            String accType=Login.getAccountType();
            if (accType.equals("Student")) {
                StudentController s1 = new StudentController();
                s1.forgot(option, confirm);
                this.dispose();
                userDashboard.getDashboard().dispose();
            }
            else{
                AdminController a1=new AdminController();
                a1.forgot(option, confirm);
                 this.dispose();
                AdminDashboard.getDashboard().dispose();
            }
           
            
           
        }
        
        
        txtVal.setText("");
        txtConfirm.setText("");
        cmbOption.setSelectedIndex(0);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.dispose();
        AdminDashboard.getDashboard().setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateUserDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelTwo;
    private javax.swing.JTextField txtConfirm;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
