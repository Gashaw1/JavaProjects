
import java.util.*;
public class Tests {
	public String FirstName;
    public String LastName;
    public int[] TestScore;
    public double Average;
    public String Grade;
    public Tests[] tests; 

    public Tests() { }
    public Tests(String firstname, String lastname, int[] scors, String grade)
      {
          this.FirstName = firstname;
          this.LastName = lastname;
          this.TestScore = scors;
          this.Grade = grade;
      }
    public Tests EnterStudentInfo(String firstName, String lastname, int[] testScore)
      {
          Tests test = new Tests();
          test.FirstName = firstName;
          test.LastName = lastname;
          test.TestScore = testScore;
          test.Average = test.CalculateStudentAverage(testScore);
          test.Grade = test.CalculateGrade(test.Average);
          return test;
      }
    private double CalculateStudentAverage(int[] testScore)
      {
          int totalGrade = 0;
          int average = 0;
          int counter = 0;
          for (int i = 0; i < testScore.length; i++)
          {
              totalGrade = totalGrade + testScore[i];
              counter ++;

              if (counter == testScore.length)
              {
                  average = totalGrade / testScore.length;
              }

          }
          return average;
      }
    private String CalculateGrade(double average)
      {
          String ch = "A";
          if (average >= 90)
          {
              ch = "A";
          }
          else if (average < 90 && average >= 80)
          {
              ch = "B";
          }
          else if (average < 80 && average >= 70)
          {
              ch = "C";
          }
          else if (average < 70 && average >= 60)
          {
              ch = "D";
          }
          else
          {
              ch = "F";
          }
          return ch;
      }
    private static double CalculateClassesAverage(Tests[] tes)
      {
          double ClassAverage = 0;
          double TotalStudentScore = 0;
          double TotalStudentTess = 0;
          for (int i = 0; i < tes.length; i++)
          {
              for (int j = 0; j < tes[i].TestScore.length; j++)
              {
                  TotalStudentScore += tes[i].TestScore[j];
                  TotalStudentTess += j;
              }
          }
          ClassAverage = TotalStudentScore / TotalStudentTess;

          return ClassAverage;
      }
   
    public static Tests[] GetStudentInput()
    {
    	
    	Tests[] studetns = new Tests[2];
    	for (int s = 0; s < studetns.length; s++)
    	{
    		Scanner scanner = new Scanner(System.in);
    		System.out.println();
            Tests studentTes = new Tests();
            System.out.print("     Enter your firstname: ");
            studentTes.FirstName = scanner.nextLine();
            System.out.print("     Enter your lastname: ");
            studentTes.LastName = scanner.nextLine();
            studentTes.TestScore = new int[3];

            for (int i = 0; i < studentTes.TestScore.length; i++)
            {
            	int counter = 1 + i;
                System.out.print("     What is your test score " + counter + " ?. ");
                studentTes.TestScore[i] = scanner.nextInt();
            }
            studentTes.Average = studentTes.CalculateStudentAverage(studentTes.TestScore);
            studentTes.Grade = studentTes.CalculateGrade(studentTes.Average);
            //adding to type Test array object
            studetns[s] = studentTes.EnterStudentInfo(studentTes.FirstName, studentTes.LastName, studentTes.TestScore);
           }
          return studetns;
    }
    public static void Print(Tests[] tests)
    {
    	System.out.println();
        System.out.print("     STUDENT REPORT \n");
        System.out.println();
        int i = 0;
      
        for (i = 0; i < tests.length; i++)
        {
        	Tests tes = new Tests(tests[i].FirstName, tests[i].LastName, tests[i].TestScore, tests[i].Grade);
        	System.out.println("     Test result: " + tes.FirstName + "  " + tes.LastName + "   " + "  " + tes.TestScore[0] + " " + tes.TestScore[1] + " " + tes.TestScore[2] + " " + tes.Average + "  " + tes.Grade);
        	       
        }
        System.out.println("    \nClass average + " + Tests.CalculateClassesAverage(tests));
    }
	
    //main method
    public static void main(String[] args)
	{
    	Tests tests = new Tests();    	
    	//getting student info
	    tests.tests =	Tests.GetStudentInput();
		//print student info
        Tests.Print(tests.tests);
      
	}

}
