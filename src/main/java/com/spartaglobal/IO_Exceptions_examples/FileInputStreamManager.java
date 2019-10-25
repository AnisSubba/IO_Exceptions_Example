package com.spartaglobal.IO_Exceptions_examples;

import java.io.*;

public class FileInputStreamManager {

    public void fileStreamReader() {
        try{

        BufferedReader file = new BufferedReader(new FileReader("resources/newFile.txt"));

        String line;
        while ((line = file.readLine()) != null) {
            String[] lineData = line.split(" ");
            System.out.println(lineData);
        }
    }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

