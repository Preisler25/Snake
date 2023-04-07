package preislerdev.javasnaketest.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import preislerdev.javasnaketest.FxmlFunc;


public class MenuController {
    private Parent root;
    private FxmlFunc fxmlFunc = new FxmlFunc();
    @FXML
    protected void toGamePage(ActionEvent event) throws Exception {

        String username = "name";

        //loading the fxml file;
        FXMLLoader loader = fxmlFunc.loadFXML("game");
        root = loader.load();

        //passing the username to the game page
        GameController gameController = loader.getController();
        gameController.display(username);

        //loading the scene
        fxmlFunc.loadPage(root, event);
    }
    @FXML
    protected void toSettingsPage(ActionEvent event) throws Exception {
        //loading the fxml file;
        FXMLLoader loader = fxmlFunc.loadFXML("settings");
        root = loader.load();

        //loading the scene
        fxmlFunc.loadPage(root, event);
    }
    @FXML
    protected void toProfilePage(ActionEvent event) throws Exception {
        FXMLLoader loader = fxmlFunc.loadFXML("profile");
        root = loader.load();

        //loading the scene
        fxmlFunc.loadPage(root, event);
    }
}