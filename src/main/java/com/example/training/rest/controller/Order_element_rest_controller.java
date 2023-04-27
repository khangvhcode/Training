package com.example.training.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.training.constans.Constans;
import com.example.training.modal.Order_element_Modal;
import com.example.training.service.Order_element_service;

@CrossOrigin("*")
@RestController
@RequestMapping(Constans.Request_API + Constans.Order_element_Request)
public class Order_element_rest_controller {

	@Autowired
	Order_element_service orderService;

	/**
	 * VN_ get tat ca thong tin tai bang order Emlement
	 * @return
	 */
	@GetMapping(Constans.Order_element_getAllData_Request)
	private List<Order_element_Modal> getAllData() {
		return orderService.getAllDataOrder();
	}
}
