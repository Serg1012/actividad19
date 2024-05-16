module com.empresa.actividad19 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.actividad19 to javafx.fxml;
    exports com.empresa.actividad19;
}