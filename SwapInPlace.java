package HackerRank;

public class SwapInPlace {
    public static void swap_1(int a, int b) {
        // a = 9, b = 5
        // -> a = 5, b = 9
        //a = 9 - 5 = 4
        //a = 9-4 = 5
        //b = 9 + 5 = 13
        //b = 13 - 5 = 9
        // Assume a > b
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void swap_2(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void swap_3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int x = 10, y = 5;
        swap_1(x, y);
        swap_2(x, y);
        swap_3(x, y);
    }
}
