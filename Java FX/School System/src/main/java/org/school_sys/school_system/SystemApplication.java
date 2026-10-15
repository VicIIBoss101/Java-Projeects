package org.school_sys.school_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SystemApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("system-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("School System");
        stage.setScene(scene);
        stage.show();
    }
}
