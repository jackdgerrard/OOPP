package Question2;

import java.util.ArrayList;

public class Dog {
	////////////////////////////
	// Attributes
	///////////////////////////
	
	
	String name;
	int age;
	String address;
	
	ArrayList<Flea> fleas = new ArrayList<Flea>(20);
	
	///////////////////////////
	// Methods
	//////////////////////////
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dog(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	///////////////////
	//Flea management
	///////////////////
	public void addFlea(String name, int age) {
		if (fleas.size()<20){
			//Creates a new flea in the fleas array list and sets the current Dog object as the new Fleas owner
			fleas.add(new Flea(name, age, this));
		}else {
			System.out.println("This Dog has too many fleas!");
		}
	}
	
}
