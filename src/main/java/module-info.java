module preislerdev.javasnaketest {
    requires javafx.controls;
    requires javafx.fxml;


    opens preislerdev.javasnaketest to javafx.fxml;
    exports preislerdev.javasnaketest;
}