package org.example.testbucle;

public class Personaje {

    float x;
    float y;

    public Personaje(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int dir){
        if(dir == 1){
            this.y += 10;
        } else if (dir==0) {
            this.y -= 10;
        }

        if (this.y >= 40.0){
            System.out.println("Chocaste");
        }
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

    public float getY(){
        System.out.println(this.y);
        return this.y;
    }

    public float getX(){
        System.out.println(this.x);
        return this.x;
    }
}
