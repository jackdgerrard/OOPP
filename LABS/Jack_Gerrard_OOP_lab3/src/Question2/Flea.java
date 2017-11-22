package Question2;

public class Flea {
	//////////////
	//Attributes
	//////////////
	
	String name;
	int age;
	
	//Each Flea only has one dog
	Dog Owner;
	
	///////////////
	//Methods
	//////////////
	
	public Flea(String name, int age,Dog Owner) {
		this.name = name;
		this.age = age;
		this.Owner=Owner;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
