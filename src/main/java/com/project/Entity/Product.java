package com.project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product")
public class Product 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	@Column(name="P_Name")
	private String pName;
	@Column(name="P_Category")
	private String pCategory;
	@Column(name="P_Quantity")
	private long pQuantity;
	@Column(name="P_Price")
	public long pPrice;

	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	public long getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(long pQuantity) {
		this.pQuantity = pQuantity;
	}
	public  long getpPrice() {
		return pPrice;
	}
	public void setpPrice(long pPrice) {
		this.pPrice = pPrice;
	}
	public Product(long pId, String pName, String pCategory, long pQuantity, long pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCategory = pCategory;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
		
	}
	public Product() {
	
	}
	
	}
	
