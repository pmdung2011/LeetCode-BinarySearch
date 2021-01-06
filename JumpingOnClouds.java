package HackerRank;

//Jumping on the Clouds Hackerrank
public class JumpingOnClouds {
    //return the minimum numbers of jumps
    public static int jumpingOnClouds(int[] c) {
        int num_of_jumps = 0;
        int i = 0;
        int len = c.length;

        //There are two main cases
        //  1-If the next two unit is not 1 then jump 2
        //  2-else jump only 1
        //  3-(optional) if the next two index is outbound of the array, then jump 1

        //Using while loop to traverse in case i is changing
        while (i < len - 1) {
            if (i + 2 == len || c[i + 2] == 1) {
                i++;
            } else {
                i += 2;
            }
            num_of_jumps++;
        }

        return num_of_jumps;

    }
}
