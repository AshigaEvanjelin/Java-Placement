import java.util.Scanner;

class leapYear{

    void leap(int year){
        if((year % 400 == 0) || (year % 100 != 0 && year % 4 ==0)){
            System.out.println("The year " + year + " is leap year.");

        }
        
        else{
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();

        leapYear l = new leapYear();
        l.leap(year);

    }
}