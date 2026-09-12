public class countodd {
    public static void main(String[] args){
        int num = 56732;
        int odd_count = 0;

        while(num > 0){
            int digit = num % 10;
            if(digit % 2 != 0){
                odd_count++;
            }
            num = num / 10;
        }
        System.out.println(odd_count);
    }
    
}
