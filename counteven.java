public class counteven {
    public static void main(String[] args){
        int num = 56732;
        int even_count = 0;

        while(num > 0){
            int digit = num % 10;
            if(digit % 2 ==0){
                even_count++;
            }
            num = num / 10;
        }
        System.out.println(even_count);
    }
    
}
