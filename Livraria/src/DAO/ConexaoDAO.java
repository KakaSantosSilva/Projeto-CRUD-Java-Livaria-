
package DAO;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoDAO {
    public Connection ConectaBD(){
        Connection conn = null;
        try {
            String URL ="jdbc:mysql://localhost:3306/jbooker?user=root&password=";
            conn = DriverManager.getConnection(URL);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO "+erro);
        }
        return conn;
    } 
    

}
