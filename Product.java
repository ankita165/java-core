package com.learning.spring.day1session1;


	// Abstract Product class
	public abstract class Product {
	    private String productId;
	    private String productName;
	    private double price;

	    // Constructor
	    public Product(String productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    // Getters and setters
	    public String getProductId() {
	        return productId;
	    }

	    public void setProductId(String productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    // Abstract method to calculate the total price
	    public abstract double calculateTotalPrice(int quantity);
	}



