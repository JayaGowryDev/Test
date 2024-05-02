import java.util.Scanner;

public class Lift_system{

    static void display(Lift lifts[],int n){
        System.out.println("The position of lift is");

        System.out.print(" Lift   : " );
        for(int i=0;i<n;i++){
            System.out.print("L" +(i+1) +" ");
        }
        System.out.print("\n Floor  : " );
        for(int i=0;i<n;i++){
            System.out.print(lifts[i].getFloor()[0]+ "  ");
        }
    }
    static void display1(Lift lifts[],int n,int destination){
        System.out.println("The position of lift is");

        System.out.print(" Lift   : " );
        for(int i=0;i<n;i++){
            System.out.print("L" +(i+1) +" ");
        }
        System.out.print("\n Floor  : " );
        
        for(int i=0;i<n;i++){
            int di= lifts[i].getDistination();
            for(int j=0;j<11;j++){
                
                if(lifts[i].getFloor()[j]==di ){
                    System.out.print(lifts[i].getFloor()[di]+ "  ");
                    break;
                }
                else if(lifts[i].getFloor()[j]==-1){
                    System.out.print(-1);
                    break;
                }
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("-----Lift System Project---- Started");
        System.out.print("Enter the number of lift ");
        System.out.print("Enter the capacity of the lift");
        int capacity=scan.nextInt();
        
        int n=scan.nextInt();
        Lift lifts[]=new Lift[n];
        scan.nextLine();
        for(int i=0;i<n;i++){
            
            System.out.print( "Lift "+(i+1) +"Setup Process :");
            System.out.println("Is Lift is work ? \n y - it is work   \n n- it is not work");
            String c=scan.nextLine();
           
            
            if(c.equals("y")){
                if(i==0 || i== 1){
                    int access_start=0;
                    int access_end=5;
                   // int floor[]=new int[11];
                    lifts[i]=new Lift(access_start, access_end, 11,0,0);

                }
                if(i==2 || i==3){
                    int access_start=6;
                    int access_end=10;
                   // int floor[]=new int[11];
                    lifts[i]=new Lift(access_start, access_end, 11,0,0);
                }
                if(i==4){
                    int access_start=0;
                    int access_end=10;
                   // int floor[]=new int[11];
                    lifts[i]=new Lift(access_start, access_end, 11,0,0);
                }
            }
            else{
                
                lifts[i]=new Lift(11);
                for(int k=0;k<11;k++){
                    lifts[i].setFloorPos(k, -1);
                }
            }
            
        }
        System.out.println("All lift are setup successfully");


        //  using lift;



        //display lift;
        display(lifts, n);
        
        int value=1;
       while(value==1){
        System.out.print("\nEnter the Current Floor : ");
        int source=scan.nextInt();
        System.out.print("Enter the destination Floor ");
        int destination=scan.nextInt();
        System.out.println("Do you want to continue");
         value=scan.nextInt();
         


        int minnear=11;
        for(int i=0;i<n;i++){
            if(lifts[i].getAccess_start()<=source && lifts[i].getAccess_end()>=destination && lifts[i].getFloor()[0]!=-1){
                int val= lifts[i].getDistination();
                int near = Math.abs(source-val);
                if(near <=minnear){
                    lifts[i].setFloor(destination);
                    lifts[i].setDistination(destination);
                    break;

                }
               
                
            }
            
        }
        display1(lifts, n,destination);
       }
        // Assign lift to the user
        
        
        



    }
}