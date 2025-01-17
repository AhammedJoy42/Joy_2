import java.util.*;
public class Jewel_30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.printf("Hello %s. How are you?", name);
        
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.printf("%d is an excellent time to start programming. What language do you prefer?", age);
        String language = sc.nextLine();
        System.out.printf("%s is very popular.", language);


        sc.close();
    }
    
}
