package StackAndQueues;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack(5);
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


//        DynamicStack stack = new DynamicStack(5); //CustomStack stack = new DynamicStack(5);
//        stack.push(3);
//        stack.push(6);
//        stack.push(21);
//        stack.push(42);
//        stack.push(64);
//        stack.push(89);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(9);
//        queue.insert(17);
//        queue.insert(43);
//
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(9);
        queue.insert(17);
        queue.insert(43);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(24);

        queue.display();
    }
}
