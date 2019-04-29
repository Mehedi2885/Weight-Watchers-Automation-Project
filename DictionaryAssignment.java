package interviewTopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public  class DictionaryAssignment {

    public static boolean doesFileExist(String path) {

        File filePath =    new File(path);

        boolean filePresent = false;

        FileInputStream inputStream;

        try {

            inputStream = new FileInputStream(filePath);

            filePresent = true;
            System.out.println("File present");

        } catch (FileNotFoundException e) {

            filePresent = false;

            e.printStackTrace();

        }return filePresent;

    }

    public static void main(String[] args) {

        doesFileExist("Please give text file path here");
    }


}
