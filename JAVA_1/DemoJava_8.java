import java.util.*;
public class DemoJava_8 {
    public static void main(String[] args){
        System.out.println("Press a button:");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        //if(b == 1)
       // {
       //     System.out.println("Hello");
      //  }
      //  else if(b == 2)
      //  {
      //      System.out.println("Hi!");
      //  }
     //   else if(b== 3)
      //  {
     //       System.out.println("Asslamualikum");
      //  }
       // else
       // {
//System.out.println("Invalid");
     //}
     switch(b)
     {
case 1 : System.out.println("Hello");
break;
case 2 : System.out.println("Hi!");
break;
case 3 : System.out.println("Asslamualikum");
break;
default : System.out.println("Invalid");

     }
    }
    
}
