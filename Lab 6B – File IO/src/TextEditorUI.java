

import java.io.File;

import java.io.IOException;

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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextEditorUI extends Application implements EventHandler<ActionEvent> {

	Label fileName;
	static TextArea textArea;
	static Text text;
	TextField txtFilename;
	static Button btnGet;
	static Button btnSave;	
	static Button btnCreateFile;
	FileEditor fileEditor;
	File file;	

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Simple text editor");

		fileName = new Label("File name");
		fileName.setMinSize(100, 30);
		fileName.setFont(new Font("Arial", 15));
		fileName.setAlignment(Pos.CENTER);
		fileName.setStyle("-fx-background-color: #ffffff; ");

		txtFilename = new TextField();
		txtFilename.setMinSize(400, 30);
		txtFilename.setStyle("-fx-font-size: 15px; ");

		btnGet = new Button("Get");
		btnGet.setMinSize(60, 30);
		btnGet.setFont(new Font("Arial", 15));
		btnGet.setStyle("-fx-border-color: lightgray; ");

		btnSave = new Button("Save");
		btnSave.setMinSize(60, 30);
		btnSave.setFont(new Font("Arial", 15));
		btnSave.setStyle("-fx-border-color: lightgray; ");

		btnCreateFile = new Button("+ New file");
		btnCreateFile.setMinSize(60, 30);
		btnCreateFile.setFont(new Font("Arial", 15));
		btnCreateFile.setStyle("-fx-border-color: lightgray; ");
		
		textArea = new TextArea();
		textArea.setFont(new Font("Arial", 20));
		textArea.setStyle("-fx-font-family: monospace");
		textArea.setWrapText(true);
		textArea.setMinSize(1000 ,900);
		textArea.setMinSize(1000, 900);
		
	

		btnGet.setOnAction(this);
		btnCreateFile.setOnAction(this);
		btnSave.setOnAction(this);

		FlowPane flowpane = new FlowPane();

		flowpane.getChildren().addAll(fileName, txtFilename,btnCreateFile, btnGet, btnSave, textArea);		

		Scene scene = new Scene(flowpane, 1000, 900);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent event)
	{
		
		String txtName = txtFilename.getText();
		
		if(event.getSource() == btnCreateFile)
		{
			if(!txtName.isEmpty())
			{
				try {
					if(FileEditor.IsFileExist(txtName)==false)
					{
					   String result = FileEditor.CreatFile(txtName);
					   
					   if(result == "1")
					   {
						   textArea.setText("file created as " + txtName);
					   }
					}
					else
					{
						textArea.setText("Try another name " + txtName);
						
					}
				} catch (IOException e) {
					
					e.getLocalizedMessage();
				}
			}
		}
		
		
		if (event.getSource() == btnGet) 
		{			
			if (!txtName.isEmpty()) 
			{	
				textArea.setText("");
				try 
			    {
					 fileEditor = new FileEditor();
				     file = fileEditor.GetFile(txtFilename.getText());
				     String result = fileEditor.ReadFile(file.getAbsolutePath());
				     textArea.appendText(result);				     
				 	  
				}
			    catch (IOException e)
			    {					
					e.getMessage().toString();
				}				
			}
		}
		if (event.getSource() == btnSave) 
		{
			String filename = txtFilename.getText();
			try {
				if(FileEditor.IsFileExist(filename)== true)
				{
					fileEditor = new FileEditor();
					try 
					{
						fileEditor.WrtiteContentToFile(file.getAbsolutePath(), textArea.getText());
					} 
					catch (IOException e)
					{
						e.getMessage().toString();
					}
				}
			} catch (IOException e)
			{
				
				e.getMessage().toString();
			}
			
			
		}

	}

}
