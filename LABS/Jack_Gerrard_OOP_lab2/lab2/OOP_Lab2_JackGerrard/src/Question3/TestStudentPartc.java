package Question3;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudentPartc {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//
		// Array list of Students
		//
		ArrayList<Student> Students = new ArrayList<Student>();
		//tempName string for holding string to be passed to Student object as name

		int running = 2;

		while(running == 2) {
			
		
						
				System.out.println("Select which operation you want to use below:");
				System.out.println("Add new Student: 1");
				System.out.println("Remove existing student : 2");
				System.out.println("List existing students: 3");
				System.out.println("Exit: 4");
				
				int x = sc.nextInt();
				
				
				 switch (x) {
				 
		         case 1: 
		     			String tempName;
		     			int tempScore;
		        	 
		 				System.out.println("Enter Students first name: ");
		 				tempName = sc.nextLine();
		 				
		 				System.out.println("Enter Students score as a natural number");
						tempScore = sc.nextInt();
						
						System.out.println("Adding new Student");
						Students.add(new Student(tempName,tempScore));
						System.out.println("Student added :");
						System.out.print(-1+" | ");Students.get(-1).print();
						
		        	 		break;
		        	 		
		         case 2:  
			        	 System.out.println("Enter student to be removed");
			        	 int remover = sc.nextInt();
			        	 System.out.println("Removing chosen Student");
			        	 Students.remove(remover);
			        	 System.out.println("Student Removed");
			        	 
		        	 		break;
		         case 3: 
			        	 System.out.println("Listing existing Students:");
			        	 System.out.println("- - - - - - - - - - - - - - - - - -");
			        	 
			        	 for(int i=0;i<=Students.size();i++) { 
			        		 System.out.print(i+" | ");Students.get(i).print();
			        		 System.out.println("- - - - - - - - - - - - - - - - - -");
			        	 }
			        	 
		        	 		break;
		        	 		
		         case 4:
		        	 System.out.println("Quitting");
		        	 running = 99999;
		     }
				 
		}
		 
	
		
		sc.close();
	}
	


}


// the advantages of using an array list over an array are that an array list has a variable length
// that changes dynamically