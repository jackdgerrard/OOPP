package Project;

public class Phone extends Product {
	
	/************
	 * Attributes
	 **************/
	
	private String make, model, storageSpaceGB;
	private int storageSpace;

	
	
	/************
	 * Constructor
	 **************/
	
	public Phone(String name, double price, String description, String make, String model,int storageSpace) {
		super(name, price, description);
		this.make = make;
		this.model = model;
		this.storageSpace = storageSpace;
		
		this.storageSpaceGB = storageSpace+"GB";
	}
	
	/************
	 * Getter/Setter methods
	 **************/


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getStorageSpaceGB() {
		return storageSpaceGB;
	}


	public void setStorageSpaceDB(String storageSpaceDB) {
		this.storageSpaceGB = storageSpaceDB;
	}


	public String getStorageSpace() {
		return storageSpaceGB;
	}


	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
		this.storageSpaceGB = storageSpace+"GB";
	}
	
	
	/************
	 * toString and Print methods
	 * Super used in to String 
	 **************/

	@Override
	public String toString() {
		return "Phone [make=" + make + ", model=" + model + ", storageSpaceGB=" + storageSpaceGB + ", storageSpace="
				+ storageSpace + ", getProductID()=" + getProductID() + ", getPrice()=" + getPrice() + ", getName()="
				+ getName() + ", getDescription()=" + getDescription() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	


	@Override
	public void print(){
		System.out.println(this.toString());
	}
	
	

	
	
	
	
	

}
