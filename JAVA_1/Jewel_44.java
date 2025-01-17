// for loop _ 6:
public class Jewel_44 {
    public static void main(String args[]){
        for(int i = 0; i <= 50; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        int numbers[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int num : numbers)
        {   
            sum += num;
            System.out.println(num);
        }
        System.out.println(sum);
    }
    
}
