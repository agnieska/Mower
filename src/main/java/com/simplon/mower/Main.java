package com.simplon.mower;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Agnieszka on 16/02/17.
 */
public class Main {


    public  static void main ( String[] args )
        {
            System.out.println( "Hello World!" );


            Lawn lawn = new Lawn(5,5);
            Position position1 = new Position (1,2,Orientation.NORTH);
            Mower mower1= new Mower(position1);

           // Mower mower1 = new Mower (1,2,Orientation.NORTH);

            mower1.turnLeft();
            mower1.goForward(lawn);
            mower1.turnLeft();
            mower1.goForward(lawn);
            mower1.turnLeft();
            mower1.goForward(lawn);
            mower1.turnLeft();
            mower1.goForward(lawn);
            mower1.goForward(lawn);

            System.out.println(mower1.getPositionActuelle().toString() );

           // Mower mower2 = new Mower (3,3,Orientation.EST);
            Position position2 = new Position (3,3,Orientation.EST);
            Mower mower2= new Mower(position2);

            mower2.goForward(lawn);
            mower2.goForward(lawn);
            mower2.turnRight();
            mower2.goForward(lawn);
            mower2.goForward(lawn);
            mower2.turnRight();
            mower2.goForward(lawn);
            mower2.goForward(lawn);
            mower2.turnRight();
            mower2.goForward(lawn);

            System.out.println(mower2.getPositionActuelle().toString() );


            Reader reader = new Reader();
            ArrayList<String> tableOfLines = new ArrayList<String>();
            tableOfLines.add("55");
            tableOfLines.add("FF");
            tableOfLines.add("RF");

            System.out.println(reader.executeMowersOneByOne(tableOfLines));


            /*
            Reader reader = new Reader();
           ArrayList<String> tableOfLines = reader.readFile("Instruction.txt");
           reader.executeMowersOneByOne(tableOfLines);
            */

        }









}
