public class MinBracketAddition {
    public static int solve(String s) {
        int bal = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); ++i) {
            bal += s.charAt(i) == '(' ? 1 : -1;

            if (bal == -1) {
                ans += 1;  //The number of bracket need
                bal += 1;  //reset balance
            }
        }

        return bal + ans;
    }

    public static void main(String[] args) {
        String s = ")))((";
        System.out.println(solve(s));
    }
}
