package com.example.training.service;

import java.util.List;

import com.example.training.modal.Gss_employee_Modal;

public interface Gss_employee_service {

	/**
	 * VN_ get all data
	 * 
	 * @return
	 */
	public List<Gss_employee_Modal> getAllData();

	/**
	 * VN_ save and update model
	 * 
	 * @param model
	 */
	public void updateGssEmployee(Gss_employee_Modal model);

	/**
	 * VN_ delete Gss Employee
	 * 
	 * @param model
	 */
	public void deleteGssEmployee(long id);

	/**
	 * VN_ get thông tin Gss_employee theo code
	 * 
	 * @param code
	 * @return
	 */
	public Gss_employee_Modal getItemByCode(String sCode);

	public String getNameById(long id);

}
