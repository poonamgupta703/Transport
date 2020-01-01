package com.org.transport.pkg.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Vehicle")
public class VehicleDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicleId;
	@NotNull
	private LocalDate manfDate;
	@NotNull
	private String vehicleNo;
	@NotNull
	private String vModel;
	@NotNull
	private String vMake;
	@NotNull
	private String assinplant;	       
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="vehicleId",referencedColumnName="vehicleId")
	private List<DriverDTO> driver;


	public Long getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}


	public LocalDate getManfDate() {
		return manfDate;
	}


	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}


	public String getVehicleNo() {
		return vehicleNo;
	}


	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}


	public String getvModel() {
		return vModel;
	}


	public void setvModel(String vModel) {
		this.vModel = vModel;
	}


	public String getvMake() {
		return vMake;
	}


	public void setvMake(String vMake) {
		this.vMake = vMake;
	}


	public String getAssinplant() {
		return assinplant;
	}


	public void setAssinplant(String assinplant) {
		this.assinplant = assinplant;
	}


	public List<DriverDTO> getDriver() {
		return driver;
	}


	public void setDriver(List<DriverDTO> driver) {
		this.driver = driver;
	}


	public VehicleDTO(LocalDate manfDate, String vehicleNo, String vModel, String vMake, String assinplant) {
		super();
		this.manfDate = manfDate;
		this.vehicleNo = vehicleNo;
		this.vModel = vModel;
		this.vMake = vMake;
		this.assinplant = assinplant;
	}


	public VehicleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
