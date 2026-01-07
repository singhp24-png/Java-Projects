// Prabhlean Singh
// 11/25/2023
// CIS 2212
// A program that displays an interactive GUI for a cricket thermometer

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CricketThermometerDriver extends Application {

	@Override
	public void start(Stage primaryStage) {

		// Since it uses Scene Builder, a try catch is needed
		try {
			Parent root = FXMLLoader.load(getClass().getResource("CricketScene.fxml"));

			Scene scene = new Scene(root);

			primaryStage.setScene(scene);

			stageProperties(primaryStage);

			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Good practice if other IDE's are used
	public static void main(String[] args) {
		launch(args);
	}

	// Sets different properties of the stage
	public static void stageProperties(Stage primaryStage) {

		primaryStage.setTitle("Cricket Thermometer");
		primaryStage.setResizable(false);
	}

}
