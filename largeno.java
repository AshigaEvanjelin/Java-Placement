import java.util.Scanner;

class largeno{
    void largenum(int num){
        int large=0;
        int digit;

        while(num > 0){
            digit = num % 10;
            if(digit > large){
            large = digit;

        }
        num = num/10;
        }
        


        System.out.println(large);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        largeno l = new largeno();
        l.largenum(num);

    }
}