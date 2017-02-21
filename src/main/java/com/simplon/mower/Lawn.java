package com.simplon.mower;

/**
 * Hello world!
 *
 */
public class Lawn
{
   public  int Xmax;
   public  int Ymax;


    public Lawn(int xmax, int ymax) {
        Xmax = xmax;
        Ymax = ymax;
    }

    public Lawn(String[] string)  {
        if (string.length==2) {
            this.Xmax = Integer.parseInt(string[0]);
            this.Ymax = Integer.parseInt(string[1]);
        }
    }

    public Lawn(String string)  {
        if (string.length()==2){
            this.Xmax = Character.getNumericValue(string.charAt(0));
            this.Ymax = Character.getNumericValue(string.charAt(1));
        }
    }


} // class
