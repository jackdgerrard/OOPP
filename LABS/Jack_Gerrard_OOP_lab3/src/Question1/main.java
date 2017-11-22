package Question1;

public class main {
	/**
	 * This is the main class that adds several objects to a new class  called ObjectList which contains an array to store all the objects in, removes the first index, adds it again and checks the list with methods, finally testing a method from the dog class by referencing it's index in the array list ..
	 * 
	 * @author Jack Gerrard
	 * @version 18/10/17
	 */
	public static class TestObjectList
	{
			//This is the main method in the application
	   public static void main(String[] args)
	   {
		   //creates a new ObjectList Object called ol with a max length of 3 indexes, passed in as a parameter
	       ObjectList ol = new ObjectList(3);
	       
	       //defining some variables and objects to be added to the array in ol
	       String s = "Im Happy";
	       Dog d = new Dog();
	       DVD v = new DVD();
	       Integer i = 1234;
	       
	       //adds the objects to the array and gives the user some feedback
	       System.out.println(ol.add(s));
	       System.out.println(ol.add(d));
	       System.out.println(ol.add(v));
	       System.out.println(ol.add(i));
	       
	       //remove the object at index 0 from the array in ol by calling the remove function in the ObjectList class
	       ol.remove(0);
	       
	       //adds the 
	       System.out.println(ol.add(i));
	       
	       //check if the array is at max capacity(3 indexes)
	       System.out.println("Is the list full? "+ ol.isFull()); 
	       
	       //check if the array has contents
	       System.out.println("Is the list empty? "+ ol.isEmpty());
	       
	       //displays how many objects are in the array
	       System.out.println("Total number of objects in the list: " + ol.getTotal());
	       
	       //defines a new object called g by using the object at array index 1, the second object, which is a dog.
	       
	       Object g = ol.getObject(0);
	       
	       //runs the bark method from the g object, formed from dog class on line above. 
	      ((Dog) g).bark();
	       
	   }
	}


}
