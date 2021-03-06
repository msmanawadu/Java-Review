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
public class MyLinkedList {
    static Node head; //head pointer of the list
    
    //linked list Node. This inner class is made static so that main() can access it.
    static class Node{
        int data;
        Node next;
        //constructor overloading
        Node(int d){
            data = d;
            next = null;
        }
        Node(int d, Node t){
            data = d;
            next = t;
        }
    }
    
    //main method to create a simple linked list with 3 nodes
    public static void main(String args []){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        
        display(head);
        insertBefore(4, 3);
        display(head);
    }
    
    //display function
    static void display(Node currentNode){
        while(currentNode != null){
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }
    
    /*insertBefore function - method 2 : find the node containing "key" data value and insert 
    a new node before it*/
    public static void insertBefore(int keyValue, int toInsert){
        Node temp = head;
        //if there is only one node in the linked list
        if(temp.next == null){
            addFirst(keyValue);
        }
        while(temp != null && temp.next.data != keyValue){
            temp = temp.next;
        }
        if(temp != null){
            temp.next = new Node(toInsert, temp.next);
        }
    }

    //addFirst function to create a node and prepends it at the beginning of the list. 
    public static void addFirst(int item){
        head = new Node(item, head);
    }
}
