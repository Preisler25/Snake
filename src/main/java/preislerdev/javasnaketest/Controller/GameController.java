package preislerdev.javasnaketest.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import preislerdev.javasnaketest.FxmlFunc;


public class GameController {
    private Parent root;
    private final FxmlFunc fxmlFunc = new FxmlFunc();
    @FXML
    Label nameLabel;

    public void display(String name) {
        nameLabel.setText(name);
    }

    @FXML
    public void startGame(ActionEvent event) throws Exception {
        FXMLLoader loader = fxmlFunc.loadFXML("map1");
        root = loader.load();
        fxmlFunc.loadPage(root, event);
    }

    @FXML
    public void toMenuPage(ActionEvent event) throws Exception {
        FXMLLoader loader = fxmlFunc.loadFXML("menu");
        root = loader.load();
        fxmlFunc.loadPage(root, event);
    }
}
