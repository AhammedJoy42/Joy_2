import java.util.Scanner;
public class Jewel_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your thought: ");
        String s = sc.nextLine();
    

        if(s.equals("tim")){
            System.out.println("You typed tim");
        }
        else if(s.equals("hello")){
            System.out.println("Hi");
        }
        else if(s.equals("hi")){
            System.out.println("hello");
        }
        else{
           System.out.println("print");
       }
       // System.out.println("hello");
    }
    
}
