package beans;

import database.Db_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 public interface Usuarios {
    String usserName ="";
    String password = ""; 
    String corre = "";
    String fecha_nacimiento = "";
    String rol = "";
    

    public void User();
    public String getUsserName();
    public void setUsserName(String usserName);
    public String getPassword();
    public void setPassword(String password);
    public String getCorreo();
    public void setCorreo(String correo);
    public String getFecha_nacimiento();
    public void setFecha_nacimiento(String fecha_nacimiento);
    public void setRol(String rol);
    public String getRol();
    public void RegistroUser();
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
    
    public void GetUser();
}
