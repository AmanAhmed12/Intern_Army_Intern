
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Database {
     public Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/quiz_management_system";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
          
            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage(),
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
          
            throw new SQLException("Error connecting to the database", e);
        }

        return connection;
    }
}
