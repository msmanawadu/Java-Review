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
   
   int intArray[] = {0};
   //int[] intArray = new int[11];
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
          
        if (threadName.equals("Thread-1")) {
             for(int i = 100; i < 201; i++) {
                 
               // total = total + i;
              //  System.out.println("Total : " + ", " + total);
                // Let the thread sleep for a while.
              //  Thread.sleep(50);
             }
        } else {
            for(int i = 100; i < 201; i++) {
                
                if (i%10 == 0) {
                    System.out.println("Remainder:" + ", " + i);
                    
                    total = total + i;
                }
                
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
            System.out.println("Total - " + total);
        }
         
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }  
}


