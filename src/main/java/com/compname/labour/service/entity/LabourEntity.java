package com.compname.labour.service.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Labours")
public class LabourEntity {
		
	@Id
	private int id;
	
	@Column(name = "firstname")
	String firstName;
	
	@Column(name = "lastName")
	String lastName;
	
	@Column(name = "mobileNumber")
	long mobileNumber;
	
	@Column(name = "salary")
	double salary;
	
	@Column(name = "currentAddress")
	String currentAddress;
	
	@Column(name = "permanentAddress")
	String permanentAddress;
	
	@Column(name = "addharNumber")
	double addharNumber;
	
	@Column(name = "bankAccoutNumber")
	double bankAccoutNumber;
	
	@Column(name = "bloodGroup")
	String bloodGroup;
	
	@Column(name = "emailId")
	String emailId;
	
	
	public LabourEntity() {
		super();

	}
	public LabourEntity(int id, String firstName, String lastName, long mobileNumber, double salary,
			String currentAddress, String permanateAddress, double addharNumber, double bankAccoutNumber,
			String bloodGroup, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanateAddress;
		this.addharNumber = addharNumber;
		this.bankAccoutNumber = bankAccoutNumber;
		this.bloodGroup = bloodGroup;
		this.emailId = emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void setMobileNumber(long mobileNumber) {
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
		return permanentAddress;
	}
	public void setPermanateAddress(String permanateAddress) {
		this.permanentAddress = permanateAddress;
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
