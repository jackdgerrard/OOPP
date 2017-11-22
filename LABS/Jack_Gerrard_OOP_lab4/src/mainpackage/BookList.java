package mainpackage;


/*
	getBook(int) : Book
	search(int): Book //ISBN
	removeBook(int): boolean  //ISBN
	calculateYearlyBookPayment(): double

 */


public class BookList extends ObjectList{
	
	//
	//Methods
	//
	
	
	//constructor: creates one object of a Bookthis.list that contains all the books allocated to one lecturer
	public BookList(final int MAX) {
		super(MAX);
	}
	
	
	//returns 1 book according to index passed in as arg
	public Book getBook(int index) {
		return (Book)this.list[index];
	}
	
	
	//returns 1 integer that is  the index of the ISBN in the bookthis.list array
	public int search(int tempISBN) {
		System.out.println("");
		
		//-5 if no book found, because 0 is a valid index
		int x = -5;
		Book b=null;
		int i;
		
		//check each index of array - 'this.list'
		for(i=0;i<this.numItems-1;i++) {
			
			b  = (Book)this.list[i];
			//System.out.println("Comparing "+tempISBN+" to "+b.getISBN());
			//System.out.println(" ");
			
			if (b.getISBN()==tempISBN){
				System.out.println("!!SEARCHRESULT!!");
				System.out.println("Found "+tempISBN+" at index "+i);
				System.out.println(list[i].toString());
				x=i;	
			}
		}
			
		
		//return index of found ISBN or -5 to break the system
		
		return x;
	}
	
	
	//removes the given ISBN from the bookthis.list and returns whether a book was removed or not
	public boolean removeBook(int tempISBN){
		
		//-5 if no book found, because 0 is a valid index
		boolean x = false;
		Book b=null;
		int i;
		
		//check each index of array - 'this.list'
		for(i=0;i<this.numItems-1;i++) {
			
			b  = (Book)this.list[i];
			//System.out.println("Comparing "+tempISBN+" to "+b.getISBN());
			//System.out.println(" ");
			
			if (b.getISBN()==tempISBN){
				System.out.println("!!SEARCHRESULT!!");
				
				x=this.remove(i);	
			}else {
				x=false;
				};
		}
			
		
		//return index of found ISBN or -5 to break the system
		
		return x;
	}

	
	//counts the total cost of all the books in the Bookthis.list
	public double calculateYearlyBookPayment(){
		double amount = 0;
		
		for(int i = 0;i<this.numItems;i++) {
			amount+=((Book)this.list[i]).getPrice();
		}
			
		return amount;
		
		
	}
	
	
	//need a toString Method to echo the book this.list and not the object reference 
	
	public String toString() {
		//string to hold the values of each book
		String x="";
		
		for (int i = 0; i < this.numItems-1; i++) {
			
			//spaced out for readability
			x.concat(
					((Book)this.list[i]).toString()
					);
		}
		
		return x;
	} 
	


	
}
