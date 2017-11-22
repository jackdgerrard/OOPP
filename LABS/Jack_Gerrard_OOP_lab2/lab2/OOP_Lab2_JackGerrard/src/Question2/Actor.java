package Question2;

public class Actor {
	
	/* 
	 * Actor
name: String
address: String
age: int
myFilm: Film []  (3)

Actor(String, String, int)
setName(String)
setAddress(String)
setAge(int)
setFilm(Film [])
getName: String
getAddress: String
getAge: int
getFilm: Film []
toString(): String
print()

	 */
	
	//
	// Values
	//
	private int age;
	private String name;
	private String address;
	public Film[] myFilm = new Film[3];
	
	
	//
	// Methods
	//
	
	
	// Constructor
	
	Actor(String n, String ad, int ag) {
		this.name = n;
		this.address = ad;
		this.age = ag;

	}
	
	//getters
	public int getAge(){
		return this.age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public Film getFilms(int w) {
			return this.myFilm[w];	
	}
	
	
	//setters
	
	public void setAge(int ag) {
		this.age = ag;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public void setAddress(String ad) {
		this.address = ad;
	}
	
	public void setFilm(Film[] asdf) {
		this.myFilm = asdf;
	}
	
	
	//Other methods
	
	public String toString() {
		return "Name: "+this.name  +" Address: "+this.address + "Age: "+ this.age +" Films:  "+this.myFilm[0]+" "+this.myFilm[1]+" "+this.myFilm[2];
	}
	
	public void print() {
		System.out.println(toString());
	}
		
	
	
	
	
}
