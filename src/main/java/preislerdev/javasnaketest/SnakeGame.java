package preislerdev.javasnaketest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SnakeGame extends Application {
    private FxmlFunc fxmlFunc = new FxmlFunc();

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = fxmlFunc.loadFXML("menu");
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        Image icon = new Image("file:src/main/resources/icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Snake");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}