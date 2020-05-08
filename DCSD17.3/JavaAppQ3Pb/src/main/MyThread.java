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
public class MyThread extends Thread{
    
    @Override
    public void run(){
        int[] intArray = new int[11];
        
        for(int i = 100; i <= 200; i++){
            if(i%10 == 0) {
                
             
             
                for(int j = 0; j<= intArray.length - 1; j++){
                   intArray[j] = i;
                }
                
                
               
            }
            
        
               
        }
        
//       for(int j = 0; j<= intArray.length - 1; j++){
//                  System.out.println(intArray[j]);
//                }
        
        
        
        
       // int sum = 0;
        
      //  for(int j = 0; j <= intArray.length - 1; j++){
      //      sum = sum + intArray[j];
      //  }
        
       // System.out.println("Sum = " + sum);
    }
}
