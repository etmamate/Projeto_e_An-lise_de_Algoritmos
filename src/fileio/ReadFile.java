package fileio;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static int[] readFile(String filename) throws IOException {

        List<Integer> weightsList = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(filename);

                InputStreamReader isReader = new InputStreamReader(fileIn);

                BufferedReader reader = new BufferedReader(isReader);) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("a ")) {
                    String[] parts = line.split("\\s+");

                    if (parts.length >= 4) {
                        try {
                            int weigh = Integer.parseInt(parts[1]);
                            weightsList.add(weigh);
                            // System.out.println(weigh); DEGUB
                        } catch (NumberFormatException e) {
                            System.err.println("Aviso: Falhou ao analisar peso do arco em linha " + line);
                        }
                    }
                }
            }

        }

        return weightsList.stream()
               .mapToInt(i -> i)
               .toArray();

    }
}
