module eu.guvercin.todolistapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;


    opens eu.guvercin.todolistapp.controller to javafx.fxml;
    exports eu.guvercin.todolistapp;
}