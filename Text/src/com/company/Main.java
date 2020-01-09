package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // datei lesen
        FileReader fileName = new FileReader("D:\\Tasks\\Text\\Text.txt");

        // wrap a BufferedReader around FileReader
        BufferedReader reader = new BufferedReader(fileName);
        int sentenceCount = 0;
        String line;
        String terminalSymbol = ".?!";

        while ((line = reader.readLine()) != null) { // Continue reading until end    of file is reached
            for (int i = 0; i < line.length(); i++) {
                if (terminalSymbol.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
                    sentenceCount++;
                }
            }
        }
        reader.close();
        System.out.println("The number of sentences is " + sentenceCount);

        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        // {"a", "e", "i", "o", "u", "y"};

        while ((line = reader.readLine()) != null) {
            int vowelsCount = 0;
            for (int i = 0; i < line.length(); ++i)
                if (vowels.contains(line.charAt(i)))
                    ++vowelsCount;
            System.out.println("Vowels count = " + vowelsCount);
        }
    }
}