import java.util.*;

public class range_prime {

    public static void primeInRange(int n){
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter range ");
        int n = sc.nextInt();

       primeInRange(n);


    }
    
}
