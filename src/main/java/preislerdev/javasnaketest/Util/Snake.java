package preislerdev.javasnaketest.Util;

public class Snake implements Object {
    private int x;
    private int y;
    private int size;
    private int direction;
    private int speed;
    private int score;
    private boolean isAlive;

    public Snake(int x, int y, int size, int direction, int speed, int score, boolean isAlive) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.direction = direction;
        this.speed = speed;
        this.score = score;
        this.isAlive = isAlive;
    }

    @Override
    public void update() {
    }

    @Override
    public void render() {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

