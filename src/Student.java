import java.util.ArrayList;
import java.util.Scanner;

public class Student {

		private String name;
		private float totalPoints;
		
        public Student() {
        	this.name = name;
        	this.totalPoints = totalPoints;		
        }
		
		static ArrayList<Student> scores = new ArrayList<Student>();
	
		public Student(String name, float totalPoints) {
			this.name = "not set";
			this.totalPoints = 0;
		}

		public static void getStudentScores() {
			
			Scanner scan = new Scanner (System.in);
			String name;
			float totalPoints, score;
			int answer;
			
			do { 
				totalPoints = 0;
				name = "not set";
				
			System.out.println("Please enter the students name:");
			name = scan.nextLine();
			
				
					for (int num = 1; num <10; num++) 
					{
						if(num<=4) {
						System.out.println("Enter Exam score # " + (num) + " (between 0 and 50)");
						score = scan.nextFloat();
							while(score > 50) {
							System.out.println("Invalid score entry.  Please enter score between 0 - 50");
							score = scan.nextFloat();
							}
							totalPoints += score;
							
						}
					 
						if(num> 5) {
						System.out.println("Enter Assignment score # " + (num - 5) + " (between 0 and 75)");
						score = scan.nextFloat();
						while(score > 75) {
							System.out.println("Invalid score entry.  Please enter score between 0 - 75");
							score = scan.nextFloat();
							}
						totalPoints += score;
						}
						
					 }
					
						
				scores.add(new Student(name, totalPoints));	
			 	System.out.println(name + "'s total points are " + totalPoints);
				
				
				System.out.println();
				System.out.println("would you like to add a student's scores?");
				System.out.println("Enter \"1\" to add another student or enter \"2\" to finish");
				answer = scan.nextInt();
				}
			while (answer == 1);
	
		}

		public static void displayScores() {
			for (int i = 0; i<= scores.size(); i++) {
				System.out.println(scores.get(i));
			}
			
		}

}
