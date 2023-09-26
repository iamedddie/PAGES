package com.example.contactformexamplefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();

        Label label = new Label("Contact Application"); // make the label
        Label label1 = new Label("Please fill in the following fields.");

        Label name = new Label("Name: ");
        TextField nameTextField = new TextField("Please enter your name");

        Label dob = new Label("Date of birth:");
        DatePicker dateOfBirth = new DatePicker();

        Label email = new Label("Email Address:");
        TextField emailTextField = new TextField("Please enter your email address");

        Label authenticator = new Label("Are you a robot?");
        CheckBox authCheckBox = new CheckBox("Yes");

        Button b = new Button("Submit Form");
        AnchorPane.setRightAnchor(b, 200d); // distance 0 from right side of
        AnchorPane.setTopAnchor(b, 250d);

        Circle circle = new Circle(75.0f, 65.0f, 40.0f );
        circle.setFill(Color.CHOCOLATE);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.DARKRED);


        VBox vBox = new VBox(10.0); // make the vBox
        vBox.getChildren().addAll(circle, label, label1, name, nameTextField, dob, dateOfBirth, email, emailTextField, authenticator, authCheckBox, b);


        Scene scene1 = new Scene(vBox, 500, 500, Color.DARKOLIVEGREEN); //make the scene


        stage.setScene(scene1);
        stage.setTitle("Contact Form");

        stage.show();





    }

    public static void main(String[] args) {
        launch();
    }
}