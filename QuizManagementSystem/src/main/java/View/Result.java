
package View;

import Controller.StudentController;
import Model.QuizModel;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Result extends javax.swing.JFrame {
private String marksObtained="";
private String sub="";

  private static int attempts=1;
    public Result(String sub) {
        initComponents();
        this.sub=sub;
           makeCircular(jPanel1);
    }
    
   
    
    public static int getAttempt(){
        return attempts;
    }
    
   public void setText(String congrats,String head, int marks) {
    marksObtained = String.valueOf(marks)+"%";
    lblHead.setText(head);
    lblMark.setText(marksObtained); 
    lblMain.setText(congrats);
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

                // Fill the inner circle with a semi-transparent color
                g2d.setColor(new Color(223, 202, 160, 50));
                g2d.fill(new Ellipse2D.Double(x, y, diameter, diameter));

                // Draw the white border
                g2d.setColor(Color.WHITE);
                int borderThickness = 3;
                g2d.setStroke(new BasicStroke(borderThickness));
                g2d.draw(new Ellipse2D.Double(x - borderThickness / 2, y - borderThickness / 2, diameter + borderThickness, diameter + borderThickness));

                g2d.dispose();
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(280, 280);
        }
    };
    circularPanel.setOpaque(false);

    panel.add(circularPanel, BorderLayout.CENTER);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pan = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMark = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        btnReAttempt = new javax.swing.JButton();
        lblMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pan.setBackground(new java.awt.Color(242, 240, 230));

        lblHead.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblMark.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        lblMark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMark, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMark, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        btnFinish.setBackground(new java.awt.Color(223, 202, 160));
        btnFinish.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnFinish.setText("Finish");
        btnFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnFinish.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnFinishFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnFinishFocusLost(evt);
            }
        });
        btnFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinishMouseExited(evt);
            }
        });
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnReAttempt.setBackground(new java.awt.Color(223, 202, 160));
        btnReAttempt.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnReAttempt.setText("RE Attempt");
        btnReAttempt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnReAttempt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnReAttemptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnReAttemptFocusLost(evt);
            }
        });
        btnReAttempt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReAttemptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReAttemptMouseExited(evt);
            }
        });
        btnReAttempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReAttemptActionPerformed(evt);
            }
        });

        lblMain.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(lblMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnFinishFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinishFocusGained

    private void btnFinishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnFinishFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinishFocusLost

    private void btnFinishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseEntered
        btnFinish.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_btnFinishMouseEntered

    private void btnFinishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseExited
        btnFinish.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnFinishMouseExited

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed

          this.dispose();
        StudentController s1 = new StudentController();
        String user = Login.getUsername();
        QuizModel q1=new QuizModel(sub,marksObtained,Result.getAttempt(),Login.getUsername());
        s1.insertQuizDetails(q1);
        attempts++;
        if(attempts>=2){
            attempts=1;
        }

        userDashboard u1 = new userDashboard();
        u1.setVisible(true);


    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnReAttemptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnReAttemptFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReAttemptFocusGained

    private void btnReAttemptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnReAttemptFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReAttemptFocusLost

    private void btnReAttemptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReAttemptMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReAttemptMouseEntered

    private void btnReAttemptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReAttemptMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReAttemptMouseExited

    private void btnReAttemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReAttemptActionPerformed

        if (attempts >=2) {
            JOptionPane.showMessageDialog(null, "You have reached the maximum number of attempts allowed !!!");
            
        } else {
            StudentController s1 = new StudentController();
            String user = Login.getUsername();
           QuizModel q1=new QuizModel(sub,marksObtained,Result.getAttempt(),Login.getUsername());
            s1.insertQuizDetails(q1);
            attempts++;
            
            this.dispose();
            if (sub.equals("Java")) {
                Java j1 = new Java();
                j1.setVisible(true);
            }
            else if(sub.equals("C#")){
                Csharp c1=new Csharp();
                c1.setVisible(true);
            }
            else if(sub.equals("Html")){
                Html h1=new Html();
                h1.setVisible(true);
            }
            else if(sub.equals("Css")){
                Css c1=new Css();
                c1.setVisible(true);
            }
            else{
                Javascript j1=new Javascript();
                j1.setVisible(true);
            }
           
           
        }

    }//GEN-LAST:event_btnReAttemptActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnReAttempt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMark;
    private javax.swing.JPanel pan;
    // End of variables declaration//GEN-END:variables
}
