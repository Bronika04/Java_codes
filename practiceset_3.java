import java.util.*;

public class practiceset_3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float num = sc.nextFloat();

        // if(num>=0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }

        String output = (num>=0)?"positive":"negative";
        System.out.println(output);

        Scanner s = new Scanner(System.in);
        float temp = s.nextFloat();

        if(temp>100){
            System.out.println("Fever");
        }
        else{
            System.out.println("Don't");
        }

       Scanner input = new Scanner(System.in);
       System.out.println("Enter choice (1-7)");
        int ch = input.nextInt();
        switch(ch){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturdat"); break;
            default: System.out.println("Wrong choice");
        }

        Scanner inp = new Scanner (System.in);
        System.out.println("Input Year");
        int year = inp.nextInt();
        if(year % 4==0){
            if(year % 100 == 0){
                if( year % 400 == 0){
                    System.out.println("Leap Year");
                }
        // else{
        //     System.in.println("Not");
        // }
            }
        // else{
        //     System.in.println("Not");
        // }
        }
        else{
            System.out.println("Not");
        }
    }
}