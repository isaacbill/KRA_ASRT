package com.asrt.ASRT.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.asrt.ASRT.model.WorkOrder;

@Repository
public interface WorkOrderRepository extends JpaRepository<WorkOrder,String> {

	@Query("SELECT p FROM WorkOrder p WHERE " +
            "p.sta_id LIKE CONCAT('%',:query, '%')" +
            "Or p.system_name LIKE CONCAT('%', :query, '%')")
    List<WorkOrder> searchWorkOrders(String query);
 @Query(value="SELECT * FROM work_order p WHERE " +
            "p.sta_id LIKE CONCAT('%',:query, '%')" +
            "Or p.system_name LIKE CONCAT('%', :query, '%')",nativeQuery=true)
 
 List<WorkOrder> searchWorkOrdersSQL(String query);

}
