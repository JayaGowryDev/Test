import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int[] array = {4,1,2,3,1,2,5,2};
         int n = array.length;
         int[] arr= new int[n];
        for(int i=0;i<n;i++){
            if(array[i]==1){
                arr[i]=2;
            }
            else if(array[i]==2){
                arr[i]=3;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
