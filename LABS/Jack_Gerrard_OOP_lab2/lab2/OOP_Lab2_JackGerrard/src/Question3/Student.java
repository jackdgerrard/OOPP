package Question3;

public class Student {
	 String Name, Grade;
	 int Score;
	 
	 
	 
	 //constructor
		public Student(String name, int score) {
		Name = name;
		Score = score;
	}

		public void setName(String name) {
			Name = name;
		}
		
		public void setGrade() {
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
		
		  
		 public void setScore(int tempScore) {
			this.Score = tempScore;
			  
		 }


	 

	public String getName() {
		return Name;
	}



	public String getGrade() {
		return Grade;
	}


	public int getScore() {
		return Score;
		    		
	}


	public String toString() {
		return Name + " received a "+ Grade + " for their mark of " + Score;
	}
	  
	public void print() {
		System.out.println(toString());
	}
}
