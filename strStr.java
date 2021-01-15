//Leetcode
//28. Implement strStr()
public class strStr {
    public static int solve(String haystack, String needle){
        int h_length = haystack.length();
        int n_length = needle.length();

        for(int i = 0; i <= h_length-n_length;i++){
            if(haystack.regionMatches(i,needle,0,n_length)){
                return i;
            }
        }
        return -1;

    }
}
