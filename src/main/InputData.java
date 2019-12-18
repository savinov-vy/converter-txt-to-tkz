package main;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputData {
    public ArrayList start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Character> listChar = new ArrayList<>();
        int c;
        while ((c = reader.read()) != -1) {
            listChar.add((char) c);
        }
        for (Character symbol : listChar) {


        }

        inputStream.close();
        return listChar;
    }
}