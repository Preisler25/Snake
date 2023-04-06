package preislerdev.javasnaketest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label helloText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX!");
        helloText.setText("Hello, JavaFX!");
    }
}