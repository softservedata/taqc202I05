package com.softserve.edu.hw11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWord {
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            //Читаємо всі рядки з файлу в змінну
            String line = reader.readLine();
            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            //Замінюємо старий рядок на новий в файлі
            String newContent = oldContent.replaceAll(oldString, newString);
            //Rewriting the input text file with newContent
            //Переписуємо текс файлу з новими рядками
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        modifyFile("C://workspace//taqc202105//sometext.txt", "Welcome|welcome", "hello");

        System.out.println("Відкрийте файл, щоб перевірити зміни");
    }
}
