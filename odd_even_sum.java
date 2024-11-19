import java.util.*;

public class odd_even_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int sum_odd=0;
        int sum_even=0;
        for(int i=a;i<b+1;i++){
            if(i%2==0){
                sum_even+=i;
            }
            else{
                sum_odd+=i;
            }
        }
        System.out.println("Even sum "+ sum_even);
        System.out.println("Odd sum "+ sum_odd);
  
    }
}