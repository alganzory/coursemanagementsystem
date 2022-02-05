package DBUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private static final String connectionURL ="jdbc:mysql://localhost:3306/coursemanagement";
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String username ="root";
    private static final String password ="";
    private static Connection conn =null;

    
    public static Connection openConnection(){
//    register & load db driver
//            create a connection, pass the connection object to the caller
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(connectionURL, username, password);
        } catch (Exception ex){}
        
        return conn;
    }
    
public static void closeConnection(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}    
//    close the db connection
    
}
