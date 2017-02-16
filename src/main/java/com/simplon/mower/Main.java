package com.simplon.mower;

/**
 * Created by Agnieszka on 16/02/17.
 */
public class Main {


    public  static void main( String[] args )
        {
            System.out.println( "Hello World!" );


            Lawn lawn = new Lawn(5,5);


            Mower mover1 = new Mower (1,2,Orientation.NORTH);

            mover1.turnLeft();
            mover1.goForward(lawn);
            mover1.turnLeft();
            mover1.goForward(lawn);
            mover1.turnLeft();
            mover1.goForward(lawn);
            mover1.turnLeft();
            mover1.goForward(lawn);
            mover1.goForward(lawn);

            System.out.println(mover1.positionActuelle.toString() );

            Mower mover2 = new Mower (3,3,Orientation.EST);

            mover2.goForward(lawn);
            mover2.goForward(lawn);
            mover2.turnRight();
            mover2.goForward(lawn);
            mover2.goForward(lawn);
            mover2.turnRight();
            mover2.goForward(lawn);
            mover2.goForward(lawn);
            mover2.turnRight();
            mover2.goForward(lawn);

            System.out.println(mover2.positionActuelle.toString() );

        }





}
