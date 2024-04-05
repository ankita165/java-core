package com.learning.core.day3session1;


	import java.util.*;

	class Studybook implements Comparable<Book> {
	    private int bookId;
	    private String title;
	    private double price;
	    private Date dateOfPublication;
	    private String author;

	    public Studybook(int bookId, String title, double price, Date dateOfPublication, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.price = price;
	        this.dateOfPublication = dateOfPublication;
	        this.author = author;
	    }

	    @Override
	    public String toString() {
	        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(bookId, title, price, dateOfPublication, author);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Book book = (Book) obj;
	        return bookId == book.getBookId() &&
	                Double.compare(book.getPrice(), price) == 0 &&
	                Objects.equals(title, book.getTitle()) &&
	                Objects.equals(dateOfPublication, book.getDateOfPublication()) &&
	                Objects.equals(author, book.getAuthor());
	    }
	    

	    @Override
	    public int compareTo(Book other) {
	        return this.author.compareTo(other.getAuthor());
	    }

	}

	public class D03P08_4 {
	    public static void main(String[] args) {
	        // Create TreeSet to store book details (sorted by author name)
	        TreeSet<Book> bookSet = new TreeSet<>();

	        // Add predefined information of 5 book details
	        bookSet.add(new Book(1003, "Java Programming", 523.0, new Date(84, 10, 23), "Gilad Bracha"));
	        bookSet.add(new Book(1004, "Read C++", 295.0, new Date(84, 10, 19), "Henry Harvin"));
	        bookSet.add(new Book(1005, ".Net Platform", 3497.0, new Date(84, 2, 6), "Mark J. Price"));
	        bookSet.add(new Book(1001, "Python Learning", 715.0, new Date(120, 1, 2), "Martic C. Brown"));
	        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, new Date(97, 4, 19), "Sharad"));

	        // Print all the book details sorted by author names in ascending order
	        System.out.println("Book Details:");
	        for (Book book : bookSet) {
	            System.out.println(book);
	        }
	    }
	}


