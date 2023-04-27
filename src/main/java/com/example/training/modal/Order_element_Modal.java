package com.example.training.modal;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "order_element")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order_element_Modal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "version")
	private Long version;

	@Column(name = "name")
	private String name;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;

	@Column(name = "code")
	private String code;

	@Column(name = "init_date")
	private LocalDateTime initDate;

	@Column(name = "deadline")
	private LocalDateTime deadline;

	@Column(name = "last_advance_meausurement_for_spreading")
	private BigDecimal lastAdvanceMeasurementForSpreading;

	@Column(name = "dirty_last_advance_measurement_for_spreading")
	private Boolean dirtyLastAdvanceMeasurementForSpreading;

	@Column(name = "parent")
	private Long parent;

	@Column(name = "template")
	private Long template;

	@Column(name = "external_code")
	private String externalCode;

	@Column(name = "position_in_container")
	private Integer positionInContainer;
}
