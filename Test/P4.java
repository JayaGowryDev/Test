import java.util.ArrayList;
import java.util.List;

public class P4 {
    public static void main(String[] args) {
        int[] arr ={2,7,5,-1,-3,2,9,7};
        int n=arr.length;
        int max_sum=-1;
        int sum=0;
        List<Integer> val=new ArrayList<Integer>();
        List<Integer> max_val=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(sum>max_sum){
                    max_sum=sum;
                    max_val=val;
                }
                sum=0;
                while(!val.isEmpty()){
                    val.removeLast();
                }
                continue;
            }
            sum+=arr[i];
            val.add(arr[i]);
        }
        System.out.println(val);
        System.out.println(sum);
    }
}
