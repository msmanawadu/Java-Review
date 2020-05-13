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
public class Product {
    protected int productCode;
    protected double productPrice;
    
    protected double discountedPrice;
    
    Product(int pCode, double pPrice){
        productCode = pCode;
        productPrice = pPrice;
    }
    
    public void calculateBill(){
        discountedPrice = productPrice;
    }
    
    public void display(){
        System.out.println("Product Price - " + discountedPrice);
    }
}
