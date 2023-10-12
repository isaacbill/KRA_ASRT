package com.asrt.ASRT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asrt.ASRT.model.Work_Order;

public interface DataRepository extends JpaRepository<Work_Order, String>{

}
