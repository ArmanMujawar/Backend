package com.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
public class car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private double priceperhour;
    private String Imageurl;
	@Override
	public String toString() {
		return "car [id=" + id + ", name=" + name + ", brand=" + brand + ", priceperhour=" + priceperhour
				+ ", Imageurl=" + Imageurl + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPriceperhour() {
		return priceperhour;
	}
	public void setPriceperhour(double priceperhour) {
		this.priceperhour = priceperhour;
	}
	public String getImageurl() {
		return Imageurl;
	}
	public void setImageurl(String imageurl) {
		Imageurl = imageurl;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
   
    

}
