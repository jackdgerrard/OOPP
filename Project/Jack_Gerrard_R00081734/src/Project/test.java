package Project;

public class test {

	public static void main(String[] args) {
		
		/************************
		 * create products
		 *************************/
		
		Phone p = new Phone("HTC MATE 5", 235, "5th gen Mate", "HTC", "Mate5", 16);
		Phone p1 = new Phone("Apple iphone 6", 679,"6th gen iphone" , "iphone", "6", 64); // all parameters not shown 
		Phone p2 = new Phone("samsung galaxy s8", 899,"68th generation galaxy flagship samsung phone" , "Samsung", "Galaxy s8", 128); // all parameters not shown 
		ProductDB database = new ProductDB();

		/************************
		 * add products to daabase
		 *************************/
		database.add(p);
		
		database.add(p1);

		database.add(p2);
		
		/************************
		 * create Customer
		 *************************/
		Customer Mary = new Customer("Mary", "Mary's house, Cork");
		Mary.print();
		
		OrderDetails o1 = new OrderDetails(p.getProductID(), 2);
		OrderDetails o2 = new OrderDetails(p1.getProductID(), 1);
		

		Mary.print();
		Mary.addOrder(o1);
		Mary.addOrder(o2);
		Mary.print();
		OrderDetails o3 = new OrderDetails(p2.getProductID(), 3);
		
		
		Mary.addOrder(o3);
		
		Mary.print();



	}

}
