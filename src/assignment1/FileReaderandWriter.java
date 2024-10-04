package assignment1;

import java.io.*;
import java.nio.CharBuffer;

public class FileReaderandWriter {

    public static void main(String[] args) {

        try {

            //creates a file inputstream file path
            FileInputStream file = new FileInputStream("C:\\Users\\ashwi\\File-InputOutput doc\\Notes.txt");
            //creates input stream Reader
            InputStreamReader reader = new InputStreamReader(file);

            //read the conten int the file
            char[] content = new char[200];
            int length = reader.read(content);

            System.out.println("Successfully read the data from the txt file");
            System.out.println(content);

            reader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        String newData = "New Information to be added ";


        try {

            File file = new File("C:\\Users\\ashwi\\File-InputOutput doc\\Notes.txt");
            file.createNewFile();

            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter outputWriter = new BufferedWriter(fileWriter);

            //writing new data
            outputWriter.write(newData);

            // Add a new line
            outputWriter.newLine();
            outputWriter.close();
            System.out.println("Successfullz added new data to the file");
        } catch (Exception e) {
            e.getStackTrace();

        }


    }


}
