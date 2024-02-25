module com.example.hw1_software_development {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw1_software_development to javafx.fxml;
    exports com.example.hw1_software_development;
}