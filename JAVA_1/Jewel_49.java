// Array List:
import java.util.ArrayList;
//import java.util.Comparator;

public class Jewel_49 {
    public static void main(String args[]){
    ArrayList<Integer> number = new ArrayList<Integer>();
    
    number.add(4);
    number.add(5);
    number.add(1);
    number.add(2);
    number.add(3);

    
    number.forEach(number -> {
       System.out.println(number * 2);
    });

    System.out.println(number.toString());
    
}
}
