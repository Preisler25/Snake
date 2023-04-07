package preislerdev.javasnaketest.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import preislerdev.javasnaketest.FxmlFunc;


public class MenuController {
    private Parent root;
    private final FxmlFunc fxmlFunc = new FxmlFunc();

    @FXML
    protected void closeApp(ActionEvent event) {
        System.exit(0);
    }
    @FXML
    protected void toGamePage(ActionEvent event) throws Exception {
        //loading the fxml file;
        FXMLLoader loader = fxmlFunc.loadFXML("game");
        root = loader.load();

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