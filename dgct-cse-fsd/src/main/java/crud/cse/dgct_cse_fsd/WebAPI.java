package crud.cse.dgct_cse_fsd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAPI {
    @Autowired // dependency injection
    private PatientRepository patientRepository;
    // http://localhost:8081/
    @GetMapping("/")
    public String showLand(){
        return "index";
    }    
}
