package com.example.apidoc.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")

public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello Dear";
    }
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }
}
