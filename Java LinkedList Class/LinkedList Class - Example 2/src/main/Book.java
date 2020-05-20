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
public class Book {
    //instance variables
    int bookId;
    String bookName, authorName;
    
    //parameterized constructor
    public Book(int bookId, String bookName, String authorName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}
