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
public class MyLinkedList {
    public static void main(String args []){
        LinkedList<String> linkedList = new LinkedList<>();
        
        //add elements to the DLL
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        
        System.out.println("Original contents of DLL - " + linkedList);
        linkedList.addLast("Z");
        System.out.println("After addLast Z contents of DLL - " + linkedList);
        linkedList.addFirst("A");
        System.out.println("After addFirst A contenets of DLL - " + linkedList);
        linkedList.add(1, "A2");
        System.out.println("After add A2 at index 1, contenets of DLL - " + linkedList);
        linkedList.remove("F");
        System.out.println("After remove F, contenets of DLL - " + linkedList);
        linkedList.remove(2);
        System.out.println("After remove index 2, contenets of DLL - " + linkedList);
        linkedList.removeFirst();
        System.out.println("After remove first element, contenets of DLL - " + linkedList);
        linkedList.removeLast();
        System.out.println("After remove last element, contenets of DLL - " + linkedList);
        String value = linkedList.get(2);
        linkedList.set(2, value + " Changed");
        System.out.println("linkedList after change - " + linkedList);
    }
}
