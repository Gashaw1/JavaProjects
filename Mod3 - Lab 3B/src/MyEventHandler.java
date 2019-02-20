import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) 
	{
		
	  event.getSource();
	  String textOne = 	Test.txtField.getText();
	  String textTwo = 	Test.txtField2.getText();
	  
	  
	  double num1 =  Double.parseDouble(textOne);
	  double num2 =  Double.parseDouble(textTwo);
	  
	  
	  String result = Double.toString(num1 + num2);
	  Test.txtReslt.setText(result);
	  System.out.print(event.getSource());
		
	}

}
