package com.kristoffer.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Instantiate
        StackPane root = new StackPane();

        // Nodes
        Button clickMeButton = new Button("Click me!");

        // Listeners
        clickMeButton.setOnAction(event -> {
            new Alert(Alert.AlertType.INFORMATION) {{
               setContentText("Hello");
            }}.showAndWait();
        });

        // Styling
        root.getChildren().add(clickMeButton);
        root.setStyle("-fx-background-color: lightblue;");

        // Set Scene
        primaryStage.setTitle("My Application :) ");
        primaryStage.setScene(new Scene(root, 1000, 300));
        primaryStage.show();

    }
}
