package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Im in the contoller");
        return "hello";
    }
}
