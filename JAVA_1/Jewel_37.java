// Array _ 5:
import java.util.Arrays;

public class Jewel_37 {
     public static void main(String args[]){
        char vowels[]= {'e', 'i', 'u', 'a', 'o'};

      //  Arrays.sort(vowels);

        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.fill(vowels, startingIndex, endingIndex, 'x');
       // int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);
        System.out.println(Arrays.toString(vowels));
    
    }
    
}

    

