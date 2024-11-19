import java.util.*;

public class prime_no {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                //System.out.println("It's not prime number");
            }
        }
        if(isPrime == true){
            System.out.println("It's a prime number");
        }
        else{
            System.out.println("It's not a prime number");
        }
    }
}
