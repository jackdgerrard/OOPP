package Question3;

public class Lecturer {
	/////////////
	//Attributes
	/////////////
	
	private String name;
	private int ID;
	
	
	//this is passed into the constructor for
	private final int MAXNOOFBOOKS;
	
	private Booklist books;
	
	////////////////
	//Methods
	/////////////
	
	//constructor
	public Lecturer(String name, int iD,int mAXNOOFBOOKS) {
		this.name = name;
		this.ID = iD;
		this.MAXNOOFBOOKS = mAXNOOFBOOKS;
		
		this.books = new Booklist(MAXNOOFBOOKS);
		
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public Booklist getBooks() {
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
	
	//booklist methods

	public void setBooks(Booklist books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.addBook(book);
	}
	
	//extra methods
	
	
	
	
	public String toString() {
		return "name: "+this.name+" ID:  "+ this.ID + " "+books.bookReader();
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	




}
