

import java.util.*;

public class Tests {
	private String FirstName;
	private String LastName;
	private double Average;
	private String Grade;
	public int[] TestScore = new int[5];	
	
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

	public Tests(String firstname, String lastname, int[] testScore, double average, String grade) {
		this.setFirstName(firstname);
		this.setLastName(lastname);		
		this.setAverage(average);
		this.setGrade(grade);
		this.TestScore = testScore;
	}

	private Tests EnterStudentInfo(String firstName, String lastname, int[] testScore) {
		Tests test = new Tests();
		test.FirstName = firstName;
		test.LastName = lastname;
		test.TestScore = testScore;
		test.Average = test.CalculateStudentAverage(testScore);
		test.Grade = test.CalculateGrade(test.Average);
		return test;
	}

	private double CalculateStudentAverage(int[] testScore) {
		int totalGrade = 0;
		int average = 0;
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

	private String CalculateGrade(double average) {
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

	public static Tests[] GetStudentInput(Tests[] tests) {
		
		for (int s = 0; s < tests.length; s++)
		{
			Tests test = new Tests();
			Scanner scanner = new Scanner(System.in);

			System.out.print("     Enter your firstname: ");
			test.setFirstName(scanner.nextLine());
			System.out.print("     Enter your lastname: ");
			test.setLastName(scanner.nextLine());

			for (int i = 0; i < test.TestScore.length; i++) {
				int counter = 1 + i;
				System.out.print("     What is your test score " + counter + " ?. ");

				int userInput = scanner.nextInt();
				
				if (userInput >= 0 && userInput <= 100)
				{
					test.TestScore[i] = userInput;
				}
				else {
					System.out.println("	Your test score should be between (0 to 100)!");
					i--;
				}
			}
			test.setAverage(test.CalculateStudentAverage(test.TestScore));
			test.setGrade(test.CalculateGrade(test.Average));
			
			
			tests[s] = test.EnterStudentInfo(test.FirstName, test.LastName, test.TestScore);
		}
		return tests;
	}

	public static void Print(Tests[] tests) {

		System.out.println();
		System.out.print("STUDENT REPORT \n\n");

		System.out.printf("%-10s %-10s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %n", "First Name", "Last Name",
				"Test1", "Test2", "Test3", "Test4", "Test5", "Average", "Grade");
		for (int i = 0; i < tests.length; i++) {
			Tests tes = new Tests(tests[i].FirstName, tests[i].LastName, tests[i].TestScore, tests[i].Average,
					tests[i].Grade);

			System.out.printf("%-10s %-10s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %n", tes.FirstName, tes.LastName,
					tes.TestScore[0], tes.TestScore[1], tes.TestScore[2], tes.TestScore[3], tes.TestScore[4],
					tes.Average, tes.Grade);
		}
		System.out.println(" \nCLASS AVERAGE: " + Tests.CalculateClassesAverage(tests));
	}

	// main method
	public static void main(String[] args) 
	{
		Tests[] tests = new Tests[5];

		Tests.Print(Tests.GetStudentInput(tests));
	}
}
