package HackerRank;

import java.util.Arrays;

public class NarcissisticNumber {
    public static boolean solve(int n) {
        //count the length of the number
        int org = n;
        int org2 = n;
        int length = 1;
        while (n > 9) {
            n /= 10;
            length++;
        }
        System.out.println(length);
        //split n into digits
        int[] num = new int[length];
        int i = 0;
        while (org > 0) {
            int digit = org % 10;
            org /= 10;
            num[i++] = digit;
        }
        System.out.println(Arrays.toString(num));
        //loop through the array to calculate
        int sum = 0;
        for (int j : num) {
            sum += Math.pow(j, length);
        }
        System.out.println(sum);
        return (org2 == sum);
    }

    public static boolean solve2(int num) {
        int length = Integer.toString(num).length();
        int sum = 0;
        for (int i = num; i > 0; i = i / 10) {
            sum += Math.pow(i % 10, length);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(solve2(123));
    }
}
