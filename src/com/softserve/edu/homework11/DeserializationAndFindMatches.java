package com.softserve.edu.homework11;

import javax.imageio.IIOException;
import java.io.*;

public class DeserializationAndFindMatches {

    public static void main(String[] args) {

        String text = "Welcome everyone";
        String pathfileName = "C:/Users/38093/Desktop/text.txt";

        String readText = "";
        String editedReadText = "";

        try {
            FileWriter fileWriter = new FileWriter(pathfileName);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IIOException e) {
            System.out.println("File Write Error: " + pathfileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(pathfileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            fileReader = new FileReader(pathfileName);
            try {
                while ((readText = bufferedReader.readLine()) != null) {
                    System.out.println(readText);
                    editedReadText = readText.replace("Welcome", "Hello");
                    System.out.println(editedReadText);
                }
                fileReader.read();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileWriter fileWriterEditedText = null;
        try {
            fileWriterEditedText = new FileWriter(pathfileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriterEditedText.write(editedReadText);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriterEditedText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
