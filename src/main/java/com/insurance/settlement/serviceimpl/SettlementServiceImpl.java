package com.insurance.settlement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.settlement.entity.Settlement;
import com.insurance.settlement.repository.SettlementRepository;
import com.insurance.settlement.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService {

    @Autowired
    private SettlementRepository settlementRepository;

    @Override
    public Settlement saveSettlement(Settlement settlement) {
        return settlementRepository.save(settlement);
    }
}