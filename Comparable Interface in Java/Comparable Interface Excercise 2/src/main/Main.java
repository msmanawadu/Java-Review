/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;

/**Student objects are stored in the Student[].
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        //create an instance of Student[]
        Student[] studentArray = new Student[5];
        
        //add new instances of Student to the student array
        studentArray[0] = new Student("Sithumini", "Kandy", 1009, 7655654);
        studentArray[1] = new Student("Siharaa", "Matara", 1001, 7764534);
        studentArray[2] = new Student("Omesha", "Colombo", 1008, 78876543);
        studentArray[3] = new Student("Udari", "Gampaha", 1000, 77645678);
        studentArray[4] = new Student("Sajani", "Kaluthara", 10012, 76546781);
        
        //invoking the sorting method
        Arrays.sort(studentArray);
        
        //display sorted student objects
        System.out.println("Student Objects after sorting \n");
        for(Student student : studentArray){
            System.out.println("Student Index - " + student.getIndexNumber());
            System.out.println("Student Name - " + student.getStudentName());
            System.out.println("Student Address - " + student.getStudentAddress());
            System.out.println("Student Phone Number - " + student.getPhoneNumber());
            System.out.println("----------------------------------");
        }    
    }
}
