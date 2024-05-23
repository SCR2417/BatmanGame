module org.example.testbucle {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testbucle to javafx.fxml;
    exports org.example.testbucle;
}