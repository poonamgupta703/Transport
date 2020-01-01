package com.org.transport.pkg.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.transport.pkg.model.DriverDTO;

public interface DriverRepository extends JpaRepository<DriverDTO,Long>{

}
