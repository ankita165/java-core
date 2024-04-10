package com.learning.spring.day1session1;


public class Disc extends Product {
 
 private String format;
 private int storageCapacity;

 
 public Disc(String productId, String productName, double price, String format, int storageCapacity) {
     super(productId, productName, price);
     this.format = format;
     this.storageCapacity = storageCapacity;
 }

 
 public String getFormat() {
     return format;
 }

 public void setFormat(String format) {
     this.format = format;
 }

 
 public int getStorageCapacity() {
     return storageCapacity;
 }

 public void setStorageCapacity(int storageCapacity) {
     this.storageCapacity = storageCapacity;
 }

 
 @Override
 public double calculateTotalPrice(int quantity) {
     return getPrice() * quantity;
 }
}



