package HackerRank;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long res;
        long org = 0;
        //Get the number of 'a' in original string
        for (long j = 0; j < s.length(); j++) {
            if (s.charAt((int) j) == 'a') {
                org++;
            }
        }

        //Get the number of repeated full string
        long num = n / s.length();

        //get the size of left over string
        long left_over = n % s.length();
        //check how many 'a' in left over string
        long counter = 0;
        for (long i = 0; i < left_over; i++) {
            if (s.charAt((int) i) == 'a') {
                counter++;
            }
        }
        res = org * num + counter;
        return res;
    }

    public static void main(String[] args) {
        String a = "aba";
        long n = 10;

        System.out.println(repeatedString(a, n));

    }
}
