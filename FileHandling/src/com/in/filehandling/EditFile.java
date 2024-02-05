package com.in.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditFile {

    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "D:\\JavaRev\\workspace\\JavaL0\\FileHandling\\src\\com\\in\\filehandling\\example.txt";

        try {
            // Read the contents of the file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                // Edit the content (modify the line as needed)
                content.append(line).append("\n");
            }

            reader.close();

            // Edit the content (add a new line)
            content.append("This is a new line.\n");

            // Write the updated content back to the file using BufferedWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("File edited successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}