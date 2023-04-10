import java.util.Scanner;

public class StarPattern7{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                if(i==1 || i==n || j==1 || j==n )
                    System.out.print("* ");
                else
                    System.out.print("  ");
                
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * *