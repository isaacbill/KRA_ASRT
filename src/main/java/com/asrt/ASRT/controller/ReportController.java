package com.asrt.ASRT.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.service.ReportsService;

@RestController
@RequestMapping("/reports")
public class ReportController {
	private ReportsService reportsService;

	public ReportController(ReportsService reportsService) {
		super();
		this.reportsService = reportsService;
	}
	
	 @GetMapping("/reports")
	    public List<WorkOrder> fetchAll() {
	        return reportsService.fetchAll();
	    }
	

}
