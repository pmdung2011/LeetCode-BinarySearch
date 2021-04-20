////Implement stack using a single queue
//import java.util.*;
//public class Stack {
//    Queue<Integer> q = new LinkedList<>();
//
//    //Push operation
//    void push(int val){
//        //get the previos size of the queue
//        int size = q.size();
//        //add current element
//        q.add(val);
//        //Pop (Dequeue) all previous elements
//        //and put them after the current element
//        for(int i = 0; i < size; i++){
//            int x = q.remove();
//            q.add(x);
//        }
//    }
//
//    //Peek operation
//    int peek(){
//        return (!q.isEmpty()) ? q.peek() : -1;
//    }
//
//    //Pop operation
//    int pop(){
//        return (!q.isEmpty()) ? q.remove() : -1;
//    }
//
//    //isEmpty operation
//    boolean isEmpty(){
//        return q.isEmpty();}
//
//    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(10);
//        s.push(20);
//        System.out.println("Top element :" + s.peek());
//        s.pop();
//        s.push(30);
//        s.pop();
//        System.out.println("Top element :" + s.peek());
//    }
//}
