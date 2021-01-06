package HackerRank;
//BinarySearch

public class Roomba {
    public static boolean solve(String[] moves, int x, int y) {
        int x1 = 0, y1 = 0;
        for (String i : moves) {
            if (i.equals("EAST")) {
                x1 += 1;
            }
            if (i.equals("NORTH")) {
                y1 += 1;
            }
            if (i.equals("SOUTH")) {
                y1 -= 1;
            }
            if (i.equals("WEST")) {
                x1 -= 1;
            }
        }
        System.out.println(x1 + " " + y1);
        return (x1 == x && y1 == y);
    }

    public static void main(String[] args) {
        String[] moves = {"NORTH", "EAST"};
        System.out.println(solve(moves, 1, 1));
    }

}
