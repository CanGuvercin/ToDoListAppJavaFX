module eu.guvercin.todolistapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens eu.guvercin.todolistapp to javafx.fxml;
    exports eu.guvercin.todolistapp;
}