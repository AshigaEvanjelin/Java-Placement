package Array;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();
        System.out.println("Enter the number needs to be searched:");
        int search = sc.nextInt();

        int[][] arr = new int[rows][columns];
        boolean found = false;

        System.out.println("Enter the values of the Array:");

        for(int i = 0; i< rows; i++){
            for(int j = 0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i< rows; i++){
            for(int j = 0 ; j<columns;j++){
                if(arr[i][j] == search){
                    found = true;
                    
                }
            }
        }
        if(found){
            System.out.println("Element found in the Array");
        }
        else{
            System.out.println("Element not found in the Array");
        }
    }
}
