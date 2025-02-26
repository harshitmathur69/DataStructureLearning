package StackAndQueues;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(6);
//        stack.push(21);
//        stack.push(42);
//        stack.push(64);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(9);
//        queue.add(17);
//        queue.add(43);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addLast(6);
        deque.removeFirst();
        //etc
    }
}
