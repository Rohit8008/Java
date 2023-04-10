import java.util.Scanner;

public class Pattern13{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        int k=n;
        while(i<=2*n-1)
        {
            if(i<=n)
            {
            int j =1;
                while(j<=i)
                {
                    System.out.print("* ");
                    j++;
                }
                i++;
                System.out.println();
            }
            else{
                int j=1;
                while(j<=k-1)
                {
                    System.out.print("* ");
                    j++;
                }
                k--;
                i++;
                System.out.println();
            }

        }
    }
}

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 