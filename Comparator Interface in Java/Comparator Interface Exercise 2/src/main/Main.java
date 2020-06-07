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
public class Main {
    public static void main(String args[]){
        
        //create an instance of ArrayList
        ArrayList<Student> list = new ArrayList<>();
        
        //add new instances of Student to the list
        list.add(new Student("Stephanie", 19, 1005));
        list.add(new Student("Sanuka", 21, 1003));
        list.add(new Student("Ashanthi", 11, 1008));
        list.add(new Student("Rainy", 20, 1009));
        list.add(new Student("Rainy", 24, 1002));
        
        /*group by sort - chain multiple comparators to sort the list of objects on mutiple fields.
        first, sort by student name then, sort by student age */
        Comparator<Student> comparator = Comparator.comparing(Student::getStudentName).thenComparing(Student::getStudentAge);
        
        //invoking to group by sort
        Collections.sort(list, comparator);
        
        //display the sorted list of student objects
        System.out.println("List of Students first sorted by name then, sorted by age");
        System.out.println(list);
    }
}
