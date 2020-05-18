/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MaNa
 */
public class DoublyLinkedList {
    static Node head; //head pointer of the list
    
    //linked list Node. This inner class is made static so that main() can access it.
    static class Node {
        int data;
        Node next;
        Node prev;
        //constructor overloading
        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
        Node(int d, Node p, Node n){
            data = d;
            prev = p;
            next = n;
        }
    }
    
    //main method to create a doubly linked list with 4 nodes
    public static void main(String args []){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(5);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        
        display(head);
        insertBefore(4, 3);
        display(head);
    }
    
    //display function - traversing in both direction along the DLL
    static void display(Node currentNode){
        Node tail = null;
        while(currentNode != null){
            System.out.println("Data: " + currentNode.data);
            tail = currentNode;
            currentNode = currentNode.next;
        }
        currentNode = tail;
        while(currentNode != null){
            System.out.println("Descending Order Data: " + currentNode.data);
            currentNode = currentNode.prev;
        }
    }

    /*insertBefore function - find the node containing "key" data value and insert a new node 
    before it*/
    public static void insertBefore(int keyValue, int toInsert){
        Node temp = head;
        while(temp != null && temp.data != keyValue){
            temp = temp.next;
        }
        if(temp != null && temp.prev != null){
            Node prevRef = temp.prev;
            temp.prev = new Node(toInsert, temp.prev, temp);
            prevRef.next = temp.prev;
        }
        else if(temp != null && temp.prev == null){
            addFirst(toInsert);
        }
    }
    
    //addFirst function to create a node and prepends it at the beginning of the list.
    public static void addFirst(int item){
        Node temp = head;
        head = new Node(item, null, head);
        temp.prev = head;
    }
}
