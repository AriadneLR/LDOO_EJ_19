package beans;

import java.sql.Connection;
import java.sql.SQLException;
import database.Db_Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class User {
    
    private String nombre, password, correo, fecha_nacimiento;

    public User(){
        nombre = "";
        password = "";
        correo = "";
        fecha_nacimiento = "";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void RegistroUser(){
        
        try{
            
            Db_Connection con = new Db_Connection();
            Connection myconnection = con.getConexion();
            
            String sqlString = "INSERT INTO login.usuarios (nombre, pass, correo, fechanacimiento) VALUES ('"+nombre+"','"+password+"','"+correo+"','"+fecha_nacimiento+"') ";
            Statement myStatement = myconnection.createStatement();
            
            try{
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myconnection.close();
            } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public static boolean LoginUsuario(String nombre, String password){
        
        boolean check = false;
        
        try{
            Db_Connection con = new Db_Connection();
            Connection myconnection = con.getConexion();
            
            PreparedStatement psl = myconnection.prepareStatement("select * from login.usuarios where nombre=? and pass=?");
            psl.setString(1, nombre);
            psl.setString(2, password);
            ResultSet rsl = psl.executeQuery();
            check = rsl.next();
            
            myconnection.close();
            
        }catch(Exception e){e.printStackTrace();}
        return check;
    }
    
    public void GetUser(){
        try{
            Db_Connection con = new Db_Connection();
            Connection myconnection = con.getConexion();
            
            String sqlString = "SELECT * FROM login.usuarios WHERE nombre = '"+nombre+"'";
            Statement myStatement = myconnection.createStatement();
            ResultSet rs = myStatement.executeQuery(sqlString);
            
            while(rs.next()){
                nombre = rs.getString("nombre");
                password = rs.getString("pass");
                correo = rs.getString("correo");
                fecha_nacimiento = rs.getString("fechanacimiento");
            }
            
            myStatement.close();
            myconnection.close();
            
        } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
   // public static void main(String args[]){
   //     User user = new User();
   //     System.out.println(User.LoginUsuario("Ari","gato"));
   // }
}
