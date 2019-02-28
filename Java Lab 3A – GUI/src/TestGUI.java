import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class TestGUI extends Application  {
	
	static Button btn1;
	static Button btn2;
	static Button btn3;
	static Button btn4;
	static Button btn5;
	static Button btn6;
		
	public static void main(String[] args) 
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");		
		
		MyEventHandler myEvent = new MyEventHandler();		
		btn1.setOnAction(myEvent);
		btn2.setOnAction(myEvent);
		btn3.setOnAction(myEvent);
		btn4.setOnAction(myEvent);
		btn5.setOnAction(myEvent);
		btn6.setOnAction(myEvent);
		
		
		FlowPane layout = new FlowPane();
		layout.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
		
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
        primaryStage.show();	
        
        
      
	}

	

}
