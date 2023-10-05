package com.asrt.ASRT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.repository.ReportRepository;

@Service
public class ReportsService {
	
	 private ReportRepository reportRepo;
	 
	 
	 public ReportsService(ReportRepository reportRepo) {
		super();
		this.reportRepo = reportRepo;
	}

	public List<WorkOrder> fetchAll() {
	        return reportRepo.findAll();
	    }
}
