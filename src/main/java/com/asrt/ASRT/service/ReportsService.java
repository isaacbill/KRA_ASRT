package com.asrt.ASRT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.repository.WorkOrderRepository;

@Service
public class ReportsService {
	
	 private WorkOrderRepository workRepo;
	 
	public ReportsService(WorkOrderRepository workRepo) {
		super();
		this.workRepo = workRepo;
	}

	public List<WorkOrder> fetchAll() {
	        return workRepo.findAll();
	    }
	
    public List<WorkOrder> findReportByCategory(String query) {
        List<WorkOrder> reports = workRepo.findReportByCategorySQL(query);
        return reports;
    }
    public int countResolutionByCategory(String query) {
        List<WorkOrder> reports = workRepo.findReportByCategorySQL(query);
        int count = reports.size();
        return count;
    }
	
}
