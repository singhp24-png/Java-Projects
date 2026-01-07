// Prabhlean Singh
// CIS 2212 
// 11/14/2023
// A program that displays a house drawing

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class PictureDriver extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Picture.paint(pane);

		Scene scene = new Scene(pane, 1000, 1000);
		primaryStage.setTitle("House");
		primaryStage.setScene(scene);

		// Makes it to where the stage is not resizable so it does not break when
		// resized
		primaryStage.setResizable(false);

		// Display the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}