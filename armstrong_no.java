import java.util.*;

public class armstrong_no {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int N =n;
        int SumOfDigits = 0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            SumOfDigits+=digit*digit*digit;
        }
        //System.out.println(SumOfDigits);
        if(N==SumOfDigits){
            System.out.println("Armstrong number ");
        }
        else{
            System.out.println("Not an Armstrong number ");

        }
}

}