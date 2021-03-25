import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class PalindromeLinkedList {
    //Method 1: Using stack
    public static boolean solve(ListNode l1){
        //First iteration to push value of list into the stack
        Stack<Integer> stk = new Stack<>();
        ListNode cur = l1;
        ListNode cur1 = l1;
        while(cur != null){
            stk.push(cur.val);
            cur = cur.next;
        }

        while(cur1 != null){
            if(stk.pop() != cur1.val){
                return false;
            }
            cur1 = cur1.next;
        }
        return true;
        //Second traverse to compare the values

    }

    /**
     * This method takes O(n) time and O(1) extra space.
        1) Get the middle of the linked list.
        2) Reverse the second half of the linked list.
        3) Check if the first half and second half are identical.
        4) Construct the original linked list by reversing
     the second half again and attaching it back to the first half
     */
    public static boolean solve1(ListNode l1){
        //First: get the middle of the list
        ListNode slow = l1;
        ListNode fast = l1;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Slow is now at the middle of the list
        ListNode half = reverse(slow);

        while(half != null){
            if(half.val != l1.val){
                return false;
            }
            half = half.next;
            l1 = l1.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        System.out.println(solve(one));
        System.out.println(solve1(one));
    }
}
