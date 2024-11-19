import java.util.*;

public class D_to_B {
   

    public static void D_to_B(int n){
        int d_no = n;
        int p = 0;
        int bin=0;
        int rem=0;
        while(n>0){
            rem=n%2;
            bin+=rem*(Math.pow(10,p));
            n=n/2;
            p++;
        }
        System.out.println("Binary Number is: " + bin + " for decimal " + d_no);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number ");
        int n = sc.nextInt();
        D_to_B(n);

    }
}

