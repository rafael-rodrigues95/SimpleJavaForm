package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
     public Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection("jdbc:mysql://localhost/educacional","root","root");
            
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
            
    }
     
     public static void main(String args[]) {
         
     }
}
