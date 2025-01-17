// Array List:
import java.util.ArrayList;

public class Jewel_47 {
    public static void main(String args[]){
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        
        number.remove(2);
        number.remove(Integer.valueOf(2));
        System.out.println(number.toString());

        System.out.println(number.get(1));

    }
    
}
