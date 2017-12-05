package Project;

public class OrderDetails {
	
	/********************
	 * Attributes
	 **********************/
	
	int product, quantity;
	
	/********************
	 * Constructor
	 **********************/
	
	public OrderDetails(int product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	/****************************
	 * Getter/Setter methods
	 ******************************/
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/****************************
	 * print method
	 ******************************/
	

	public String toString() {
		return "OrderDetails [product: " + product + ", quantity: " + quantity + "]";
	}
	
	
	public void print() {
		System.out.println(this.toString());
	}
	
	

}
