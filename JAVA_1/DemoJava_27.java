//Merge Sort
public class DemoJava_27{     
    // Time complexity: nlogn
    public static void conquer(int arr[], int si, int ei, int mid){
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        //o(n)
        while(idx1b <= mid && idx2 <= ei){
            if(arr[idx] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        for(int i = 0; j = si; i < merged.length; i++; j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //o(logn)
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, si, mid+1);
        conquer(arr, si, mid, ei); 
}
public static void main(String args []){
    int arr[] = {6,3,9,5,2,8};
    int n = arr.length;
    divide(arr, 0, n-1);
    for(int i = 0; i<n; i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();

}
}






















