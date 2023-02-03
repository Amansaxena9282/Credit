package com.training.credit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credit {
    private  int id;
    private String name;
    private  float salary;
    private  long account_No;
    private  int age ;
    private  boolean countryIndia;
}
