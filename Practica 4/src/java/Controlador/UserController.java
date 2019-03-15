package Controlador;

import org.springframework.stereotype.Controller;
import Modelo.User;
import Vista.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    
    /**
     *
     * @return
     */
    @RequestMapping (value = "index.htm")
    public String principal(){
    return "index";
    }
    
    @RequestMapping (value="hacer", method=RequestMethod.GET)
    public String hacer(HttpServletRequest request, Model model){
        User user = new User();
        user.setNombre(request.getParameter("nombre"));
        user.setApellido(request.getParameter("apellido"));
        user.setCorreo(request.getParameter("correo"));
        user.setEdad(Integer.parseInt(request.getParameter("edad")));
        
        user=service.Hacer(user);
        
        model.addAttribute("user", user);
        return "index";
    }
}
