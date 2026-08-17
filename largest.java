import java.util.Scanner;

class largest{

    void large(int a,int b,int c){

        if(a > b && a > c){
            System.out.println("The number " + a + " is larger");
        }
        else if(b > a && b > c){
            System.out.println("The number " + b + " is larger");
        }
        else{
            System.out.println("The number " + c + " is larger");
        }
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    largest l = new largest();
    l.large(a,b,c);
}

}

