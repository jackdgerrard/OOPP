package mainpackage;

public class MainClass {

	public static void main(String[] args) {
		
	/**************************
	 * Create lecturer
	 ***************************/
		
	 Lecturer Philip = new Lecturer("Phil", 123454);
	 
	/**************************
	 * Add 15/15 books to lecturer
	***************************/
	 
	 for(int i=0;i<Philip.getMAXNOOFBOOKS()-5;i++) {
		 Philip.addBook(new Book(("Book"+(i+1)), ((777+i)*3),"Generic Author-name", ((i+1)*13.7)));
		 System.out.println(" ");
		 System.out.println("Adding to index "+i+" "+Philip.getBookList().getBook(i).toString());
	 }
	 
	 
	 
		
	 /**************************
	 * Show all Lecturers details
	 ***************************/
	 
	 // show total amount of books in Phil's BookList, thanks to inheritance from objectList
	 	System.out.println(" ");
	  Philip.print();
	  System.out.println(" ");
	  
	/**************************
	 *search Philip's BookList for ISBN and save to  variable named testIndex;
	 ***************************/
	  Philip.getBookList().search(9999); //- Should return 'not found'
	  
	  	
	  	int testIndex = Philip.getBookList().search(2352); // -> should give index 7, saved as testIndex for further use.
	  	//if the function finds a book it echoes the result OR if it doesn't find a book it echoes 'not found'.
	  	
	  
	/**************************
	 *Get the Book found from the previous ISBN 
	 ***************************/
	  	System.out.println("Getting Book:  -> "+Philip.getBookList().getBook(testIndex));
	  	
	/**************************
	 *Remove from the Booklist,  the Book found from the previous ISBN 
	 ***************************/
	  	
	  System.out.println("Removing book: -> "+Philip.getBookList().removeBook(testIndex));
	  
	/**************************
	 *calculate the total cost of Book's in Phil's BookList
	 ***************************/
	  	
	  	System.out.println("Calculating total cost of Books: -> "+Philip.getBookList().calculateYearlyBookPayment());
		
	/**************************
	 * Remove 6 book -> 9/15
	 ***************************/
	  	 System.out.println("TEST: CAN WE REMOVE 1 BOOK?: ANSWER: -> " + Philip.getBookList().remove(0));
	  	 
		 /**************************
	 	 * Show all Lecturers details
	 	 ***************************/
	 	 
	 	 // show total amount of books in Phil's BookList, thanks to inheritance from objectList
	 	 	System.out.println(" ");
	 	  Philip.print();
	 	  System.out.println(" ");
	 
	  	
	  	 System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK1",12345,"TEST AUTHOR",46.50)));
	  	 System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK2",23456,"ANOTHER TEST AUTHOR",32.50)));
	  	 
		 /**************************
	 	 * Show all Lecturers details
	 	 ***************************/
	 	 
	 	 // show total amount of books in Phil's BookList, thanks to inheritance from objectList
	 	 	System.out.println(" ");
	 	  Philip.print();
	 	  System.out.println(" ");

	  	 
	  	 System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK1",88888,"TEST AUTHOR",46.50)));
	  	 System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK2",88889,"ANOTHER TEST AUTHOR",32.50)));
	  	 
		 /**************************
	 	 * Show all Lecturers details
	 	 ***************************/
	 	 
	 	 // show total amount of books in Phil's BookList, thanks to inheritance from objectList
	 	 System.out.println(" ");
	 	 Philip.print();
	 	 System.out.println(" ");
	 	  
	   	 
		  System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK1",54245,"TEST AUTHOR",46.50)));
		  System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK2",6578,"ANOTHER TEST AUTHOR",32.50)));
		  	 
		/**************************
		* Show all Lecturers details
		***************************/
		 	 
		 	 // show total amount of books in Phil's BookList, thanks to inheritance from objectList
		 	 	System.out.println(" ");
		 	  Philip.print();
		 	  System.out.println(" ");


	 
	 
		 
	 	/**************************
	 	 * add 1 more book, FAIL 16/15
	 	***************************/
		
		 	 System.out.println("TEST: CAN WE ADD 1 BOOK? : ANSWER: -> "+ Philip.addBook(new Book("TESTBOOK2",88889,"ANOTHER TEST AUTHOR",32.50)));
		
		
		
		
		
		
		
	}

}
