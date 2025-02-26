package StackAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_VALUE = 10;

    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_VALUE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
