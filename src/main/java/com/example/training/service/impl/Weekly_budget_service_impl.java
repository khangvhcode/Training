/**
 * 
 */
package com.example.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.dao.Weekly_budget_Dao;
import com.example.training.modal.Weekly_budget_Modal;
import com.example.training.service.Weekly_budget_service;

/**
 * @author Administrator
 *
 */

@Service
public class Weekly_budget_service_impl implements Weekly_budget_service {

	@Autowired
	Weekly_budget_Dao weeklyDao;

	/**
	 * VN_ get all data
	 * 
	 * @return
	 */
	public List<Weekly_budget_Modal> getAllData() {
		return weeklyDao.findAll();
	}

	/**
	 * VN_ save and update Weekly Dubget
	 * 
	 * @param model
	 */
	public void updateWeeklyDubget(Weekly_budget_Modal model) {
		weeklyDao.save(model);
	}

	/**
	 * VN_ detele weekly_budget
	 * 
	 * @param model
	 */
	public void deteleWeeklyDubget(int id) {
		weeklyDao.deleteById(id);
	}

	/**
	 * VN_ tim kiem theo theo name
	 */
	@Override
	public Weekly_budget_Modal findByName(String sName) {
		return weeklyDao.findByName(sName);
	}
}
