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
public class MyLinkedListClass {
    public static void main(String args []){
        LinkedList<Integer> link1 = new LinkedList<>();
        
        link1.add(12);
        link1.add(34);
        link1.add(65);
        link1.add(78);
        link1.add(89);
        link1.add(55);
        link1.add(55);
        link1.add(55);
        
        link1.add(0, 10);
        link1.addFirst(5);
        link1.addLast(60);
     
        link1.remove(7);
        
        int size = link1.size();
        System.out.println("DLL Size - " + size);
         
        Iterator<Integer> iterator1 = link1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        
        boolean state = link1.contains(65);
        String stringState = state ? "exists !" : "doesn't exist !";
        System.out.printf("The searching element %s \n", stringState);
        
        int firstElement = link1.getFirst();
        System.out.println("First element - " + firstElement);
        
        int lastElement = link1.getLast();
        System.out.println("Last element - " + lastElement);
        
        int element = link1.get(3);
        System.out.println("Element at index 3 - " + element);
        
        int searchIndex = link1.indexOf(78);
        System.out.println("Index of 78 is - " + searchIndex);
        
        int lastIndex = link1.lastIndexOf(55);
        System.out.println("Index of last occurence of 55 - " + lastIndex);
    }
}
