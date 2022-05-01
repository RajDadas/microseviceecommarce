package com.csi.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Customar {
    @Id
    @GeneratedValue


    private int custId;
    private String custName;
    private long custCode;
    private String custAddress;
    private int productId;
}
