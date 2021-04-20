import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            return new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        }
        else{
            return new ListNode(l2.val, mergeTwoLists(l1,l2.next));
        }

    }

    public ListNode solve(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        //Traverse through both lists
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }
            else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        //Remaining list
        if(l1 != null){
            dummy.next = l1;
        }
        else{
            dummy.next = l2;
        }

        return tail.next;//tail is a head of dummy linkedlist
    }
}
