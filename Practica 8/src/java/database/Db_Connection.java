package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connection {
    private String USERNAME = "root";
    private String PASSWORD = "root";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "login";
    private String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection con;
    
    public Db_Connection(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);                    
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("ERROR "+e);
        } 
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public static void main(String[] args){
        Db_Connection con = new Db_Connection();
    }
}

