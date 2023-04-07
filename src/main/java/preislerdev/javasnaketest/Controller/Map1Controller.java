package preislerdev.javasnaketest.Controller;
import javafx.scene.Scene;
import preislerdev.javasnaketest.Util.Snake;
import preislerdev.javasnaketest.FxmlFunc;

public class Map1Controller {
    private final FxmlFunc fxmlFunc = new FxmlFunc();
    Snake snake = new Snake(0, 0, 0, 0, 0, 0);

    public static void startGame(Scene scene) {
        System.out.println("Game started");

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W ->  System.out.println("W");
            }
        });
    }
}
