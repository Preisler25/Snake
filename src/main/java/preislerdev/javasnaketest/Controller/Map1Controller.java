package preislerdev.javasnaketest.Controller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import preislerdev.javasnaketest.Util.Snake;

public class Map1Controller {
    @FXML
    private static Circle myObj;

    private static double snakeHeadX = 0;
    private static double snakeHeadY = 0;
    Snake snake = new Snake(0, 0, 0, 0, 0, 0);


    static void ref() {
        System.out.println("Snake head X: " + snakeHeadX);
        System.out.println("Snake head Y: " + snakeHeadY);
    }

    static void moveSnakeUp() {
        System.out.println("Snake moved up");
        snakeHeadY = snakeHeadY - 10;
        myObj.setCenterY(snakeHeadY);
        ref();
    }

    public static void startGame(Stage stage) {
        Scene scene = stage.getScene();
        System.out.println("Game started");

        stage.setScene(scene);
        stage.show();


        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W -> moveSnakeUp();
            }
        });
    }
}