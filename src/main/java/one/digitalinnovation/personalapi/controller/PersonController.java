package one.digitalinnovation.personalapi.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = {"one.digitalinnovation.personalapi"})
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    @GetMapping
    public String getMensagem(){
        return "Hello World";
    }
}
