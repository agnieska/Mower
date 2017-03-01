package com.simplon.mower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Agnieszka on 21/02/17.
 */
public class Reader {


    public ArrayList<String[]> readFileBySplitString(String fileName) {

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


    public ArrayList<String> readFile(String fileName) {

        ArrayList<String> tableOfLines = new ArrayList<String>();
        try {
            BufferedReader file = new BufferedReader(new FileReader("Instruction.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                tableOfLines.add(line);
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tableOfLines;
    }


    public String executeMowersOneByOne (ArrayList<String> tableOfLines) {

        String result="";

        Lawn lawn = new Lawn(tableOfLines.get(0));
        for (int i=1; i<(tableOfLines.size()-1); i=i+2){
            Mower mower = new Mower(tableOfLines.get(i));
            mower = mower.moveMower(lawn, tableOfLines.get(i+1));
            result = result + mower.getPositionActuelle().toString();
        }
        return result;

    }






} // class
