
package com.mycompany.currencyconverter;

import javax.swing.JOptionPane;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;

import javax.swing.JOptionPane;

public class Converter extends javax.swing.JFrame {
  private Color defaultBackgroundColor;
    public Converter() {
        initComponents();
    }
 public void convertCurrency(double amount, String from, String to) {
        try {
            double exchangeRate = getExchangeRate(from, to);

            if (exchangeRate > 0) {
                double convertedAmount = amount * exchangeRate;
                lblConvertAmount.setOpaque(true);
                lblConvertAmount.setBackground(Color.GREEN);
                lblConvertAmount.setText(Double.toString(convertedAmount));
            } else {
                JOptionPane.showMessageDialog(null, "Failed to fetch exchange rate for " + from + " to " + to);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting currency: " + e.getMessage());
        }
    }
 
  private double getExchangeRate(String from, String to) {
        try {
            if ("LK".equals(from) && "INR".equals(to)) {
               
                String apiUrl = "https://api.exchangerate-api.com/v4/latest/LKR";
                JsonNode response = Unirest.get(apiUrl)
                        .header("accept", "application/json")
                        .asJson()
                        .getBody();

              
                double exchangeRate = response.getObject()
                        .getJSONObject("rates")
                        .getDouble("INR");
                lblCurrency.setText("(INR)");
                return exchangeRate;
            } else if ("INR".equals(from) && "LK".equals(to)) {
                
                String apiUrl = "https://api.exchangerate-api.com/v4/latest/INR";
                JsonNode response = Unirest.get(apiUrl)
                        .header("accept", "application/json")
                        .asJson()
                        .getBody();

                double exchangeRate = response.getObject()
                        .getJSONObject("rates")
                        .getDouble("LKR");
                 lblCurrency.setText("(LK)");
                return exchangeRate;
            }

          
            return -1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching exchange rate: " + e.getMessage());
            return -1;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblConvertAmount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox<>();
        cmbTo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        lblCurrency = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Currency Converter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setText("Converted Currency");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblConvertAmount.setBackground(new java.awt.Color(204, 204, 204));
        lblConvertAmount.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblConvertAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConvertAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblConvertAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 249, 43));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("From");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 37, -1));

        cmbFrom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LK", "INR", " " }));
        jPanel1.add(cmbFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 30));

        cmbTo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LK", "INR", " " }));
        cmbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbToActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 97, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("To");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 37, -1));

        btnConvert.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnConvert.setText("Convert Currency");
        btnConvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertMouseExited(evt);
            }
        });
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 263, 55));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 249, 45));

        lblCurrency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(lblCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 30));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 460, 263, 55));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 90, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbToActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed

      try {
            double amount = Double.parseDouble(txtAmount.getText());
            String from = (String) cmbFrom.getSelectedItem();
            String to = (String) cmbTo.getSelectedItem();

            convertCurrency(amount, from, to);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter an amount to convert");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for the amount");
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtAmount.setText("");
        lblConvertAmount.setText("");
        cmbFrom.setSelectedIndex(0);
        cmbTo.setSelectedIndex(0);
        lblConvertAmount.setOpaque(false); 
        lblConvertAmount.setBackground(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnConvertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseEntered
      defaultBackgroundColor = btnConvert.getBackground();  
    btnConvert.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnConvertMouseEntered

    private void btnConvertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseExited
         btnConvert.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnConvertMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
      defaultBackgroundColor = btnConvert.getBackground();  
    btnClear.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnClearMouseExited

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConvertAmount;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
