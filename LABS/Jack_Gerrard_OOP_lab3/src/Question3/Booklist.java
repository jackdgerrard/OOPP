package Question3;

import java.util.ArrayList;


public class Booklist {
	private ArrayList<Book> list = new ArrayList<Book>();
	
	
	public Booklist(int mAXNOOFBOOKS) {

	//constructor creates one  list of elements with type book(defined by book class) using an arraylist with max number of books defined in parens

		ArrayList<Book> list = new ArrayList<Book>(mAXNOOFBOOKS);
	}
	
	public void addBook(Book book) {
		list.add(book);
	}
	
	

	
	//
	//Bookreader method to add the books in the list to a  single string and return that to the Lecturer class 
	//
	
	public String bookReader(){
		String Rx = "Books: ";
		
		for(int i = 0; i < list.size(); i++) {
			Rx+=(list.get(i).getTitle()+ ", ");
		}
		
		return Rx;
	}


	
}
