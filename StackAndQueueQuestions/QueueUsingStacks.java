package StackAndQueueQuestions;

import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int value) {
        first.push(value);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}