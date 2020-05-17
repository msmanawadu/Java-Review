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
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        display(head);
        remove(4);
        display(head);
    }
    
    //display function
    static void display(Node currentNode){
        while(currentNode != null){
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }
    
    /*remove function - find the node containing the "key" data value and delete it.
    (Removing the reference to that object) */
    public static void remove(int keyValue){
        //check whether the linked list is empty
        if(head == null){
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null && temp.data != keyValue){
            prev = temp;
            temp = temp.next;
        }
        if(temp != null && prev != null){
            prev.next = temp.next;
        }
        else {
            head = temp.next;
        }
    }
}
