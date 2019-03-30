package Vista;


import Modelo.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    public User Hacer(User user){
        String usuario;
        usuario= (user.getNombre());
        user.setUser(usuario);
        
        return user;
        
        
    }
}
