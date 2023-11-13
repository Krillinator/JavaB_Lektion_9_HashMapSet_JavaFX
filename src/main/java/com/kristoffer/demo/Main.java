package com.kristoffer.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private final VBox vbox = new VBox();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Panes
        BorderPane borderPane = new BorderPane();

        // Nodes
        Button btnAddLabel = new Button("Add Label");
        Label textIntroduction = new Label("Welcome to Our Application!");
        TextField input = new TextField("placeholder?");

        // Positioning
        borderPane.setTop(textIntroduction);
        borderPane.setRight(btnAddLabel);
        borderPane.setBottom(input);
        borderPane.setCenter(vbox);

        /* This is an OK solution too!
        BorderPane.setAlignment(btnAddLabel, Pos.CENTER);
        BorderPane.setAlignment(vbox, Pos.CENTER);
        BorderPane.setAlignment(textIntroduction, Pos.CENTER);
        */

        borderPane.getChildren().forEach(node -> {
            BorderPane.setAlignment(node, Pos.CENTER);
        });

        vbox.setAlignment(Pos.CENTER);

        // Listeners
        setupListeners(btnAddLabel, input);

        // Finalize
        primaryStage.setTitle("Final Example");
        primaryStage.setScene(new Scene(borderPane, 400, 300));
        primaryStage.show();
    }

    public void setupListeners(Button btnAddLabel, TextField input) {
        btnAddLabel.setOnAction(e -> {
            addNewLabel();
        });

        input.setOnAction(e -> textInput(
                input.getText()
        ));
    }

    // Methods
    public void textInput(String input) {
        System.out.println("This is what you wrote: " + input);
    }

    public void addNewLabel() {
        Label label = new Label("Test" + vbox.getChildren().size());
        vbox.getChildren().add(label);

        // Debugging
        System.out.println("Debugging");
        System.out.println(vbox.getChildren().size());
    }

}
