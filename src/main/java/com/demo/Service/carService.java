package com.demo.Service;


import java.util.List;
import java.util.Optional;



import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.Entity.car;
import com.demo.Repository.carRepository;

@Service
public class carService {
	
	@Autowired
	private carRepository repository;
	
	public List<car> getAllCars(){
		return repository.findAll();   // for retrive
	}
	
	public car getCarById(Long id) {
		Optional<car> car = repository.findById(id);
		return car.orElse(null);
		
	}
	
	public car getCarByName(String name) {
		Optional<car> car = repository.findByName(name);
		return car.orElse(null);
		
	}
	
	
	public car addCar(car car) {
		return repository.save(car);
	}
	
	
	
	 public car updateCar(Long id, car car) {
	        if (repository.existsById(id)) {
	            car.setId(id); 
	            return repository.save(car); 
	        }
	        return null; 
	    }

	public void deleteCar(Long id) {
		repository.deleteById(id);
	}
	
}
