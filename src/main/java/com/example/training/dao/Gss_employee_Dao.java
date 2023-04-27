/**
 * 
 */
package com.example.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.training.modal.Gss_employee_Modal;

/**
 * @author Administrator
 *
 */
public interface Gss_employee_Dao extends JpaRepository<Gss_employee_Modal, Long>{

	@Query("Select o from Gss_employee_Modal o where o.code = ?1")
	public Gss_employee_Modal findByCode(String code);
}
