package preislerdev.javasnaketest.Controller;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import preislerdev.javasnaketest.Util.Snake;
import preislerdev.javasnaketest.FxmlFunc;
import javafx.scene.input.KeyEvent;

public class Map1Controller {
    private final FxmlFunc fxmlFunc = new FxmlFunc();
    Snake snake = new Snake(0, 0, 0, 0, 0, 0);

    public static void startGame(Scene scene) {
        System.out.println("Game started");
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (new KeyCodeCombination(KeyCode.W).match(event)) {
                    System.out.println("W");
                }
                if (new KeyCodeCombination(KeyCode.A).match(event)) {
                    System.out.println("W");
                }
                if (new KeyCodeCombination(KeyCode.S).match(event)) {
                    System.out.println("W");
                }
                if (new KeyCodeCombination(KeyCode.D).match(event)) {
                    System.out.println("W");
                }
            }
        });
    }
}
