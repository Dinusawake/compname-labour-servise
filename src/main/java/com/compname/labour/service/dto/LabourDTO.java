package com.compname.labour.service.dto;



public class LabourDTO {

	public LabourDTO(String firstName, String lastName, int mobileNumber, double salary, String currentAddress,
			String permanateAddress, double addharNumber, double bankAccoutNumber, String bloodGroup, String emailId
		) {
		
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
		this.currentAddress = currentAddress;
		this.permanateAddress = permanateAddress;
		this.addharNumber = addharNumber;
		this.bankAccoutNumber = bankAccoutNumber;
		this.bloodGroup = bloodGroup;
		this.emailId = emailId;
	
	}

	public LabourDTO() {

	}

	String firstName;
	String lastName;
	long mobileNumber;
	double salary;
	String currentAddress;
	String permanateAddress;
	double addharNumber;
	double bankAccoutNumber;
	String bloodGroup;
	String emailId;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber (long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getCurrentAddress() {
		return currentAddress;
	}



	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}



	public String getPermanateAddress() {
		return permanateAddress;
	}



	public void setPermanateAddress(String permanateAddress) {
		this.permanateAddress = permanateAddress;
	}



	public double getAddharNumber() {
		return addharNumber;
	}



	public void setAddharNumber(double addharNumber) {
		this.addharNumber = addharNumber;
	}



	public double getBankAccoutNumber() {
		return bankAccoutNumber;
	}



	public void setBankAccoutNumber(double bankAccoutNumber) {
		this.bankAccoutNumber = bankAccoutNumber;
	}



	public String getBloodGroup() {
		return bloodGroup;
	}



	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


}
