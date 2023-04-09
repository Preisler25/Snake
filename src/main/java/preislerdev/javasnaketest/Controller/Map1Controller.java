package preislerdev.javasnaketest.Controller;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import preislerdev.javasnaketest.Util.Snake;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;


public class Map1Controller {
    //isMoving is used to check if the snake is moving or not
    static Boolean isMoving = false;
    //snakeObj is the snake object which is the character of the game
    static Snake snakeObj = new Snake(0, 0, 2, 1);
    //gameEngine is the timer which runs the game it's a global variable so it can be stopped and resigned with new tasks
    static Timer gameEngine;
    static Pane pane;
    static Rectangle active_apple;


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
        getPlayGround(stage);
        scene.setRoot(pane);
        genRandomApple(stage);

        //task is basically the main method of the game
        //its doing the movement, drawing and the collision detection
        TimerTask task = genTask(stage);
        gameEngine = new Timer();
        gameEngine.schedule(task, 0, 200);
    }

    public static void getPlayGround(Stage stage) {
        Rectangle rect = snakeObj.getSnakeHeadRect();
        pane = new Pane(rect);

        // Set the background color of the Pane to black
        BackgroundFill backgroundFill = new BackgroundFill(Color.BLACK, null, null);
        Background background = new Background(backgroundFill);
        pane.setBackground(background);
    }

    //stops the game
    public static void stopGame() {
        isMoving = false;
        gameEngine.cancel();
    }

    //game engine task which runs in a periodic manner
    public static TimerTask genTask(Stage stage) {
        return new TimerTask() {
            @Override
            public void run() {
                snakeObj.move();
                snakeObj.draw();
                checkCollision(stage);
            }
        };
    }

    static void checkCollision(Stage stage) {
        if (snakeObj.getSnakeHeadRect().getX() == active_apple.getX() && snakeObj.getSnakeHeadRect().getY() == active_apple.getY()) {
            System.out.println("Collision");
            snakeObj.grow(pane);
            pane.getChildren().remove(active_apple);
            genRandomApple(stage);
        }
    }

    //generates a random apple
    public static void genRandomApple(Stage stage) {
        int x = (int) Math.floor(Math.random() * 10);
        int y = (int) Math.floor(Math.random() * 10);

        active_apple = new Rectangle(100, 100);
        active_apple.setX(x*100);
        active_apple.setY(y*100);
        active_apple.setFill(Color.RED);
        pane.getChildren().add(active_apple);
    }
}