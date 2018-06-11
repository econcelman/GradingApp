import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
		static ArrayList<Integer> examScores = new ArrayList<Integer>();
		static ArrayList<Integer> assignmentScores = new ArrayList<Integer>();
		String name;

		public Student(String name) {
		this.name = name;
		}
	
		private float totalPoints;
		
		static ArrayList<Student> students = new ArrayList<Student>();
		
		static int getExamScoresTotal()
		{
		    int examSum = 0;
		    for(int i = 0; i < examScores.size(); i++)
		    {
		        examSum += examScores.get(i);
		    }
		    return examSum;
		    
		}
		static int getAssignmentScoresTotal()
		{
		    int assignmentSum = 0;
		    for(int i = 0; i < assignmentScores.size(); i++)
		    {
		        assignmentSum += assignmentScores.get(i);
		    }
		    return assignmentSum;
		}
		
	
		public static void getStudentScores() {
			
			Scanner scan = new Scanner (System.in);
			String name = "not set";
			int totalPoints, score;
			int answer = 1;
			
			
			while (answer ==1)	
			{
			System.out.println("would you like to add a student?");
			System.out.println("Enter \"1\" to add another student or enter \"2\" to finish");
			answer = scan.nextInt();
			System.out.println("Please enter the students name:");
			name = scan.nextLine();
			Student student = new Student(name);
			}
					
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
						
						
						
					 	}
						
			 	System.out.println(name + "'s total points are " );
				
				
				System.out.println();
				
				}
			
		
		

		public static void displayScores() {
			for (int i = 0; i<= students.size(); i++) {
				System.out.println(students.get(i));
			}
			
		}

}
