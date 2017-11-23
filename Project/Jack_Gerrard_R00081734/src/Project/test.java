package Project;

public class test {

	public static void main(String[] args) {
		// copied from example code
		
		Phone p1 = new Phone("Apple iphone 6", 679,"6th gen iphone" , "iphone", "6", 64); // all parameters not shown 
		Phone p2 = new Phone("samsung galaxy s8", 899,"68th generation galaxy flagship samsung phone" , "Samsung", "Galaxy s8", 128); // all parameters not shown 
		ProductDB database = new ProductDB(null);
		database.add(p1);
		database.add(p2);
		Customer Mary = new Customer("Mary", "1 halloween road, merry christmas, easter something");
		
		Order o = new Order(); // fix dis 
		
		
		o.add(p1,3); // ordered 12 iphone 6 products
		o.add(p2,1); //ordered 1 Galaxy 8
		
		Mary.addOrder(o); // and fix dis 2


	}

}
