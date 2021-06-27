public class RomanToInt {
    public static int solve(String s){
        int sum = 0;
        int prev = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int val = roman(s.charAt(i));
            if(prev > val){
                sum -= val;
            }
            else{
                sum += val;
            }
            prev = val;
        }
        return sum;
    }

    public static int roman(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main (String[] args){
        String s = "XV";

        System.out.println(solve(s));
    }
}
