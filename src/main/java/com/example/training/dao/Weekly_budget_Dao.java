/**
 * 
 */
package com.example.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.training.modal.Weekly_budget_Modal;

/**
 * @author Administrator
 *
 */
public interface Weekly_budget_Dao extends JpaRepository<Weekly_budget_Modal, Integer>{

	@Query("select o from Weekly_budget_Modal o where o.name = ?1")
	public Weekly_budget_Modal findByName(String name);
}
