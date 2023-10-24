package com.asrt.ASRT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.asrt.ASRT.model.WorkOrder;
public interface OrderBySystemRepository extends JpaRepository<WorkOrder,String>{
	@Query("SELECT w FROM WorkOrder w WHERE w.system_name = :system_name")
	List<WorkOrder> findOrderBySystemName(@Param("system_name") String system_name);
}

