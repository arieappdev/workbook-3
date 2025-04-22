package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Throwable e;

    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("hansel_and_gretel.txt");
            Scanner scanner = new Scanner(fis);

            String storyTime;
            while(scanner.hasNextLine()) {
               storyTime = scanner.nextLine();
                System.out.println(storyTime);

            }
            scanner.close();

        }       catch(IOException e) {
            e.printStackTrace(); }

    }
    }


