// Write a program to calculate the sum of each layer in a 2D array separately. 

import java.util.*;
public class Sum_Of_Each_Layer{
         public static void sum(int arr[][]){
        int Layer_1 = 0;
        int Layer_2 = 0;
         int row = 0;
        for(int col = 0; col <= arr[row].length-1; col++){
            Layer_2 += arr[0][col];
        }
        for(row = 0; row <= arr.length-1; row++){
            Layer_1 += arr[row][0];
        }
        System.out.println("Layer 1 Sum : "+Layer_1);
        System.out.println("Layer 2 Sum : "+Layer_2);
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},{5,6,7,8}
        };
        sum(arr);
    }
}