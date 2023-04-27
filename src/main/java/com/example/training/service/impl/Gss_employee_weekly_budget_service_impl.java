package com.example.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.dao.Gss_employee_weekly_budget_Dao;
import com.example.training.modal.Gss_employee_weekly_budget_Modal;
import com.example.training.service.Gss_employee_weekly_budget_service;

@Service
public class Gss_employee_weekly_budget_service_impl implements Gss_employee_weekly_budget_service {

	@Autowired
	Gss_employee_weekly_budget_Dao gssDao;

	@Override
	public List<Gss_employee_weekly_budget_Modal> findAllGssEmployeeWeeklyBudget() {
		return gssDao.findAll();
	}

	@Override
	public void addGssEmployeeWeeklyBudget(Gss_employee_weekly_budget_Modal model) {
		gssDao.save(model);
	}

	@Override
	public void deleteEmployeeInWeekly(long lIdEmploy, long lIdWeekly) {
		Gss_employee_weekly_budget_Modal model = gssDao.getGssEmplyById(lIdEmploy, lIdWeekly);
		gssDao.delete(model);
//		gssDao.deleteEmployeeInWeekly(lIdEmploy, lIdWeekly);
	}

	@Override
	public Gss_employee_weekly_budget_Modal getEmployeeInWeeklyById(long lIdEmploy, long lIdWeekly) {
		return gssDao.getGssEmplyById(lIdEmploy, lIdWeekly);
	}

}
