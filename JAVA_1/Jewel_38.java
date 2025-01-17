// Array _ 6
import java.util.Arrays;

public class Jewel_38 {
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 4, 5};

        int startingIndex = 1;
        int endingIndex = 4;
       // int copyOfNumbers[] = numbers;
       // int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
       // int copyOfNumbers[] = Arrays.copyOf(numbers, 10);
        int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));


    }
    
}
