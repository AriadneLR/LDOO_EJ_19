package Classes;

public class Datos {
    
    private String nombre;
    private int edad;
    private String correo;
    private int fecha;
    
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public void setFecha(int fecha){
        this.fecha=fecha;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public int getFecha(){
        return this.fecha;
    }
}
