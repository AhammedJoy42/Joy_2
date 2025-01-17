public class DemoJava_22 {
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int arr[] = {7,8,3,1,2};

         //time complexity = 0(n^2)
        //bubble sort
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[i]>arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
        }
        printArray(arr);
    }  
}
