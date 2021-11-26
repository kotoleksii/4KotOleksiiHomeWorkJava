package edu.itstep;

class Node<E> {
    public Node next;
    public E data;

    public void displayNodeData() {
        System.out.print("\t" + data + "\t");
    }
}

public class SinglyLinkedList<E> {
    private Node head;

    public void insertFirst(E data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(E data) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node removeFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void removeLast() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node temp = new Node();
                temp = this.head;
                while (temp.next.next != null)
                    temp = temp.next;
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }

    public void displayAllItems() {
        System.out.println("LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
}
