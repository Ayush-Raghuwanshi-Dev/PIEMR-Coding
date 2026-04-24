// Write a program to find the maximum and minimum elements in a three-dimensional array. 

import java.util.*;

public class Find_Min_Max_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Initialize
        int max = arr[0][0];
        int min = arr[0][0];

        // Traverse
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}