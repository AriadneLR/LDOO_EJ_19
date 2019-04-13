package beans;

import database.Db_Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administrador implements Usuarios {

    String usserName;
    String password;
    String correo;
    String fecha_nacimiento;
    int numero_empleado;
    String rol;

    public int getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
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
            
            String sqlString = "INSERT INTO admin (usser_name, pass, correo, fechanacimiento, id_empleado) VALUES ('"+usserName+"','"+password+"','"+correo+"','"+fecha_nacimiento+"','"+numero_empleado+"') ";
            Statement myStatement = myconnection.createStatement();
            
            try{
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myconnection.close();
            } catch (SQLException ex) {Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);}
    }

    @Override
    public void GetUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

