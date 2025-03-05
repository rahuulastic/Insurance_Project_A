package com.insurance.settlement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.insurance.settlement.entity.Settlement;
import com.insurance.settlement.service.SettlementService;

@RestController
@RequestMapping("/settlements")
public class SettlementController {

    @Autowired
    private SettlementService settlementService;

    @PostMapping("/save")
    public Settlement saveSettlement(@RequestBody Settlement settlement) {
        return settlementService.saveSettlement(settlement);
    } 
    
}