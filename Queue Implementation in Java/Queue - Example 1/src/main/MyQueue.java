/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author MaNa
 */
public class MyQueue {
    public static void main(String args []){
        //create an instance of Queue class
        Queue<Integer> q = new LinkedList<>();
        
        //add elements 0-4 to the queue (enqueue)
        for(int i = 0; i < 5; i++){
            q.add(i);
        }
        
        //display the contents of the queue
        System.out.println("Elements of Queue - " + q);
        
        //to remove the head of queue (dequeue)
        int dequeuedElement = q.remove();
        System.out.println("Dequeued / Removed element - " + dequeuedElement);
        System.out.println("Elements of Queue - " + q);
        
        //to examine the head of the queue
        int headElement = q.peek();
        System.out.println("Head element of the queue - " + headElement);
        
        int queueSize = q.size();
        System.out.println("Queue Size - " + queueSize);
    }
}
