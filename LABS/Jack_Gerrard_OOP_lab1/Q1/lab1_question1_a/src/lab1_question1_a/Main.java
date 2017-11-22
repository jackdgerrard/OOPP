package lab1_question1_a;


public class Main {

	//main method, checks value of amount and echoes verse accordingly
	public static void main(String[] args) {
		int amount = 99;
		String word = new String(" bottles");
		String line = new String (" of beer");
		String wall = new String(" on the wall");
		

		while (amount > 0) //  while there are bottles of beer on the wall
		{
			System.out.println(amount+word+line+wall);
			System.out.println(amount+word+line);
			System.out.println("Take one down");
			System.out.println("Pass it around");
			
			amount--;	
			
			//if the amount of bottles on the wall are greater than one, echo this
			if(amount > 1) {			
					System.out.println("  ");
					System.out.println(amount+word+line+wall);
					System.out.println("  ");
					
			// if the amount of bottles of beer on the wall are equal to one, change bottles to bottle and echo the same as above		
			} if(amount == 1) { 
					word = new String(" bottle");
					
					System.out.println("  ");
					System.out.println(amount+word+line+wall);
					System.out.println("  ");
					
				}
		}
		
		// adds space
		System.out.println("  ");
		
		//final line of song
		System.out.println("No more bottles of beer on the wall"); 
		
		

	}
}


