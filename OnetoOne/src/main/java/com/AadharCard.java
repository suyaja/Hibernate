package com;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class AadharCard {
	
	@Id
	
	private long ano;
	private String fname;
	private String dob;
	private String address;
	private int pincode;
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	

}
