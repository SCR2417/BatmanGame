package org.example.testbucle;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;




public class MenuControll {

    private long lastUpdateTime = 0;
    GameControll game = new GameControll();

    @FXML
    private Button Btt;


    @FXML
    public void start(){


        try {



            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Game.fxml"));
            Stage stage = (Stage) Btt.getScene().getWindow();
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);



            stage.setTitle("Game");
            stage.setScene(scene);
            stage.show();


            AnimationTimer gameLoop = new AnimationTimer() {
                @Override
                public void handle(long now) {
                    if (lastUpdateTime == 0) {
                        lastUpdateTime = now;
                        return;
                    }


                    double deltaTime = (now - lastUpdateTime) / 1e9;


                    game.updateGameLogic(deltaTime);


                    game.render();

                    lastUpdateTime = now;
                }
            };

            gameLoop.start();
        }catch(IOException ex){
            System.out.println("Error");
        }

    }
}
