package com.asrt.ASRT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asrt.ASRT.model.WorkOrder;

public interface ReportRepository extends JpaRepository<WorkOrder,Integer> {
	

}
