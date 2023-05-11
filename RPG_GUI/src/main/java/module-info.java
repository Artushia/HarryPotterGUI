module org.java.isep {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens org.java.isep to javafx.fxml;
    exports org.java.isep.Controller;
    opens org.java.isep.Controller to javafx.fxml;
    exports org.java.isep.Model;
    opens org.java.isep.Model to javafx.fxml;
}