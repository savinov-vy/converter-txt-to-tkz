package main;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputData {
    public ArrayList start() throws IOException, InterruptedException {
        System.out.println("введите путь и имя файла");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Thread.sleep(8000); // сделать здесь старт счетчика для переключения программ
        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] data = new byte[inputStream.available()];
        inputStream.read(data);
        ArrayList<Character> charMas = new ArrayList<>();
        for (byte datMas : data) {

            char ch = (char) datMas;
            charMas.add(ch);
        }

        inputStream.close();
        return charMas;
    }
}
