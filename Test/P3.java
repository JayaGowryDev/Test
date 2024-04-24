
import java.util.Scanner;

public class P3 {
    static void sumArray(int a[] , int b[] ,int n, int m){
        int[] val= new int[n];
        int i = n - 1; 
        int j = m - 1;
        int k = n - 1;
        int carry =0;
        int sum=0;
        while (j >= 0) 
	   {
			sum = a[i] + b[j] + carry;
			val[k] = (sum % 10);
			carry = sum / 10;
			k--;
			i--;
			j--;
		}
        while (i >= 0) 
		{
			sum = a[i] + carry;
			val[k] = (sum % 10);
			carry = sum / 10;
			i--;
			k--;
		}
	   
		for(int l=0;l<n;l++){
            System.out.print(val[l] +" ");
        }



    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number of digits in first array");
        int n = scan.nextInt();
        
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=scan.nextInt();
        }
        
        System.out.println("Enter number of digits in second array");
        int m=scan.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=scan.nextInt();
        }

        if (n >= m){
            sumArray(arr1, arr2, n, m);
        }
        else{
            sumArray(arr2, arr1, m, n);
        }

        

    }
}



	
