# OOPP
A project for semester 3 of Web development, CIT 







SOFT7004 – OOP  - Project 
Completion Date: 8th
 December 2017  
On completion please zip up your files including any 
documents used for drawing the class diagram etc. Upload 
to BlackBoard.  

You are to create an inventory/shopping application as outlined below. 

PART 1
You are to write the following java classes:
1.
A Product class. This will be a generic class for Products that a company may sell.
It will have attributes for the following: name, description, price and productID. 
Use appropriate data types. Write getters and setters for all attributes. Write a 
method called print() that prints the Product information to the screen. 
A unique productID is assigned to the product when it is created. You can use a 
static int to achieve this.
2.
A Phone class. It will Inherit from the Product class. It will have attributes for 
make (Apple, Motorola, Samsung, etc), model (iPhone 6, Moto X, Galaxy S5, etc), 
and storage space (in gigabytes). Write getters and setters and Overload the 
print() method that's inherited from the Product class. Make use of the 
super.print() call.
3.
A TV class. It will Inherit from the Product class. It will have attributes for make, 
screen size, type (LCD, LED, Plasma) and whether or not it is 3D capable. Write 
getters and setters and overload the print() method. 
4.
Write a ProductDB class which manages an ArrayList of Products. The class 
provides methods to add, remove and find a product. The find method returns a 
product object foa a matching productID.
5.
Write an OrderDetails class which has a Product and a quantity attributes. 
Provide a Print method. 



6.
Write an Order class which manages an ArrayList of OrderDetails objects. Provide
a Print method. Provide an add method which takes a product object and a 
quantity. The add method creates an OrderDetails object and adds it to the 
ArrayList.
7.
Write a Customer class that has attributes name, address. A Customer object 
also has an ArrayList of Order objects.
8.
Write a Test class that instantiates a number of phones and TVs and sets their 
attributes. Create some Customer objects. Create a ProductDB object called 
database.  Add all your products to the object. Create some Order objects for a 
Customer and add the orders to that Customer object. See example code below 
(Note not all parameters are shown).
Phone p = new Phone(“Apple”, “iphone 6”,  ..); // all parameters not shown
Phone p1 = new Phone(“Samsung”,”Galaxy s6”, ...); 
Phone p2 = new Phone(“Apple”, “iphone 5”,  ..);  
Phone p3 = new Phone(“Samsung”,”Galaxy s5”, ...); 
ProductDB database = new ProductDB();
database.add(p1);
database.add(p);
database.add(p2);
database.add(p3);
Customer Mary = new Customer(“Mary” ..);
Order o = new Order();
o.add(p,12); // ordered 12 iphone 6 products
o.add(p1,1); //ordered 1 Galaxy s6
Mary.addOrder(o);
Order o1 = new Order();
o1.add(p2,1); // ordered 1 iphone 5 products
o1.add(p3,5); //ordered 5 Galaxy s5 products
Mary.addOrder(o1);

