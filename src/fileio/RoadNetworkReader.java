package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoadNetworkReader {
    public static int[] readRoadNetwork(String filename, int count) {
        List<Integer> distances = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null && distances.size() < count) {
                if (line.startsWith("a ")) {
                    String[] parts = line.split(" ");
                    if (parts.length >= 4) {
                        int distance = Integer.parseInt(parts[3]);
                        distances.add(distance);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return distances.stream().mapToInt(i -> i).toArray();
    }
}
