package com.org.transport.pkg.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.transport.pkg.model.VehicleDTO;

public interface VehicleRepository  extends JpaRepository<VehicleDTO, Long>{
	

}
