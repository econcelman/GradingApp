import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
		static ArrayList<Integer> examScores = new ArrayList<Integer>();
		static ArrayList<Integer> assignmentScores = new ArrayList<Integer>();
		String name;

		public Student(String name) {
		this.name = name;
		}
		
		 public static void setScores(Student student) {
			
			Scanner scan = new Scanner (System.in);
			String name = "not set";
			int totalPoints, score;
			int answer = 1;
				
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
				
				}
		 }
		
			
		public static void displayScores(ArrayList<Student> studentRoster) {
			for (int i = 0; i<= studentRoster.size(); i++) {
				System.out.println(studentRoster.get(i));
				}
		}
}
		


