

import java.awt.Event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.text.Text;
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage; 

public class SimpleCalculator extends Application 
{
	
	static Button btn0;
	static Button btn1;
	static Button btn2;
	static Button btn3;
	static Button btn4;
	static Button btn5;
	static Button btn6;
	static Button btn7;
	static Button btn8;
	static Button btn9;
	static Button btnDot;
	static Button btnEqual;
	static Button btnDivi;
	static Button btnAdd;
	static Button btnMult;
	static Button btnSub;
	static Button btnClear;
   
	static TextField txtDisplay;
	
	Text text;

	public static void main(String[] args) 
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		btn1=new Button("1");
		btn1.setMinSize(70, 50);		
		//btn1.getOnAction();
		
		btn2=new Button("2");
		btn2.setMinSize(70, 50);
		btn3=new Button("3");
		btn3.setMinSize(70, 50);
		btn4=new Button("4");
		btn4.setMinSize(70, 50);
		btn5=new Button("5");
		btn5.setMinSize(70, 50);
		btn6=new Button("6");
		btn6.setMinSize(70, 50);
		btn7=new Button("7");
		btn7.setMinSize(70, 50);
		btn8=new Button("8");
		btn8.setMinSize(70, 50);
		btn9=new Button("9");
		btn9.setMinSize(70, 50);
		btn0=new Button("0");
		btn0.setMinSize(70, 50);
		btnDot=new Button(".");
		btnDot.setMinSize(70, 50);
		
		
		btnMult=new Button("*");
		btnMult.setMinSize(70, 50);
		btnAdd=new Button("+");
		btnAdd.setMinSize(70, 50);
		btnSub=new Button("-");
		btnSub.setMinSize(70, 50);
		btnDivi=new Button("/");
		btnDivi.setMinSize(70, 50);
		
		btnClear=new Button("Clear");
		btnClear.setMinSize(70, 50);
		btnEqual=new Button("=");
		btnEqual.setMinSize(70, 50);
		
		txtDisplay = new TextField();
		txtDisplay.setMinSize(300, 65);
		
		Calculator caluclatorAndEvent = new Calculator();
		
		
		
		btn0.setOnAction(caluclatorAndEvent);
		btn1.setOnAction(new Calculator());
		btn2.setOnAction(caluclatorAndEvent);
		btn3.setOnAction(caluclatorAndEvent);
		
		
		btnAdd.setOnAction(caluclatorAndEvent);
		btnSub.setOnAction(caluclatorAndEvent);
		btnDivi.setOnAction(caluclatorAndEvent);
		btnMult.setOnAction(caluclatorAndEvent);
		
		btnClear.setOnAction(caluclatorAndEvent);
		btnEqual.setOnAction(caluclatorAndEvent);
		
		
		//Panel pan = new Panel()
		
		
		GridPane grid = new GridPane();	
		grid.setMinSize(400, 500);		
		grid.setAlignment(Pos.CENTER);
		
		
	    grid.add(txtDisplay, 1,0,4,1);
	
	    
		grid.add(btn7, 1, 1); 
		grid.add(btn8, 2, 1); 
		grid.add(btn9, 3, 1); 
		grid.add(btnAdd, 4, 1); 
		
		grid.add(btn4, 1, 2); 
		grid.add(btn5, 2, 2); 
		grid.add(btn6, 3, 2); 
		grid.add(btnSub, 4, 2); 
		
		grid.add(btn1, 1, 3); 
		grid.add(btn2, 2, 3); 
		grid.add(btn3, 3, 3); 
		grid.add(btnDivi, 4, 3); 
		
		grid.add(btn0, 1, 4); 
		grid.add(btnDot, 2, 4); 
		grid.add(btnEqual, 3, 4); 
		grid.add(btnMult, 4, 4); 
		
		grid.add(btnClear, 1, 5); 
	
	   		
		//Setting the vertical and horizontal gaps between the columns 
		grid.setVgap(5); 
		grid.setHgap(5); 
		  
		Scene scene = new Scene(grid); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
