package Vista;


import Modelo.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    public User Hacer(User user){
        String nombrec;
        nombrec= (user.getNombre()+ user.getApellido());
        user.setNombrec(nombrec);
        
        return user;
    }
}
