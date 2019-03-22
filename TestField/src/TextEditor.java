


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos; 
import javafx.scene.Scene; 

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javafx.scene.layout.GridPane;  
import javafx.stage.Stage; 

public class TextEditor extends Application implements EventHandler<ActionEvent> {

	static TextArea txtDisplay;
	
	static Button btn1;
	static Button btn2;
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		btn1=new Button("Get");
		btn1.setMinSize(70, 50);		
		//btn1.getOnAction();
		
		btn2=new Button("save");
		btn2.setMinSize(70, 50);
		
		txtDisplay = new TextArea();
		txtDisplay.setMinSize(500, 400);
		
		//txtDisplay.TextArea(Pos.TOP_LEFT);
		txtDisplay.setPrefColumnCount(20);
		txtDisplay.setMaxWidth(200);
		
		btn1.setOnAction(this);
		btn2.setOnAction(this);
		
		GridPane grid = new GridPane();	
		grid.setMinSize(550, 600);		
		grid.setAlignment(Pos.CENTER);
		
		grid.add(txtDisplay, 1,1);
		grid.add(btn1, 1, 2); 
		grid.add(btn2, 1, 3); 
		
		
		Scene scene = new Scene(grid); 
		primaryStage.setScene(scene);		
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) 
	{
		if(event.getSource()==btn1)
		{
			btn1.getText();
			System.out.print(btn1.getText());
		}
		
		//String r = ((Button)event.getSource()).getText();
		//String text = txtDisplay.getText();
		//System.out.println(r + " \n" + text);
	}
}
