package Modelo;

public class User {
    String nombre;
    String contra;
    String correo;
    int fecha;
        
    public User(){
    }
    
    public User(String nombre, String contra, String correo, int fecha){
        this.nombre=nombre;
        this.contra=contra;
        this.correo=correo;
        this.fecha=fecha;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setUser(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}
