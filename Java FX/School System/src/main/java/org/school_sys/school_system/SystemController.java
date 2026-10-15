package org.school_sys.school_system;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SystemController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
