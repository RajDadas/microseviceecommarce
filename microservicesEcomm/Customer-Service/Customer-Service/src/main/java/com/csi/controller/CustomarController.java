package com.csi.controller;


import com.csi.exception.RecordNotFoundException;
import com.csi.model.Customar;
import com.csi.repo.CustomarRepository;
import com.csi.service.CustomarServiceImpl;
import com.csi.vo.RestempleteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customars")
public class CustomarController {


    @Autowired
    CustomarServiceImpl customarServiceImpl;
    @Autowired
    CustomarRepository customarRepository;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Customar customar){
        customarServiceImpl.saveData(customar);
        return " Data Saved Sucessfully";
    }

    @GetMapping("/getalldata")
    public List<Customar> getAllData(){
        return customarServiceImpl.getAllData();
    }

    @GetMapping("/getdatabyid/{custId}")
    public RestempleteVo getDataByid(@PathVariable int custId){
        return customarServiceImpl.getDataById(custId);
    }
    @PutMapping("/updatedata/{custId}")
    public String updateDataById(@PathVariable int custId,@RequestBody Customar customar) throws RecordNotFoundException {


        Customar customar1=customarRepository.findById(custId).orElseThrow(()->new RecordNotFoundException("Customar Not Found"));
         customar1.setCustName(customar.getCustName());
         customar1.setCustCode(customar.getCustCode());
         customar1.setCustAddress(customar.getCustAddress());
          customarServiceImpl.updateDataBYId(customar1);
        return " Data Updated Sucessfully";
    }
    @DeleteMapping("/deletedatabyId/{custId}")
    public String deleteDataById(@PathVariable int custId){
        customarServiceImpl.deleteDataById(custId);
        return " Data Deleted Sucssfully";
    }


}
