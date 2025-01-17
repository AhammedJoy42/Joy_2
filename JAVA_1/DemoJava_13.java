import java.util.*;
public class DemoJava_13 {
    public static int calculateProduct(int a, int b){
        int pro = a*b;
        return pro;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        int pro = calculateProduct(a,b);
        System.out.println("The product of 2 number is:"+calculateProduct(a,b));
    }
}
