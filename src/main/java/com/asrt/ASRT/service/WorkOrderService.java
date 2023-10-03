package com.asrt.ASRT.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asrt.ASRT.model.WorkOrder;
import com.asrt.ASRT.repository.WorkOrderRepository;

@Service
public class WorkOrderService {
	@Autowired
	 private WorkOrderRepository workRepo;

    public List<WorkOrder> searchWorkorders(
            String newrequest,
            String closed,
            String pending,
            String overdue) {
        List<WorkOrder> results = new ArrayList<>();

        switch (newrequest.toLowerCase()) {
            case "new":
                results = workRepo.findByNew(newrequest);
                break;
            case "closed":
                results = workRepo.findByClosed(newrequest);
                break;
            case "pending":
                results =workRepo.findByPending(newrequest);
                break;
            case "overdue":
                results = workRepo.findByOverdue(newrequest);
                break;
            default:
                // Handle the case when an invalid keyword is provided
        }

        // Add similar switch statements for keyword3 and keyword4 if needed

        return results;
    }
	
	
}
