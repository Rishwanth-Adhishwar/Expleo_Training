package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

    public static void main(String[] args) {

        try (BufferedReader bufferInput = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bufferOutput = new BufferedWriter(new FileWriter(args[1]))) {

            String line = "";

            while ((line = bufferInput.readLine()) != null) {
                bufferOutput.write(line);
                bufferOutput.newLine();
            }

            System.out.println("File copied successfully");

        } catch (FileNotFoundException f) {
            System.out.println("File Not Found: " + f);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}