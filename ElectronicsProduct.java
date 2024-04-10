package com.learning.spring.day1session1;


	// Concrete subclass for a specific type of product (e.g., Electronics)
	public class ElectronicsProduct extends Product {
	    // Additional properties specific to Electronics
	    private String brand;

	    // Constructor
	    public ElectronicsProduct(String productId, String productName, double price, String brand) {
	        super(productId, productName, price);
	        this.brand = brand;
	    }

	    // Getter and setter for brand
	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    // Implementation of abstract method to calculate total price
	    @Override
	    public double calculateTotalPrice(int quantity) {
	        return getPrice() * quantity;
	    }
	}



