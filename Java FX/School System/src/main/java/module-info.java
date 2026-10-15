module org.school_sys.school_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.school_sys.school_system to javafx.fxml;
    exports org.school_sys.school_system;
}