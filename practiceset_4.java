import java.util.*;

public class practiceset_4 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial: "+ fact);
    }
}
