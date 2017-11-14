package com.org;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="employee_details")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name",length=250,nullable=false)
	private String name;
	@Column(name="emp_emailid",length=250,nullable=false,unique=true)
	private String emailId;
	@Column(name="emp_phno",length=11,nullable=false,unique=true)
	private long phone;
	@Column(name="bs")
	private float basicSalary;
	@Column(name="da")
	private float dearnessAllowance;
	@Column(name="hra")
	private float houseRentAllowance;
	@Column(name="ta")
	private float travelAllowance;
	@Column(name="pf")
	private float providFund;
	@Transient
	private long netSalary;
	public Employee() {
	}
	/*float basicSalary, float dearnessAllowance,
	float houseRentAllowance, float travelAllowance, float providFund*/
	public Employee( String name, String emailId, long phone) {
		super();
		//this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		/*this.basicSalary = basicSalary;
		this.dearnessAllowance = dearnessAllowance;
		this.houseRentAllowance = houseRentAllowance;
		this.travelAllowance = travelAllowance;
		this.providFund = providFund;*/
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getProvidFund() {
		return providFund;
	}

	public void setProvidFund(float providFund) {
		this.providFund = providFund;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setId(int id) {
		this.id = id;
	}
}
