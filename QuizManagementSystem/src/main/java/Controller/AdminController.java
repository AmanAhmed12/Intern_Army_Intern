package Controller;

import Database.Database;
import View.ButtonEditor;
import View.ButtonRenderer;
import View.Login;
import View.updateUserDetail;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class AdminController {

    private Database d1 = new Database();
    private Connection con = null;

    public void logout() {

        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();
            String userName = Login.getUsername();
            String updateQuery = "UPDATE admin_details SET Status = 'active' WHERE username = ?";
            pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, userName);
            pstmt.executeUpdate();
            Login l1 = new Login();
            l1.setVisible(true);

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {

            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void loadUserAccountDetails(JTable tblUserDetails) {
        try {
            // Create buttons for activation and deactivation
            JButton activateButton = new JButton("Activate");
            JButton deactivateButton = new JButton("Deactivate");

            // Set cell renderer for the activation button column
            tblUserDetails.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer(activateButton));
            tblUserDetails.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JCheckBox(), activateButton));

            // Set cell renderer for the deactivation button column
            tblUserDetails.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer(deactivateButton));
            tblUserDetails.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JCheckBox(), deactivateButton));
            con = d1.getConnection();

            String query = "SELECT username, password FROM student_details";
            PreparedStatement preparedStatement = con.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tblUserDetails.getModel();

            // Clear existing rows
            model.setRowCount(0);

            // Add data to the table model
            while (resultSet.next()) {
                String user = resultSet.getString("username");
                String pwd = resultSet.getString("password");

                // Add data to each row, including buttons (empty for now)
                model.addRow(new Object[]{user, pwd, "", ""}); // Buttons added as empty columns
            }

            // Set action listeners for the buttons
            activateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = tblUserDetails.getSelectedRow();
                    if (selectedRow != -1) {
                        String username = (String) model.getValueAt(selectedRow, 0);
                        try {
                            String updateQuery = "UPDATE student_details SET Status='active' WHERE username=?";
                            PreparedStatement pstmt = con.prepareStatement(updateQuery);
                            pstmt.setString(1, username);
                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Account " + username + " successfully activated!");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error activating account " + username + ": " + ex.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select a user to activate.");
                    }
                }
            });

            deactivateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = tblUserDetails.getSelectedRow();
                    if (selectedRow != -1) {
                        String username = (String) model.getValueAt(selectedRow, 0);
                        try {
                            String updateQuery = "UPDATE student_details SET Status='deactivated' WHERE username=?";
                            PreparedStatement pstmt = con.prepareStatement(updateQuery);
                            pstmt.setString(1, username);
                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Account " + username + " successfully deactivated!");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error deactivating account " + username + ": " + ex.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select a user to deactivate.");
                    }
                }
            });

            // Close resources
            resultSet.close();
            preparedStatement.close();

            // Repaint the table to reflect changes
            tblUserDetails.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading user account details: " + e.getMessage());
        }
    }

    
    
    public void forgot(String option, String confirm) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();
            String userName = Login.getUsername();
            String updateQuery = "";

            if (option.equals("username")) {
                updateQuery = "UPDATE admin_details SET username = ?, Status = 'active' WHERE username = ?";
            } else {
                updateQuery = "UPDATE admin_details SET password = ?, Status = 'active' WHERE username = ?";
            }

            pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, confirm);
            pstmt.setString(2, userName);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Account Mail: " + userName + ", Account details changed successfully!!!");
                Login l1 = new Login();
                l1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error in changing Profile Details !!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateUserDetail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(updateUserDetail.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void viewQuizDetails(JTable tblDetails) {
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = d1.getConnection();

            String selectQuery = "SELECT stu_Name,subject,marks,attempt FROM quiz_details";
            pstmt = con.prepareStatement(selectQuery);
            rs = pstmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                String user = rs.getString("stu_Name");
                String subject = rs.getString("subject");
                String marks = rs.getString("marks");
                int marksWithoutPercent = Integer.parseInt(marks.replace("%", ""));
                int attempt = rs.getInt("attempt");
                if (marksWithoutPercent >= 80) {
                    model.addRow(new Object[]{subject, marks, attempt, "Pass"});
                } else {
                    model.addRow(new Object[]{user, subject, marks, attempt, "Fail"});
                }

                found = true;
            }

            if (!found) {

                JOptionPane.showMessageDialog(null, "Subject not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    

    public void searchSubDetails(String search, JTable tblDetails) {
        String capitalizedSearch= search.substring(0, 1).toUpperCase() + search.substring(1);
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = d1.getConnection();

            String selectQuery = "SELECT stu_Name,subject,marks,attempt FROM quiz_details WHERE stu_Name=? OR subject=?";
            pstmt = con.prepareStatement(selectQuery);
            pstmt.setString(1, capitalizedSearch);
            pstmt.setString(2, capitalizedSearch);
            rs = pstmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                String user=rs.getString("stu_Name");
                String subject = rs.getString("subject");
                String marks = rs.getString("marks");
                int marksWithoutPercent = Integer.parseInt(marks.replace("%", ""));
                int attempt = rs.getInt("attempt");
                if (marksWithoutPercent >= 80) {
                    model.addRow(new Object[]{subject, marks, attempt, "Pass"});
                } else {
                    model.addRow(new Object[]{user,subject, marks, attempt, "Fail"});
                }

                found = true;
            }

            if (!found) {

                JOptionPane.showMessageDialog(null, "Subject not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
