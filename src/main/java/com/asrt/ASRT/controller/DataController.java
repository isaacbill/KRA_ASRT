package com.asrt.ASRT.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asrt.ASRT.model.Work_Order;
import com.asrt.ASRT.service.DataService;

@RestController
public class DataController {
	 private final DataService dataService;


	    public DataController(DataService dataService) {
	        this.dataService = dataService;
	    }

	    @GetMapping("/reports")
	    public List<Work_Order> fetchAll() {
	        return dataService.fetchAll();
	    }
	    @GetMapping("/count-choices/open")
	    public Long countOpenChoices() {
	        return dataService.countOpenChoices();
	    }

	    @GetMapping("/count-choices/closed")
	    public Long countClosedChoices() {
	        return dataService.countClosedChoices();
	    }

	    @GetMapping("/count-choices/pending")
	    public Long countPendingChoices() {
	        return dataService.countPendingChoices();
	    }

	    @GetMapping("/count-choices/new")
	    public Long countNewChoices() {
	        return dataService.countNewChoices();
	    }

}
