package preislerdev.javasnaketest.Util;

public class Apple implements Object {
    private int x;
    private int y;

    public Apple(int x, int y) {
        this.x = x;
        this.y = y;
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
}