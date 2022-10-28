module com.mycompany.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.simplecalculator to javafx.fxml;
    exports com.mycompany.simplecalculator;
}
