package ihmprototypage.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mxm on 08/04/17.
 */
@Controller
public class CreercompteController {


        @GetMapping("/creeruncompte")
        public String Creer(){
            return "creeruncompte";
        }
}
