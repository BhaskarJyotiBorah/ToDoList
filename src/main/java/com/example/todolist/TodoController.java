package com.example.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TodoController {

    @FXML
    private TextField taskInput;

    @FXML
    private ListView<String> taskList;

    @FXML
    private void handleAddTask() {
        String task = taskInput.getText();
        if (!task.isEmpty()) {
            taskList.getItems().add(task);
            taskInput.clear();
        }
    }
    @FXML
    private void initialize() { //Delete a task when doubled-clicked
        taskList.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                String selectedItem = taskList.getSelectionModel().getSelectedItem();
                if (selectedItem != null) {
                    taskList.getItems().remove(selectedItem);
                }
            }
        });
    }


}