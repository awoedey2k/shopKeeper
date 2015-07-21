package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Custormer implements Serializable {

	DimDate date_Of_Birth;
	DimDate latest_deposit_Date;
	Collection<Orders> orders;
	private int id;
	private String phoneNumber;
	private String address;
	private String first_Name;
	private String middle_Name;
	private String last_name;
	private String gender;
	private Double current_balance;
	private Double latest_Deposit_amount;

	@ManyToOne(optional=false)
	@JoinColumn(name="Date_Of_Birth", referencedColumnName="DateKay", nullable=false)
	public DimDate getDate_Of_Birth() {
		return this.date_Of_Birth;
	}

	public void setDate_Of_Birth(DimDate date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="Latest_deposit_Date", referencedColumnName="DateKay", nullable=false)
	public DimDate getLatest_deposit_Date() {
		return this.latest_deposit_Date;
	}

	public void setLatest_deposit_Date(DimDate latest_deposit_Date) {
		this.latest_deposit_Date = latest_deposit_Date;
	}

	@OneToMany(mappedBy="custormer")
	public Collection<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(Collection<Orders> orders) {
		this.orders = orders;
	}

	@Id
	@Column(name="id", nullable=false, length=10)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="PhoneNumber")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name="Address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="First_Name")
	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	@Column(name="Middle_Name")
	public String getMiddle_Name() {
		return this.middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	@Column(name="Last_name")
	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Column(name="Gender", length=10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name="Current_balance", scale=4)
	public Double getCurrent_balance() {
		return this.current_balance;
	}

	public void setCurrent_balance(Double current_balance) {
		this.current_balance = current_balance;
	}

	@Column(name="Latest_Deposit_amount", scale=4)
	public Double getLatest_Deposit_amount() {
		return this.latest_Deposit_amount;
	}

	public void setLatest_Deposit_amount(Double latest_Deposit_amount) {
		this.latest_Deposit_amount = latest_Deposit_amount;
	}

}