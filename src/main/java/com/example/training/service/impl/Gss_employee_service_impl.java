package com.example.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.dao.Gss_employee_Dao;
import com.example.training.modal.Gss_employee_Modal;
import com.example.training.service.Gss_employee_service;

/**
 * @author Administrator
 *
 */
@Service
public class Gss_employee_service_impl implements Gss_employee_service {

	@Autowired
	Gss_employee_Dao gssDao;

	/**
	 * VN_ get all data
	 * 
	 * @return
	 */
	public List<Gss_employee_Modal> getAllData() {
		return gssDao.findAll();
	}

	/**
	 * VN_ save and update model
	 * 
	 * @param model
	 */
	public void updateGssEmployee(Gss_employee_Modal model) {
		gssDao.save(model);
	}

	/**
	 * VN_ delete Gss Employee
	 * 
	 * @param model
	 */
	public void deleteGssEmployee(long id) {
		gssDao.deleteById(id);
	}

	/**
	 * VN_ get kiểm tra trùng code
	 */
	@Override
	public Gss_employee_Modal getItemByCode(String code) {
		return gssDao.findByCode(code);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getNameById(long id) {
		Gss_employee_Modal item = gssDao.getById(id);
		return item.getCode();
	}

}
