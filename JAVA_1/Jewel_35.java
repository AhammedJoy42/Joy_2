// Array _ 3:
import java.util.Arrays;

public class Jewel_35 {
    public static void main(String args[]){
        char vowels[]= {'e', 'i', 'u', 'a', 'o'};

        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(vowels, startingIndex, endingIndex);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);


    }
}
