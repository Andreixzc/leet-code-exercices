package DynamicProgramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Instance {
    static int[] weights = new int[20];
    static int[] values = new int[20];

    public static void fillInstance() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            weights[i] = random.nextInt(1000) + 1; // Pesos variando de 1 a 1000
            values[i] = random.nextInt(1000) + 1; // Valores variando de 1 a 1000
        }
    }

    public static void saveToFile() {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("valores.txt")));

            for (int i = 0; i < 20; i++) {
                writer.println(weights[i] + " " + values[i]);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fillInstance();
        saveToFile();
    }
}

