module com.jack.mbs.moviebookingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens com.jack.mbs.moviebookingsystem to javafx.fxml;
    exports com.jack.mbs.moviebookingsystem;
}