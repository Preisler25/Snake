package preislerdev.javasnaketest.Controller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import preislerdev.javasnaketest.Util.Snake;

public class Map1Controller {
    @FXML
    private static Circle snakeHead;
    private static double snakeHeadX;
    private static double snakeHeadY;
    Snake snake = new Snake(0, 0, 0, 0, 0, 0);


    static void moveSnakeUp() {
        System.out.println("Snake moved up");
        snakeHead.setCenterY(snakeHeadY -= 10);
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