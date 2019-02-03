
import java.util.*;
//Gashawbeza Amalto
public class Tests {
	private String FirstName;
	private String LastName;
	private double Average;
	private String Grade;
	public double[] TestScores = new double[5];

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getAverage() {
		return Average;
	}

	public void setAverage(double average) {
		Average = average;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public Tests() {
	}

	public Tests(String firstname, String lastname, double[] testScore, double average, String grade) {
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setAverage(average);
		this.setGrade(grade);
		this.TestScores = testScore;
	}

	private static double CalculateStudentAverage(double[] testScore) {
		double totalGrade = 0;
		double average = 0;
		int counter = 0;
		for (int i = 0; i < testScore.length; i++) {
			totalGrade = totalGrade + testScore[i];
			counter++;
			if (counter == testScore.length) {
				average = totalGrade / testScore.length;
			}
		}
		return average;
	}

	private static String CalculateGrade(double average) {
		String ch = "A";
		if (average >= 90) {
			ch = "A";
		} else if (average < 90 && average >= 80) {
			ch = "B";
		} else if (average < 80 && average >= 70) {
			ch = "C";
		} else if (average < 70 && average >= 60) {
			ch = "D";
		} else {
			ch = "F";
		}
		return ch;
	}

	private static double CalculateClassesAverage(Tests[] tes) {
		double ClassAverage = 0;
		double TotalStudentAverage = 0;
		int totalStudent = tes.length;

		for (int i = 0; i < tes.length; i++) {
			TotalStudentAverage += tes[i].Average;
		}
		ClassAverage = TotalStudentAverage / totalStudent;

		return ClassAverage;
	}

	public static Tests[] GetTestList() {

		Tests[] tests = new Tests[5];
		for (int s = 0; s < tests.length; s++) {
			double[] score = new double[5];

			Scanner scanner = new Scanner(System.in);
			System.out.print("     Enter your firstname: ");
			String firstname = scanner.nextLine();
			System.out.print("     Enter your lastname: ");
			String lastname = scanner.nextLine();

			System.out.println();
			for (int i = 0; i < 5; i++) {
				int counter = 1 + i;
				System.out.print("     Enter your test score " + counter + " ?. ");

				int userInput = scanner.nextInt();

				if (userInput >= 0 && userInput <= 100) {
					score[i] = userInput;
				} else {
					System.out.println("	Your test score should be between (0 to 100)!");
					i--;
				}
			}
			double average = CalculateStudentAverage(score);
			String grade = CalculateGrade(average);
			// invoke Tests constructor
			Tests myTest = new Tests(firstname, lastname, score, average, grade);
			tests[s] = myTest;
			System.out.println();
			System.out.println();
		}

		return tests;
	}

	public static void PrintTestList(Tests[] tests) {

		System.out.println();
		System.out.print("STUDENT REPORT \n\n");

		System.out.printf("%-15s %-15s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %n", "First Name", "Last Name", "Test1",
				"Test2", "Test3", "Test4", "Test5", "Average", "Grade");
		for (int i = 0; i < tests.length; i++) {
			Tests tes = new Tests(tests[i].FirstName, tests[i].LastName, tests[i].TestScores, tests[i].Average,
					tests[i].Grade);

			System.out.printf("%-15s %-15s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %n", tes.getFirstName(),
					tes.getLastName(), tes.TestScores[0], tes.TestScores[1], tes.TestScores[2], tes.TestScores[3],
					tes.TestScores[4], tes.getAverage(), tes.getGrade());
		}
		
		System.out.println(" \nCLASS AVERAGE: " + Tests.CalculateClassesAverage(tests));
	}
	// main method
	public static void main(String[] args) {
		Tests.PrintTestList(Tests.GetTestList());
	}
}
