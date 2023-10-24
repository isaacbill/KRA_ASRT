package com.asrt.ASRT.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	 
	 @GetMapping("/search")
	    public ResponseEntity<List<WorkOrder>> searchWorkOrders(@RequestParam("query") String query){
	        return ResponseEntity.ok(reportsService.findReportByCategory(query));
	    }
		 @GetMapping("/count")
		    public ResponseEntity<Integer> countWorkOrders(@RequestParam("query") String query) {
		        int count = reportsService.countResolutionByCategory(query);
		        return new ResponseEntity<>(count, HttpStatus.OK);
		    }
	

}
