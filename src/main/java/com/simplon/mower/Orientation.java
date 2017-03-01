package com.simplon.mower;

/**
 * Created by Agnieszka on 16/02/17.
 */
public enum Orientation {

    UNKNOWN("Inconnu"),
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

        switch (c){
            case 'N':
                return Orientation.NORTH;
            case 'S':
                return Orientation.SOUTH;
            case 'E':
                 return Orientation.EST;
            case 'W':
                return Orientation.WEST;
            default :
                return Orientation.UNKNOWN;
        }

    }
}
