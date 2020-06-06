/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.lang.*;

/**implement the Student class with the Comparable interface and override the compareTo() 
 * method of Comparable interface.
 *
 * @author MaNa
 */
public class Student implements Comparable<Student>{

    //private instance variables of Student
    private String studentName;
    private String studentAddress;
    private int indexNumber;
    private long phoneNumber;
    
    //parameterized constructor method
    public Student(String studentName, String studentAddress, int indexNumber, int phoneNumber){
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.indexNumber = indexNumber;
        this.phoneNumber = phoneNumber;
    }
    
    //getter methods for accessing private instance variables
    public String getStudentName(){
        return studentName;
    }
    
    public String getStudentAddress(){
        return studentAddress;
    }
    
    public int getIndexNumber(){
        return indexNumber;
    }
    
    public long getPhoneNumber(){
        return phoneNumber;
    }
    
    //sorting of student objects based on ascending order of index numbers
    @Override
    public int compareTo(Student student) {
       if(this.indexNumber == student.indexNumber){
           return 0;
       }
       else if(this.indexNumber > student.indexNumber){
           return 1;
       }
       else {
           return -1;
       }
    } 
}
