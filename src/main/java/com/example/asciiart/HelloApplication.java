package com.example.asciiart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    TextField textField1;
    TextField textField2;
    TextArea textArea;
    Button  drawButton;

    @Override
    public void start(Stage stage) throws IOException {

        InitiliazeUIComponents();

        AddDrawButton();

        CreateLayout(stage);

    }

    private void CreateLayout(Stage stage) {
        VBox vbox = new VBox(10,textField1,textField2,textArea,drawButton);
        vbox.setAlignment(Pos.CENTER);
        Scene scene =new Scene(vbox,600,600);
        stage.setTitle("ASCII UI");
        stage.setScene(scene);
        stage.show();
    }

    private void AddDrawButton() {
        Artist artist = new Artist();
        drawButton.setOnAction((e)->{
            String art = textField1.getText().toLowerCase().trim();
            String artName = textField2.getText().toUpperCase().trim();
            artist.setName(artName);
            artist.drawUI(art,textArea);


        });
    }

    private void InitiliazeUIComponents() {
        textField1 = new TextField("What do you want to draw");
        textField2 = new TextField("Who is drawing");
        textArea = new TextArea();
        drawButton = new Button("Draw");
    }

    public static void main(String[] args) {
        launch();
    }
}