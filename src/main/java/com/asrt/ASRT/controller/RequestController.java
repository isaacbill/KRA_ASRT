package com.asrt.ASRT.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.service.WorkOrderService;

@RestController
@RequestMapping("/api/workorders")

public class RequestController {
	 @Autowired
	    private WorkOrderService workRepo;

	    @GetMapping("/search")
	    public ResponseEntity<List<WorkOrder>> searchWorkorders(
	            @RequestParam String newrequest,
	            @RequestParam String closed,
	            @RequestParam String overdue,
	            @RequestParam String pending) {

	    	 List<WorkOrder> results = workRepo.searchWorkorders(newrequest, closed, pending, overdue);
	         return ResponseEntity.ok(results);

	        }
}
