package Array;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        System.out.println("Enter elements");
        for(int i=0 ; i< rows ; i++){
            for(int j = 0;j <columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < columns; i++){
           for(int j = 0; j < rows; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        



    }
}
