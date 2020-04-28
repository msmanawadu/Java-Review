/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        Calculation c1 = new Calculation();
        try{
            c1.divide(2, 0);
        } 
        catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }
    }
}
