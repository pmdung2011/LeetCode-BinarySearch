

//BinarySearch
//You are given a lowercase alphabet string text. 
//Return a new string where every character in text is mapped to its reverse in the alphabet, 
// so that a becomes z, b becomes y, c becomes x, and so on.
public class AtbashCipher {
    public static String solve(String text) {


        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append((char) ('z' - c + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String t = "abcdefg";
        System.out.println(solve(t));
    }
}
