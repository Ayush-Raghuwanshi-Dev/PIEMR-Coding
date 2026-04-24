// Write a program to search for a given element in a 2D array and display its position. 

import java.util.*;
public class Search_Element{
    public static void find(int arr[][], int target){
        for(int row = 0; row <= arr.length-1; row++){
            for(int col = 0; col <= arr[row].length-1; col++){
             
                if(arr[row][col] == target){
                    System.out.println(target+" Found at row: "+row+" Column: "+col );
                }else{
                    System.out.println(target+" Target not found");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},{5,6,7,8}
        };
        int target = 6;
        find(arr, target);
    }
}