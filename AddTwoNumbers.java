//2.Add Two Numbers - Leetcode
public class AddTwoNumbers {
    public ListNode solve(ListNode l1, ListNode l2){
        //Temp nodes for traversing the lists
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        //Result node
        ListNode res = new ListNode(0);

        //Head of result list
        ListNode head_res = res;

        int carry =0;

        //Traverse both lists
        while(temp1 != null && temp2 != null){
            int data = temp1.val + temp2.val + carry;
            int remain = data % 10;
            carry = data /10;

            res.next = new ListNode(remain);

            //Moving pointers
            res = res.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        //In case l1 still remains
        while(temp1 != null){
            int data = temp1.val + carry;
            int rem = data%10;
            carry = data/10;
            res.next = new ListNode(rem);

            temp1 = temp1.next;
            res = res.next;
        }

        //In case l2 still remain
        while(temp2 != null){
            int data = temp2.val +carry;
            int rem = data%10;
            carry = data/10;
            res.next = new ListNode(rem);

            temp2 = temp2.next;
            res = res.next;
        }
        //if any carry is left
        if(carry != 0){
            res.next = new ListNode(carry);
            res = res.next;
        }
        return head_res;
    }
}
