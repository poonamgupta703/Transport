package com.org.transport.pkg.service.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.transport.pkg.model.FuelDTO;
import com.org.transport.pkg.repository.FuelRepository;
import com.org.transport.pkg.service.FuelService;

@Service
public class FuelServiceImpl implements FuelService{
	
	@Autowired
	FuelRepository fuelRepository;
	List<FuelDTO> list=new ArrayList<FuelDTO>();
	@PostConstruct
	public void saveFuel() {
		LocalDate date=LocalDate.now();
		FuelDTO fuel=new FuelDTO("poonam","xyz",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		FuelDTO fuel1=new FuelDTO("poonam","pqr",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		FuelDTO fuel6=new FuelDTO("poonam","cvn",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		FuelDTO fuel2=new FuelDTO("poonam","mdb",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		FuelDTO fuel3=new FuelDTO("poonam","csi",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		FuelDTO fuel4=new FuelDTO("poonam","mcr",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		FuelDTO fuel5=new FuelDTO("poonam","pwd",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		list.add(fuel5);
		list.add(fuel4);
		list.add(fuel3);
		list.add(fuel);
		list.add(fuel6);
		list.add(fuel2);
		list.add(fuel1);
		fuelRepository.saveAll(list);
		
	}
	
		
	public int saveFuel(FuelDTO fuelDto)
	{
		FuelDTO fueDtoNew=new FuelDTO();
		fueDtoNew= fuelRepository.save(fuelDto);
		int result=0;
		if(fueDtoNew!=null) {
			result=1;
		}
		return result;
	}
	public List<FuelDTO> getFuel() 
	{
		return fuelRepository.findAll();
	}
	public List<FuelDTO> getFuelByVehicleNo(String vehicleNo) {
		List<FuelDTO> fuels=new ArrayList<FuelDTO>();
		FuelDTO dto=new FuelDTO();
		List<Object[]> objects= fuelRepository.findByVehicleNo(vehicleNo);
		for(Object[] object:objects)
		{
			if(object[0]!=null)
			{
				dto.setVehicleNo(vehicleNo);
				dto.setDriver(object[0].toString());
				dto.setMake(object[1].toString());
				dto.setModel(object[2].toString());
				dto.setPlant(object[3].toString());
				fuels.add(dto);
			}
		}
		return fuels;
		
	}
	public List<FuelDTO> getFuels(String vehicleNo) {
		List<FuelDTO> fuels=new ArrayList<FuelDTO>();
		FuelDTO dto=new FuelDTO();
		List<FuelDTO> objects= fuelRepository.getFuels(vehicleNo);
		/*
		 * for(Object[] object:objects) { if(object[0]!=null) {
		 * dto.setId(Long.parseLong(String.valueOf(object[0])));
		 * dto.setClosingKm(Integer.parseInt(object[1].toString()));
		 * dto.setDriver(object[2].toString()); dto.setMake(object[5].toString());
		 * dto.setModel(object[6].toString()); dto.setPlant(object[8].toString());
		 * dto.setVehicleNo(object[9].toString());
		 * dto.setEfficiency(Float.valueOf(object[3]));
		 * dto.setFuelAmmount(Integer.parseInt(String.valueOf(object[4])));
		 * dto.setFuelLtr(Float.parseFloat(object[4].toString()));
		 * dto.setOpeningKm(Integer.parseInt(object[7].toString())); fuels.add(dto); } }
		 */	return objects;
		
	}
}
