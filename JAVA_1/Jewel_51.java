// Hash Map:
import java.util.HashMap;

public class Jewel_51 {
    public static void main(String args[]){
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        examScore.put("Math", 75);
        examScore.put("Physics", 90);
        examScore.put("Chemistry", 85);
        examScore.put("Biology", 95);
        
       
        System.out.println(examScore.toString());
        System.out.println(examScore.get("Math"));
        System.out.println(examScore.get("Chemistry"));

    }
}
