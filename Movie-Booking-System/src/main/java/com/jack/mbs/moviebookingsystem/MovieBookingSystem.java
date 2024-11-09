package com.jack.mbs.moviebookingsystem;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.Toolkit;
import java.io.IOException;

public class MovieBookingSystem extends Application {

    private final double sizeX = Toolkit.getDefaultToolkit().getScreenSize().width-250;
    private final double sizeY = Toolkit.getDefaultToolkit().getScreenSize().height-250;
    private final Color backgroundColor = Color.rgb(79, 17, 0);
    private final Color subBoxColor = Color.rgb(135, 73, 55);

    private Parent createContent(){
        Rectangle rectangle = new Rectangle(sizeX/2, sizeY/2, subBoxColor);
        rectangle.setTranslateX(sizeX/4);
        rectangle.setTranslateY(sizeY/4);
        return new Pane(rectangle);
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Movie Booking System");
        stage.centerOnScreen();
        stage.setScene(new Scene(createContent(), sizeX, sizeY, backgroundColor));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}