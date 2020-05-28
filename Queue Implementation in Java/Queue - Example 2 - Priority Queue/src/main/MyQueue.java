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
        //create an instance of PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        
        System.out.println("Head Element - " + queue.element());
        System.out.println("Head Peak - " + queue.peek());
        System.out.println("Iterating the queue elements - ");
        
        //iterating the queue using an iterator instance 
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        String dequequedElement = queue.remove();
        System.out.println("Dequequed Element - " + dequequedElement);
        
        String polledElement = queue.poll();
        System.out.println("Polled Element - " + polledElement);
        
        System.out.println("After dequequing 2 elements - ");
        Iterator itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
