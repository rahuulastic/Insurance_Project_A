package com.insurance.settlement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.settlement.entity.Settlement;

public interface SettlementRepository extends JpaRepository<Settlement, Long> {

}
