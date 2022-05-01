package com.csi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/customarfallback")
    public  String customarFallBack(){

        return "Customer Service is Down";

    }


    @GetMapping("/productfallback")
    public  String productFallBack(){

        return "product Service is Down";

    }


}
