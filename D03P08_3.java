package com.learning.core.day3session1;


	import java.util.*;

	class Book implements Comparable<Book> {
	    private int bookId;
	    private String title;
	    private double price;
	    private Date dateOfPublication;
	    private String author;

	    public Book(int bookId, String title, double price, Date dateOfPublication, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.price = price;
	        this.dateOfPublication = dateOfPublication;
	        this.author = author;
	    }

	    public int getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public Date getDateOfPublication() {
	        return dateOfPublication;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    @Override
	    public String toString() {
	        return "Book ID: " + bookId + ", Title: " + title + ", Price: " + price +
	               ", Date of Publication: " + dateOfPublication + ", Author: " + author;
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
	        return bookId == book.bookId &&
	                Double.compare(book.price, price) == 0 &&
	                Objects.equals(title, book.title) &&
	                Objects.equals(dateOfPublication, book.dateOfPublication) &&
	                Objects.equals(author, book.author);
	    }

	    @Override
	    public int compareTo(Book other) {
	        return Integer.compare(this.bookId, other.bookId);
	    }
	}

	public class D03P08_3 {
	    public static void main(String[] args) {
	        // Create TreeSet to store book details (sorted by bookId)
	        TreeSet<Book> bookSet = new TreeSet<>();

	        // Add predefined information of 5 book details
	        bookSet.add(new Book(1001, "Python Learning",715.0, new Date(2020, 2, 2), "Matric C. Brown"));
	        bookSet.add(new Book(10002, "Mordern Mainframe", 295.0, new Date(1997, 5, 19), "Sharad"));
	        bookSet.add(new Book(1003, "Java Programming", 523.0, new Date(1984, 11, 23), "Gilad Bracha"));
	        bookSet.add(new Book(1004, "Read C++", 295.0, new Date(1984, 11, 19), "Henry Harvin"));
	        bookSet.add(new Book(1005, ".Net Platform", 3497.0, new Date(1984, 3, 6), "Mark J. Price"));

	        // Print all the book details
	        System.out.println("Book Details:");
	        for (Book book : bookSet) {
	            System.out.println(book);
	        }
	    }
	}


