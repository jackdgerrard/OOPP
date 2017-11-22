package Question3;

import java.util.Scanner;

public class TestStudentPartb {

public static void main(String[] args) {

		
		//alter this to add more/less than 20 students
		Student[] students = new Student[20];
		
		//temp string and int for object
		String tempFirstName;
		String tempLastName;
		String tempWholeName;
		
		int tempScore;
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		// for student in Students
		for (int i=0; i<students.length; i++) {
			//open scanner
			
			
			//get  first name
			
			System.out.println("Enter Students first name: ");
			tempFirstName = input.nextLine();

			// bug where program only looks for this on first iteration of loop
			System.out.println("Enter Students sirname: ");
			tempLastName = input.nextLine();

			//get score

			System.out.println("Enter Students score as a natural number");
			tempScore = input.nextInt();

			
			//Create Full name to be passed into new Student object
			tempWholeName = tempFirstName + " " + tempLastName;
			
			//create class with name and score set from temp name and score taken from above tempName and tempScore
			students[i]=new Student(tempWholeName,tempScore);
			students[i].setGrade();
			
			

			
		}
		
		
		
		for(int i=0; i<students.length; i++) {
			students[i].print();
		}
		

			 
	}
}
