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
        
        int value = getFirst();
        displayFirst(value);
    }
    
    //displayFirst function - display the data value of first node
    public static void displayFirst(int value){
        System.out.println("First Node - " + value);
    }
    
    //getFirst function - returns the data value of the first node/element (head node)
    public static int getFirst(){
        //check whether the linked list is empty
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        else {
            return head.data;
        }
    }
}
