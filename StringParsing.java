package HackerRank;
//“put a start between #s if consecutive numbers are even, otherwise put a dash”
public class StringParsing {
    public static String stringParsing(String a){
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < a.length()-1; i++){
            str.append(a.charAt(i));
            int curr = a.charAt(i) - '0';
            int next = a.charAt(i+1) - '0';
            if(curr % 2 == 0 && next % 2 == 0){
                str.append("*");
            }
            else{
                str.append("-");
            }
        }
        str.append(a.charAt(a.length()-1));
        return str.toString();
    }

    public static void main(String[] args){
        String str = "22345667788";
        System.out.println(stringParsing(str));
    }
}
