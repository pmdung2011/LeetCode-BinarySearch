//

public class MaxIntArr {
    public static int maxInArr(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            // max = Math.max(max,a[i]);
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 22, 23, 4, 1 };
        System.out.println(maxInArr(a));
    }
}
