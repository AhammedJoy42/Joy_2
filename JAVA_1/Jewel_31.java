// Calculator :

import java.util.*;

public class Jewel_31 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the 2nd number: ");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.printf("What operation do you want to perform?");
        String operation = sc.nextLine();
        
        if(operation.equals("sum"))
        {
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        }
        else if(operation.equals("sub"))
        {
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
        }
        else if(operation.equals("mul"))
        {
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        }
        else if(operation.equals("div"))
        {   
            if(num2 == 0){
                System.out.printf("Can not divide by Zero");
            }
            else{
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
            
        }
        else
        {
            System.out.printf("%s is not supported operation.", operation);
        }

       sc.close();
    }
    }
    