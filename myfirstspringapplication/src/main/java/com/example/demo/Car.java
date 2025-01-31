package com.example.demo;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {
	private int carId;
	private String brandName;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brandName=" + brandName + "]";
	}
	
	public void carRun() {
		System.out.println("Car running now...");
	}
	
	public Car() {
		super();
		System.out.println("Creating Car object");
	}
	
}
