package GIF;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class FIGController {
    private int convFactor = 1;
    @FXML
    private ComboBox unitBox;

    @FXML
    private Label weightUnit;

    @FXML
    private Label heightUnit;

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private Label BMIResult;

    @FXML
    private VBox resultViewBox;

    @FXML
    void onCalculatePresed(ActionEvent event) {
        try {

            float weight = Float.parseFloat(weightTextField.getText());
            float height = Float.parseFloat(heightTextField.getText());
            float result = (convFactor * weight)/(height*height);
            String stringResult = String.format("%.02f", result);
            BMIResult.setText(stringResult);
            if (result<18){
                resultViewBox.setStyle("-fx-background-color:   #FEB132");
            }
            else if (result<24.9){
                resultViewBox.setStyle("-fx-background-color:   #30A232");
            }
            else if (result<29.9){
                resultViewBox.setStyle("-fx-background-color:   #E96024");
            }else{
                resultViewBox.setStyle("-fx-background-color:   #C0101B");
            }
        } catch(Exception e) {
            if (e.getMessage() == "empty String"){
                BMIResult.setText("The fields can not be empty");
            }
            else {
                BMIResult.setText("The fields must be in numbers");
            }
        }


    }

    @FXML
    void onResetPressed(ActionEvent event) {
        weightTextField.setText("");
        heightTextField.setText("");
        BMIResult.setText("Please fill the empty fields");
    }

    @FXML
    void onUnitBoxUpdated(ActionEvent event) {

        if (unitBox.getValue().toString()=="Metric"){
            weightUnit.setText("kg");
            heightUnit.setText("m");
            convFactor = 1;
        }
        else{
            weightUnit.setText("lbs");
            heightUnit.setText("in");
            convFactor = 703;
        };
    }

    /* This function starts in the beginning of the program */
    public void initialize(){
        unitBox.getItems().addAll("Metric","English");
    }

}
