public class IsPrime {
    public static boolean solve(int num) {
        if (num <= 1) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve(6));
    }
}
