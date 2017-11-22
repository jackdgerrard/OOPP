package Project;

public class test {

	public static void main(String[] args) {
		// copied from example code
		
		Phone p = new Phone(“Apple”, “iphone6”,  ..); // all parameters not shown 
		Phone p1 = new Phone(“Samsung”,”Galaxy 8”, ...); 
		ProductDB database = new ProductDB();
		database.add(p1);
		database.add(p);
		Customer Mary = new Customer("Mary", "1 halloween road, merry christmas, easter something");
		Order o = new Order();
		o.add(p,12); // ordered 12 iphone 6 products
		o.add(p1,1); //ordered 1 Galaxy 8
		Mary.addOrder(o);


	}

}
