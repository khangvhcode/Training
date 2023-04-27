package com.example.training.modal;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gss_employee_weekly_budget")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gss_employee_weekly_budget_Modal {

	@EmbeddedId
	private GssEmployeeWeeklyBudgetId id;

	@Column(name = "code")
	private String code;

	@Column(name = "budget")
	private BigDecimal budget;
	
//	@Column(name = "gss_employee_name")
//	private String gss_employee_name;
	
	@Column(name = "order_element_name")
	private String order_element_name;
	
//	@ManyToOne
//	private Gss_employee gssEmployeeId;
}
