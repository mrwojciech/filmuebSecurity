package pl.javastart.filmueb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {



    @ResponseBody
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
