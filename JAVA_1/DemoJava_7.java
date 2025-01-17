import java.util.*;

public class DemoJava_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        if(a == b)
        {
            System.out.println("Equal");
        }
        else if(a>b)
        {
            System.out.println("a is greater");
        }
        else 
        {
            System.out.println("a is lesser");
        }

    }
    
}
