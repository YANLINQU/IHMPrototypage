package ihmprototypage.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by QYL on 2017/4/8.
 */
@Controller
public class PanierController {
    @RequestMapping("/panier")
    public String panier(){
        return "panier";
    }
}
