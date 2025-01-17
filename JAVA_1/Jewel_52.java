// Hash Map:
import java.util.HashMap;

public class Jewel_52 {
    public static void main(String args[]){
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();
        
        examScore.put("Math", 75);
        examScore.put("Sociology", 85);
        examScore.put("English", 95);
        examScore.put("Bengali", 100);
        examScore.put("CP", 100);

       // examScore.replace("Math", 70);

       //examScore.clear();
       examScore.remove("Sociology");

        System.out.println(examScore.getOrDefault("Religion", -1));
        System.out.println(examScore.toString());

        System.out.println(examScore.containsKey("English"));
        System.out.println(examScore.containsKey("Sociology"));
        System.out.println(examScore.containsKey("Biology"));
        System.out.println(examScore.containsValue(100));
        System.out.println(examScore.containsValue(92));
    }
    
}
