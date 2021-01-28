
//206. Reverse Linked List
class ListNoded{
    int val;
    ListNoded next;
    ListNoded() {}
    ListNoded(int val) { this.val = val; }
    ListNoded(int val, ListNoded next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    public ListNoded reverseList(ListNoded head) {
        ListNoded prev = null;
        ListNoded curr = head;
        ListNoded next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
