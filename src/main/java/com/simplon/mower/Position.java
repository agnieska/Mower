package com.simplon.mower;

import java.util.Objects;

/**
 * Created by Agnieszka on 16/02/17.
 */
public class Position {

   private int x;
   private int y;
   private Orientation o;


    public Position(int x, int y, Orientation o) {
        this.x = x;
        this.y = y;
        this.o = o;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Orientation getO() {
        return o;
    }

    public void setO(Orientation o) {
        this.o = o;
    }

    @Override
    public String toString() {
        String st = (""+x+y+o+"\n");
        return st;
    }

    @Override
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;
        Position position = (Position) o1;
        return getX() == position.getX() &&
                getY() == position.getY() &&
                getO() == position.getO();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getO());
    }
}
