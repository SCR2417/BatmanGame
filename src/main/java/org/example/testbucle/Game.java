package org.example.testbucle;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.concurrent.TimeUnit;

public class Game {

    public void loop(Pane root){
        MouseEvent simulatedClick = new MouseEvent(
                MouseEvent.MOUSE_CLICKED,
                200, 150, 0, 0,
                null, 1, false, false, false, false, false, false, false, false, false, false, null
        );


        root.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            System.out.println("click");
        });


        while(true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            root.fireEvent(simulatedClick);
        }




    }



}
