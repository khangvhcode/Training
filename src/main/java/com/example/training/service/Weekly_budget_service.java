/**
 * 
 */
package com.example.training.service;

import java.util.List;

import com.example.training.modal.Weekly_budget_Modal;

/**
 * @author Administrator
 *
 */
public interface Weekly_budget_service {

	/**
	 * VN_ get all data
	 * 
	 * @return
	 */
	public List<Weekly_budget_Modal> getAllData();

	/**
	 * VN_ save and update Weekly Dubget
	 * 
	 * @param model
	 */
	public void updateWeeklyDubget(Weekly_budget_Modal model);

	/**
	 * VN_ detele weekly_budget
	 * 
	 * @param model
	 */
	public void deteleWeeklyDubget(int id);

	public Weekly_budget_Modal findByName(String sName);
}
