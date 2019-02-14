import java.util.ArrayList;
import java.util.List;

public class CalculaterLogic {

	// public
	public static String Calculate(String num1, String num2, String operator) {
		String result = "";
		double doubleResult = 0;

		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		if (operator == "+") {
			doubleResult = n1 + n2;
		} else if (operator == "-") {
			doubleResult = n1 - n2;
		} else if (operator == "*") {
			doubleResult = n1 * n2;
		} else if (operator == "/") {
			doubleResult = n1 / n2;
		} else {
			doubleResult = 0;
		}
		result = Double.toString(doubleResult);
		;
		return result;
	}

}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// new file 
class Calculator
{
    double num1;
    double num2;
    char operator;
    
    public Calculator(double num1, double num2, char operator)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    
    }
    public String Calculate()
    {
        if(this.operator == '+')
        {
            return Double.toString(addition(this.num1, this.num2));
        }
        if(this.operator =='-')
        {
            return Double.toString(subtraction(this.num1, this.num2));
        }
        else if(this.operator =='*')
        {
           return Double.toString(multiplication(this.num1, this.num2));
        }
        else if(this.operator =='/')
        {
            if(num2 == 0)
            {
                return "\nError division by zero!";
            }
            else
            {
                 return Double.toString(division(this.num1, this.num2));
            }
        }
        else
        {
            return "";
        }
    }
    private double addition(double num1, double num2)
    {
        return num1 + num2;
    }
    private double subtraction(double num1, double num2)
    {
        return num1 - num2;
    }
    private double multiplication(double num1, double num2)
    {
        return num1 * num2;
    }
    private double division(double num1, double num2)
    {
        return num1 / num2; 
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    String str = new Calculator(3,-3,'/').Calculate();
	    
	    System.out.println("Hello World  " + str);
	
	}
}

