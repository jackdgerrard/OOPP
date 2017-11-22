package Question1;

public class DVD {
	//
	// Attributes
	//
	
	public String Title;
	public String Genre;
	public String Artist;
	
	
	
	//
	// Methods
	//

	
	//Getters
	
	 String getTitle() {
		return Title;
	}
	
	
	 String getGenre() {
		return Genre;
	}
	
	
	 String getArtist() {
		return Artist;
		
	}

	// Setters

	void setTitle(String t) {
		this.Title =  t;
	}
	
	 void setGenre(String g) {
		this.Genre = g;
		
	}
	
	 void setArtist(String a) {
		this.Artist = a;
		
	}
	
	//Constructor
	
	public DVD(String t, String g){
		this.Title =  t;
		this.Genre = g;
	}
	
	//other methods
	

	public void print(){
		System.out.println(Title+" is a "+Genre+" film starring "+Artist);
	}
	
	
	
	
	
}
