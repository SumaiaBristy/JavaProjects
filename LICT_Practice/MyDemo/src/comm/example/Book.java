package comm.example;

public class Book {
	
	
	private int bookId;
	private String authorkName;
	private double bookPrice;
	
	
	/*
	public Book(int bookId, String authorkName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.authorkName = authorkName;
		this.bookPrice = bookPrice;
	}*/
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorkName() {
		return authorkName;
	}
	public void setAuthorkName(String authorkName) {
		this.authorkName = authorkName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDetails()
	{
		return "BookId: "+getBookId()+"authorName: "+getAuthorkName()+"Price: "+getBookPrice();
		
	}
	
}