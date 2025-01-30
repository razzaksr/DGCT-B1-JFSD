package crud.cse.dgct_cse_fsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAPI {
    // http://localhost:8081/
    @GetMapping("/")
    public String showLand(){
        return "index";
    }    
}
