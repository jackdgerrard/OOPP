package Project;

import java.util.Scanner;

public class test {
	static ProductDB Database = new ProductDB();
	static Customer Mary;

	public static void main(String[] args) {
		
		/************************
		 * create products
		 *************************/
		
		
						//creating 3 phone objects
						Phone p = new Phone("HTC MATE 5", 235, "5th gen Mate", "HTC", "Mate5", 16);
						Phone p1 = new Phone("Apple iphone 6", 679,"6th gen iphone" , "iphone", "6", 64);
						Phone p2 = new Phone("samsung galaxy s8", 899,"8th generation galaxy flagship samsung phone" , "Samsung", "Galaxy s8", 128);
						
				
						/************************
						 * add products to Database
						 *************************/
						Database.add(p);
						
						Database.add(p1);
				
						Database.add(p2);
						
						/************************
						 * create Customer, add orders to customer and test 
						 *************************/
						
						 Mary = new Customer("Mary", "Mary's house, Cork");
						
					//	System.out.println("---test: is mary created?---------");
					//	Mary.print();
						
						//create 2 orderDetails objects
						
						OrderDetails o1 = new OrderDetails(p.getProductID(), 2);
						OrderDetails o2 = new OrderDetails(p1.getProductID(), 1);
						
					//	System.out.println("---test: have items been added to mary?---------");
					//	Mary.print();
						Mary.addOrder(o1);
						Mary.addOrder(o2);
					//	Mary.print();
						OrderDetails o3 = new OrderDetails(p2.getProductID(), 3);
						
						
						Mary.addOrder(o3);
						
					//	System.out.println("---test: final result of Mary?---------");
					//	Mary.print();
		
						/************************
						 * User Menu
						 * 
						 *************************/
						
						Scanner sc = new Scanner(System.in);
						
						printMenu();
							
						int i = sc.nextInt();
							
						switch(i) {
							
							
							case 1: //create new phone
						//		Phone(String name, double price, String description, String make, String model, int storageSpace)
								 String name, description,  make, model;
								 int  storageSpace;
								 double price;
								 
								 System.out.println("---creating a new phone---");
								 
								 System.out.println("enter name of phone");
								 name = sc.nextLine();
								 
								 System.out.println("enter description of phone");
								 description = sc.nextLine();
								 
								 System.out.println("enter make");
								 make = sc.nextLine();
								 
								 System.out.println("enter model");
								 model = sc.nextLine();
								 
								 System.out.println("enter Storage capacity in GB");
								 storageSpace = sc.nextInt();
								 sc.next();
								 
								 System.out.println("enter price");
								 price = sc.nextDouble();
								 
								 Phone newPhone = new Phone(name, price,description, make, model, storageSpace);
							//	 Phone(String name, double price, String description, String make, String model,int storageSpace)
								 Database.add(newPhone);
								 
								break;
								
								
							case 2: //search by product ID
								int searchID;
								System.out.println("---Search for product---");
								 
								System.out.println("enter product ID"); //p2's productID = 10214859
								searchID = sc.nextInt();
								 
								 System.out.println(Database.find(searchID));
								 
								printMenu();
									
								 i = sc.nextInt();
								 
								
								break;

							case 3: //Display all products
								System.out.println("---Displaying all products---");
								Database.getAll();
							
								printMenu();
								
								 i = sc.nextInt();
								 
								break;
								
							case 4: //order products
								System.out.println("---Ordering Products---");
								
								System.out.println("enter product ID"); //p2's productID = 10214859
								int addID = sc.nextInt();
								
								System.out.println("enter Quantity to order");
								int amount = sc.nextInt();
								 
								OrderDetails o = new OrderDetails(addID, amount);
								
								Mary.addOrder(o3);
								 
								printMenu();
									
								 i = sc.nextInt();
								
								
								
								break;
								
							case 5: //display all orders
								System.out.println("---Displaying your orders for: Mary---");
								Mary.getOrders();
								printMenu();
								
								 i = sc.nextInt();
								break;
								
							case 6: //quit
								System.out.println("---Quitting---");
								sc.close();
								System.out.println("Goodbye");
								System.exit(0);
								break;// good practice to close cases.
									
							
							}


	}
	
	public static void printMenu(){
		System.out.println();
		System.out.println("--------Menu---------");
		System.out.println();
		System.out.println("Please enter a menu option");
		System.out.println("1: create a new phone");
		System.out.println("2: Search by product ID");
		System.out.println("3: Display all Products");
		System.out.println("4: Order products");
		System.out.println("5: Display all orders");
		System.out.println("6: Quit");
		
	}
	



}
