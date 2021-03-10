
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                res.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                res.add("Buzz");
            }
            else if(i % 3 == 0){
                res.add("Fizz");
            }
            else {
                res.add(Integer.toString(i));
            }
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println((fizzBuzz(100)));
    }
}
