/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author MaNa
 */
public class Values {
   
    void displayValues(int...values){
        
        try{
        for(int i = 0; i <= values.length-1; i++){
        
            System.out.println(values[i]);
        }
            }
        
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of bounds");
        }
    }
}

