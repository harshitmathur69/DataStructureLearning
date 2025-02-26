package LinkedList;

public class Main {
    public static void main(String[] args) {

        // Singly Linked List
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(13);
        list.insertLast(69);
        list.insert(6,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(2,1);
        list.display();

        // Doubly Linked List
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(69);
//        list.insert(8,20);
//        list.display();

        // Circular Linked List
//        CLL list = new CLL();
//        list.insert(3);
//        list.insert(5);
//        list.insert(8);
//        list.insert(19);
//        list.display();
//        list.delete(8);
//        list.display();

    }
}
