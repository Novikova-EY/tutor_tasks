package ru.novikova.tutor.homework.lesson2;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<Integer, Character[]> map = new HashMap<>();
        map.put(2, new Character[]{'A', 'B', 'C'});
        map.put(3, new Character[]{'D', 'E', 'F'});
        map.put(4, new Character[]{'G', 'H', 'I'});
        map.put(5, new Character[]{'J', 'K', 'L'});
        map.put(6, new Character[]{'M', 'N', 'O'});
        map.put(7, new Character[]{'P', 'Q', 'R', 'S'});
        map.put(8, new Character[]{'T', 'U', 'V'});
        map.put(9, new Character[]{'W', 'X', 'Y', 'Z'});

        File fileInput = new File("C:\\Users\\sledo\\Desktop\\tutor\\src\\main\\java\\ru\\novikova\\tutor\\homework\\lesson2\\task1\\input.txt");
        BufferedReader bufferedReader = null;

        StringBuilder stringBuilder = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(fileInput));
            int symbol = bufferedReader.read();
            while (symbol != -1) {
                stringBuilder.append((char) symbol);
                symbol = bufferedReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String output = stringBuilder.toString();

        BufferedWriter bufferedWriter = null;
        File fileOutput = new File("C:\\Users\\sledo\\Desktop\\tutor\\src\\main\\java\\ru\\novikova\\tutor\\homework\\lesson2\\task1\\output.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileOutput));
            bufferedWriter.write(convertInput(map, output));
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertInput(Map<Integer, Character[]> map, String output) {
        int[] textOutput = new int[output.length()];
        for (int i = 0; i < output.length(); i++) {
            textOutput[i] = Character.getNumericValue(output.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < textOutput.length - 1; i++) {
            if (textOutput[i] == -1 && textOutput[i + 1] == -1 ) {
                if (!(sb.charAt(sb.length() - 1) == ' ')) {
                    sb.append(' ');
                }
            } else if (textOutput[i] == -1) {
                for (Map.Entry<Integer, Character[]> entry : map.entrySet()) {
                    if (entry.getKey() == textOutput[i - 2]) {
                        sb.append(entry.getValue()[textOutput[i - 1] - 1]);
                    }
                }
            }
        }
        return sb.toString();
    }
}
