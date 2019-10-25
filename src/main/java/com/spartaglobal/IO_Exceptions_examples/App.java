package com.spartaglobal.IO_Exceptions_examples;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main (String[] args) {
//        byteReaderManager byteReaderManager = new byteReaderManager();
//        byteReaderManager.charReader();

//        BufferedFileManager bufferedFileManager = new BufferedFileManager();
//        try {
//            bufferedFileManager.readerWriter();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        FileInputStreamManager fileInputStreamManager = new FileInputStreamManager();
////        fileInputStreamManager.fileStreamReader();

//        MovieManager movieManager = new MovieManager();
//        movieManager.searchForFilm("avenger");

        MovieRatingManager movieRatingManager = new MovieRatingManager();
        movieRatingManager.searchForRate(7.5);
    }
 }

