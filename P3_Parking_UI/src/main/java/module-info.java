module org.example.actualjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    // Solo incluye módulos que realmente sean modulares
    requires org.controlsfx.controls; // Asegúrate que ControlsFX sea compatible
    requires org.kordamp.ikonli.javafx;


    opens org.example.actualjavafxapp to javafx.fxml;
    exports org.example.actualjavafxapp;
}