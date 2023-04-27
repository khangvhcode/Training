package com.example.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.dao.Order_element_Dao;
import com.example.training.modal.Order_element_Modal;
import com.example.training.service.Order_element_service;

@Service
public class Order_element_service_impl implements Order_element_service {

	@Autowired
	Order_element_Dao orderDao;

	/**
	 * VN_ get all data
	 */
	@Override
	public List<Order_element_Modal> getAllDataOrder() {
		return orderDao.getOrderByParentIsNotNull();
	}

	@Override
	public String getNameById(long id) {
		Order_element_Modal item = orderDao.getItemById(id);
		return item.getName();
	}

}
