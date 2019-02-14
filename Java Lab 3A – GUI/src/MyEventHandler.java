import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent> {
	
	@Override
	public void handle(ActionEvent event)
	{	
		
		if(event.getSource() == TestGUI.btn1)
		{			
			System.out.println("Button " + TestGUI.btn1.getText() + " clicked");	
		}
	    if(event.getSource() == TestGUI.btn2)
		{			
			System.out.println("Button " + TestGUI.btn2.getText() + " clicked");
		}
	    if(event.getSource() == TestGUI.btn3)
		{			
			System.out.println("Button " + TestGUI.btn3.getText() + " clicked");
		}
	    if(event.getSource() == TestGUI.btn4)
		{			
			System.out.println("Button " + TestGUI.btn4.getText() + " clicked");
		}
	    if(event.getSource() == TestGUI.btn5)
		{			
			System.out.println("Button " + TestGUI.btn5.getText() + " clicked");
		}
	    if(event.getSource() == TestGUI.btn6)
		{			
			System.out.println("Button " + TestGUI.btn6.getText() + " clicked");
		}		
				
	}

}
