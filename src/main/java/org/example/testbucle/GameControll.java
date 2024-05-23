package org.example.testbucle;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameControll {

    Personaje batman = new Personaje(0,0);

    @FXML
    private void Move(KeyEvent keyEvent) {

        KeyCode keycode = keyEvent.getCode();

        switch (keycode) {
            case W, A, S, D -> moverPersonaje(keycode);
        }

    }

    private void moverPersonaje(KeyCode keycode) {



        if(keycode==KeyCode.W){
            batman.setY(1);
            batman.getY();
        }if(keycode==KeyCode.A){

        }if(keycode==KeyCode.S){
            batman.setY(0);
            batman.getY();
        }if(keycode==KeyCode.D){

        }

    }

    protected void updateGameLogic(double deltaTime){

    }

    protected void render(){

    }



}