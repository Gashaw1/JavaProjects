



import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos; 
import javafx.scene.Scene; 

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import javafx.scene.text.Font;

import javafx.stage.Stage; 

public class TextEditor extends Application implements EventHandler<ActionEvent> {

	Label fileName;
	TextArea textArea;
	TextArea txtField;
	static Button btn1;
	static Button btn2;
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Simple text editor");	
		
		fileName = new Label("File name");
		fileName.setMinSize(100, 30);	
		fileName.setFont(new Font("Arial", 15));
		fileName.setAlignment(Pos.CENTER);
		fileName.setStyle("-fx-background-color: #ffffff; ");
		
		TextField textField = new TextField();
		textField.setMinSize(400, 30);	
		textField.setStyle("-fx-font-size: 15px; ");
       
       
		btn1=new Button("Get");
		btn1.setMinSize(60, 30);	
		btn1.setFont(new Font("Arial", 15));
		btn1.setStyle("-fx-border-color: lightgray; ");	
		
		btn2=new Button("Save");
		btn2.setMinSize(60, 30);	
		btn2.setFont(new Font("Arial", 15));		
		btn2.setStyle("-fx-border-color: lightgray; ");
		
		textArea = new TextArea();
		textArea.setWrapText(true);
		textArea.setMinSize(700, 600);
		textArea.setFont(new Font("Arial", 20));			
		textArea.setPrefColumnCount(20);
		
		
		btn1.setOnAction(this);
		btn2.setOnAction(this);	
		
		FlowPane flowpane = new FlowPane();
        
        flowpane.getChildren().add(fileName);
        flowpane.getChildren().add(textField);
        flowpane.getChildren().add(btn1);
        flowpane.getChildren().add(btn2);
        flowpane.getChildren().add(textArea);        
      
        Scene scene = new Scene(flowpane, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
		
		
	}

	@Override
	public void handle(ActionEvent event) 
	{
		if(event.getSource()==btn1)
		{
			textArea.appendText(btn1.getText() + "");
			System.out.println(btn1.getText());
		}
		if(event.getSource()==btn2)
		{
			textArea.appendText(btn2.getText() + "\n");
			System.out.println(btn2.getText());
		}	
	
	}
}
