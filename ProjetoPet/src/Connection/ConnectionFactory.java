
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL =  "jdbc:mysql://localhost:3306/dbpet";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection getConnection (){
        try {
            Class.forName (DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException ("Erro na conexão:");
        }
    }
    public static void closeConnection (Connection con){
        if (con != null){
        con.close();
    }
    }
}
