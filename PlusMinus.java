//

public class PlusMinus {

    public static void plusMinus(int[] arr) {
        double resultP, resultN, resultZ;
        double counterP = 0, counterN = 0, counterZ = 0;
        int totalNum = arr.length;
        for (int i : arr) {
            // positive
            if (i > 0) {
                counterP++;
            } else if (i < 0) {
                counterN++;
            } else {
                counterZ++;
            }
        }
        resultN = (double) counterN / totalNum;
        resultP = (double) counterP / totalNum;
        resultZ = (double) counterZ / totalNum;
        System.out.printf("\n%1$.6f", resultN);
        System.out.printf("\n%1$.6f", resultP);
        System.out.printf("\n%1$.6f", resultZ);
    }

    public static void main(String[] args) {
        int[] nums = { -4, 3, -9, 0, 4, 1 };
        plusMinus(nums);
    }
}
