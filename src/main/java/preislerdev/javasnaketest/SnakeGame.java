package preislerdev.javasnaketest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.util.Objects;

public class SnakeGame extends Application {
    private final FxmlFunc fxmlFunc = new FxmlFunc();

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = fxmlFunc.loadFXML("menu");
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());

        Image icon = new Image("file:src/main/resources/icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Snake");
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}