import java.util.Scanner;

public class P5{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=5;
        int[][] arr =new int[n][n];
        
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0|| i==n-1 || j==n-1){
                    arr[i][j]=1;
                }
                if(i%2==0 && j %2==0 ){
                    arr[i][j]=1;
                }

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       
        
    }
}