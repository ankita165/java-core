package com.learning.core.day3session1;


	


	import java.util.TreeSet;

	class Person implements Comparable<Person> {
	    int id;
	    String name;
	    int age;
	    double salary;

	    public Person(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }

	    @Override
	    public int compareTo(Person other) {
	        return Integer.compare(this.id, other.id);
	    }
	}

	public class D03P07_7 {
	    public static void main(String[] args) {
	        TreeSet<Person> persons = new TreeSet<>();
	        
	        persons.add(new Person(1, "Alice", 22, 1500.0));
	        persons.add(new Person(2, "Bob", 18, 2500.0));
	        persons.add(new Person(3, "Charlie", 24, 3500.0));
	        persons.add(new Person(4, "David", 20, 1000.0));
	        persons.add(new Person(5, "John", 32, 1999.0));
	        persons.add(new Person(6, "Tom", 42, 3999.0));

	        for (Person person : persons) {
	            System.out.println(person.name);
	        }
	    }
	}

