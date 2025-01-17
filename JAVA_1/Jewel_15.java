import java.util.HashMap;
import java.util.Map;
public class Jewel_15 {
    public static void main(String args[]) {
        Map m = new HashMap();
        String str = "hello my name is joy and i am cool";
        System.out.println(str.toCharArray());

        for(char x:str.toCharArray()){
            if(m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else {
                m.put(x, 1);
            }

        }
        m.remove(' ');
        System.out.println(m);
    }
    
}
