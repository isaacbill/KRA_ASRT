package com.asrt.ASRT.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.service.WorkOrderService;


@RestController
@RequestMapping("/api/workorders")
public class RequestController {
	
	
	 private WorkOrderService workorderService;

	public RequestController(WorkOrderService workorderService) {
		this.workorderService = workorderService;
	}
	@GetMapping
	public ResponseEntity<String>sayHello(){
		return ResponseEntity.ok("welcome to asrt");
	}
	@GetMapping("/search")
    public ResponseEntity<List<WorkOrder>> searchWorkOrders(@RequestParam("query") String query){
        return ResponseEntity.ok(workorderService.searchWorkOrders(query));
    }

    @PostMapping
    public WorkOrder createWorkOrder(@RequestBody WorkOrder workorder){
        return workorderService.createWorkOrder(workorder);
    }
    	 
}
