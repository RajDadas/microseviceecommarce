package com.csi.controller;


import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    ProductServiceImpl productServiceImpl;


    @PostMapping("/")
    public  String saveData(@RequestBody Product product){
        productServiceImpl.saveData(product);
        return " Data Saved Sucessfully";
    }

    @GetMapping("/")
    public List<Product> getAllData(){
        return productServiceImpl.getAllData();
    }
    @GetMapping("/{productId}")
    public Optional<Product> getDataById(@PathVariable int productId){
        return  productServiceImpl.getDataById(productId);
    }

    @PutMapping("/{productId}")
    public String updateDataById(@PathVariable int productId,@RequestBody Product product){

        productServiceImpl.updateDataById(productId,product);
        return " Data Updated Sucessfully";
    }
    @DeleteMapping("/{productId}")
    public String deleteDataById(@PathVariable int productId){
        productServiceImpl.deleteDataById(productId);
        return " Data Deleted sucessfully";
    }
}
