package Question2;

public class Film {
	//
	// Attributes
	//
	
	String name;
	String code;
	
	//
	// Methods
	//

	//Use the initials of the film name to set up the film code within the constructor. 
	// constructor
	Film(String n, String c){
		name = n;
		code = c;
	}
	
	
	// setters and geters
	public void setName(String n){
		name = n;
	}
	public String getName() {
		return name;
	}
			
	
	public String getCode() {
		return code;
	}
	
	
	//other methods
	public String toString() {
		return name + " "+ code;
	}
	
	
	public void print() {
		System.out.println(this);
	}

}
