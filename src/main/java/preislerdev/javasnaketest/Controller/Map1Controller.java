package preislerdev.javasnaketest.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import preislerdev.javasnaketest.Util.Snake;
import java.util.Timer;
import java.util.TimerTask;


public class Map1Controller {
    //isMoving is used to check if the snake is moving or not
    static Boolean isMoving = false;
    //snakeObj is the snake object which is the character of the game
    static Snake snakeObj = new Snake(0, 0, 2, 1);
    //gameEngine is the timer which runs the game it's a global variable so it can be stopped and resigned with new tasks
    static Timer gameEngine;



    //this method is called from the gameMenu, and it's going to start listening for key presses
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


    //this method is controlling what happens after the snake is moving
    public static void moveSnake(Stage stage) {
        if (isMoving) {
            return;
        }
        System.out.println("Snake is moving");
        isMoving = true;
        snakeObj.setSnakeHeadRect(stage);

        Scene scene = stage.getScene();
        Rectangle rect = snakeObj.getSnakeHeadRect();
        Group root = new Group(rect);
        scene.setRoot(root);

        genRandomApple(stage);
        //task is basically the main method of the game
        //its doing the movement, drawing and the collision detection
        TimerTask task = genTask();
        gameEngine = new Timer();
        gameEngine.schedule(task, 0, 200);
    }

    //stops the game
    public static void stopGame() {
        isMoving = false;
        gameEngine.cancel();
    }

    //game engine task which runs in a periodic manner
    public static TimerTask genTask() {
        return new TimerTask() {
            @Override
            public void run() {
                snakeObj.move();
                snakeObj.draw();
            }
        };
    }

    //generates a random apple
    public static void genRandomApple(Stage stage) {
        //TODO: generate random apple x and y pos
        int x = (int) Math.floor(Math.random() * 10);
        int y = (int) Math.floor(Math.random() * 10);

        Rectangle apple = new Rectangle(100, 100);
        apple.setX(x*100);
        apple.setY(y*100);

        System.out.println(stage.getScene().getRoot().getChildrenUnmodifiable());
        stage.show();
    }
}