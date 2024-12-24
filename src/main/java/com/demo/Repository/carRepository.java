package com.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Entity.car;


public interface carRepository extends JpaRepository<car, Long>{  
	 Optional<car> findByName(String name);
}
