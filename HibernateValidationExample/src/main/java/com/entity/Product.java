package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="productinfo1")
public class Product {
	
	@Column(name="pid")
	@Id
	@NotNull(message="id cannot be blank")
	//@GeneratedValue(Strategy=GenerationType:AUTO)
	private int pId;
	@Min(5)
	@Pattern(regexp="[A-Za-z] {1,9}")
	@NotNull(message="Name cannot be null")
	private String pName;
	
	@Max(5)
	@NotNull(message="quantity cannot be blank")
	@Column(name="quality")
	private int quantity;
	@DecimalMax("30.00")
	@Column(name="price")
	private double price;
	@Past
	@Column(name="dob")
	private Date dob;
	@AssertTrue
	private boolean isAvailable;
	public Product()
	{
		
	}
	public Product(int pId, String pName, int quantity, double price, boolean isAvailable, Date dob) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
		this.dob=dob;
		this.isAvailable = isAvailable;
		
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this. dob =  dob;
	}
	

}
