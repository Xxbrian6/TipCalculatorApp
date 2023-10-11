module com.example.tipcalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.tipcalculatorapp to javafx.fxml;
    exports com.example.tipcalculatorapp;
}