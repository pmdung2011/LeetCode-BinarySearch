package HackerRank;
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
        while(curr != null){
            ListNoded nextTemp = curr.next;
            // prev curr next
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
