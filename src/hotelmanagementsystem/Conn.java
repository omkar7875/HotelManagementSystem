
package hotelmanagementsystem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
    
     try{
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///projecthms?autoReconnect=true&useSSL=false","root","root");
        s = c.createStatement();
        
        
     }catch(Exception e){
            e.printStackTrace();
            }
        
    }
    
}
