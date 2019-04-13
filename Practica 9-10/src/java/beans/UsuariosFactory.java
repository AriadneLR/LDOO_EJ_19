package beans;

public class UsuariosFactory {
    public Usuarios getUsuario(String tipoUsuario){
      if(tipoUsuario == null){
         return null;
      }		
      if(tipoUsuario.equals("Administrador")){
         return new Administrador();
         
      } else if(tipoUsuario.equals("Normal")){
         return new Normal();
         
      } else if(tipoUsuario.equals("Invitado")){
         return new Invitado();
      }
      
      return null;
   }
}

