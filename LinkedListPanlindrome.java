//234. Palindrome Linked List

public class LinkedListPanlindrome {
    public boolean solve(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next.next;
        }

        //in case odd nodes, move slow one more step
        if(fast != null){
            slow = slow.next;
        }

        ListNode end = reverse(slow);
        ListNode start = head;

        //Check for palindrome
        while(end != null){
            if(start.val != end.val){
                return false;
            }
            start = start.next;
            end = end.next;
        }

        return true;

    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
