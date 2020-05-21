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
public class MyCircularLinkedList {
    static Node head; //head pointer of the CLL
    
    static class Node{ //Node inner class
        int data;
        Node next;
        //constructor
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String args []){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        third.next = head;
        
        display(head);
    }
    
    //display function - to traverse and display the data in the CLL
    static void display(Node currentNode){
        Node temp = currentNode;
        if(temp != null){
            do{
                System.out.println("Data: " + temp.data);
                temp = temp.next;
            } while(temp != head);
        }
    }
}
