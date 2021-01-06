package HackerRank;

//BinarySearch
class LLNode {
    int val;
    LLNode next;
}


public class LinkedListtoInteger {
    public int solve(LLNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            node = node.next;
        }
        //get value;
        int len = sb.length();
        int dec_value = 0;
        int base = 1;

        for (int i = len - 1; i >= 0; i--) {
            if (sb.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }

        return dec_value;
    }
}
