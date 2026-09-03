package org.example;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @PostMapping ("hii")
    public String hiiWorld(){
        return "Jii, Namaste";
    }

}
