package Controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Consultas extends Conexion{
    
    public boolean autenticacion(String usuario, String contra){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from usuarios where nombre = ? and pass = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contra);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e){
            System.err.println("Error " + e);
        }finally{
            try{
             if(getConexion() != null) getConexion().close();
             if (pst != null) pst.close();
             if(rs != null) rs.close();
            }catch (Exception e){
                System.err.println("Error " + e);
            }
        }
        
        
        return false;
    } 
 
    public boolean registrar(String nombre, String pass, String correo, String fechanacimiento){
        
        PreparedStatement pst = null;
        try{
            
            String consulta = "insert into usuarios (nombre, pass, correo, fechanacimiento) values(?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, pass);
            pst.setString(3, correo);
            pst.setString(4, fechanacimiento);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
            
        }catch(Exception ex){
            
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch (Exception e){
                System.err.println("Error " + e);
            }
        }
        
        return false;
    }
    
}
