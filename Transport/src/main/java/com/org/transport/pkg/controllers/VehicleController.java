package com.org.transport.pkg.controllers;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.transport.pkg.model.User;
import com.org.transport.pkg.model.DriverDTO;
import com.org.transport.pkg.model.VehicleDTO;
import com.org.transport.pkg.service.Impl.VehicleServiceImpl;

@RestController
@RequestMapping("VehicleController")
@CrossOrigin()
public class VehicleController {

	@Autowired
	VehicleServiceImpl service;

	@RequestMapping(value = "/getVehicles", method = RequestMethod.GET)
	public ResponseEntity<Object> getRecords() {
		List<VehicleDTO> list = service.getAllVehicles();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public User validateLogin() {
		return new User("User successfully authenticated");
	}
	@RequestMapping(value = "/createVehicle", method = RequestMethod.POST)
	public ResponseEntity<Object> createVehicle(@Valid @RequestBody VehicleDTO vehicleDto) {
		service.createVehicle(vehicleDto);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/deleteVehicle/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteVehicle(@PathVariable(value = "id") Long id) {
		service.deleteVehicle(id);
		return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/UpdateVehicle", method = RequestMethod.PUT)
	public ResponseEntity<Object> upadteVehicle(@Valid @RequestBody VehicleDTO driverDto) {
		service.upadteVehicle(driverDto);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/getDrivers", method = RequestMethod.GET)
	public ResponseEntity<Object> getllDrivers() {
		List<DriverDTO> list = service.ListgetAllDrivers();
		return new ResponseEntity<>(list, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/createDriver", method = RequestMethod.POST)
	public ResponseEntity<Object> createDriver(@Valid @RequestBody DriverDTO dto) {
		service.createDriver(dto);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/deleteDriver/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteDriver(@PathVariable(value = "id") Long id) {
		service.deleteDriver(id);
		return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/UpdateDriver", method = RequestMethod.PUT)
	public ResponseEntity<Object> upadteDriver(@Valid @RequestBody DriverDTO driverDto) {
		service.createDriver(driverDto);
		return new ResponseEntity<>("Product is updated successfully", HttpStatus.CREATED);
	}
}
