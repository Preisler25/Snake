package preislerdev.javasnaketest.Util;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snake implements Object{
    private int x;
    private int y;
    private int width;
    private int height;
    private int direction;
    private int length;
    private Rectangle snakeHeadRect;

    public Snake(int x, int y, int direction, int length) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.length = length;
    }
    @Override
    public void draw() {
        snakeHeadRect.setX(x);
        snakeHeadRect.setY(y);
    }

    //X
    @Override
    public int getX() {
        return x;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }

    //Y
    @Override
    public int getY() {
        return y;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getSnakeLength() {
        return length;
    }

    public void setSnakeLength(int length) {this.length = length;}

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setSnakeHeadRect(Stage stage) {
        Scene scene = stage.getScene();
        Parent root = scene.getRoot();
        this.snakeHeadRect = (Rectangle) root.lookup("#myObj");
    }


    public void move() {
        switch (direction) {
            case 0 -> y -= 100;
            case 1 -> x += 100;
            case 2 -> y += 100;
            case 3 -> x -= 100;
        }
    }
}
