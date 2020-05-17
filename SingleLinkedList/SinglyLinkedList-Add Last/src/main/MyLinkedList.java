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
        head.next = second;
        second.next = third;
        
        display(head);
        addLast(4);
        display(head);
    }
    
    //display function
    static void display(Node currentNode){
        while(currentNode != null){
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }
    
    //addLast function to create a node and appends it at the end of the list.
    public static void addLast(int item){
        if(head == null){
            addFirst(0);
        }
        else{
            Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
            temp.next = new Node(item,null);    
        }
    }
    
    //addFirst function to create a node and prepends it at the beginning of the list. 
    public static void addFirst(int item){
        head = new Node(item, head);
    } 
}
