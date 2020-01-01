package com.org.transport.pkg.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Fuel_Entry")
public class FuelDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String plant;
	@NotNull
	private String vehicleNo;
	@NotNull
	private int openingKm;
	@NotNull
	private int closingKm;
	@NotNull
	private Float fuelLtr;
	@NotNull
	private int fuelAmmount;
	@NotNull
	private float efficiency;
	@NotNull
	private String make;
	@NotNull
	private String model;
	@NotNull
	private String driver;
	@NotNull
	private LocalDate date;
	
	public FuelDTO() {
		super();
		}

	public FuelDTO(String plant, String vehicleNo, int openingKm, int closingKm, Float fuelLtr, int fuelAmmount,
			float efficiency, String make, String model, String driver, LocalDate date) {
		super();
		this.plant = plant;
		this.vehicleNo = vehicleNo;
		this.openingKm = openingKm;
		this.closingKm = closingKm;
		this.fuelLtr = fuelLtr;
		this.fuelAmmount = fuelAmmount;
		this.efficiency = efficiency;
		this.make = make;
		this.model = model;
		this.driver = driver;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public int getOpeningKm() {
		return openingKm;
	}

	public void setOpeningKm(int openingKm) {
		this.openingKm = openingKm;
	}

	public int getClosingKm() {
		return closingKm;
	}

	public void setClosingKm(int closingKm) {
		this.closingKm = closingKm;
	}

	public Float getFuelLtr() {
		return fuelLtr;
	}

	public void setFuelLtr(Float fuelLtr) {
		this.fuelLtr = fuelLtr;
	}

	public int getFuelAmmount() {
		return fuelAmmount;
	}

	public void setFuelAmmount(int fuelAmmount) {
		this.fuelAmmount = fuelAmmount;
	}

	public float getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(float efficiency) {
		this.efficiency = efficiency;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

	

}
