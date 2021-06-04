package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion(){
    
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database = ProyectoAdan;"
                + "user = Alex;"
                + "password = 123456;"
                + "loginTimeout = 30;";
        
        try{
        
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
            
        } catch (SQLException ex){
        
            System.out.println(ex.toString());
            return null;
        
        }
        
    }
}
