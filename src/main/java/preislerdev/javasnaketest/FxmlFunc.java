package preislerdev.javasnaketest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlFunc {
    private Stage stage;
    private Scene scene;

    public void loadPage(Parent root, ActionEvent event) {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public FXMLLoader loadFXML(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml + ".fxml"));
        return loader;
    }

}
