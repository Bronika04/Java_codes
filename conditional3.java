import java.util.*;

public class conditional3{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        float income = s.nextFloat();
        int tax;
        if(income<500000){
            income = income;
        }
        else if(income>500000 && income<100000){
            income = (float)(income-0.2* income);  //Needed to be type cast know it with proper logic-->left side float and right side double
        }
        else{
            income = (float)(income-0.3 * income);
        }

        System.out.println("after tax applied income is: " +income);
    }
}