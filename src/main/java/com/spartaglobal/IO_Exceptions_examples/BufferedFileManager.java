package com.spartaglobal.IO_Exceptions_examples;

import java.io.*;

public class BufferedFileManager {

    public void readerWriter() throws IOException {

        // current file managed via buffer
        File file = new File("resources/TestFile.txt");
        // buffer memory storing the capacity ....
        // resources/TestFile.txt .....
        // throws ....
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // new file to be managed by buffered writer
        File newFile = new File("resources/newFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));

        // line manager variable
        String line;

        while ((line = reader.readLine()) != null ){
            if (!line.equals("")){
                // \n will trim it the wide space... make it look presentable
                writer.append(line + "\n");
                System.out.println("Friday I've added a new line sic");
            }
        }
        // need to research .flush
        writer.flush();
        writer.close();
        reader.close();
    }
}
