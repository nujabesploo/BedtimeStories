package com.pluralsight;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class BedtimeStories {
    public static void main(String[] args) {

        try{

            Scanner in = new Scanner(System.in);

            FileReader filereader = new FileReader("src/main/resources/goldilocks.txt");
            BufferedReader buffreader = new BufferedReader(filereader);

            String input;
            int line = 1;

            while((input = buffreader.readLine()) != null )
            {
                System.out.printf("%d.\t",line++);
                System.out.println(input);

            }
            buffreader.close();
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }
}
