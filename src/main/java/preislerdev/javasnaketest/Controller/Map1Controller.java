package preislerdev.javasnaketest.Controller;

import javafx.event.ActionEvent;
import preislerdev.javasnaketest.Util.Snake;

public class Map1Controller {
    private Snake snake;

    void startGame(ActionEvent event) throws Exception {
        while (snake.isAlive()) {
            update();
        }
    }

    void update() {
        snake.update();
    }
}
