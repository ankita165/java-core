
 class Book {
	private String bookTitle;
	private double bookPrice;
	
	public String getBookTitle() {
		return bookTitle;
		
	}
	public void setBookTitle(String title) {
		this.bookTitle = title;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double price) {
		this.bookPrice = price;
	}

}
public class D01P01 {
	public static Book createBook(String title, double price) {
		
		Book book = new Book();
		book.setBookTitle(title);
		book.setBookPrice(price);
		return book;
		
	}
	public static void showBooks(Book book) {
		System.out.println("Book Title:" + book.getBookTitle() + "and price:" + book.getBookPrice());
		
	}
	public static void main(String[] args) {
		
		String title = "java programming";
		double price = 350.00;
		Book book = createBook(title, price);
		showBooks(book);
 }
}
