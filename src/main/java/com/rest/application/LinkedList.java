package com.rest.application;

public class LinkedList {

    public static void main(String[] args) {

        Node node = new Node();
        node.createNode(1);

        node.insertNodeAtBeginning(node,2);

        node.display();
    }

}

 class Node {

    Node head;
    Node new_node;
    Node temp;

    int data;
    Node next;

    Node(){

    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    void createNode(int data){
        new_node = new Node(data);
    }

    void insertNodeAtBeginning(Node new_node, int data) {
        new_node = new Node(data);
        head = new_node;
    }

    void insertAtEnd(Node new_node) {
        new_node = new Node(data);
        temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = new_node;

    }

    void display() {
        temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
