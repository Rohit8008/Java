import java.util.Scanner;

public class Pattern14{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int s=1;
            while(s<=n-i)
            {
                System.out.print("  ");
                s++;
            }
            int j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
        i=1;
        while(i<n)
        {
            int s=1;
            while(s<=i)
            {
                System.out.print("  ");
                s++;
            }
            int j=1;
            while(j<=n-i)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * *
//   * * * *
//     * * *
//       * *
//         *