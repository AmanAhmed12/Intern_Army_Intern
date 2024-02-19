
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Css extends javax.swing.JFrame {
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    public int marks = 0;
    private int secondsPassed = 0;
    private javax.swing.Timer timer;
   
    public Css() {
        initComponents();
          buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup1.add(rdoOne1);
        buttonGroup1.add(rdoOne2);
        buttonGroup1.add(rdoAnswer1);

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup2.add(rdoTwo1);
        buttonGroup2.add(rdoTwo2);
        buttonGroup2.add(rdoAnswer2);

        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup3.add(rdoThree1);
        buttonGroup3.add(rdoThree2);
        buttonGroup3.add(rdoAnswer3);

        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup4.add(rdoFour1);
        buttonGroup4.add(rdoFour2);
        buttonGroup4.add(rdoAnswer4);

        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup5.add(rdoFive1);
        buttonGroup5.add(rdoFive2);
        buttonGroup5.add(rdoAnswer5);
        startTimer();
    }
    private void startTimer() {
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (secondsPassed >= 15 * 60) {
                    ((Timer) e.getSource()).stop();
                    JOptionPane.showMessageDialog(Css.this, "Time's up!");
                    btnSubActionPerformed(null);

                } else {
                    int minutes = secondsPassed / 60;
                    int seconds = secondsPassed % 60;
                    lblTimer.setText(String.format("Time: %02d:%02d", minutes, seconds));
                    secondsPassed++;
                }
            }
        });
        timer.start();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoOne1 = new javax.swing.JRadioButton();
        rdoAnswer1 = new javax.swing.JRadioButton();
        rdoOne2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdoTwo1 = new javax.swing.JRadioButton();
        rdoTwo2 = new javax.swing.JRadioButton();
        rdoAnswer2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdoAnswer3 = new javax.swing.JRadioButton();
        rdoThree1 = new javax.swing.JRadioButton();
        rdoThree2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rdoAnswer4 = new javax.swing.JRadioButton();
        rdoFour1 = new javax.swing.JRadioButton();
        rdoFour2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rdoFive1 = new javax.swing.JRadioButton();
        rdoAnswer5 = new javax.swing.JRadioButton();
        rdoFive2 = new javax.swing.JRadioButton();
        btnSub = new javax.swing.JButton();
        lblTimer = new javax.swing.JLabel();
        lblTimer1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 240, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CSS - QUIZ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("5) The CSS property used to make the text bold is -");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        rdoOne1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoOne1.setText("Cascade style sheets");
        jPanel1.add(rdoOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        rdoAnswer1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoAnswer1.setText("Cascading style sheets");
        jPanel1.add(rdoAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        rdoOne2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoOne2.setText("None of the above");
        jPanel1.add(rdoOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("1) CSS stands for -");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        rdoTwo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoTwo1.setText("bgcolor");
        jPanel1.add(rdoTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        rdoTwo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoTwo2.setText("color");
        jPanel1.add(rdoTwo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        rdoAnswer2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoAnswer2.setText("background-color");
        jPanel1.add(rdoAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("2)  The property in CSS used to change the background color of an element is -");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        rdoAnswer3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoAnswer3.setText("color");
        jPanel1.add(rdoAnswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        rdoThree1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoThree1.setText("background-color");
        jPanel1.add(rdoThree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        rdoThree2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoThree2.setText("bgcolor");
        jPanel1.add(rdoThree2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("3) The property in CSS used to change the text color of an element is -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        rdoAnswer4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoAnswer4.setText("style");
        jPanel1.add(rdoAnswer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        rdoFour1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoFour1.setText("styles");
        jPanel1.add(rdoFour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        rdoFour2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoFour2.setText("class");
        jPanel1.add(rdoFour2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("4) The HTML attribute used to define the inline styles is -");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        rdoFive1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoFive1.setText("font: bold");
        jPanel1.add(rdoFive1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        rdoAnswer5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoAnswer5.setText("font-weight : bold");
        jPanel1.add(rdoAnswer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        rdoFive2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoFive2.setText("style: bold");
        jPanel1.add(rdoFive2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        btnSub.setBackground(new java.awt.Color(223, 202, 160));
        btnSub.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnSub.setText("SUBMIT");
        btnSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnSub.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSubFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSubFocusLost(evt);
            }
        });
        btnSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubMouseExited(evt);
            }
        });
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 100, 40));

        lblTimer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(lblTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 200, 40));

        lblTimer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTimer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer1.setText("Total : 15 Minutes");
        lblTimer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(lblTimer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubFocusGained

    private void btnSubFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubFocusLost

    private void btnSubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMouseEntered
        btnSub.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnSubMouseEntered

    private void btnSubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMouseExited
        btnSub.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSubMouseExited

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        if (rdoAnswer1.isSelected()) {
            marks++;

        }

        if (rdoAnswer2.isSelected()) {
            marks++;
        }

        if (rdoAnswer3.isSelected()) {
            marks++;
        }

        if (rdoAnswer4.isSelected()) {
            marks++;
        }

        if (rdoAnswer5.isSelected()) {
            marks++;
        }

        int percent = (int) Math.round(((double) marks / 5) * 100);

        Result r1 = new Result("Css");
        if (percent >= 80) {
            String main = "Congratulations " + Login.getUsername() + "  !!!";
            String head = "You have passed the Css Quiz !!!";
            r1.setText(main, head, percent);
        } else {
            String main = "Oops " + Login.getUsername() + "  !!!";
            String head = "You  need to get more than 80% to pass this quiz !!!";
            r1.setText(main, head, percent);
        }
        this.dispose();
        r1.setVisible(true);


    }//GEN-LAST:event_btnSubActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Css().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel lblTimer1;
    private javax.swing.JRadioButton rdoAnswer1;
    private javax.swing.JRadioButton rdoAnswer2;
    private javax.swing.JRadioButton rdoAnswer3;
    private javax.swing.JRadioButton rdoAnswer4;
    private javax.swing.JRadioButton rdoAnswer5;
    private javax.swing.JRadioButton rdoFive1;
    private javax.swing.JRadioButton rdoFive2;
    private javax.swing.JRadioButton rdoFour1;
    private javax.swing.JRadioButton rdoFour2;
    private javax.swing.JRadioButton rdoOne1;
    private javax.swing.JRadioButton rdoOne2;
    private javax.swing.JRadioButton rdoThree1;
    private javax.swing.JRadioButton rdoThree2;
    private javax.swing.JRadioButton rdoTwo1;
    private javax.swing.JRadioButton rdoTwo2;
    // End of variables declaration//GEN-END:variables
}
