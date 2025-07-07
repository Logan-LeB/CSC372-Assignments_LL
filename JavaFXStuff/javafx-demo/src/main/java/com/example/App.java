package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Button btn = new Button("Click me!");
        Text text = new Text("I dare you...");
        
        btn.setOnAction(event -> {
            text.setText("BOOM! 💥 You clicked it!");
        });

        VBox root = new VBox(10, btn, text);
        Scene scene = new Scene(root, 300, 200);
        
        stage.setTitle("JavaFX Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // Start JavaFX
    }
}
