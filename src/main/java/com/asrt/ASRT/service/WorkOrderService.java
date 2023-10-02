package com.asrt.ASRT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.repository.WorkOrderRepository;

@Service
public class WorkOrderService {
	@Autowired
	 private WorkOrderRepository workRepo;
	//get all records
	  public List<WorkOrder> getAllWorkOrders(){
	   List<WorkOrder> list =  (List<WorkOrder>)workRepo.findAll();
	   return list;
	  }

	// get record by keyword
		 public List<WorkOrder> getByKeyword(String keyword){
			  return workRepo.findByKeyword(keyword);
			 }
}
