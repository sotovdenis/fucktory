module proj.fucktory {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens proj.fucktory to javafx.fxml;
    exports proj.fucktory;
    exports proj.fucktory.controller;
    opens proj.fucktory.controller to javafx.fxml;
}