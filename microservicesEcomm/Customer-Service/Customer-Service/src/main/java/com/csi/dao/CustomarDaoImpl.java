package com.csi.dao;

import com.csi.model.Customar;
import com.csi.repo.CustomarRepository;
import com.csi.vo.Product;
import com.csi.vo.RestempleteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CustomarDaoImpl {

    @Autowired
    CustomarRepository customarRepositoryImpl;
    @Autowired
    RestTemplate restTemplate;

    public void saveData(Customar customar) {
        customarRepositoryImpl.save(customar);
    }

    public List<Customar> getAllData() {
        return customarRepositoryImpl.findAll();
    }

    public RestempleteVo getDataById(int custId) {
        RestempleteVo restempleteVo=new RestempleteVo();
        Customar customar=customarRepositoryImpl.findByCustId(custId);
        Product product=restTemplate.getForObject("http://ProductService/products/"+customar.getProductId(),Product.class);
        restempleteVo.setCustomar(customar);
        restempleteVo.setProduct(product);

        return restempleteVo;
    }

    public void updateDataById(Customar customar) {
        customarRepositoryImpl.save(customar);
    }

    public void deleteDataById(int custId) {
        customarRepositoryImpl.deleteById(custId);
    }

}
