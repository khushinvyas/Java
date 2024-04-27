module com.example.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.mysql.cj.jdbc; // If you're using MySQL Connector/J 8 or above.

    opens com.example.app to javafx.fxml, javafx.graphics;
    exports com.example.app;
}
