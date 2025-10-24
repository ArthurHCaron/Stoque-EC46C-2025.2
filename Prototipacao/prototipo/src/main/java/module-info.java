module com.mycompany.prototipo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.prototipo to javafx.fxml;
    exports com.mycompany.prototipo;
}
