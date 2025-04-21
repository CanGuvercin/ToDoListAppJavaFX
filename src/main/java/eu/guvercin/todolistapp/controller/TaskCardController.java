package eu.guvercin.todolistapp.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.AnchorPane;



public class TaskCardController {

    public Label taskName;
    public Label taskTimeStamp;
    public Label taskStatus;

    public void handleViewTask (ActionEvent actionEvent) {
        System.out.println("Viewing task: " + taskName.getText());
        // TODO: will be constructed here
    }
    public void setTaskDetails (String name, LocalDateTime timeStamp, String status){
        taskName.setText(name);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd.MM.yyyy");
        taskTimeStamp.setText(timeStamp.format(formatter));
        taskStatus.setText(status);
    }



}
