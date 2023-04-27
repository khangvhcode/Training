package com.example.training.service;

import java.util.List;

import com.example.training.modal.Order_element_Modal;

public interface Order_element_service {

	public List<Order_element_Modal> getAllDataOrder();

	public String getNameById(long id);
}
