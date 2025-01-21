package dgct.cse.crud.foundation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicApi {
    @GetMapping("/begin")
    public String haiThere(){
        return "greetings";
    }
    @PostMapping("/")
    public String getData(Model model, 
    @RequestParam String user, @RequestParam String pass){
        if(user.equalsIgnoreCase("razak")
        &&pass.equalsIgnoreCase("mohamed")){
            model.addAttribute("content",user);
        }
        else{
            return "redirect:/begin";
        }
        return "response";
    }
}
