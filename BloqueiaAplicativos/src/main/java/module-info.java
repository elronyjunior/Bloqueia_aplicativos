module elronyjunior.bloqueiaaplicativos {
    requires javafx.controls;
    requires javafx.fxml;

    opens elronyjunior.bloqueiaaplicativos to javafx.fxml;
    exports elronyjunior.bloqueiaaplicativos;
    requires com.fasterxml.jackson.databind;
}
