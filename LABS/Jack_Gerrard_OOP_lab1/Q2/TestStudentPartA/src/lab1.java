	/*
	 * 
	 * Write a program called TestStudentPartA that will allow a teacher to input student details such as student first 
	 * name, student second name and examination mark at the keyboard for at least 20 students. Once all examination 
	 * marks have been entered, the program must display the mark and grade for each of the students as follows:

	*	“William Buckley received a Merit for his mark of 68”. 
	*	And so on for the rest of the students
		
		
		The grades are given by the following table:
		      Mark range     	grade
		      85 – 100          distinction	
		      65 – 84           merit
		      40 – 64           pass
		      0  - 39           fail
		
			 * 
	 */


import java.util.Scanner;

//Class to represent a student with variables for name and score and grade.
//score is percentage mark range as int

class Student{
	
	 String Name, Grade;
	 int Score;
  
	  public void setName(String tempFullName) {
			this.Name = tempFullName;
		  }
	  public void setScore(int tempScore) {
			this.Score = tempScore;
		  
		    	if (Score > 85) {
		            Grade = "Distinction";
		        } else if (Score > 65 && Score < 84) {
		            Grade = "Merit";
		        } else if (Score > 40 && Score < 64) {
		            Grade = "Pass";
		        } else {
		            Grade = "Fail";
      }
  	
  }
	

}

public class lab1 {

	
	public static void main(String[] args) {

		
		//alter this to add more/less than 20 students
		Student[] students = new Student[1];
		
		//temp string and int for object
		String tempFirstName;
		String tempLastName;
		
		int tempScore;
		
		Scanner input = new Scanner(System.in);
		
		
		// for student in Students
		for (int i=0; i<students.length; i++) {
			
			//get  first name
			//scanner
			
			System.out.println("Enter Students first name: ");
			tempFirstName = input.nextLine();
			
			System.out.println("Enter Students sirname: ");
			tempLastName = input.nextLine();
		
			
			//get score
			System.out.println("Enter Students score as a natural number");
			tempScore = input.nextInt();
			
			//create class with name and score set from temp name and score taken from above tempName and tempScore
			students[i]=new Student();
			
			//Create Full name to be passed into new Student object
			String tempFullName = tempFirstName + " " + tempLastName;
			
			// Set name
			students[i].setName(tempFullName);
			
			//set score
			students[i].setScore(tempScore);
			
			 
			
		}
		
		input.close();
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].Name + " received a "+ students[i].Grade + " for his mark of " + students[i].Score);
		}
			 
	}

}


