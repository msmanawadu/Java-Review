/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;
import java.util.*;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st value");
        int v1 = input.nextInt();
        System.out.println("Enter 2nd value");
        int v2 = input.nextInt();
        
        try{
            if((v1 == 0) && (v2 == 0)){
                throw new myException("Sorry, Both numbers cannot be Zeros");
            } else {
                int v3 = v1 + v2;
                System.out.println("Addition = " + v3);
            }
        } catch(myException e){
            System.out.println(e.getMessage());
        }
    
    }
}
