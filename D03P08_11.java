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

	public class D03P08_11 {
	    public static void main(String[] args) {
	        // Create Hashtable to store employee details (using employee id as key)
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

	        // Add predefined information of 4 employee details
	        employeeTable.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
	        employeeTable.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
	        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
	        employeeTable.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));

	        // Add Employee if not exists
	        addEmployeeIfNotExists(employeeTable, 1005, "Charles", "Testing", "QA Lead");

	        // Display all Employees
	        System.out.println("Employee Details:");
	        employeeTable.values().forEach(System.out::println);
	    }

	    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee> employeeTable,
	                                               int id, String name, String department, String designation) {
	        if (!employeeTable.containsKey(id)) {
	            employeeTable.put(id, new Employee(id, name, department, designation));
	        }
	    }
	}


