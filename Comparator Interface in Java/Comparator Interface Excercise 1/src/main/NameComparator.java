/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;

/**this NameComparator class needs to implement the Comparator interface and override the  
 *compare() method.
 * @author MaNa
 */
public class NameComparator implements Comparator<Student>{
    
    //sorting of student objects based on alphabetical order of student names
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getStudentName().compareTo(student2.getStudentName());
    }
}
