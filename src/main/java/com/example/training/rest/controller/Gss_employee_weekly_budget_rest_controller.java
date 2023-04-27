package com.example.training.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.training.constans.Constans;
import com.example.training.constans.DataChecker;
import com.example.training.constans.MessagesSource;
import com.example.training.modal.Gss_employee_weekly_budget_Modal;
import com.example.training.service.Gss_employee_service;
import com.example.training.service.Gss_employee_weekly_budget_service;
import com.example.training.service.Order_element_service;

@CrossOrigin("*")
@RestController
@RequestMapping(Constans.Request_API + Constans.Gss_employee_weekly_Request)
public class Gss_employee_weekly_budget_rest_controller {

	@Autowired
	Gss_employee_weekly_budget_service gss_weekly_Service;

	@Autowired
	Gss_employee_service employee_service;

	@Autowired
	Order_element_service element_service;

	/**
	 * 
	 * @return
	 */
	@GetMapping(Constans.Gss_employee_weekly_getAllData_Request)
	private List<Gss_employee_weekly_budget_Modal> getAllData() {
		return gss_weekly_Service.findAllGssEmployeeWeeklyBudget();
	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	@PostMapping(Constans.Gss_employee_weekly_update_Request)
	private ResponseEntity<?> updateGssEmployee(@RequestBody Gss_employee_weekly_budget_Modal model) {
		if (DataChecker.isNull(model.getId()) || DataChecker.isNull(model.getId().getGssEmployeeId())
				|| DataChecker.isNull(model.getId().getOrderElementId())) {
			return new ResponseEntity<>(MessagesSource.message_insert_error, HttpStatus.BAD_REQUEST);
		}
		model.setCode(employee_service.getNameById(model.getId().getGssEmployeeId()));
		model.setOrder_element_name(element_service.getNameById(model.getId().getOrderElementId()));
		gss_weekly_Service.addGssEmployeeWeeklyBudget(model);
		return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	@PostMapping(Constans.Gss_employee_weekly_addData_Request)
	private ResponseEntity<?> addGssEmployee(@RequestBody Gss_employee_weekly_budget_Modal model) {
		if (DataChecker.isNull(model.getId()) || DataChecker.isNull(model.getId().getGssEmployeeId())
				|| DataChecker.isZero(model.getId().getGssEmployeeId().intValue())
				|| DataChecker.isNull(model.getId().getOrderElementId())
				|| DataChecker.isZero(model.getId().getOrderElementId().intValue())) {
			return new ResponseEntity<>(MessagesSource.message_insert_error, HttpStatus.BAD_REQUEST);
		}
		Gss_employee_weekly_budget_Modal item = gss_weekly_Service
				.getEmployeeInWeeklyById(model.getId().getGssEmployeeId(), model.getId().getOrderElementId());
		if (!DataChecker.isNull(item)) {
			return new ResponseEntity<>(MessagesSource.message_employee_weekly_notice_exists, HttpStatus.BAD_REQUEST);
		}
		model.setCode(employee_service.getNameById(model.getId().getGssEmployeeId()));
		model.setOrder_element_name(element_service.getNameById(model.getId().getOrderElementId()));
		gss_weekly_Service.addGssEmployeeWeeklyBudget(model);
		return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
	}

	/**
	 * 
	 * @param idEmployee
	 * @param idOrder
	 * @return
	 */
	@DeleteMapping(Constans.Gss_employee_weekly_delete_Request + "/{idEmployee}/{idOrder}")
	private ResponseEntity<?> deleteGssEmployee(@PathVariable("idEmployee") long idEmployee,
			@PathVariable("idOrder") long idOrder) {
		try {
			gss_weekly_Service.deleteEmployeeInWeekly(idEmployee, idOrder);
			return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(MessagesSource.message_delete_error, HttpStatus.BAD_REQUEST);
		}
	}
}
