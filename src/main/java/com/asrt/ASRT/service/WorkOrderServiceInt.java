package com.asrt.ASRT.service;

import java.util.List;

import com.asrt.ASRT.model.WorkOrder; 



public interface WorkOrderServiceInt {
	
	List<WorkOrder> searchWorkOrders(String query);
	
	WorkOrder createWorkOrder(WorkOrder workorder);
}
