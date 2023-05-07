package com.example.training.modal;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gss_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gss_employee_Modal {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column(name = "code")
	String code;
	@Column(name = "price_cost")
	BigDecimal price_cost;

}
