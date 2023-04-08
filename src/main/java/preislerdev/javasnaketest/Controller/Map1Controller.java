package preislerdev.javasnaketest.Controller;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import preislerdev.javasnaketest.Util.Snake;

import java.util.Timer;
import java.util.TimerTask;


public class Map1Controller {
    static Boolean isMoving = false;
    static Snake snakeObj = new Snake(10, 10, 10, 10, 0, 1);
    static Timer gameEngine;

    public static void moveSnake(Stage stage) {
        if (isMoving) {
            return;
        }

        isMoving = true;

        Scene scene = stage.getScene();
        Parent root = scene.getRoot();
        Rectangle snakeRect= (Rectangle) root.lookup("#myObj");

        TimerTask task = genTask();
        gameEngine = new Timer();
        gameEngine.schedule(task, 0, 200);
    }

    public static TimerTask genTask() {
        return new TimerTask() {
            @Override
            public void run() {
                snakeObj.move();
            }
        };
    }

    void inGame() {
        if (isMoving) {

        }else{

        }
    }

    public static void stopGame() {
        isMoving = false;
        gameEngine.cancel();
        System.out.println("Game stopped");
    }

    public static void startGame(Stage stage) {
        Scene scene = stage.getScene();

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case SPACE -> moveSnake(stage);
                case ESCAPE -> stopGame();
            }
        });
    }
}