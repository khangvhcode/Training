/**
 * 
 */
package com.example.training.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.training.constans.Constans;
import com.example.training.constans.MessagesSource;
import com.example.training.modal.Weekly_budget_Modal;
import com.example.training.service.Weekly_budget_service;

/**
 * @author Administrator
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping(Constans.Request_API + Constans.Weekly_budget_Request)
public class Weekly_budget_rest_controller {

	@Autowired
	Weekly_budget_service weeklyService;

	/**
	 * 
	 * @return
	 */
	@GetMapping(Constans.Weekly_budget_getAllData_Request)
	public List<Weekly_budget_Modal> getAllDataList() {
		return weeklyService.getAllData();
	}

	/**
	 * 
	 * @param payload
	 * @return
	 */
	@PostMapping(Constans.Weekly_budget_updateData_Request)
	public ResponseEntity<?> updateWeeklyBudget(@RequestBody Weekly_budget_Modal weekly_budget) {
		Weekly_budget_Modal item = weeklyService.findByName(weekly_budget.getName());
		if (null == item || weekly_budget.getOrder_element_id() == item.getOrder_element_id()) {
			weeklyService.updateWeeklyDubget(weekly_budget);
			return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
		}
		return new ResponseEntity<>(MessagesSource.message_weekly_budget_BAD_REQUEST, HttpStatus.BAD_REQUEST);

	}

}
