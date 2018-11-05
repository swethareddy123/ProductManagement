package com.cg.productmgmt.dto;

public class Product {

	//Creating Variables for Required Values and creating 
	//Getters and Setters 
	private String productName;
	private String productCategory;
	private int price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public Product(String productName, String productCategory, int price) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCategory="
				+ productCategory + ", price=" + price + ", getProductName()="
				+ getProductName() + ", getProductCategory()="
				+ getProductCategory() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
