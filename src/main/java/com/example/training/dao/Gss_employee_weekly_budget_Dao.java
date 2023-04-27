/*2023/04/21*/
package com.example.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.training.modal.Gss_employee_weekly_budget_Modal;

/**
 * 
 * @author Administrator
 *
 */
public interface Gss_employee_weekly_budget_Dao extends JpaRepository<Gss_employee_weekly_budget_Modal, Integer> {

	/**
	 * VN_ get thông tin có tồn tại nhân viên làm tại dự án hay chưa 
	 * @param lIdEmployee
	 * @param lIdOrder
	 * @return
	 */
	@Query("SELECT o FROM Gss_employee_weekly_budget_Modal o WHERE o.id.gssEmployeeId = ?1 and o.id.orderElementId = ?2")
	public Gss_employee_weekly_budget_Modal getGssEmplyById(long lIdEmployee, long lIdOrder);

	@Query("DELETE FROM Gss_employee_weekly_budget_Modal o WHERE o.id.gssEmployeeId = ?1 and o.id.orderElementId = ?2")
	public void deleteEmployeeInWeekly(long lIdEmployee, long lIdOrder);
}
