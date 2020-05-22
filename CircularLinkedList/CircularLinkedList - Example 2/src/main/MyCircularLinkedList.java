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
    
    //getFirst function - returns the data value of the first node (head node)
    public int getFirst(){
        //check whether the CLL is empty
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        else{
            return head.data;
        }
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
    
    //displayFirst function - to display the first node value
    public void displayFirst(int value){
        System.out.println("Head Node - " + value);
    }
    
    /*insertAfter function - find the node containing "key" data value and insert a new node 
    after it. There are 2 categories*/
    
    public void insertAfter(int keyValue, int toInsert){
        //check whether the Circularly Linked List is empty.
        if(head == null){
            System.out.println("Circularly Linked List is empty");
        }
        
        Node temp = head;
        while(temp.data != keyValue){
            temp = temp.next; 
        }
        
        /*category 1 - check if it is the last node*/
        if(temp.next == head){
            addNodeAtEnd(toInsert);
        }
        
        /*category 2 - node to be added is after the head node, which is same as adding
        the new node after a middle section node*/
        else {
            temp.next = new Node(toInsert, temp.next);
        }
    }
    
    /*insertBefore function - find the node containing "key" data value and insert a new node 
    before it. There are 2 categories*/
    
    public void insertBefore(int keyValue, int toInsert){
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
        
        /*category 1 - check if it is the head node*/
        if(temp == head){
            addNodeAtStart(toInsert);
        }
        
        /*category 2 - node to be added is before the tail node, which is same as adding
        the new node before a middle section node*/
        else{
            prev.next = new Node(toInsert, temp);
        }
        
    }
    
}
