import java.util.Set;
import java.util.TreeSet;
public class Jewel_12 {
    public static void main(String args[]) {
       // Set<Integer> t = new HashSet<Integer>();
       Set<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(6);
        t.add(7);
        t.add(8);
        t.add(9);
       // t.remove(9);
        t.size();


        int x = t.size();
        System.out.println(t);
        System.out.println(x);
    }
}