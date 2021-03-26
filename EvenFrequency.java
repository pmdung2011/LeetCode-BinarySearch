import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EvenFrequency {
    public static boolean solve(int[] a) {
        if (a.length % 2 != 0)
            return false;

        int count = 1;

        Arrays.sort(a);

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1])
                count++;
            else {
                if (count % 2 != 0)
                    return false;
                count = 1; //reset counter
            }
        }

        return count % 2 == 0;
    }

    public static void main(String[] args) {

    }
}
