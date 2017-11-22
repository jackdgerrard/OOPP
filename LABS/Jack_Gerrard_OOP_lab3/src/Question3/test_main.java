package Question3;

public class test_main {

	public static void main(String[] args) {
		
		// Create a new lecturer
		
		Lecturer Simon  = new Lecturer("simon", 60609969, 20);
		
		// create new books to add to lectrurers booklist
		
		Book algorithms = new Book("intoduction to algorithms", 9733848, "Thomas H. Cormen, Charles E. Leiserson, Ronald Rivest, Clifford Stein", 53.09);
		Book Computation = new Book("Introduction to the Theory of Computation", 67656456, "Brian Kernighan and Dennis Ritchie", 15.89);
		
		//add books to lecturers booklist
		
		Simon.addBook(algorithms);
		Simon.addBook(Computation);
		
		
		// print
		
		Simon.print();

	}

}
