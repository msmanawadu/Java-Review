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
    static int size = 0;
    static Node head = null;
    static Node tail = null;
    
    //addNodeAtEnd function - add the node to the end of the CLL (as the tail node)
    public void addNodeAtEnd(int data){
        if(size == 0){
            addNodeAtStart(data);
        }
        else {
            Node n = new Node(data);
            tail.next = n;
            tail = n;
            tail.next = head;
            size++;
        }
        System.out.println("\nNode " + data + " is added at the end of the list");
    }
    
    //addNodeAtStart function - add the node to the start of the CLL (as the head node)
    public void addNodeAtStart(int data){
        System.out.println("Adding node " + data + " as head");
        Node n = new Node(data);
        if(size == 0){
            head = n;
            tail = n;
            n.next = head;
        }
        else{
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }
    
    /*remove function - find the node containing the "key" value and delete it.
    node deletion involves 4 categories*/
    
    public void remove(int keyValue){
        //check whether the Circularly Linked List is empty.
        if(head == null){
            System.out.println("Circularly Linked List is empty");
        }
        
        Node temp = head;
        Node prev = null;
        
        while(temp.data != keyValue){
            prev = temp;
            temp = temp.next; 
        }
        
        //category 1 - check if it is the only node in the CLL
        if(temp == head && temp.next == head){
            head = null;
        }
        
        /*category 2 - else if the CLL has more than one node, check if it is the first node
        of the list*/
        else if(temp == head && temp.next != head){
           prev = head;
           while(prev.next != head){
               prev = prev.next;
           }
           head = temp.next;
           prev.next = head;
        }
        
        /*category 3 - else if, check if it is the last node*/
        else if(temp.next == head){
            prev.next = head;
        }
        
        /*category 4 - node to be deleted is neither head nor tail,
        it is a node in middle section */
        else {
            prev.next = temp.next;
        }
    }
    
    //getLast function - returns the data value of the last node (tail node)

    public int getLast(){
        //check whether the CLL is empty
        if(head == null){
            throw new RuntimeException("List is empty");            
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        return temp.data;
    }
    
    //print function - traverse and display the data in the CLL
    public void print(){
        System.out.println("\nCircularly Linked List: ");
        Node temp = head;
        if(size <= 0){
            System.out.println("Circularly Linked List is empty");
        }
        else {
            do{
                System.out.println(" " + temp.data);
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println();
    }
    
    //displayLast function - to display the last node value
    public void displayLast(int value){
        System.out.println("Tail Node - " + value);
    }
    
}
