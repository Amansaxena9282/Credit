package com.training.credit.service;
import com.training.credit.model.Credit;

import java.util.List;
public interface CreditService {
    //get   for get the data
    public List<Credit>getall();
    //post  FOR data insertion
    public Credit addCredit(Credit credit);
    //put for data updation
    public  Credit updateCredit(Credit credit);
    //delete for delete data
    public String deleteData(int id);
    public String deleteCredit(int id);
}
