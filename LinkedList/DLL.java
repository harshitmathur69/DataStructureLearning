package LinkedList;
// Doubly Linked List
public class DLL {
    Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if(head != null){
            head.previous = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head == null){
            node.previous = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.previous = last;

    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after,int value){
        Node p = find(after);
        if(p == null){
            System.out.println("Does not exist");
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.previous = p;
        if(node.next.previous != null){
            node.next.previous = node;
        }
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print("[" + node.value + "]" + "->");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Print in reverse");
        while(last != null){
            System.out.print("[" + last.value + "]" + "->");
            last = last.previous;
        }
        System.out.println("Start");
    }

    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
