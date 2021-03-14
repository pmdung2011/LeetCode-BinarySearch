//
//BinarySearch

import java.util.Arrays;

public class BuyingCars {
    public static int solve(int[] prices, int k) {
        Arrays.sort(prices); // First,sort the array
        int i = 0; // work as a counter
        for (int c : prices) {
            k -= c; // keep buying cars
            if (k < 0) { // we stop when we have no money left
                break;
            }
            i++; // else, we increase the counter/index
        }
        return i;
    }

    public static void main(String[] args) {
        int[] prices = { 145, 149, 106, 61 };
        System.out.println(solve(prices, 217));
    }
}
