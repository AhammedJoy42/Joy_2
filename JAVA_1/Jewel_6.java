
import java.util.Scanner;
public class Jewel_6 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x = sc.nextInt();

        if(x >= 18) {
            System.out.print("Input your fav food: ");
            String food = sc.nextLine();
            if(food.equals("pizza")) {
                System.out.println("Mine too");
            }
            else {
                System.out.println("Not Mine");
            }
            System.out.println("You are an adult");
        }
        else if(x >= 13) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are not a teenager or an adult");
        }

    }
}
