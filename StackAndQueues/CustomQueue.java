package StackAndQueues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_VALUE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_VALUE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int value){
        if(isFull()){
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        //Shifting data towards left
        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0; i < end; i++){
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }

}
