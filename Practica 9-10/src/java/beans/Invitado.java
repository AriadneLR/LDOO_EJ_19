package beans;

import database.Db_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Invitado implements Usuarios {

    String usserName;
    String password;
    String correo;
    String fecha_nacimiento;
    String nombre;
    int fecha_registro;
    String rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(int fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    
    @Override
    public void User() {
        usserName = "";
        password = "";
        correo = "";
        fecha_nacimiento = "";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsserName() {
          return usserName;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsserName(String usserName) {
        this.usserName=usserName;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo=correo;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
        
    }

    @Override
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento=fecha_nacimiento;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RegistroUser() {
       
        
        try{
            
            Db_Connection con = new Db_Connection();
            Connection myconnection = con.getConexion();
            
            String sqlString = "INSERT INTO invitado (usser_name, pass, correo, fechanacimiento, fecha_registro, nombre) VALUES ('"+usserName+"','"+password+"','"+correo+"','"+fecha_nacimiento+"','"+fecha_registro+"','"+nombre+"') ";
            Statement myStatement = myconnection.createStatement();
            
            try{
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myconnection.close();
            } catch (SQLException ex) {Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);}
    }

    public static boolean LoginUsuario(String nombre, String password){
        
        boolean check = false;
        
        try{
            Db_Connection con = new Db_Connection();
            Connection myconnection = con.getConexion();
            
            PreparedStatement psl = myconnection.prepareStatement("select * from invitado where usser_name=? and pass=?");
            psl.setString(1, nombre);
            psl.setString(2, password);
            ResultSet rsl = psl.executeQuery();
            check = rsl.next();
            
            myconnection.close();
            
        }catch(Exception e){e.printStackTrace();}
        return check;
        
    }
    
    @Override
    public void GetUser(){
        try{
            Db_Connection con = new Db_Connection();
            Connection myconnection = con.getConexion();
            
            String sqlString = "SELECT * FROM invitado WHERE nombre = '"+usserName+"'";
            Statement myStatement = myconnection.createStatement();
            ResultSet rs = myStatement.executeQuery(sqlString);
            
            while(rs.next()){
                usserName = rs.getString("nombre");
                password = rs.getString("pass");
                correo = rs.getString("correo");
                fecha_nacimiento = rs.getString("fechanacimiento");
            }
            
            myStatement.close();
            myconnection.close();
            
        } catch (SQLException ex) {Logger.getLogger(Normal.class.getName()).log(Level.SEVERE, null, ex);}
    }

      @Override
    public void setRol(String rol) {
        this.rol = rol;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRol() {
       return rol;
    }
    
}

