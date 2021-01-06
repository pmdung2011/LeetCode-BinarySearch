package HackerRank;
//HackerRank

import java.util.HashMap;
import java.util.Map;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('D', -1);
        map.put('U', 1);
        int sum = 0;
        int valleys = 0;
        for (Character i : path.toCharArray()) {
            sum += map.get(i);
            if (sum == 0 && i.equals('U')) {
                valleys++;
            }
        }
        return valleys;
    }


    public static void main(String[] args) {
        int steps;
        String path = "UDDDUDUU";
        steps = path.length();

        System.out.println(countingValleys(steps, path));

    }
}
