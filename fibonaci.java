import java.util.*;

public class fibonaci {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Enter positive numbers");
        }
        else if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);
        }
        else{
        int first = 0;
        int second = 1;
        int third=0;
        for(int i=3;i<=n;i++){
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println(third);
    }
}
}
