//

public class StringToInteger {
    public static int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int index = 0;
        int result = 0;
        int sign = 1;
        // Remove leading space by moving shifting index for every space
        while (index < s.length() && (s.charAt(index) == ' ')) {
            index++;
        }

        // After moving the index, Check the sign + or -
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt((index)) == '-' ? -1 : 1;
            index++;
        }

        // Build the result and check for overflow/underflow condition
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int lastDigit = s.charAt(index++) - '0';
            if (result > Integer.MAX_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + lastDigit;
        }

        return result * sign;
    }

    public static void main(String[] args) {

    }
}
