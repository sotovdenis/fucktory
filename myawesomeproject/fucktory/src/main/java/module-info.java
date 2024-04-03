module proj.fucktory {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens proj.fucktory to javafx.fxml;
    exports proj.fucktory;
}