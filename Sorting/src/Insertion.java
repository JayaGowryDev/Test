import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int currentValue=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currentValue){
                arr[j + 1] = arr[j]; 
                j = j - 1;
            }
            arr[j + 1] = currentValue; 
        }
        System.out.println(Arrays.toString(arr));
    }
}
