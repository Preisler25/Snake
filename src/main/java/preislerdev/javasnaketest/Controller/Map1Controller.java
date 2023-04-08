package preislerdev.javasnaketest.Controller;
import javafx.scene.Scene;
import javafx.stage.Stage;
import preislerdev.javasnaketest.Util.Snake;
import java.util.Timer;
import java.util.TimerTask;


public class Map1Controller {
    static Boolean isMoving = false;
    static Snake snakeObj = new Snake(0, 0, 2, 1);
    static Timer gameEngine;



    public static void startGame(Stage stage) {
        Scene scene = stage.getScene();

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case SPACE -> moveSnake(stage);
                case ESCAPE -> stopGame();
                case UP -> snakeObj.setDirection(0);
                case RIGHT -> snakeObj.setDirection(1);
                case DOWN -> snakeObj.setDirection(2);
                case LEFT -> snakeObj.setDirection(3);
            }
        });
    }

    public static void moveSnake(Stage stage) {
        if (isMoving) {
            return;
        }
        isMoving = true;
        snakeObj.setSnakeHeadRect(stage);


        TimerTask task = genTask();
        gameEngine = new Timer();
        gameEngine.schedule(task, 0, 200);
    }

    //stops the game
    public static void stopGame() {
        isMoving = false;
        gameEngine.cancel();
    }

    //game engine task which runs every 200ms
    public static TimerTask genTask() {
        return new TimerTask() {
            @Override
            public void run() {
                snakeObj.move();
                snakeObj.draw();
            }
        };
    }
}