package com.learning.coregame.day3session1;


	import java.util.Hashtable;
	import java.util.Objects;

	class Employee {
	    private int id;
	    private String name;
	    private String department;
	    private String designation;

	    public Employee(int id, String name, String department, String designation) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.designation = designation;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + department + " " + designation;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Employee employee = (Employee) obj;
	        return id == employee.id;
	    }
	}

	public class D03P08_10 {
	    public static void main(String[] args) {
	        // Create Hashtable to store employee details (using employee id as key)
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

	        // Add predefined information of 4 employee details
	        employeeTable.put(1001, new Employee(1001, "John", "Engineering", "Manager"));
	        employeeTable.put(1002, new Employee(1002, "Alice", "HR", "HR Manager"));
	        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
	        employeeTable.put(1004, new Employee(1004, "Eva", "Marketing", "Marketing Executive"));

	        // Search for a specific Employee
	        int searchId = 1003;
	        Employee employee = employeeTable.get(searchId);
	        if (employee != null) {
	            System.out.println("Employee found: " + employee);
	        } else {
	            System.out.println("Employee with id " + searchId + " not found.");
	        }
	    }
	}


