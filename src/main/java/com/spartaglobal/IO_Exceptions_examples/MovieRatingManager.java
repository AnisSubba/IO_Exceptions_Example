package com.spartaglobal.IO_Exceptions_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MovieRatingManager {

    public void searchForRate(double rating) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("resources/movie_metadata.csv"));

            String csvLine;
            csvReader.readLine();

            while ((csvLine = csvReader.readLine()) != null) {
                String[] csvLineData = csvLine.split(",");
                if (Double.parseDouble(csvLineData[1]) >= rating) {
                    System.out.println(csvLineData[0]);
                    System.out.println(csvLineData[1]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

