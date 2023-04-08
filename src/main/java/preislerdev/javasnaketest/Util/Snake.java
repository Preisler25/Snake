package preislerdev.javasnaketest.Util;

public class Snake implements Object{
    private int x;
    private int y;
    private int width;
    private int height;
    private int direction;
    private int length;

    public Snake(int x, int y, int width, int height, int direction, int length) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;
        this.length = length;
    }
    @Override
    public void draw() {

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getSnakeLength() {
        return length;
    }

public void setSnakeLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void move() {
        switch (direction) {
            case 0:
                y -= 10;
                break;
            case 1:
                x += 10;
                break;
            case 2:
                y += 10;
                break;
            case 3:
                x -= 10;
                break;
        }
    }
}
