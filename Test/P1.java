import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner scan =new Scanner(System.in);
        char input= scan.next().charAt(0);

        int n=input-'A' +1;
        
        char c = 'A'; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print(c);

            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
            }
            c++;
            System.out.println();
        }

       c--;
       c--;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.print(c);
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
            }
            c--;
            System.out.println();
        }

    }
}
