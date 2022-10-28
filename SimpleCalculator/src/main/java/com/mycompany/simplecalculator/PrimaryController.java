package com.mycompany.simplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField firstOperand;

    @FXML
    private TextField resultTextArea;

    @FXML
    private TextField secondOperand;

    @FXML
    void sumButtonPressed(ActionEvent event) {
        int n1 = Integer.parseInt(firstOperand.getText());
        int n2 = Integer.parseInt(secondOperand.getText());
        
        int sum = n1 + n2;
        
        resultTextArea.setText(String.format("The sum of %d and %d is %d.", n1, n2, sum));
    }
        @FXML
    void subtractionButtonPressed(ActionEvent event) {
        int n1 = Integer.parseInt(firstOperand.getText());
        int n2 = Integer.parseInt(secondOperand.getText());
        
        int diff = n1 - n2;
        
        resultTextArea.setText(String.format("The difference of %d and %d is %d.", n1, n2, diff));
    }
            @FXML
    void productButtonPressed(ActionEvent event) {
        int n1 = Integer.parseInt(firstOperand.getText());
        int n2 = Integer.parseInt(secondOperand.getText());
        
        int prod = n1 * n2;
        
        resultTextArea.setText(String.format("The product of %d and %d is %d.", n1, n2, prod));
    }
                @FXML
    void quotientButtonPressed(ActionEvent event) {
        int n1 = Integer.parseInt(firstOperand.getText());
        int n2 = Integer.parseInt(secondOperand.getText());
        
        int quot = n1 / n2;
        
        resultTextArea.setText(String.format("The quotient of %d and %d is %d.", n1, n2, quot));
    }
}
