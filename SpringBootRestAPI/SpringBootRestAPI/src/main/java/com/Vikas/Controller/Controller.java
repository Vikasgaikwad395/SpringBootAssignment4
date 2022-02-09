package com.Vikas.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    
    @GetMapping("/hello")
    public String helloGet(){
        return "hello from GET";
    }

     
    @PutMapping("/hello")
    public String helloPut(){
        return "hello from PUT";
    }

     
    @DeleteMapping("/hello")
    public String helloDelete(){
        return "hello from DELETE";
    }

     
    @PostMapping("/hello")
    public String helloPost(){
        return "hello from POST";
    }

     
    @PatchMapping("/hello")
    public String helloPatch(){
        return "hello from PATCH";
    }

     
   
}
