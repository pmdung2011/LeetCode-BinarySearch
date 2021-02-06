
//BinarySearch
//Given an integer n, return a list with each number from 1 to n,
// except if it's a multiple of 3 or has a 3, 6, or 9 in the number, it should be the string "clap".
//        Note: return the number as a string.
public class Contain369 {
    public boolean contains369(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d == 3 || d == 6 || d == 9)
                return true;
            n = n / 10;
        }
        return false;
    }

    public String[] solve(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            if (((i + 1) % 3 == 0) || contains369(i + 1))
                arr[i] = "clap";
            else
                arr[i] = Integer.toString(i);
        }
        return arr;
    }
}
