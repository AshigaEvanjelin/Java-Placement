import java.util.Scanner;

class smallnum{
    void smallnum(int num){
        int small=9;
        int digit;

        while(num != 0){
            digit = num % 10;
            if(digit < small){
            small = digit;

        }
        num = num/10;
        }
        


        System.out.println(small);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        smallnum l = new smallnum();
        l.smallnum(num);

    }
}