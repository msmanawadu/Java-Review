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
public class Main {
    public static void main(String args []){
        MyCircularLinkedList cl = new MyCircularLinkedList();
        
        cl.addNodeAtEnd(1);
        cl.addNodeAtEnd(2);
        cl.addNodeAtEnd(3);
        cl.addNodeAtEnd(4);
        cl.addNodeAtEnd(5);
        
        cl.print();
        cl.remove(3);
        cl.print();
    }
}
