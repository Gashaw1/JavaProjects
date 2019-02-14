

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class JavaFxGUI extends Application {

	public static void main(String[] args) {		
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception 
	{
		Button btn = new Button("Clic");
		
		stage.setTitle("JavaFx Practice");	
		StackPane layOut = new StackPane();
		layOut.getChildren().add(btn);
		Scene scene = new Scene(layOut,444,444);
		stage.setScene(scene);
		stage.show();
		
	}

}
