// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public void NivenNumber(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        if(original % sum == 0){
            System.out.println("Its a Niven Number");
        }
        else{
            System.out.println("Not a Niven Number");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main m = new Main();
        m.NivenNumber(num);
        
        
    }
}