package HackerRank;

import java.util.*;

public class SockMerchant {

    public static int sockMerchant(int n, int[] ar) {
        Set<Integer> pairs = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (!pairs.contains(ar[i])) {
                pairs.add(ar[i]);
            } else {
                counter++;
                pairs.remove(ar[i]);
            }
        }

        return counter;
    }


    public static void main(String[] args) {
        int[] socks = {4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
        int[] socks1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = socks.length;
        System.out.println(sockMerchant(n, socks));

    }
}
