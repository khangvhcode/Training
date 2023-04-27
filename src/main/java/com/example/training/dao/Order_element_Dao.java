package com.example.training.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.training.modal.Order_element_Modal;

public interface Order_element_Dao extends JpaRepository<Order_element_Modal, Long>{

	@Query("SELECT o FROM Order_element_Modal o WHERE o.parent IS NULL")
	public List<Order_element_Modal> getOrderByParentIsNotNull();
	
	@Query("SELECT o FROM Order_element_Modal o WHERE o.id = ?1")
	public Order_element_Modal getItemById(Long lId);
}
