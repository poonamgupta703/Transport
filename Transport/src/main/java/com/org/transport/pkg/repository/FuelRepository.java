package com.org.transport.pkg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.transport.pkg.model.FuelDTO;

public interface FuelRepository extends JpaRepository<FuelDTO,Long> {
	
	@Query(value ="SELECT d.d_name, v.v_make,v.v_model,d.plant FROM driver d,vehicle v where d.driver_id=v.vehicle_id and v.vehicle_no=?1",nativeQuery = true)
	public List<Object[]> findByVehicleNo(String vehicleNo);
	
	@Query(value ="SELECT * FROM fuel_entry f where vehicle_no=?1",nativeQuery = true)
	public List<FuelDTO> getFuels(String vehicleNo);
	
	
	
}
