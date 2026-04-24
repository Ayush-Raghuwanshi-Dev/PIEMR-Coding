// Write a program to input a 2D array and calculate the sum of all elements across all layers.

import java.util.*;
public class Sum_All_Element{
    public static void sum(int [][]arr){
        int sum = 0;
        
        for(int row = 0; row <= arr.length-1; row++){
            for(int col = 0; col <= arr[row].length-1; col++){
                sum += arr[row][col];
            }
        }
        System.out.println("Sum of Array : "+sum);
    }
    public static void main(String[] args) {
        int [][] arr = {
                         {1,2},
                         {3,4}
                       };
        sum(arr);               
    }
}