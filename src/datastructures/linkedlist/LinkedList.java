package datastructures.linkedlist;



public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
//    public void removeFirst(){
//        if (length==0) return;
//        Node nodeRemove = head;
//        head = nodeRemove.next;
//        nodeRemove = null;
//        length--;
//    }
    public void removeLast(){
        if (length==0) return;
        Node temp = head;
        Node pre= temp;
        //moves the head from one node to the next and sets the  till it gets to th
        while (temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length==0){
            head = null;
            tail = null;
        }

    }
}
