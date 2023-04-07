package preislerdev.javasnaketest.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import preislerdev.javasnaketest.FxmlFunc;

public class Map1Controller {
    private Parent root;
    private final FxmlFunc fxmlFunc = new FxmlFunc();
    @FXML
    void toMenuPage(ActionEvent event) throws Exception {
        FXMLLoader loader = fxmlFunc.loadFXML("map1");
        root = loader.load();
        fxmlFunc.loadPage(root, event);
    }
}
