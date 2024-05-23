package org.example.testbucle;

public class Personaje {

    float x;
    float y;

    public Personaje(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(){

    }

    public void setY(int dir){

        if(dir == 1){
            this.y += 10;
        } else if (dir==0) {
            this.y -= 10;
        }

        if (this.y >= 40.0){
            System.out.println("Chocaste");
        }


    }

    public void getY(){
        System.out.println(this.y);
    }
}
