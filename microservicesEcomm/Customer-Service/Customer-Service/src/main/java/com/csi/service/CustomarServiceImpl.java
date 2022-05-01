package com.csi.service;

import com.csi.dao.CustomarDaoImpl;
import com.csi.model.Customar;
import com.csi.vo.RestempleteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomarServiceImpl {

    @Autowired
    CustomarDaoImpl customarDaoImpl;

    public void saveData(Customar customar) {
        customarDaoImpl.saveData(customar);
    }

    public List<Customar> getAllData() {
      return   customarDaoImpl.getAllData();
    }

    public RestempleteVo getDataById(int custId) {
        return customarDaoImpl.getDataById(custId);
    }

    public void updateDataBYId(Customar customar1) {
        customarDaoImpl.updateDataById(customar1);
    }

    public void deleteDataById(int custId) {
        customarDaoImpl.deleteDataById(custId);

    }

}
