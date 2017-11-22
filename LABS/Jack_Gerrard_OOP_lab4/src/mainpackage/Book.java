package mainpackage;

public class Book {
	////////////
	//Attributes
	////////////
	
	String title;
	int ISBN;
	String author; 
	double price;

	
	///////////
	//Methods
	///////////
	
	public Book(String title, int iSBN, String author, double price) {
		this.title = title;
		ISBN = iSBN;
		this.author = author;
		this.price = price;
	}

	//Getters
	public String getTitle() {
		return title;
	}


	public int getISBN() {
		return ISBN;
	}


	public String getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}

	//Setters
	public void setTitle(String title) {
		this.title = title;
	}


	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Book [title=" + title + ", ISBN=" + ISBN + ", author=" + author + ", price=" + price + "]";
	} 
	
	
	
	


}
