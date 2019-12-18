package main;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputData {
    public ArrayList start() throws IOException, InterruptedException {
        System.out.println("введите путь и имя файла");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Thread.sleep(5000); // сделать здесь старт счетчика для переключения программ
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