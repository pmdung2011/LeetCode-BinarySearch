//

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeNum {
    public static int birthdayCakeCandles(int[] arr) {
        int a = arr.length;
        int counter = 0;
        for (int i : arr) {
            if (a == i) {
                counter++;
            }
        }
        if (counter == 0) {
            int tallest = arr[0];
            counter = 1;
            for (int j = 1; j < a; j++) {
                if (tallest < arr[j]) {
                    tallest = arr[j];
                    counter = 1;
                } else if (tallest == arr[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 1, 3 };
        System.out.println(birthdayCakeCandles(a));
    }
}
