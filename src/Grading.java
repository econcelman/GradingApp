import java.util.ArrayList;
import java.util.Scanner;

public class Grading {

	static double A, B, C, D;
	
	public static void main(String[] args) {
		
		int studentNumber = 0;
		int answer;
		ArrayList<Student> studentRoster = new ArrayList<Student>();
		Scanner scan = new Scanner (System.in);
		double classTotal = 0;
		double classMean = 0;
		double sumSquaredDif = 0;
		double standardDeviation;
		
			
		System.out.println("Enter the first student's information:");
		System.out.println();
		
		
		//this creates student objects with names and then collect their exam/assignment
		//scores and store them in the student object as array lists studendRoster
		do {
			
				String name;
				System.out.println("Please enter the student's name:");
				name = scan.next();
				Student student = new Student(name);

				student.getScores(student);
				studentRoster.add(student);
				
				
				System.out.println("would you like to add another student?");
				System.out.println("Enter \"1\" to add another student or enter \"2\" to finish");
				answer = scan.nextInt();
			
				
		//Prints out the current list of student objects with their name, exam scores, 
		//assignment scores, and their total points
		}
		while (answer ==1);
		
		//this prints out all the student objects with their names and exams/assignment scores
		for(Student student : studentRoster)
		{
			System.out.println("Student's Name: " + student.getName());
			for( int e : student.getExamScores())
			{
				System.out.print("Exam Scores:");
				System.out.println(e);
				System.out.println();
			}
			for(int a : student.getAssignmentScores()) {
				System.out.print("Assignment Scores:");
				System.out.println(a);
				System.out.println();
			}
			System.out.print("Total Points: ");
			System.out.println(student.getTotalPoints());
			classTotal += student.getTotalPoints();
			System.out.println();
		}
		
		
		classMean = getClassMean(classTotal, studentRoster.size());
		
		//this takes each students total points and subtracts the class average, 
		//then squares the result.  It then adds up all the results to get the sum
		//of the squared means
		for(Student student : studentRoster) {
			double squareddif = Math.pow(student.getTotalPoints()-classMean, 2);
			sumSquaredDif += squareddif;
		}
		
		
		standardDeviation = Math.sqrt(sumSquaredDif/studentRoster.size());
		
		A = classMean + (standardDeviation * 2);
		B = classMean + standardDeviation;
		C = classMean;
		D = classMean - standardDeviation;
		
		System.out.println("FinalScore >= " + Math.floor(A) + " : A");
		System.out.println("FinalScore >= " + Math.floor(B) + " : B");
		System.out.println("FinalScore >= " + Math.floor(C) + " : C");
		System.out.println("FinalScore >= " + Math.floor(D) + " : D");
		System.out.println("FinalScore < " + Math.floor(D) + " : F");
		System.out.println();
		
		
				
		for(Student student : studentRoster)
		{
			System.out.print(student.getName() + ": ");
			finalClassGrade(student.getTotalPoints());
			
		}
		
		
	
	}

	private static double getClassMean(double classTotal, int classSize) {
	
		return classTotal / classSize;	
	}
	
	
	private static void finalClassGrade(double totalPoints) {
		if(totalPoints >= A)
			System.out.println("Final Grade = A");
		else if (totalPoints >= B)
			System.out.println("Final Grade = B");
		else if (totalPoints >= C)
			System.out.println("Final Grade = C");
		else if (totalPoints >= D)
			System.out.println("Final Grade = D");
		else 
			System.out.println("Final Grade = F");
	}
	
	
}







