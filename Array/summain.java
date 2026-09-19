package Array;
import java.util.Scanner;

public class summain {
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

        int j = 0;
        int i = 0;
        int sum =0;

        while(i < rows){
            sum = arr[i][j] + sum;
            i++;
            j++;
        }
        System.out.println(sum);
    }
    
}

//int sum = 0;

//int limit = Math.min(rows, columns);

//for(int i = 0; i < limit; i++){
//    sum = sum + arr[i][i];
//}

//System.out.println(sum);