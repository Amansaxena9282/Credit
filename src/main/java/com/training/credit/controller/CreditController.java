package com.training.credit.controller;
import com.training.credit.model.Credit;
import com.training.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class CreditController {
    @Autowired
    private CreditService creditService;

    @GetMapping("/getAllCreditData")
    public List<Credit> getall() {
        return creditService.getall();
    }

    @PostMapping("/saveCreditData")
    public Credit saveCredit(@RequestBody Credit credit) {
        return creditService.addCredit(credit);
    }

    @DeleteMapping("/deleteCredit/{id}")
    public String getDelete(@PathVariable int id) {
        return creditService.deleteCredit(id);
    }

    @PutMapping("/updateCredit")
    public Credit updateCredit(@RequestBody Credit credit) {
        return creditService.updateCredit(credit);
    }
}
