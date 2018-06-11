import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		int studentNumber = 0;
		
		Scanner scan = new Scanner (System.in);

		System.out.println("How many students do you have in your class?");
		studentNumber = scan.nextInt();
		System.out.println();
		
		Student.getStudentScores();
		Student.displayScores();
		

	}

}
