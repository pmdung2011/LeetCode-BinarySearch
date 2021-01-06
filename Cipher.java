package HackerRank;

//You are given a lowercase alphabet string text, and another string key. Return a new string where every letter in text[i] is moved to the right with offset key[i]. Offset is equal to key[i]'s position in the alphabet (A=0, B=1 etc.)
//
//        Note: If the letter overflows past z, it gets wrapped around the other side.
public class Cipher {
    public static String solve(String text, String key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int txt = text.charAt(i);
            int ky = key.charAt(i);
            int shift = ky - 'a';
            char ch = (txt + shift) <= 122 ? (char) (txt + shift) : (char) (96 + (txt + shift - 122));
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "vqatumbwxqpdgkjlyauzpvsnh";
        String b = "qtvyfxdkfmmfokwzbhhbjjefd";
        System.out.println(solve(a, b));
    }
}
