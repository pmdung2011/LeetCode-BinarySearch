package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Checkerboard_Colors {
    public static void main(String[] args) throws IOException {
        char col = 0;
        int row = 0;
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        //System.out.println("Enter input: ");
        String line;
        while ((line = in.readLine()) != null) {
            //System.out.println(line);
            String result = "";
            if (line.length() == 2) {
                col = Character.toLowerCase(line.charAt(0));
                row = Integer.parseInt(String.valueOf(Character.toLowerCase(line.charAt(1))));
                if ((col >= 'a' && col <= 'h') && (row >= 1 && row <= 8)) {
                    if (col == 'a' || col == 'c' || col == 'e' || col == 'g') {
                        //odd row
                        result = (row % 2 != 0) ? "Black" : "White";

                    } else {
                        result = (row % 2 != 0) ? "White" : "Black";
                    }

                    System.out.println(result);
                }
            } else {
                System.out.println("Error");
            }

        }
    }
}
