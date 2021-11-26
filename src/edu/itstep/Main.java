package edu.itstep;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(4);
        linkedList.insertFirst('З');
        linkedList.insertFirst(2.0);
        linkedList.insertFirst(1);
        linkedList.insertLast("string");

        linkedList.removeLast();
        linkedList.removeFirst();

        linkedList.displayAllItems();
    }
}
