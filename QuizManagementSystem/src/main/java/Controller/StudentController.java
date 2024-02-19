package Controller;

import Database.Database;
import Model.QuizModel;
import View.Javascript;
import View.Login;
import View.updateUserDetail;
import View.userDashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentController {

    private Database d1 = new Database();
    private Connection con = null;

    public void createAccount(String mail, String username, String password, String contact) {
        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();

            String insertQuery = "INSERT INTO student_details (email,username,password,contact,Status)VALUES(?,?,?,?,?)";
            pstmt = con.prepareStatement(insertQuery);

            pstmt.setString(1, mail);
            pstmt.setString(2, username);
            pstmt.setString(3, password);
            pstmt.setString(4, contact);
            pstmt.setString(5, "active");
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Account Created Successfully..!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error in creating Account..!!");
            }
        } catch (SQLIntegrityConstraintViolationException e) {

            JOptionPane.showMessageDialog(null, "An Account already exists with this username or Email !!!");
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

    public void logout() {

        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();
            String userName = Login.getUsername();
            String updateQuery = "UPDATE student_details SET Status = 'active' WHERE username = ?";
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

    public void forgot(String option, String confirm) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();
            String userName = Login.getUsername();
            String updateQuery = "";

            if (option.equals("username")) {
                updateQuery = "UPDATE student_details SET username = ?, Status = 'active' WHERE username = ?";
            } else {
                updateQuery = "UPDATE student_details SET password = ?, Status = 'active' WHERE username = ?";
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
            // Close resources in finally block
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
    
    public void loadProgress(JTable tblDetails) {
      
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = d1.getConnection();

            String selectQuery = "SELECT subject,marks,attempt FROM quiz_details WHERE stu_Name=?";
            pstmt = con.prepareStatement(selectQuery);
            pstmt.setString(1, Login.getUsername());
            
            rs = pstmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                String subject = rs.getString("subject");
                String marks = rs.getString("marks");
                int marksWithoutPercent = Integer.parseInt(marks.replace("%", ""));
                int attempt = rs.getInt("attempt");
                if (marksWithoutPercent >= 80) {
                    model.addRow(new Object[]{subject, marks, attempt, "Pass"});
                } else {
                    model.addRow(new Object[]{subject, marks, attempt, "Fail"});
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


    
    
    
    
    public void insertQuizDetails(QuizModel model) {
        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();

            String insertQuery = "INSERT INTO quiz_details (subject,marks,attempt,stu_Name)VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(insertQuery);

            pstmt.setString(1, model.getSub());
            pstmt.setString(2, model.getMarks());
            pstmt.setInt(3, model.getAttempt());
            pstmt.setString(4, model.getStuName());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Quiz details recorded Successfully..!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error in recording quiz details..!!");
            }
        }catch (SQLException e) {

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
    
    
    
    public void searchSubDetails(String sub,String username,JTable tblDetails){
        String capitalizedSub = sub.substring(0, 1).toUpperCase() + sub.substring(1);
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
         PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = d1.getConnection();

            String selectQuery = "SELECT subject,marks,attempt FROM quiz_details WHERE stu_Name=? AND subject=?";
            pstmt = con.prepareStatement(selectQuery);
            pstmt.setString(1, username);
            pstmt.setString(2, capitalizedSub);
            rs = pstmt.executeQuery();
            boolean found = false; 
            while (rs.next()) {
                String subject = rs.getString("subject");
                String marks = rs.getString("marks");
                int marksWithoutPercent = Integer.parseInt(marks.replace("%", ""));
                int attempt = rs.getInt("attempt");
                if(marksWithoutPercent>=80){
                      model.addRow(new Object[]{subject, marks, attempt,"Pass"});
                }
                else{
                     model.addRow(new Object[]{subject, marks, attempt,"Fail"});
                }
              
                found=true;
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

    
    
    
    
    
    
    
    
    
    
    

