package vlad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vlad.entities.Employee;

import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping(value = "/")
    private String registrationHandler(Model model) {
        model.addAttribute("employee", new Employee());
        return "pseudo_registration";
    }

    @RequestMapping(value = "/success")
    private String successHandler(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            System.out.println("12312213");
            return "pseudo_registration";
        }
        return "success";
    }
}
