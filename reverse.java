import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        while(number!=0){
            int last_dig = number % 10;     // printing digits in reverse order
            System.out.print(last_dig);
            number=number/10;
        }
    int n =10433;
    int rev = 0;
    while(n>0){
        int last_digit = n % 10; 
        rev = (rev*10) + last_digit;   // reversing orignal no.
        n = n/10;
    }
    System.out.println();
    System.out.println(rev);

}
}
