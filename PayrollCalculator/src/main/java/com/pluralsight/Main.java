package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class Main {
       public static void main(String[] args) {

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/data/employees.csv"));

            String input;
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);



            }
            bufReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
           }
        }
    }
