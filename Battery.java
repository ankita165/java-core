package com.learning.spring.day1session1;


public class Battery extends Product {
 
 private String type;
 private double voltage;

 
 public Battery(String productId, String productName, double price, String type, double voltage) {
     super(productId, productName, price);
     this.type = type;
     this.voltage = voltage;
 }

 
 public String getType() {
     return type;
 }

 public void setType(String type) {
     this.type = type;
 }

 
 public double getVoltage() {
     return voltage;
 }

 public void setVoltage(double voltage) {
     this.voltage = voltage;
 }

 
 @Override
 public double calculateTotalPrice(int quantity) {
     return getPrice() * quantity;
 }
}

	


