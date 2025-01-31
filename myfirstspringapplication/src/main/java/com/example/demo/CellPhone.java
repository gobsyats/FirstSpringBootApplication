package com.example.demo;

import org.springframework.stereotype.Component;

@Component("myPhone")
public class CellPhone {
	private int mobileId;
	private int number;
	private String brandName;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "CellPhone [mobileId=" + mobileId + ", number=" + number + ", brandName=" + brandName + "]";
	}
	public CellPhone() {
		super();
		System.out.println("Created Cell Phone Object");
	}
	
	public void callSomeone() {
		System.out.println("Calling someone now...");
	}
	
}
