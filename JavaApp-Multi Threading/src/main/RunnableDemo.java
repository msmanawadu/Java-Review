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
public class RunnableDemo implements Runnable{
   private Thread t;
   private String threadName;
   private int total;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
    int[] intArray = new int[11];
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
          
        if (threadName.equals("Thread-1")) {
                for(int i = 100; i <= 200; i++){
                    if(i%10 == 0) {
                
             
             
                for(int j = 0; j<= intArray.length - 1; j++){
                   intArray[j] = i;
                }
                
                
               
            }
                    
                
                }



//             for(int i = 100; i < 201; i++) {
//                 
//                total = total + i;
//                System.out.println("Total : " + ", " + total);
//                // Let the thread sleep for a while.
//                Thread.sleep(50);
//             }
        } else {
            
//            for(int j = 0; j<= intArray.length - 1; j++){
//                  System.out.println(intArray[j]);
//                }
            
//            for(int i = 100; i < 201; i++) {
//                
//                if (i%10 == 0) {
//                    System.out.println("Remainder:" + ", " + i);
//                }
//                
//                // Let the thread sleep for a while.
//                Thread.sleep(50);
//            }
        }
         
      } catch (Exception e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
      
      for(int j = 0; j<= intArray.length - 1; j++){
                  System.out.println(intArray[j]);
                }
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }  
}
