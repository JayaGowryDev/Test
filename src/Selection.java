import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[] ={10,44,2,79,4,1,99};
        int n=arr.length;
        int minIndex=Integer.MAX_VALUE;
        
        for(int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
