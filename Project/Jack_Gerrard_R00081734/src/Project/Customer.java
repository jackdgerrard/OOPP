package Project;

import java.util.ArrayList;

public class Customer {
	
	/************
	 * Attributes
	 **************/
	String name, address;
	ArrayList<Order> Orders = new ArrayList<Order>();
	
	/************
	 * Constructor
	 **************/

	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}	
	/************
	 * Getter/Setter methods
	 **************/


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/************
	 * Orders methods
	 **************/
	
	private void addOrder(Order a) {
		this.Orders.add(a);
		System.out.println(a+" has been removed");
	}
	


	private void  removeOrder(Order a) {
		this.Orders.remove(a);
	}

	
	/************
	 * toString and Print methods
	 **************/


	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}

}
