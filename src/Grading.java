import java.util.ArrayList;
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		int studentNumber = 0;
		int answer;
		ArrayList<Student> studentRoster = new ArrayList<Student>();
		Scanner scan = new Scanner (System.in);

		System.out.println("How many students do you have in your class?");
		studentNumber = scan.nextInt();
		System.out.println();
		
		System.out.println("Enter the first student's information:");
		System.out.println();
		
		
		
		//this should create student objects with names and then collect their exam/assignment
		//scores and store them in the student object as array lists
		do {
			
				String name;
				System.out.println("Please enter the student's name:");
				name = scan.nextLine();
				Student student = new Student(name);
				
				studentRoster.add(student);
				Student.setScores(student);
				
				
				System.out.println("would you like to add another student?");
				System.out.println("Enter \"1\" to add another student or enter \"2\" to finish");
				answer = scan.nextInt();
				
		}
		while (answer ==1);
		
		//this should print out all the student objects with their names and scores of exams/assignments
		Student.displayScores(studentRoster);
		

	}

}
