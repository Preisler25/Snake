module preislerdev.javasnaketest {
    requires javafx.controls;
    requires javafx.fxml;


    opens preislerdev.javasnaketest to javafx.fxml;
    exports preislerdev.javasnaketest;
    exports preislerdev.javasnaketest.Controller;
    opens preislerdev.javasnaketest.Controller to javafx.fxml;
    exports preislerdev.javasnaketest.Func;
    opens preislerdev.javasnaketest.Func to javafx.fxml;
    exports preislerdev.javasnaketest.Util;
    opens preislerdev.javasnaketest.Util to javafx.fxml;
}