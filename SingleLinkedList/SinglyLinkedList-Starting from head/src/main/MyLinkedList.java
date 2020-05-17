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
    static class Node {
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    //main method to create a simple linked list with 3 nodes
    public static void main(String args []){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        /*three nodes have been allocated dynamically. we have references to these three
        blocks as head, second and third*/
        
        //link the head node (first node) with the second node
        head.next = second;
        //now the next of head node points to the second. So they both are linked now.
        
        second.next = third;
        //link the second node with the third node
        //Now the next of second node points to third. So all three nodes are linked. 
        
        display(head);
    }
    
    static void display(Node currentNode){
        while(currentNode != null){
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
