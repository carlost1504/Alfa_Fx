package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class formCalculator {

    @FXML
    private TextField denominatorFX;

    @FXML
    private TextField numeratorTX;

    @FXML
    private Label txtFX1;

    @FXML
    private Label txtFX2;

    @FXML
    void Multiple(ActionEvent event) {

    }

    @FXML
    void division(ActionEvent event) {

    }

	public Stage build() {
		try {
			Parent root= FXMLLoader.load(getClass().getResource("formCalculator.fxml"));
			Scene scene = new Scene(root, 388,200);
			Stage stage=new Stage();
			stage.setScene(scene);
			return stage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
