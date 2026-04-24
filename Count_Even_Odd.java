// Write a program to count even and odd numbers in a two-dimensional array.

import java.util.*;
public class Count_Even_Odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        // Input For Array
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int Even = 0;
        int Odd = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j]%2 == 0){
                    Even = Even+1;
                }
                if(arr[i][j]%2 != 0){
                    Odd = Odd+1;
                }
            }
        }

        System.out.println("Even:"+Even);
        System.out.println("Odd:"+Odd);
    }
}