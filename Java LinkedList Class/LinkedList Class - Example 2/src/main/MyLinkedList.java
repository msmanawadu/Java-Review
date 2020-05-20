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
        //create a DLL to store the book objects
        LinkedList<Book> bookList = new LinkedList<>();
        
        //create book objects
        Book b1 = new Book(1678, "Java for Dummies", "Pearson Publishers");
        Book b2 = new Book(1356, "Java in 24 hours", "Longbeach Publishers");
        Book b3 = new Book(1936, "PDSA in Java", "Cute Pie Publishers");
        
        //add the books to the DLL
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        
        //Traversing the DLL - method 1 - by an iterator
        Iterator<Book> iterator1 = bookList.iterator();
        while(iterator1.hasNext()){
            Book b = iterator1.next();
            System.out.println("Book ID: " + b.bookId);
            System.out.println("Book Name: " + b.bookName);
            System.out.println("Author Name: " + b.authorName);
            System.out.println("--------------------------------");
        }
        
        //Traversing the DLL - method 2 - by a for each loop
        //for(Book b : bookList){
        //    System.out.println("Book ID: " + b.bookId);
        //    System.out.println("Book Name: " + b.bookName);
        //    System.out.println("Author Name: " + b.authorName);
        //    System.out.println("--------------------------------");
        //}
        
    }
}
