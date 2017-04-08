package ihmprototypage.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by QYL on 2017/4/8.
 */
@Controller
public class RechercherController {

    @RequestMapping("/rechercher")
    public String rechercher(){
        return "rechercher";
    }
}
