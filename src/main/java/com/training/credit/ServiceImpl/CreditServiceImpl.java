package com.training.credit.ServiceImpl;

import com.training.credit.model.Credit;
import com.training.credit.service.CreditService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CreditServiceImpl  implements CreditService {
    @Override
    public List<Credit> getall() {
        List<Credit>getall=new ArrayList<>();
        boolean yes = false;
        Credit c1=new Credit(1,"aman",25000,642345678,22,yes);
        Credit c2=new Credit(2,"divya",30000,34567654,21,yes);
        Credit c3=new Credit(3,"ashish",40000,4567887,25,yes);
        Credit c4=new Credit(4,"amanverma",35000,4567890,23,yes);
        Credit c5=new Credit(5,"shivam",45000,9876548,24,yes);
        Credit c6=new Credit(6,"rahul",20000,87654347,25,yes);
        Credit c7=new Credit(7,"anshu",345678, 345789876,35,yes);
        Credit c8=new Credit(8,"amrendra",18000,56789867,30,yes);
        Credit c9=new Credit(9,"ajita",100000,657664657,26,yes);
        Credit c10=new Credit(10,"nikhil",50000,56357357,28,yes);
        getall.add(c1);
        getall.add(c2);
        getall.add(c3);
        getall.add(c4);
        getall.add(c5);
        getall.add(c6);
        getall.add(c7);
        getall.add(c8);
        getall.add(c9);
        getall.add(c10);
        return getall();

    }

    @Override
    public Credit addCredit(Credit credit) {
        return credit;
    }

    @Override
    public Credit updateCredit(Credit credit) {
        return credit;
    }

    @Override
    public String deleteData(int id) {
        return "deleteid:"+id;
    }

    @Override
    public String deleteCredit(int id) {
        return null;
    }
}
