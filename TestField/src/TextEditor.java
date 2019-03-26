



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
	TextField txtFileName;
	static Button btnGet;
	static Button btnSave;
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
		
	    txtFileName = new TextField();
		txtFileName.setMinSize(400, 30);	
		txtFileName.setStyle("-fx-font-size: 15px; ");
       
       
		btnGet=new Button("Get");
		btnGet.setMinSize(60, 30);	
		btnGet.setFont(new Font("Arial", 15));
		btnGet.setStyle("-fx-border-color: lightgray; ");	
		
		btnSave=new Button("Save");
		btnSave.setMinSize(60, 30);	
		btnSave.setFont(new Font("Arial", 15));		
		btnSave.setStyle("-fx-border-color: lightgray; ");
		
		textArea = new TextArea();
		textArea.setWrapText(true);
		textArea.setMinSize(700, 600);
		textArea.setFont(new Font("Arial", 20));			
		textArea.setPrefColumnCount(20);
		
		
		btnGet.setOnAction(this);
		btnSave.setOnAction(this);	
		
		FlowPane flowpane = new FlowPane();
        
        flowpane.getChildren().add(fileName);
        flowpane.getChildren().add(txtFileName);
        flowpane.getChildren().add(btnGet);
        flowpane.getChildren().add(btnSave);
        flowpane.getChildren().add(textArea);        
      
        Scene scene = new Scene(flowpane, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
		
		
	}

	@Override
	public void handle(ActionEvent event) 
	{		
		if(event.getSource()==btnGet)
		{	
			textArea.appendText(txtFileName.getText() + "");
			System.out.println(btnGet.getText());
		}
		if(event.getSource()==btnSave)
		{
			textArea.appendText(btnSave.getText() + "\n");
			System.out.println(btnSave.getText());
		}	
	
	}
}
