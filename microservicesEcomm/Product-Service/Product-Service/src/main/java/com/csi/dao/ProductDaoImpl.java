package com.csi.dao;


import com.csi.model.Product;
import com.csi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDaoImpl {

    @Autowired
    ProductRepo productRepo;

    public void saveData(Product product) {
        productRepo.save(product);
    }

    public List<Product> getAllData() {
       return productRepo.findAll();
    }

    public Optional<Product> getDataById(int productId) {
        return productRepo.findById(productId);
    }

    public void updateDataById(int productId, Product product) {
        productRepo.save(product);
    }

    public void deleteDataById(int productId) {
        productRepo.deleteById(productId);
    }
}
