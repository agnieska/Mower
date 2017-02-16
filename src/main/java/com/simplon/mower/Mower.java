package com.simplon.mower;

import com.sun.tools.javac.util.ForwardingDiagnosticFormatter;

/**
 * Created by Agnieszka on 16/02/17.
 */
public class Mower {

Position positionActuelle;



    public Mower(int x, int y, Orientation o) {
        positionActuelle = new Position (x,y,o);
    }



    public Position turnLeft() {

       Orientation o=this.positionActuelle.getO();
       switch (o){
           case EST:
               this.positionActuelle.setO(Orientation.NORTH);
           case NORTH:
               this.positionActuelle.setO(Orientation.WEST);
           case SOUTH:
               this.positionActuelle.setO(Orientation.EST);
           case WEST:
               this.positionActuelle.setO(Orientation.SOUTH);
       }
        return this.positionActuelle;
    }

    public Position turnRight() {
        Orientation o=this.positionActuelle.getO();
        switch (o) {
            case EST:
                this.positionActuelle.setO(Orientation.SOUTH);
            case NORTH:
                this.positionActuelle.setO(Orientation.EST);
            case SOUTH:
                this.positionActuelle.setO(Orientation.WEST);
            case WEST:
                this.positionActuelle.setO(Orientation.NORTH);
        }
        return this.positionActuelle;
    }


    public Position goForward(Lawn lawn) {

        int x= this.positionActuelle.getX();
        int y= this.positionActuelle.getY();
        Orientation o=this.positionActuelle.getO();
        switch (o) {
            case EST:
                if ((x+1)<=lawn.Xmax)
                this.positionActuelle.setX(x+1);
            case NORTH:
                if ((y+1)<=lawn.Ymax)
                this.positionActuelle.setY(y+1);
            case SOUTH:
                if ((y+1)<=lawn.Ymax)
                this.positionActuelle.setY(y+1);
            case WEST:
                if ((x+1)<=lawn.Xmax)
                this.positionActuelle.setX(x+1);
        }
        return this.positionActuelle;



    }



}
