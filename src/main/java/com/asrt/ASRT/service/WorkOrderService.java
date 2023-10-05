package com.asrt.ASRT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.repository.WorkOrderRepository;


@Service
public class WorkOrderService implements WorkOrderServiceInt{
	
	
	 private WorkOrderRepository workRepo;

	public WorkOrderService(WorkOrderRepository workRepo) {
		this.workRepo = workRepo;
	}
	@Override
    public List<WorkOrder> searchWorkOrders(String query) {
        List<WorkOrder> workorders = workRepo.searchWorkOrdersSQL(query);
        return workorders;
    }
	public int countWorkOrders(String query) {
        List<WorkOrder> workOrders = workRepo.searchWorkOrdersSQL(query);
        int count = workOrders.size();
        return count;
    }
	@Override
    public WorkOrder createWorkOrder(WorkOrder workorder) {
        return workRepo.save(workorder);
    }
}
