// Hash Map:
import java.util.HashMap;

public class Jewel_53 {
    public static void main(String args[]){
        HashMap<String,Integer> examScore = new HashMap<String,Integer>();
        
        examScore.put("Math", 75);
        examScore.put("Sociology", 85);
        examScore.put("English", 95);
        examScore.put("Bengali", 100);
        examScore.put("CP", 100);

        examScore.forEach(subject, score) -> {
            System.out.println(subject + " - " + score);
        }); 
}
}

