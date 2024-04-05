package com.learning.fieldcore.day3session1;


	

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

	    public int getAge() {
	        return age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	    }

	    @Override
	    public int compareTo(Person other) {
	        return Integer.compare(this.id, other.id);
	    }
	}

	public class D03P07_9 {
	    public static void main(String[] args) {
	        TreeSet<Person> persons = new TreeSet<>();

	        persons.add(new Person(1, "Alice", 22, 1500.0));
	        persons.add(new Person(2, "Bob", 18, 2500.0));
	        persons.add(new Person(3, "Charlie", 24, 3500.0));
	        persons.add(new Person(4, "David", 20, 1000.0));
	        persons.add(new Person(5, "John", 32, 1999.0));
	        persons.add(new Person(6, "Tom", 42, 3999.0));

	        char startingLetter = 'J';
	        System.out.println("Names starting with" + startingLetter + ":");
	        for (Person person : persons) {
	            if (person.getName().charAt(0) == startingLetter) {
	                System.out.println(person);
	            }
	        }
	    }
	}


