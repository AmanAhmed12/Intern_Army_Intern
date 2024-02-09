
package Controller;

import Database.Database;
import View.Login;
import View.ViewBook;
import View.ViewIssueBook;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class LibrarianController {
    private Database d1 = new Database();
    private Connection con = null;
    
   public void addBook(String bookId, String bookName, String author) {
    PreparedStatement pstmt = null;
    Connection con = null; 
    try {
        con = d1.getConnection(); 
        String username = Login.getUsername();
        String selectQuery = "SELECT lib_Id FROM librarian_details WHERE username=?";
        pstmt = con.prepareStatement(selectQuery);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        String libId = "";
        if (rs.next()) {
            libId = rs.getString("lib_Id");
        } else {
            JOptionPane.showMessageDialog(null, "Librarian not found.");
            return; 
        }

        String insertQuery = "INSERT INTO book_details VALUES(?,?,?,?,?)";
        pstmt = con.prepareStatement(insertQuery);

        pstmt.setString(1, bookId);
        pstmt.setString(2, bookName);
        pstmt.setString(3, author);
        pstmt.setString(4, "available");
        pstmt.setString(5, libId);
        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Book added successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Error adding book.");
        }
    } catch (SQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "The book ID already exists.");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
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

    public void viewBooks(JTable tblBookDetails,ViewBook v1){
          Statement stmt = null;
        ResultSet rs = null;

        try {
            con = d1.getConnection();
            stmt = con.createStatement();

            String showTableQuery = "SELECT * FROM book_details";
            rs = stmt.executeQuery(showTableQuery);

            DefaultTableModel model = (DefaultTableModel) tblBookDetails.getModel();
            model.setRowCount(0); // Clear existing rows in the table

            while (rs.next()) {
                String Id = rs.getString("Book_Id");
                String username = rs.getString("Book_Name");
                String pwd = rs.getString("Book_Author");
                String status = rs.getString("Status");
                String libId=rs.getString("libId");

                String tbData[] = {Id, username, pwd, status,libId};

                model.addRow(tbData);
            }
            con.close();
            v1.setVisible(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in connecting Database!!!");

        }
    }
    
    public void issueBook(String bookId,String stuName) {
        PreparedStatement pstmt = null;
          PreparedStatement stmt = null;
        Connection con = null;
        java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
        String issuedate=currentDate.toString();
        try {
            con = d1.getConnection();
            String selectQuery = "SELECT Book_Id,Book_Name,Book_Author,Status FROM book_details WHERE Book_Id=?";
            pstmt = con.prepareStatement(selectQuery);
            pstmt.setString(1, bookId);
            ResultSet rs = pstmt.executeQuery();
            String bookid = "";
            String bookname = "";
            String bookauthor = "";
             String status = "";
            
           while(rs.next()) {
                bookid = rs.getString("Book_Id");
                bookname=rs.getString("Book_Name");
                bookauthor=rs.getString("Book_Author");
                status=rs.getString("Status");
            } 
            if (status.equals("available")) {
                String insertQuery = "INSERT INTO books_issued ( Book_Id,Name,Author,issue_date,return_date,stu_Name) VALUES(?,?,?,?,?,?)";
                pstmt = con.prepareStatement(insertQuery);

                pstmt.setString(1, bookid);
                pstmt.setString(2, bookname);
                pstmt.setString(3, bookauthor);
                pstmt.setString(4, issuedate);
                pstmt.setString(5, "Not Returned");
                pstmt.setString(6, stuName);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Book:" + bookname + ",issued to " + "Student:" + stuName);
                } else {
                    JOptionPane.showMessageDialog(null, "Error in issuing Book !!!");
                }
                
                
                 String updateQuery = "UPDATE book_details SET  Status=? where Book_Id=?";
                 stmt=con.prepareStatement(updateQuery);
                 stmt.setString(1, "Issued");
                 stmt.setString(2,bookId);
                 stmt.executeUpdate();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "This Book is Not Available Right Now !!!");
            }

           
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "The book  is  already issued !!!");
        } catch (SQLException e) {
           
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
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

    public void viewIssueBook(JTable tblBookDetails, ViewIssueBook v1) {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = d1.getConnection();
            stmt = con.createStatement();

            String showTableQuery = "SELECT * FROM books_issued";
            rs = stmt.executeQuery(showTableQuery);

            DefaultTableModel model = (DefaultTableModel) tblBookDetails.getModel();
            model.setRowCount(0); // Clear existing rows in the table

            while (rs.next()) {
                String Id = rs.getString("Book_Id");
                String bname = rs.getString("Name");
                String author = rs.getString("Author");
                String Idate = rs.getString("issue_date");
                String Rdate = rs.getString("return_date");
                String status = rs.getString("stu_Name");
                

                String tbData[] = {Id, bname, author, Idate, Rdate,status};

                model.addRow(tbData);
            }
            con.close();
            v1.setVisible(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in connecting Database!!!");

        }
    }

    public void returnBook(String bookId) {
        PreparedStatement pstmt = null;
          PreparedStatement stmt = null;
          PreparedStatement tmt = null;
          java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
        String returndate=currentDate.toString();
        try {
            con = d1.getConnection();
              String selectQuery = "SELECT Status FROM book_details WHERE Book_Id=?";
            tmt = con.prepareStatement(selectQuery);
            tmt.setString(1, bookId);
            ResultSet rs = tmt.executeQuery();
             String status = "";
            
           if(rs.next()) {
                status=rs.getString("Status");
            } 
           
            if (!status.equals("available")) {
                String updateQuery = "UPDATE books_issued SET return_date=? WHERE Book_Id = ?";
                pstmt = con.prepareStatement(updateQuery);
                pstmt.setString(1, returndate);
                pstmt.setString(2, bookId);
                pstmt.executeUpdate();

                String updateQuery2 = "UPDATE book_details SET Status=? WHERE Book_Id = ?";
                stmt = con.prepareStatement(updateQuery2);
                stmt.setString(1, "available");
                stmt.setString(2, bookId);
                int rowsAffected2 = stmt.executeUpdate();
                if (rowsAffected2 > 0) {
                    JOptionPane.showMessageDialog(null, "Book Number " + bookId + " is Available Now !!!");
                }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Book is Already Available !!!");
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
    
    public void logout() {

        PreparedStatement pstmt = null;
        try {
            con = d1.getConnection();
            String userName = Login.getUsername();
            String updateQuery = "UPDATE librarian_details SET Status = 'active' WHERE username = ?";
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
