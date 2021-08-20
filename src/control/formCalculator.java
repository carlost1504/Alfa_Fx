package control;

import model.*;
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
    public void Multiple(ActionEvent event) {
    	int getdenominator=Integer.parseInt(denominatorFX.getText());
    	int getnumerator=Integer.parseInt(numeratorTX.getText());
    	int multi=Operations.multiplication( getnumerator, getdenominator);
    	String messag = "multiplication is "+multi;
    	txtFX1.setText(messag);
    }

    @FXML
    public void division(ActionEvent event) {
    	int getdenominator=Integer.parseInt(denominatorFX.getText());
    	int getnumerator=Integer.parseInt(numeratorTX.getText());
    	int divis=Operations.division( getnumerator, getdenominator);
    	String messag;
    	if (divis!=0) {
    		messag = "division is "+divis;
    	}else {
    		messag = "invalid division because denominator is 0 ";
    	}
    	txtFX2.setText(messag);
    	
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
