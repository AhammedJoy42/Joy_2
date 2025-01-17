import java.util.*;
public class DemoJava_15{
    public static void main(String args[]){
        //int marks[] = new int[3];
       // marks[0] = 97;
       // marks[1] = 98;
       // marks[2] = 95;
      // int marks[] = {97,98,95};
        //System.out.println(marks[0]);
       // System.out.println(marks[1]);
       // System.out.println(marks[2]);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your size number:");
       int size = sc.nextInt();
       int marks[] = new int[size];
       //input
       for(int i = 0; i < size; i++){
       // System.out.println("Now enter your information:");
        marks[i] = sc.nextInt();
       }
       //output
       for(int i = 0; i < size; i++){
        System.out.println(marks[i]);
       }
    }
}