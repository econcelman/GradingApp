import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
		ArrayList<Integer> examScores = new ArrayList<Integer>();
		ArrayList<Integer> assignmentScores = new ArrayList<Integer>();
		String name;

		public Student(String name) {
		this.name = name;
		}
	
		private float totalPoints;
		
		static ArrayList<Student> students = new ArrayList<Student>();
		
		
		
		//can ignore this for now. I was looking for away to get the sums in order to get the 
		//total points for that student. 
		static int getExamScoresTotal()
		{
		    int examSum = 0;
		    for(int i = 0; i < examScores.size(); i++)
		    {
		        examSum += examScores.get(i);
		    }
		    return examSum;  
		}
		
		//same for this
		static int getAssignmentScoresTotal()
		{
		    int assignmentSum = 0;
		    for(int i = 0; i < assignmentScores.size(); i++)
		    {
		        assignmentSum += assignmentScores.get(i);
		    }
		    return assignmentSum;
		}
		
	
		
		//The goal of this was to create a loop that would ask for the students name, 
		//then create a student object with that name and then ask the user to input the 
		//exam scores and assignment scores to be added into the arrays that are in that 
		//student object.
		public static void getStudentScores() {
			
			Scanner scan = new Scanner (System.in);
			String name = "not set";
			int totalPoints, score;
			int answer = 1;
			
				
			do 	{
			
			System.out.println("Please enter the students name:");
			name = scan.nextLine();
			Student student = new Student(name);
			
					
					for (int num = 1; num <10; num++) {
						if(num<=4) {
						System.out.println("Enter Exam score # " + (num) + " (between 0 and 50)");
						score = scan.nextInt();
							while(score > 50) {
							System.out.println("Invalid score entry.  Please enter score between 0 - 50");
							score = scan.nextInt();
							}
							examScores.add(score);
						}
					 
						if(num> 5) {
						System.out.println("Enter Assignment score # " + (num - 5) + " (between 0 and 75)");
						score = scan.nextInt();
						while(score > 75) {
							System.out.println("Invalid score entry.  Please enter score between 0 - 75");
							score = scan.nextInt();
							}
						    assignmentScores.add(score);
						    }
						getExamScoresTotal();
						getAssignmentScoresTotal();
						
						System.out.println("would you like to add a student?");
						System.out.println("Enter \"1\" to add another student or enter \"2\" to finish");
						answer = scan.nextInt();	
						}
					
					while (answer ==1)	
					 	
				//I would like something here to show up the information that is stored in that student object
				//while also having that students points summed to a total for the use in the curve
						
			 	System.out.println(name + "'s total points are " );
				
				}
			
		
		
			//this doesn't work yet. I want it to print out all the student objects entered in the 
			//students list
		public static void displayScores() {
			for (int i = 0; i<= students.size(); i++) {
				System.out.println(students.get(i));
			}
			
		}

}
