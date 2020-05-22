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
public class Node {
    int data;
    Node next;
    //constructor overloading
    public Node(int data){
        this.data = data;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
