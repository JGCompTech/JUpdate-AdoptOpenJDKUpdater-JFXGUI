module com.jgcomptech.adoptopenjdk {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jgcomptech.adoptopenjdk to javafx.fxml;
    exports com.jgcomptech.adoptopenjdk;
}