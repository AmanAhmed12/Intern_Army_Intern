package Controller;

import Database.Database;
import View.Login;
import View.ViewAccounts;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminController {

    private Database d1 = new Database();
    private Connection con = null;

    public void add(String id, String username, String password, String accType) {
        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();
            if (accType.equals("Admin")) {
                String insertQuery = "INSERT INTO admin_details VALUES(?,?,?,?)";
                pstmt = con.prepareStatement(insertQuery);
            } else {
                String insertQuery = "INSERT INTO librarian_details VALUES(?,?,?,?)";
                pstmt = con.prepareStatement(insertQuery);
            }
            pstmt.setString(1, id);
            pstmt.setString(2, username);
            pstmt.setString(3, password);
            pstmt.setString(4, "active");
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Account Created Successfully..!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error in creating Account..!!");
            }
        } catch (SQLIntegrityConstraintViolationException e) {

            JOptionPane.showMessageDialog(null, "The ID already exists.");
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

    public void view(JTable tblUserDetails, ViewAccounts v1) {

        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = d1.getConnection();
            stmt = con.createStatement();

            String showTableQuery = "SELECT * FROM librarian_details";
            rs = stmt.executeQuery(showTableQuery);

            DefaultTableModel model = (DefaultTableModel) tblUserDetails.getModel();
            model.setRowCount(0); // Clear existing rows in the table

            while (rs.next()) {
                String Id = rs.getString("lib_Id");
                String username = rs.getString("username");
                String pwd = rs.getString("password");
                String status = rs.getString("Status");

                String tbData[] = {Id, username, pwd, status};

                model.addRow(tbData);
            }
            con.close();
            v1.setVisible(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in connecting Database!!!");

        }
    }

    public void delete(String id) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int rowsAffected = 0;
        try {
            con = d1.getConnection();
            String selectQuery = "SELECT Status FROM librarian_details WHERE lib_Id = ?";
            pstmt = con.prepareStatement(selectQuery);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String currentStatus = rs.getString("Status");
                if (!currentStatus.equals("deactive")) {
                    String updateQuery = "UPDATE librarian_details SET Status = 'deactive' WHERE lib_Id = ?";
                    pstmt = con.prepareStatement(updateQuery);
                    pstmt.setString(1, id);
                    rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Account ID: " + id + ", Successfully Deleted !!!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account ID: " + id + ",Doesn't Exist !!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No account found with ID: " + id);
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error in connecting Database!!!");
        } finally {

            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in connecting Database!!!");
            }
        }

    }

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
}
