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
    
    //linked list Node. This inner class is made static so that the main() can access it.
    static class Node{
        int data;
        Node next;
        //constructor
        Node(int d, Node t){
        data = d;
        next = t;
        }
    }
    //main method to create a simple linked lsi with 3 nodes. 
    public static void main(String args []){
        Node temp = new Node(50, null);
        temp = new Node(17, temp);
        temp = new Node(23, temp);
        temp = new Node(97, temp);
        temp = new Node(44, temp);
        
        display(temp);
    }
    
    static void display(Node currentNode){
        while(currentNode != null){
            System.out.println("Value: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
