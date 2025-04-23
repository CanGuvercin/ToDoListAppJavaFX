package eu.guvercin.todolistapp.controller;

import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDateTime;

public class TodoController {

    @FXML
    private VBox taskContainer;


    public MFXTextField taskTitle;
    @FXML
    private MFXComboBox<String> statusComboBox;


    public void initialize(){
        statusComboBox.getItems().addAll("All", "ToDo", "InProgress", "Done");
        statusComboBox.setValue("All");

        addTask("Create a JavaFX project", LocalDateTime.now().minusMinutes(3),"ToDo");
        addTask("Learn REACT LAN IT", LocalDateTime.now().minusMinutes(3),"Done");
    }

    @FXML
    public void handleAddTask () {
        addTask("New Task", LocalDateTime.now(), "ToDo");
    }

    private void addTask(String taskName, LocalDateTime timeStamp, String status){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/eu/guvercin/todolistapp/task-card.fxml"));
            HBox taskCard = loader.load();

            TaskCardController controller = loader.getController();
            controller.setTaskDetails(taskName,timeStamp,status);

            taskContainer.getChildren().add(taskCard); //

        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
