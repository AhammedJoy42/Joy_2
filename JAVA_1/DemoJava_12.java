import java.util.*;

public class DemoJava_12 {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number:");
    int a = sc.nextInt();
    System.out.println("Enter 2nd number:");
    int b = sc.nextInt();
    int sum = calculateSum(a,b);
    System.out.println("Sum of 2 numbers: "+sum);
    }
}
