//BinarySearch
//Given a list of strings words, concatenate the strings in camel case format.

public class CamelCase {
    public static String solve(String[] words) {
        StringBuilder sb = new StringBuilder();
        words[0] = words[0].toLowerCase();
        for(int i = 1; i < words.length;i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        for(String k : words){
            sb.append(k);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"java", "beans"};
        System.out.println(solve(words));
    }
}
