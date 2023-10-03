package com.asrt.ASRT.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asrt.ASRT.model.WorkOrder;

@Repository
public interface WorkOrderRepository extends JpaRepository<WorkOrder,String> {

	List<WorkOrder> findAll();
	List<WorkOrder> findByNew(String sta_id);
    List<WorkOrder> findByClosed(String sta_id);
    List<WorkOrder> findByPending(String sta_id);
    List<WorkOrder> findByOverdue(String sta_id);
}
