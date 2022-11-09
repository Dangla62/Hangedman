module hangman.hangedman {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens hangman.hangedman to javafx.fxml;
    exports hangman.hangedman;
}