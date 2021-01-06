package HackerRank;

//LeetCode
public class HappyNumber {
    public boolean isHappy(int n) {
        while (true) {
            int sum = 0;
            while (n != 0) {
                int lastDigit = n % 10;             //here, we have to extract the digits from the given number starting from the last one
                sum += lastDigit * lastDigit;       //add that digit to the sum, by squaring it
                n /= 10;
            }
            if (sum / 10 == 0)                       //if it is a single digit number, check if it 1 or 7
            {
                //if yes, then this a happy number
                // else you want to terminate the loop as it isn't a happy number
                return sum == 1 || sum == 7;
            }
            n = sum;
        }
    }
}
