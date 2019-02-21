
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Test extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	static Button btnAdd;
	static TextField txtField;
	static TextField txtField2;

	static Label txtReslt;
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		btnAdd = new Button("Add");
		btnAdd.setMinSize(70, 50);

		txtField = new TextField();
		txtField.setMinSize(200, 65);

		txtField2 = new TextField();
		txtField2.setMinSize(200, 65);
		
		//for result
		txtReslt = new Label();
		txtReslt.setMinSize(200, 65);
				

		GridPane grid = new GridPane();
		grid.setMinSize(400, 500);
		grid.setAlignment(Pos.CENTER);

		grid.add(txtReslt, 1, 1);
		grid.add(txtField, 1, 2);
		grid.add(txtField2, 1, 3);
		grid.add(btnAdd, 1, 4);

		MyEventHandler myeve = new MyEventHandler();
		btnAdd.setOnAction(myeve);
		
		Scene  scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
