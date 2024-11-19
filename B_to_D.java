import java.util.*;

public class B_to_D {

    public static void B_to_D(int n){
        int b_no = n;
        int p = 0;
        int dec=0;
        int ld=0;
        while(n>0){
            ld=n%10;
            dec+=ld*(Math.pow(2,p));
            n=n/10;
            p++;
        }
        System.out.println("Decimal Number is: " +dec + " for binary " + b_no);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number ");
        int n = sc.nextInt();
        B_to_D(n);

    }
}
