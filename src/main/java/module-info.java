module me.serbob.studentmanagerabellab5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.serbob.studentmanagerabellab5 to javafx.fxml;
    exports me.serbob.studentmanagerabellab5;
}