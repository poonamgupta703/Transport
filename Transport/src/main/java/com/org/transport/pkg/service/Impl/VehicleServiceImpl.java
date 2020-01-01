package com.org.transport.pkg.service.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.transport.pkg.model.DriverDTO;
import com.org.transport.pkg.model.VehicleDTO;
import com.org.transport.pkg.repository.DriverRepository;
import com.org.transport.pkg.repository.VehicleRepository;
import com.org.transport.pkg.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository repository;

	@Autowired
	DriverRepository driverRepository;

	List<VehicleDTO> list = new ArrayList<VehicleDTO>();

	@PostConstruct
	public void save() {
		LocalDate date = LocalDate.now();
		VehicleDTO vehicle = new VehicleDTO(date, "AP02TA564", "Tata", "1210", "Tumkur");
		VehicleDTO vehicle1 = new VehicleDTO(date, "AP02TA673", "Ashok Leyland", "1433", "WhiteField");
		VehicleDTO vehicle2 = new VehicleDTO(date, "AP02TA980", "Eicher", "1433", "JSW");
		VehicleDTO vehicle3 = new VehicleDTO(date, "AP02TA212", "Tata", "1210", "Mysure");
		VehicleDTO vehicle4 = new VehicleDTO(date, "AP02TA341", "Tata", "1433", "Hosur");
		VehicleDTO vehicle5 = new VehicleDTO(date, "AP02TA87", "Ashok Leyland", "1210", "JSW");
		VehicleDTO vehicle6 = new VehicleDTO(date, "AP02TA563", "Eicher", "1210", "Tumkur");

		list.add(vehicle5);
		list.add(vehicle6);
		list.add(vehicle4);
		list.add(vehicle3);
		list.add(vehicle2);
		list.add(vehicle1);
		list.add(vehicle);
		repository.saveAll(list);

	}

	List<DriverDTO> driverList = new ArrayList<DriverDTO>();

	@PostConstruct
	public void saveDriver() {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.now();
		DriverDTO driver = new DriverDTO("WhiteField", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,1l);
		DriverDTO driver1 = new DriverDTO("JSW", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,2l);
		DriverDTO driver2 = new DriverDTO("Mysure", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,2l);
		DriverDTO driver3 = new DriverDTO("Hosur", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,2l);
		DriverDTO driver4 = new DriverDTO("WhiteField", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,5l);
		DriverDTO driver5 = new DriverDTO("Hosure", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,6l);
		DriverDTO driver6 = new DriverDTO("JSW", "Alex", "AX67907878B", 897654322, "KA01GE2688", date1, date2,7l);

		driverList.add(driver6);
		driverList.add(driver5);
		driverList.add(driver4);
		driverList.add(driver3);
		driverList.add(driver2);
		driverList.add(driver1);
		driverList.add(driver);
		driverRepository.saveAll(driverList);
	}

	public List<VehicleDTO> getAllVehicles() {
		return repository.findAll();
	}

	public List<DriverDTO> ListgetAllDrivers() {
		return driverRepository.findAll();
	}

	public DriverDTO createDriver(DriverDTO dto) {
		return driverRepository.save(dto);
	}

	public void deleteDriver(Long modelNo) {
		driverRepository.deleteById(modelNo);
	}

	public VehicleDTO createVehicle(VehicleDTO vehicleDto) {
		return repository.save(vehicleDto);
	}

	public void deleteVehicle(Long id) {
		repository.deleteById(id);
	}

	public VehicleDTO upadteVehicle(VehicleDTO vehicleDto) {
		return repository.save(vehicleDto);
	}
}
