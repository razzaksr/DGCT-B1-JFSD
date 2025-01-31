package crud.cse.dgct_cse_fsd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebAPI {
    @Autowired
    HospitalRepo repo;
    // http://localhost:8081/
    @GetMapping("/")
    public String showLand(){
        return "index";
    }
    // to show register page
    @GetMapping("/register")
    public String showRegister(Model model){
        Patient patient = new Patient();
        model.addAttribute("newPatient", patient);
        return "register";
    }
    @PostMapping("/new")
    public String regitering(Patient patient){
        //System.out.println("What i have received from page "+patient.getPatientName());
        double tempHeight = patient.getPatientHeight();
        double tempWeight = patient.getPatientWeight();
        tempHeight/=100;// cm to m
        patient.setPatientBmi(tempWeight/(tempHeight*tempHeight));
        repo.save(patient); 
        return "index";
    }
    @GetMapping("/view")
    public String view(Model model){
        List<Patient> temp = repo.findAll();
        model.addAttribute("total", temp);
        return "view";
    }
    @GetMapping("/obese")
    public String obese(Model model){
        List<Patient> temp = repo.findAll().stream().filter(obj->{
            return obj.getPatientBmi()>30.1;
        }).toList();
        model.addAttribute("total", temp);
        return "view";
    }
}
