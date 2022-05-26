package inventory.management.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BankConnection {
    Connection con = null;
    
    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/db_inventory_management";
    private final String user = "root";
    private final String password = "";

    public Connection getConnection(){
       try{
        Class.forName(driver);
        con = DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException drive)
        {
            JOptionPane.showMessageDialog(null, "Driver não encontrado " +drive);
        }
        catch(SQLException fonte)
        {
            JOptionPane.showMessageDialog(null, "Banco de dados não encontrado " + fonte);
        }
        return con;  
    }
    
}
