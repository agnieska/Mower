package com.simplon.mower;

import com.sun.tools.javac.util.ForwardingDiagnosticFormatter;

import java.util.Objects;

/**
 * Created by Agnieszka on 16/02/17.
 */
public class Mower {

private Position positionActuelle;


    public Position getPositionActuelle() {
        return positionActuelle;
    }

    public Mower(Position position) {
        this.positionActuelle = position;
    }

    public Mower(int x, int y, Orientation o) {

        Position position = new Position (x,y,o);
        this.positionActuelle = position;
    }

    public Mower(String string) {
        int x = Character.getNumericValue(string.charAt(0));
        int y = Character.getNumericValue(string.charAt(1));
        Orientation o = Orientation.readOrientation(string.charAt(2));
        this.positionActuelle = new Position (x,y,o);
    }
    public Mower(String[] string) {
        int x=Integer.parseInt(string[0]);
        int  y= Integer.parseInt(string[1]);
        Orientation o = Orientation.readOrientation(string[2].charAt(0));
        this.positionActuelle = new Position (x,y,o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mower mower = (Mower) o;
        return Objects.equals(getPositionActuelle(), mower.getPositionActuelle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPositionActuelle());
    }

    public Mower turnLeft() {

       Orientation o = this.positionActuelle.getO();
       switch (o){
           case EST:
               this.positionActuelle.setO(Orientation.NORTH); break;
           case NORTH:
               this.positionActuelle.setO(Orientation.WEST); break;
           case SOUTH:
               this.positionActuelle.setO(Orientation.EST); break;
           case WEST:
               this.positionActuelle.setO(Orientation.SOUTH); break;
       }
        return this;
    }

    public Mower turnRight() {
        Orientation o=this.positionActuelle.getO();
        switch (o) {
            case EST:
                this.positionActuelle.setO(Orientation.SOUTH); break;
            case NORTH:
                this.positionActuelle.setO(Orientation.EST); break;
            case SOUTH:
                this.positionActuelle.setO(Orientation.WEST); break;
            case WEST:
                this.positionActuelle.setO(Orientation.NORTH); break;
        }
        return this;
    }


    public Mower goForward(Lawn lawn) {

        int x= this.positionActuelle.getX();
        int y= this.positionActuelle.getY();
        Orientation o=this.positionActuelle.getO();
        switch (o) {
            case EST:
                if ((x+1)<=lawn.Xmax)
                this.positionActuelle.setX(x+1); break;
            case NORTH:
                if ((y+1)<=lawn.Ymax)
                this.positionActuelle.setY(y+1); break;
            case SOUTH:
                if ((y+1)<=lawn.Ymax)
                this.positionActuelle.setY(y+1); break;
            case WEST:
                if ((x+1)<=lawn.Xmax)
                this.positionActuelle.setX(x+1); break;
        }
        return this;
    }

    public Mower moveMower ( Lawn lawn, String instr) {

        for (int i = 0; i < instr.length(); i++) {
            char command = instr.charAt(i);
            switch (command) {
                case 'F':
                    this.goForward(lawn); break;
                case 'L':
                    this.turnLeft(); break;
                case 'R':
                    this.turnRight(); break;
            }

        }
        return this;
        //return this.positionActuelle.toString();
    }

    public Mower moveMower ( Lawn lawn, String[] instr) {

        for (int i = 0; i < instr.length; i++) {
            char command = instr[i].charAt(0);
            switch (command) {
                case 'F':
                    this.goForward(lawn); break;
                case 'L':
                    this.turnLeft(); break;
                case 'R':
                    this.turnRight(); break;
            }

        }
        return this;
        //return this.positionActuelle.toString();
    }

} // class
