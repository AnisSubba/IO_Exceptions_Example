package com.spartaglobal.IO_Exceptions_examples;

import java.io.*;

public class MovieManager {

    public void searchForFilm(String fileName) {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("resources/movie_metadata.csv"));

            String csvLine;
            while ((csvLine = csvReader.readLine()) != null) {
                String[] csvLineData = csvLine.split(",");
                if (csvLineData[0].toLowerCase().contains(fileName)) {
                    System.out.println(csvLineData[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
