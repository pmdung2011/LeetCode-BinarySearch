//
public class Acronym {
    public String solve(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!words[i].equals("and")) {
                sb.append(words[i].charAt(0));
            }
        }
        return sb.toString().toLowerCase();
    }
}
