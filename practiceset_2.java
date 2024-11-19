import java.util.*;

public class practiceset_2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println("Average is : " +avg);
        
        System.out.println("Input side of square");
        float side=s.nextFloat();
        float area=side*side;
        System.out.println("area of the sqaure is: " +area);
        
        float item1 = s.nextFloat();
        float item2 = s.nextFloat();
        float item3 = s.nextFloat();
        float  total = (item1+item2+item3);
        System.out.println("Bill is : " +total);
        float total_bill =  total+(0.18f)* total;
        System.out.println("Total bill after GST is:" +total_bill);
        int $=2;
        System.out.println($);
    }
}