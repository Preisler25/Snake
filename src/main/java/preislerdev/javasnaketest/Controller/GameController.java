package preislerdev.javasnaketest.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import preislerdev.javasnaketest.FxmlFunc;


public class GameController {
    private Parent root;
    private final FxmlFunc fxmlFunc = new FxmlFunc();

    @FXML
    public void startGame(ActionEvent event) throws Exception {
        FXMLLoader loader = fxmlFunc.loadFXML("map1");
        root = loader.load();

        Map1Controller map1Controller = loader.getController();
        Map1Controller.startGame(fxmlFunc.getStage(event).getScene());

        fxmlFunc.loadPage(root, event);
    }

    @FXML
    public void toMenuPage(ActionEvent event) throws Exception {
        FXMLLoader loader = fxmlFunc.loadFXML("menu");
        root = loader.load();
        fxmlFunc.loadPage(root, event);
    }
}
