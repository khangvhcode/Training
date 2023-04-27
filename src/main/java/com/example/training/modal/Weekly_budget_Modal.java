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
@Table(name = "weekly_budget")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weekly_budget_Modal {

	@Id
	@Column(name = "order_element_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int order_element_id;

	@Column(name = "name")
	String name;

	@Column(name = "budget")
	BigDecimal budget;

	@Column(name = "display")
	short display;

}
