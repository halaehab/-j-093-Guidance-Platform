/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.*;
import javax.swing.JOptionPane;
public class connection {

    private static final String URL = "jdbc:mysql://localhost:3306/hajj?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    public static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static ResultSet setQuery(String sql) {
        try {
            return resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return resultSet;
    }
    private boolean connectedToDatabase = false;

    public connection() {
        if (!connectedToDatabase) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = connection.createStatement();
                connectedToDatabase = true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
    }

    /*public ResultSet setQuery(String sql) {
        try {
            return resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Query Faild!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return resultSet;
    }
*/

    public void closeConnection() {
        try {
            if (connectedToDatabase) {
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Disconnection Faild!", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            connectedToDatabase=false;
        }

    }

}
