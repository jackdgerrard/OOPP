package mainpackage;

public class Lecturer {
	/////////////
	//Attributes
	/////////////
	
	private String name;
	private int ID;
	
	private BookList books;
	
	private static final int MAXNOOFBOOKS = 15;
	

	
	////////////////
	//Methods
	///////////////
	
	//constructor
	public Lecturer(String name, int iD) {
		this.name = name;
		this.ID = iD;
		
		this.books = new BookList(MAXNOOFBOOKS);
	}

	//getters and setters
	
	//get name
	public String getName() {
		return name;
	}
	
	//getID
	public int getID() {
		return ID;
	}

	//getbooklist
	public BookList getBookList() {
		return books;
	}

	public int getMAXNOOFBOOKS() {
		return MAXNOOFBOOKS;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	//BookList methods

	public void setBookList(BookList books) {
		this.books = books;
	}
	
	public boolean addBook(Book book) {
		return(books.add(book));
	}
	
	
	//extra methods
	
	public String toString() {
		return "¦name: "+this.name+"¦ ID:  "+ this.ID + "¦ "+"Book-max: "+getMAXNOOFBOOKS()+ "¦ "+"Books: "+books.getTotal()+books.toString()+" ¦";
	}
	
	
	
	public void print() {
		System.out.println(this.toString());
	}
	




}
