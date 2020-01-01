package com.org.transport.pkg.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Driver")
public class DriverDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long driverId;
	@NotNull
	private String plant;
	@NotNull
	private String dName;
	@NotNull
	private String dId;
	@NotNull
	private Integer phNo;
	@NotNull
	private String licenceNo;
	@NotNull
	private LocalDate licenceExp;
	@NotNull
	private LocalDate createdDate;
	@NotNull
	private Long vehicleId;
	
	
	public DriverDTO() {
		super();
		}
	public DriverDTO(String plant, String dName, String dId, Integer phNo, String licenceNo, LocalDate licenceExp,
			LocalDate createdDate, Long vehicleId) {
		super();
		this.plant = plant;
		this.dName = dName;
		this.dId = dId;
		this.phNo = phNo;
		this.licenceNo = licenceNo;
		this.licenceExp = licenceExp;
		this.createdDate = createdDate;
		this.vehicleId = vehicleId;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public Integer getPhNo() {
		return phNo;
	}
	public void setPhNo(Integer phNo) {
		this.phNo = phNo;
	}
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public LocalDate getLicenceExp() {
		return licenceExp;
	}
	public void setLicenceExp(LocalDate licenceExp) {
		this.licenceExp = licenceExp;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	
}
