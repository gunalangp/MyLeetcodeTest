package com.geeksforgeeks.mytest.linkedlist;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int val){

    }

    public void insertAtIndex(int val, int index){

    }

    public int deleteFirst(){

        return size;
    }

    public int deleteLast(){

        return size;
    }

    public Node get(int index){

        return null;
    }

    public int deleteIndex(int index){

        return index;
    }

    public Node findNode(int val){

        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value + " spce-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
