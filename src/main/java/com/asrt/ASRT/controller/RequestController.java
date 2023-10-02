package com.asrt.ASRT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.service.WorkOrderService;

@RestController
//@RequestMapping("/api/request/hello")

public class RequestController {
	@Autowired
	private WorkOrderService orderService;

	@GetMapping
	public ResponseEntity <String>sayHello(){
		return ResponseEntity.ok("welcome to request api");
		
	}
	@RequestMapping(path = {"/","/search"})
	public String home(WorkOrder workorder, Model model, String keyword) {
		  if(keyword!=null) {
		   List<WorkOrder> list = orderService.getByKeyword(keyword);
		   model.addAttribute("list", list);
		  }else {
		  List<WorkOrder> list = orderService.getAllWorkOrders();
		  model.addAttribute("list", list);}
		  return "index";
		 }

}
