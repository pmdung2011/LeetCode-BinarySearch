import java.util.Arrays;

public class IsAnagram {
    public static boolean solve(String a, String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
    //Method 2
    public static boolean solve2(String a, String b){
        if(a.length() != b.length()) return false;
        int[] db = new int[256];
        for(int i = 0; i < a.length();i++){
            db[a.charAt(i)]++;
            db[b.charAt(i)]--;
        }

        for(int i : db){
            if(i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "LISTEN";
        String b = "TENLAS";

        System.out.println(solve2(a,b));
    }
}
