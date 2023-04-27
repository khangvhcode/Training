package com.example.training.modal;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GssEmployeeWeeklyBudgetId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6070398085949393655L;

//	@ManyToOne
	@Column(name = "gss_employee_id")
	private Long gssEmployeeId;

	@Column(name = "order_element_id")
	private Long orderElementId;

}
