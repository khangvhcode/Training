/**
 * 
 */
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
import com.example.training.modal.Gss_employee_Modal;
import com.example.training.service.Gss_employee_service;

/**
 * @author Administrator
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping(Constans.Request_API + Constans.Gss_employee_Request)
public class Gss_employee_rest_controller {

	@Autowired
	Gss_employee_service gssService;

	/**
	 * VN_ get all data
	 * 
	 * @return
	 */
	@GetMapping(Constans.Gss_employee_getAllData_Request)
	public List<Gss_employee_Modal> getAllDataList() {
		return gssService.getAllData();
	}

	/**
	 * 
	 * @param payload
	 * @return
	 */
	@PostMapping(Constans.Gss_employee_AddData_Request)
	public ResponseEntity<?> addGssEmployee(@RequestBody Gss_employee_Modal model) {
		Gss_employee_Modal item = gssService.getItemByCode(model.getCode());
		if (!DataChecker.isNull(item) || model.getCode().matches(Constans.REGEX_STRING)) {
			return new ResponseEntity<>(MessagesSource.message_employee_weekly_notice_exists_regex_string,
					HttpStatus.BAD_REQUEST);
		}
		gssService.updateGssEmployee(model);
		return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
	}

	/**
	 * 
	 * @param payload
	 * @return
	 */
	@PostMapping(Constans.Gss_employee_UpdateData_Request)
	public ResponseEntity<?> updateGssEmployee(@RequestBody Gss_employee_Modal model) {
		if (model.getCode().matches(Constans.REGEX_STRING)) {
			return new ResponseEntity<>(MessagesSource.message_regex_string, HttpStatus.BAD_REQUEST);
		}
		Gss_employee_Modal item = gssService.getItemByCode(model.getCode());
		if (DataChecker.isNull(item) || model.getId() == item.getId()) {
			gssService.updateGssEmployee(model);
			return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
		}
		return new ResponseEntity<>(MessagesSource.message_employee_weekly_notice_exists_regex_string,
				HttpStatus.BAD_REQUEST);
	}

	/**
	 * 
	 * @param payload
	 * @return
	 */
	@DeleteMapping(Constans.Gss_employee_deleteData_Request + "/{id}")
	public ResponseEntity<?> deleteGssEmployee(@PathVariable("id") int id) {
		gssService.deleteGssEmployee(id);
		return new ResponseEntity<>(MessagesSource.message_update_success, HttpStatus.OK);
	}
}
