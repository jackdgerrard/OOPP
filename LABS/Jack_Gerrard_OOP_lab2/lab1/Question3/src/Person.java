
public class Person {
	int stars;
	String phone, name;
	
	 public Person(String p, String n, int s) {
		phone  = p;
		name = n;
		stars  = s; 
	}
	
	//setters
	int setStars() {
		this.stars = s;
	}
	String setPhone() {
		this.phone = p;
	}
	String setName() {
		this.name = n; 
	}
	
	
	//getters
	int getStars() {
		return stars;
	}
	
	public String getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	
	

	
	public String jump() {
		return "I jumped";
	}
	
	public String jumpTimes() {
		return "I jumped "+stars+" times";
	}
	
	public String toString() {
		return "my name is " +name;
	}
	
	void print() {
		System.out.println(this.toString());
		System.out.println(this.jump() );
		System.out.println(this.jumpTimes());
	}

}
