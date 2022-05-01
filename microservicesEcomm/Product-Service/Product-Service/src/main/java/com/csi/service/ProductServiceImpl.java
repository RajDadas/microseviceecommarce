package com.csi.service;


import com.csi.dao.ProductDaoImpl;
import com.csi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductDaoImpl productDaoImpl;

    public void saveData(Product product) {
             productDaoImpl.saveData(product);
    }

    public List<Product> getAllData() {
     return    productDaoImpl.getAllData();
    }

    public Optional<Product> getDataById(int productId) {
     return productDaoImpl.getDataById(productId);
    }

    public void updateDataById(int productId, Product product) {
        productDaoImpl.updateDataById(productId,product);
    }

    public void deleteDataById(int productId) {
        productDaoImpl.deleteDataById(productId);
    }
}
