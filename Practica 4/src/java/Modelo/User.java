package Modelo;

public class User {
    String nombre;
    String contra;
    String correo;
    String apellido;
    String nombrec;
    int edad;
        
    public User(){
    }
    
    public User(String nombre, String contra, String correo, String apellido, int edad){
        this.nombre=nombre;
        this.contra=contra;
        this.correo=correo;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
