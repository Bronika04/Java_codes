public class func_overloading {
//Function overloading with the different number of parameters
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    public static void main(String args[]){
        System.out.println(sum(3,5));    
        System.out.println(sum(3.5f,9.9f));
    }
    
}
