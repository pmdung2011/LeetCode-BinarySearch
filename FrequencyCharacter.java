import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given a string, print out duplicate character with its frequency in order of occurrence
 * eg: racingcar -> 2r2a2c
 */
public class FrequencyCharacter {
    //Method 1: using HashMap, O(n) and O(n) space
    public static String solve(String s){
        if(s.length() == 0) return "";
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }

        //Traverse through map
//        for(Map.Entry<Character, Integer> element : map.entrySet()){
//            int freg = element.getValue();
//            char letter = element.getKey();
//            if(freg > 1){
//                sb.append(freg).append(Character.toString(letter));
//            }
//        }

        //To append in order of occurrence, we need to traverse the original string again
        for(char c : s.toCharArray()){
            if(map.get(c) > 1){
                sb.append(map.get(c)).append(c);
            }
            //Reset the frequency to avoid duplicate append
            map.put(c, 0);
        }
        return sb.toString();
    }
    //method 2: using simple array
    public static String solve2(String s){
        if( s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[128];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }

        for(char c : s.toCharArray()){
            if(arr[c-'a'] > 1){
                sb.append(arr[c-'a']).append(c);
                // update frequency of c to
                // 0 so that the same character is not
                // appended again
                arr[c-'a'] = 0;
            }
        }
        return sb.toString();

    }


    public static void main(String[] args){
        String s = "racingcar";
        System.out.println(solve(s));
    }
}
