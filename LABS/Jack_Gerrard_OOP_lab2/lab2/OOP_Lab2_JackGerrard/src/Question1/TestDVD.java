package Question1;

public class TestDVD {

	public static void main(String[] args) {
		
		// Create new DVD object called dvd1 using DVD class 
		DVD  dvd1 = new DVD("",""); 
		
		//set the title of dvd1 to "Song Bird" using the setTitle method described in DVD class 
        dvd1.setTitle("Song Bird"); 
        
     // set the genre attribute of dvd1 to "Blues" using the setGenre method described in DVD class 
        dvd1.setGenre("Blues"); 
        
     // set the artist attribute a value of "Eva Cassidy" using the setArtist method described in the DVD class
        dvd1.setArtist("Eva Cassidy");
        
        // use print method for dvd1 defined in DVD class
        dvd1.print(); 
        
        
        
        
      //call the constructor class of DVD to create an object called dvd2 with the attributes described in parens
        DVD dvd2 = new DVD("Johnny B. Goode", "Chuck Berry"); 
        
     // use print method for dvd2 defined in DVD class
        dvd2.print();
        


	}

}
