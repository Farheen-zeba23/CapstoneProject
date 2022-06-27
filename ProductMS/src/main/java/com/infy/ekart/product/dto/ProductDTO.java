package com.infy.ekart.product.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Pattern;

public class ProductDTO {
	
	private Integer productId;
	@Pattern(regexp = "[A-Za-z0-9\\.\\s-]+",message ="{product.invalid.name}")
	private String name;
	@Pattern(regexp = "[A-Za-z]{10,}",message="{product.invalid.description}")
	@NotBlank(message= "{product.invalid.description}")
	private String description;
	private String category;
	@Pattern(regexp ="[A-Za-z]{3,}",message="{product.invalid.brand}")
	@NotBlank(message ="{product.invalid.brand}")
	private String brand;
	@Min(value=1,message="{product.invalid.price}")
	
	private Double price;
	@Min(value =1,message="{product.invalid.quantity}")
	private Integer availableQuantity;
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	

}
