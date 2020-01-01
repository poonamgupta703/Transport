package com.org.transport.pkg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.transport.pkg.model.FuelDTO;
import com.org.transport.pkg.service.Impl.FuelServiceImpl;

@RestController
@RequestMapping("fuelController")
@CrossOrigin()
public class FuelController {

	@Autowired
	FuelServiceImpl fuelServiceImpl;

	@PostMapping(value = "/createFuel")
	public int saveFuel(@Valid @RequestBody FuelDTO fuelDto) {
		int result = 0;
		result = fuelServiceImpl.saveFuel(fuelDto);
		if (result == 0) {
			throw new RuntimeException();
		}
		return result;
	}

	@GetMapping(value = "/getFuels")
	public List<FuelDTO> getFuel() {
		return fuelServiceImpl.getFuel();
	}

	@GetMapping(value = "/getFuelByVehicleNo/{vehileNo}")
	public List<FuelDTO> getFuelByVehicleNo(@PathVariable String vehileNo) {
		
		return fuelServiceImpl.getFuelByVehicleNo(vehileNo);
	}
	@GetMapping(value = "/getFuels/{vehileNo}")
	public List<FuelDTO> getVehicleFuels(@PathVariable String vehileNo) {
		
		return fuelServiceImpl.getFuels(vehileNo);
	}
}
