import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Calculator implements EventHandler<ActionEvent>
{	
	String tempValue ="";
	double num1;
    double num2;
    String operator;
    
    public Calculator() {}
    
    public String Calculate()
    {
        if(this.operator == "+")
        {
            return Double.toString(addition(this.num1, this.num2));
        }
        if(this.operator =="-")
        {
            return Double.toString(subtraction(this.num1, this.num2));
        }
        else if(this.operator =="*")
        {
           return Double.toString(multiplication(this.num1, this.num2));
        }
        else if(this.operator =="/")
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
	
	@Override
	public void handle(ActionEvent event) 
	{
		//all number buttons
		if(event.getSource() == SimpleCalculator.btn0 || event.getSource() == SimpleCalculator.btn1 ||event.getSource() == SimpleCalculator.btn2 || event.getSource() == SimpleCalculator.btn3)
		{			
			tempValue += ((Button)event.getSource()).getText();		
			SimpleCalculator.txtDisplay.setText(tempValue);				
			System.out.println(tempValue);
		}
		//clear button
		if(event.getSource()==SimpleCalculator.btnClear)
		{
			tempValue = "";
			SimpleCalculator.txtDisplay.setText(tempValue);			
			System.out.println("Clear event fire: " + tempValue);
		}
		//operators buttons
		if(event.getSource() == SimpleCalculator.btnAdd || event.getSource() == SimpleCalculator.btnSub || event.getSource() == SimpleCalculator.btnDivi || event.getSource() == SimpleCalculator.btnMult)
		{
			operator = ((Button)event.getSource()).getText();
			num1 = Double.parseDouble(tempValue);			
			tempValue = "";
			
			System.out.println("Operator: " + operator);
		}
		//equal button
		if(event.getSource() == SimpleCalculator.btnEqual)
		{
			
			num2 = Double.parseDouble(tempValue);			
			Calculate();			
			SimpleCalculator.txtDisplay.setText(Calculate());
			System.out.println("Equal to:  " + Calculate());
			
			
		}
			
		
	}

}
