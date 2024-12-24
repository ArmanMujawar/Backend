package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.Entity.car;
import com.demo.Service.carService;

@RestController
@RequestMapping("/cars")
@CrossOrigin
public class carController {

    @Autowired
    private carService carService;

    // GET: Retrieve all cars
    @GetMapping
    public List<car> getAllCars() {
        return carService.getAllCars();
    }

    // GET: Retrieve a specific car by its ID
    @GetMapping("/{id}")
    public car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    // GET: Retrieve a specific car by its name
    @GetMapping("/name/{name}")
    public car getCarByName(@PathVariable String name) {
        return carService.getCarByName(name);
    }

    // POST: Add a new car
    @PostMapping
    public car addCar(@RequestBody car car) {
        return carService.addCar(car);
    }

    // PUT: Update an existing car by its ID
    @PutMapping("/{id}")
    public car updateCar(@PathVariable Long id, @RequestBody car car) {
        return carService.updateCar(id, car);
    }

    // DELETE: Delete a car by its ID
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
