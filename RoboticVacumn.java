package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class RoboticVacumn {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int sum = 0;
        while ((line = in.readLine()) != null) {
            if (line.length() == 0) {
                System.out.println("True"); // still at base
            } else {
                Map<Character, Integer> map = new HashMap<>();
                map.put('U', 1);
                map.put('D', -1);
                map.put('R', 2);
                map.put('L', -2);
                for (Character i : line.toCharArray()) {
                    sum += map.get(i);
                }
            }
        }
        String result = (sum != 0) ? "False" : "True";
        System.out.println(result);
    }
}
