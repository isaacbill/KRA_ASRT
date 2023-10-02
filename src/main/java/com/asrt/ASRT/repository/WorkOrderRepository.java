package com.asrt.ASRT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.asrt.ASRT.model.WorkOrder;

@Repository
public interface WorkOrderRepository extends JpaRepository<WorkOrder,Integer> {
	// @Query(value = "select * from task s where s.staff_id like %:keyword% or s.work_order_no like %:keyword%", nativeQuery = true)
		 @Query(value = "select * from tasks s where s.sta_id like %:keyword% or s.work_order_no like %:keyword%", nativeQuery = true)
		 List<WorkOrder> findByKeyword(@Param("keyword") String keyword);


}
