package com.simplon.mower;

/**
 * Created by Agnieszka on 16/02/17.
 */
public enum Orientation {

    INCONNUE("I"),
    NORTH("N"),
    SOUTH ("S"),
    EST ("E"),
    WEST("W");



    Orientation(String st) {
    }

    @Override
    public String toString() {
        String st="I";
        switch (this) {
            case NORTH:
                st = "N"; break;
            case SOUTH:
                st = "S"; break;
            case WEST:
                st = "W"; break;
            case EST:
                st = "E"; break;
        }
        return st;
    }

    public static Orientation readOrientation(char c) {
        Orientation o= Orientation.INCONNUE;
        switch (c){
            case 'N':
                o=Orientation.NORTH; break;
            case 'S':
                o=Orientation.SOUTH; break;
            case 'E':
                o=Orientation.EST;   break;
            case 'W':
                o=Orientation.WEST;  break;
        }
        return o;
    }
}
