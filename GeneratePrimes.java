package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePrimes {
    public static int[] solve(int n) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                ls.add(i);
            }
        }
        int[] primes = new int[ls.size()];
        for (int j = 0; j < ls.size(); j++) {
            primes[j] = ls.get(j);
        }

        return primes;
    }

    private static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(3)));
    }
}
