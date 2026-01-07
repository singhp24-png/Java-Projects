import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// This class is created for connecting the event handling with Scene Builder
public class Controller {

	// NAMING IS IMPORTANT! These names are linked to their objects in Scene Builder
	// @FXML acts as a way to connect the scene builder object to the variable
	@FXML
	private ImageView cricketImage;

	@FXML
	private RadioButton commonFieldCricket, snowTreeCricket, commonKatydid;

	@FXML
	private TextField chirpsInput, secondsInput;

	@FXML
	private Label tempResult;

	// Three functions are needed for three different scenarios to display the
	// correct picture due to Scene Builder linking
	public void setCommonFieldCricketPicture(ActionEvent e) {

		cricketImage.setImage(new Image("commonFieldCricket.png"));
	}

	public void setSnowTreeCricketPicture(ActionEvent e) {

		cricketImage.setImage(new Image("snowyTreeCricket.JPG"));
	}

	public void setCommonKatydidPicture(ActionEvent e) {

		cricketImage.setImage(new Image("commonKatydid.jpg"));
	}

	public void exit(ActionEvent e) {

		javafx.application.Platform.exit();
	}

	// Displays the results from the form. Displays error pop-ups if needed
	public void result(ActionEvent e) {

		// Catches an exception when the user gives bad text input
		try {

			final int MINUTECONVERSION = 60;

			// String variable as it is easier to display the end result into the label
			String temperature = "";

			int chirps = Integer.parseInt(chirpsInput.getText());
			double seconds = Double.parseDouble(secondsInput.getText());

			double chirpsPerMinute = chirps / (seconds / MINUTECONVERSION);

			// Makes sure that input is not less than zero
			if (chirps < 0 || seconds < 0) {
				Alert negativeError = new Alert(AlertType.ERROR);
				negativeError.setHeaderText("Negative input");
				negativeError
						.setContentText("One or more input fields are negative, please type with positive numbers.");

				negativeError.showAndWait();
			}

			else {
				// Calculates temperature based on which radio button is selected.
				// If none are selected, then an error message appears
				if (commonFieldCricket.isSelected()) {

					temperature = String.format("%.2f", (50 + ((chirpsPerMinute - 40) / 4)));
				}

				else if (snowTreeCricket.isSelected()) {

					temperature = String.format("%.2f", (50 + ((chirpsPerMinute - 92) / 4.7)));
				}

				else if (commonKatydid.isSelected()) {

					temperature = String.format("%.2f", (60 + ((chirpsPerMinute - 19) / 3)));
				}

				else {
					Alert inputRadioButtonError = new Alert(AlertType.ERROR);
					inputRadioButtonError.setHeaderText("No selection");
					inputRadioButtonError.setContentText("Your input is invalid. Please select a cricket type. ");

					inputRadioButtonError.showAndWait();
				}

				tempResult.setText(temperature + " °F");

				// Displays different temperature errors
				if (Double.parseDouble(temperature) < 50 || Double.isNaN(Double.parseDouble(temperature))
						|| Double.isInfinite(Double.parseDouble(temperature))) {
					Alert tempError = new Alert(AlertType.ERROR);
					tempError.setHeaderText("Temperature Error");
					tempError.setContentText("Air temperature should not be less than 50 F, infinity, or NaN.");

					tempError.showAndWait();
				}
			}
		}

		catch (NumberFormatException exception) {

			Alert inputTextError = new Alert(AlertType.ERROR);
			inputTextError.setHeaderText("Typed input not valid");
			inputTextError.setContentText("Your input is invalid. Please fill out all text fields, "
					+ "have an integer for the chirps field, and no letters for both text fields.");

			inputTextError.showAndWait();
		}
	}
}