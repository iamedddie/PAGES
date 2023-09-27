module com.example.asciiart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.asciiart to javafx.fxml;
    exports com.example.asciiart;
}