import java.util.*;
public class DemoJava_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n == 0)
        {
            System.out.println("Neither Even nor Odd");
        }
        else if(n%2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
