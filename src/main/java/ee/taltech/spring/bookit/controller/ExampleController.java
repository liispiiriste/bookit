package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.User;
import ee.taltech.spring.bookit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("users") //Esimene API tase - ressurss
public class ExampleController {
    //Saab andmed, mida töötlesime. Võtab servisest. Saadab kõik andmed ui-sse edasi.
    @Resource
    UserService service;

    @GetMapping(value = "/{id}") // model on timeleaf asi.
    public String hello(Model model, @PathVariable Long id) {
        User user = service.getUserById(id);
        model.addAttribute(user); //seda mudelit näidatakse html lehel
        return "index";
    }

    @GetMapping(value = "api/{id}")
    @ResponseBody
    public User joukijou(@PathVariable Long id) {
        return service.getUserById(id);
    }
}
