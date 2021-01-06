package HackerRank;/*
* 1119. Remove Vowels from a String
*Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
* */


import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsString {
    public static String removeVowels(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('u');
        vowels.add('o');

        for (Character c : str.toCharArray()){
            if(!vowels.contains(c)){
                result.append(c);
            }
        }

        return result.toString();
    }


    public static void main(String[] args){
        String str = "Leetcode is awesome";
        System.out.println(removeVowels(str));
    }
}
