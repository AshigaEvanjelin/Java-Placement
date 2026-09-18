package Array;
import java.util.Scanner;

public class counteven {
    public static void main(String[] args){
        int count = 0;

        
    Scanner sc = new Scanner(System.in);
    

    int[][] arr  = new int[2][3];

    for(int i = 0; i < 2 ; i++){
        for(int j =0 ; j < 3; j++){
            arr[i][j] = sc.nextInt();
        }
        
    }
       
    for(int i = 0; i < 2 ; i++){
        for(int j =0 ; j < 3; j++){
            if(arr[i][j] % 2 ==0){
                count++;
            }


            
            
        }
        
    }

    System.out.println(count);
    

    }


    


    
}
