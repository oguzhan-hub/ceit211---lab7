package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/com/company/Classics.txt");
        BufferedReader input = new BufferedReader(file);

        String title;
        String artist;
        // ADD LINES FOR TASK #3 HERE
        ArrayList<Song> cd = new ArrayList<Song>();
        // Declare an array of Song objects, called cd,
        do{
            title = input.readLine();
            artist = input.readLine();
            cd.add(new Song(title,artist));
        }while (title != null);
        cd.remove(cd.size()-1);
        System.out.println("------------------------------");
        System.out.println("Contents of Classics:\n");
        for (Song i:cd) {
        // ADD LINES FOR TASK #3 HERE
        System.out.println(i.toString());
        }
        System.out.println("------------------------------");

        //İlk iki task zaten bir önce ki labın ve resultset içinde değiller. yapmadım (saçma geldi burada olması..)

    }
}
