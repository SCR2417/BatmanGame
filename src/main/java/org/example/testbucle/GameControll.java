package org.example.testbucle;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class GameControll {

    Personaje batman = new Personaje(0,0); //Se crea el personaje Batman
    Personaje guason = new Personaje(0,0); //Se crea el personaje Guason

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
            batman.setX(0);
            batman.getX();
        }if(keycode==KeyCode.S){
            batman.setY(0);
            batman.getY();
        }if(keycode==KeyCode.D){
            batman.setX(1);
            batman.getX();
        }

    }

    protected void updateGameLogic(double deltaTime){ //En esta sección va la logica del juego

        guason(1,2,3,4); //Aqui solo inicialice la función
        //NO SON LOS DATOS FINALES QUE VAN A USARSE


    }

    protected void render(){

    }


    protected void guason(float y, float largoY, float MAX_altura, float MIN_altura){ //Aqui va la logica que deben de hacer
        //Ya coloque las 4 variables que van a usar como entradas
        System.out.println(guason.getY()); //Esto es solo por poner algo

    }



}