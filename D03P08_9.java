package com.learning.core.day3session1;


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
	        return "Employee{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", department='" + department + '\'' +
	                ", designation='" + designation + '\'' +
	                '}';
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

	public class D03P08_9 {
	    public static void main(String[] args) {
	        // Create Hashtable to store employee details (using employee id as key)
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

	        // Add predefined information of 4 employee details
	        employeeTable.put(1, new Employee(1, "John", "Engineering", "Manager"));
	        employeeTable.put(2, new Employee(2, "Alice", "HR", "HR Manager"));
	        employeeTable.put(3, new Employee(3, "Bob", "Finance", "Accountant"));
	        employeeTable.put(4, new Employee(4, "Eva", "Marketing", "Marketing Executive"));

	        // Verify whether the Hashtable is empty or not
	        boolean isEmpty = employeeTable.isEmpty();
	        System.out.println("Is Hashtable empty? " + isEmpty);
	    }
	}

