/**
 * 
 */
package com.example.training.service;

import java.util.List;

import com.example.training.modal.Gss_employee_weekly_budget_Modal;

/**
 * @author Administrator
 *
 */
public interface Gss_employee_weekly_budget_service {

	/**
	 * VN_ get all data
	 * 
	 * @return
	 */
	public List<Gss_employee_weekly_budget_Modal> findAllGssEmployeeWeeklyBudget();

	/**
	 * VN_ add and update nhân viên tại dự án
	 * 
	 * @param model
	 */
	public void addGssEmployeeWeeklyBudget(Gss_employee_weekly_budget_Modal model);

	/**
	 * VN_ xoa nhan vien tai du an
	 * 
	 * @param lIdEmploy
	 * @param lIdWeekly
	 */
	public void deleteEmployeeInWeekly(long lIdEmploy, long lIdWeekly);

	/**
	 * VN_ get nhan vien tai du an
	 * 
	 * @param lIdEmploy
	 * @param lIdWeekly
	 * @return
	 */
	public Gss_employee_weekly_budget_Modal getEmployeeInWeeklyById(long lIdEmploy, long lIdWeekly);
}
