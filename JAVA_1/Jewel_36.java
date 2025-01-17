// Array _ 4:
import java.util.*;
public class Jewel_36 {
    public static void main(String args[]){
        char vowels[]= {'e', 'i', 'u', 'a', 'o'};

        Arrays.sort(vowels);

        int startingIndex = 1;
        int endingIndex = 4;

        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);
        System.out.println(vowels.length);
    }
    
}
