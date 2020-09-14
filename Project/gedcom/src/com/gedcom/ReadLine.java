package com.gedcom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Parses a GEDCOM file to determine if each line is in a valid format.
 * To run, run 'java com.gedcom.ReadLine [Path from Content Root] from
 * the directory "/out/production/gedcom".
 *
 * @author Liam Brew
 * @version 1.0
 * @date 14 September 2020
 * @pledge I pledge my honor that I have abided by the Stevens Honor System
 */
public class ReadLine {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Error: requires file path argument");
            System.exit(1);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String lineStr;

            while ((lineStr = bufferedReader.readLine()) != null) {
                Line line = new Line(lineStr);

                line.parseLine();
                line.printLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
