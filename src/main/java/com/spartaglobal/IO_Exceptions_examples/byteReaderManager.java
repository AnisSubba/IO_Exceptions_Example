package com.spartaglobal.IO_Exceptions_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class byteReaderManager {

    public void readStream () throws FileNotFoundException {
        try (InputStream input = new FileInputStream("resources/TestFile.txt")){

            int data = 0;
            while(data != -1){
                data = input.read();
                System.out.println(data);
            }
        }
        catch(IOException error){
            error.printStackTrace();
        }
    }
    public void charReader() {
        try (InputStream input = new FileInputStream("resources/TestFile.txt");){
            int data = 0;
            int aCount = 0;
            while(data != -1){
                data = input.read();
                System.out.println((char)data);
                if((char) data == 'I'){
                    aCount++;
                }
            }
            System.out.println(aCount);
        }
        catch(IOException error){
            error.printStackTrace();
        }
    }

}
