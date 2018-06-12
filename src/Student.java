import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
		ArrayList<Integer> examScores = new ArrayList<Integer>();
		ArrayList<Integer> assignmentScores = new ArrayList<Integer>();
		String name;
		double totalPoints;
		


		public Student(String name) {
			this.name = name;
			this.totalPoints = 0;
			
		
		}
		
		//this should set the scores for the array lists in the student object
		 public void getScores(Student student) {
			
			Scanner scan = new Scanner (System.in);
			String name = "not set";
			int score;
			int answer = 1;
			
			
				
				for (int num = 1; num <10; num++) {
					if(num<=4) {
					System.out.println("Enter Exam score # " + (num) + " (between 0 and 50)");
					score = scan.nextInt();
						while(score > 50) {
							System.out.println("Invalid score entry.  Please enter score between 0 - 50");
							score = scan.nextInt();
						}
					totalPoints += (double) score;
					examScores.add(score);
					}
					
					if(num> 5) {
 						System.out.println("Enter Assignment score # " + (num - 5) + " (between 0 and 75)");
 						score = scan.nextInt();
 						while(score > 75) {
 							System.out.println("Invalid score entry.  Please enter score between 0 - 75");
 							score = scan.nextInt();
 							}
						totalPoints += (double) score;
						assignmentScores.add(score);	
					}
				
				}
		 }
		
		public double getTotalPoints() {
			return totalPoints;
		}

		public ArrayList<Integer> getExamScores() {
			return examScores;
		}

		public ArrayList<Integer> getAssignmentScores() {
			return assignmentScores;
		}

		public String getName() {
			return name;
		}
}
		


