import java.util.HashMap;
import java.util.Map;
public class Jewel_14 {
    public static void main(String args []) {
        Map m = new HashMap();
        m.put("tim",5);
        m.put("joe", "x");
        m.put(11, 99);

        m.containsValue("joy");
        m.containsKey("nabila");

        System.out.println(m);
        System.out.println(m.get("tim"));
        System.out.println(m.get("joe"));
        System.out.println(m.get(11));

        System.out.println(m.get("nabila"));
        
        
    }
}
