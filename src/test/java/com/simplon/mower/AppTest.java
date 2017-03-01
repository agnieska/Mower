package com.simplon.mower;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    @org.junit.Test
    public void testTurnLeft () {

        //set
        Lawn lawn = new Lawn(5,5);
        Mower mower = new Mower (1,1,Orientation.NORTH);
        Position positionTest = new Position(1,1,Orientation.WEST);
        //test
        mower=mower.turnLeft();
        // assert
        assertEquals(positionTest, mower.getPositionActuelle());
    }


    @org.junit.Test
    public void testTurnRight () {

        //set
        Lawn lawn = new Lawn(5,5);
        Mower mower = new Mower (1,1,Orientation.NORTH);
        Position positionTest = new Position(1,1,Orientation.EST);
        //test
        mower=mower.turnRight();
        // assert
        assertEquals(positionTest, mower.getPositionActuelle());
    }


    @org.junit.Test
    public void testGoForward () {

        //set
        Lawn lawn = new Lawn(5,5);
        Mower mower = new Mower (1,1,Orientation.NORTH);
        Position positionTest = new Position(1,2,Orientation.NORTH);
        //test
        mower=mower.goForward(lawn);
        // assert
        assertEquals(positionTest, mower.getPositionActuelle());
    }

    @org.junit.Test
    public void testmoveMower () {

        //set
        Lawn lawn = new Lawn(5,5);
        Mower mower = new Mower (1,1,Orientation.NORTH);
        //test
        mower= mower.moveMower(lawn, "FFRFLF");
        Position positionTest = new Position(2,4,Orientation.NORTH);
        // assert
        assertEquals( positionTest, mower.getPositionActuelle());
    }


    @org.junit.Test
    public void executeMowersOneByOne () {

        //set

        Reader reader = new Reader();
        ArrayList<String> tableOfLines = new ArrayList<String>();
        // Lawn lawn = new Lawn(5,5);
        // Mower mower = new Mower (1,1,Orientation.NORTH);
        tableOfLines.add("55");
        tableOfLines.add("11N");
        tableOfLines.add("FFRFLF");

        //test
        //mower= mower.moveMower(lawn, "FFRFLF");
        String resultat = reader.executeMowersOneByOne(tableOfLines);
        Position positionTest = new Position(2,3,Orientation.NORTH);

        // assert
        assertEquals( "23N", resultat);
    }




}
