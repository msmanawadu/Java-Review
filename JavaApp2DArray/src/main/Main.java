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
public class Main {
    
    public static void main(String args []){
        int array1[][] = {{2,3,5},{7,3,1}};
        int[][] array2 = {{4,6,2},{2,4,8}};
        
        int arraySum[][] = new int[2][3];
        
        //initializing the new 2D array
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arraySum[i][j] = array1[i][j] + array2[i][j];
            }
        }   
        
        //printing the result from the new 2D array
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arraySum[i][j] + " ");
            }
            System.out.println("");
        }
        
        int[][] array3 = new int[2][3];
        int array4[][] = new int[3][3];
       
        int marks1[][];           
        marks1 = new int[3][5];
        
        int[][] marks2;           
        marks2 = new int[3][5]; 
    }
}
