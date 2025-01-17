// Array List:
import java.util.ArrayList;
import java.util.Comparator;

public class Jewel_48 {
    public static void main(String args[]){
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(4);
        number.add(5);
        number.add(1);
        number.add(2);
        number.add(3);

     //  number.set(2, Integer.valueOf(30));
        number.sort(Comparator.naturalOrder());

        System.out.println(number.toString());
        System.out.println(number.size());
        System.out.println(number.contains(Integer.valueOf(3)));
        System.out.println(number.contains(Integer.valueOf(10)));

        System.out.println(number.isEmpty());
    }
}
