package Project;

import java.util.ArrayList;

public class Order {
	/************
	 * Attributes
	 **************/
	
	ArrayList<OrderDetails> orders = new ArrayList<OrderDetails>();
	
	/************
	 * Constructor
	 **************/
	
	public Order(){
		orders = new ArrayList<OrderDetails>();
	}
	
	/************
	 * Methods
	 **************/
	
	//add method
	
	public void  addOrder(int product, int quantity){
		OrderDetails x = new OrderDetails(product,  quantity);
	}
	
	
	//
	
	// print method 
	public void print() {
		
		for(int i =0; i<this.orders.size();i++) {
			System.out.println(this.orders.get(i));
		}
	}
}
