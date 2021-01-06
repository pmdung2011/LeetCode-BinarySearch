package HackerRank;
//1342. Number of Steps to Reduce a Number to Zero
/*
* Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.
* */
public class NumberOfSteptToZero {
    public static int numberOfSteps (int num) {
        int counter = 0;
        while(num!=0){
            if(num%2 == 0){
                num = num/2;
                counter++;
            }
            else{
                num--;
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println("Input: 8");
        System.out.println("Steps: " + numberOfSteps(8));

    }
}
