//////BinarySearch
////You are given a list of integers fighters and a two dimensional list bosses.
//// The fighters list contains 1s and 0s with a 1 representing a fighter.
//// Similarly, each bosses list contains 1s and 0s with a 1 representing a boss.
////Given that fighters can beat a bosses row if it contains more fighters than bosses, return a new bosses matrix with defeated boss rows removed.
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class BossFight {
//    public static int[][] solve(int[] fighters, int[][] bosses) {
//        int num_of_fighters = 0;
//        int num_of_bosses = 0;
//        for(int i : fighters){
//            if(i == 1){
//                num_of_fighters++;
//            }
//        }
//
//        List<List<Integer>> ls = new ArrayList<>();
//        List<Integer> sublist = new ArrayList<>();
//        List<Integer> sublist2 = new ArrayList<>();
//        for(int[] row : bosses)//loop each row
//        {
//            for(int j = 0; j < bosses[0].length; j++)//loop each column
//            {
//                if(row[j]==1){
//                    num_of_bosses++;
//                }
//            }
//            if(num_of_fighters <= num_of_bosses){
//                for(int k = 0; k < bosses[0].length; k++){
//                    sublist.add(row[k]);
//                }
//                sublist2 = sublist;
//                //System.out.println(sublist.toString());
//                ls.add(sublist2);
////                System.out.println(ls.toString());
//                sublist.removeAll(sublist);
//
//            }
//
//            num_of_bosses = 0;
//        }
//
//        int[][] res = new int[ls.size()][];
//        for (int i = 0; i < ls.size(); i++) {
//            for (int j = 0; j < ls.get(i).size(); j++) {
//                res[i][j] = ls.get(i).get(j);
//            }
//        }
//
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] fighters = {0,1,1};
//        int[][] bosses = {
//                {0,0,0},
//                {0,0,1},
//                {0,1,1},
//                {1,1,1}
//        };
//
//        System.out.println(Arrays.toString(solve(fighters,bosses)));
//    }
//}
