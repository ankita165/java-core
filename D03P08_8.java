package com.learning.core.day3session1;


	import java.util.Objects;
	import java.util.TreeMap;

	class Car implements Comparable<Car> {
	    private String name;
	    private double price;

	    public Car(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return name + " " + price;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, price);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Car car = (Car) obj;
	        return Double.compare(car.price, price) == 0 &&
	                Objects.equals(name, car.name);
	    }

	    @Override
	    public int compareTo(Car other) {
	        return Double.compare(this.price, other.price);
	    }
	}

	public class D03P08_8 {
	    public static void main(String[] args) {
	        // Create TreeMap to store car details (sorted by price)
	        TreeMap<Car, String> carMap = new TreeMap<>();

	        // Add predefined information of 4 car details
	        carMap.put(new Car("Bugatti", 80050.0), "");
	        carMap.put(new Car("Swift", 305000.0), "");
	        carMap.put(new Car("Audi", 600100.0), "");
	        carMap.put(new Car("Benz", 900000.0), "");

	        // Remove and get a key-value mapping associated with the greatest key
	        Car greatestCar = carMap.pollLastEntry().getKey();
	        System.out.println("Removed greatest car: " + greatestCar + " " + carMap.get(greatestCar));

	        // Replace the value mapped by the specified key with the new value
	        double newPrice = 80050.0;
	        Car keyCar = carMap.keySet().stream()
	                                   .filter(car -> car.price == newPrice)
	                                   .findFirst()
	                                   .orElse(null);
	        if (keyCar != null) {
	            carMap.put(keyCar, "Reva");
	            System.out.println("Replaced value: " + keyCar + " " + carMap.get(keyCar));
	        } else {
	            System.out.println("Car with price " + newPrice + " not found.");
	        }
	    }
	}


