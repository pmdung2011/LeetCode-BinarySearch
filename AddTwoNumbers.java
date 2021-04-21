//2.Add Two Numbers - Leetcode
public class AddTwoNumbers {
    public ListNode solve(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode p = l1, q = l2, dummy = res;
        int carry = 0;

        //Traversing both lists, do not need to care which will end first
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;

            //Store to result list
            res.next = new ListNode(sum % 10);

            //Keep moving pointers
            res = res.next;
            if(p != null ) p = p.next;
            if(q != null) q = q.next;
        }
        //In case carry still remains
        if(carry > 0){
            res.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
