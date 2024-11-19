import java.util.*;
public class SumOfDigits {

    public static void SumOfDigits(int n){
        int N =n;
        int sum=0;
        int ld=0;
        while(n>0){
            ld=n%10;
            sum+=ld;
            n=n/10;
        }
        System.out.println("Sum of digits of number "+ N + " is " + sum);
    }
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        SumOfDigits(n);

    }
    
}
