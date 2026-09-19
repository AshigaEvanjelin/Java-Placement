package Array;
import java.util.Scanner;

public class sumofrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        System.out.println("Enter elements");
        for(int i = 0; i <rows;i++){
            for(int j = 0 ; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            int sum = 0;
            for(int j = 0 ; j < columns; j++){
                sum =sum + arr[i][j];

            }
            System.out.println("Sum of the " + (i + 1) + "th " + sum);
        }
        
    }
    
}
