package com.simplon.mower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Agnieszka on 21/02/17.
 */
public class Reader {


    private ArrayList<String[]> readFileBySplitString() {

        ArrayList<String[]> lines = new ArrayList<String[]>();
        try {
            BufferedReader file = new BufferedReader(new FileReader("Instruction.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                 String[] entries  = line.split("");
                 lines.add(entries);
            }
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }


    private ArrayList<String> readFileByStrings() {

        ArrayList<String> lines = new ArrayList<String>();
        try {
            BufferedReader file = new BufferedReader(new FileReader("Instruction.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                lines.add(line);
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }


    private String executeMoverOneByOne (ArrayList<String> lines) {

        String result="";

        Lawn lawn = new Lawn(lines.get(0));
        for (int i=1; i<(lines.size()-1); i=i+2){
            Mower mower = new Mower(lines.get(i));
            result = result + mower.moveMower(lawn, lines.get(i+1));
        }
        return result;

    }




/*
//float f = Float.parseFloat(line[0]);
int x = getNumericValue(line[0]);
String[] lines = readAll.split("\n");
                String[] readLawn = lines[0].split("");
                String[] readMower1 = lines[1].split("");
                String[] readInstr1 = lines[2].split("");
                String[] readMower2 = lines[3].split("");
                String[] readInstr2 = lines[4].split("");
     int x = Character.getNumericValue(line.charAt(0));
     int y = Character.getNumericValue(line.charAt(1));
     Orientation o = Orientation.readOrientation(line.charAt(2));
     Mower mower = new Mower(x,y,o);
 */










} // class
