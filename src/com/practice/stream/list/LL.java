package com.practice.stream.list;

public class LL {

    private Node head;
    private Node tail;

    // Add element to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove and return the first element (like a queue poll operation)
    public Integer poll() {
        if (head == null) {
            return null;
        }
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public Integer getDataFromSpecificPosition(int size){
        if (size<0){
            return -1;
        }
        Node current = head;
        int count =0;

        while (current!=null){
            if (count==size){
                return current.data;
            }
            count++;
            current = current.next;

        }
        return -1;
    }

    public void addFirstPosition(int data){
        Node node = new Node(data);
        if (head==null){
            head = node;
            tail = head;
        }else {
            node.next=head;
            head = node;
        }
    }

    public void addLastPosition(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = head;
        }
        Node current = head;
        while (current.next!=null){
            current=current.next;
        }
        current.next = node;
        tail = node;
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }



}

// Node class to store data
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main class to test the LL
class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirstPosition(45);
        ll.addLastPosition(87);

        System.out.println(ll.getDataFromSpecificPosition(1));

        // Corrected condition in the while loop
        while (!ll.isEmpty()) {
            System.out.println(ll.poll());
        }
    }
}
