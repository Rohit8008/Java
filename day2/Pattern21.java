import java.util.Scanner;

public class Pattern21{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int row=1;
        int leftstr=1;
        int rightstar=1;
        int middlespace=2*n-3;
        while(row<=n)
        {
            int left=1;
            if(row==n)
                leftstr--;
            while(left<=leftstr)
            {
                System.out.print("* ");
                left++;
            }
            int sp=1;
            while(sp<=middlespace)
            {
                System.out.print("  ");
                sp++;
            }
            int right=1;
            while(right<=rightstar)
            {
                System.out.print("* ");
                right++;
            }
            row++;
            leftstr++;
            rightstar++;
            middlespace=middlespace-2;
            System.out.println();
        }
    }
}

// *                       *
// * *                   * *
// * * *               * * *
// * * * *           * * * *
// * * * * *       * * * * *
// * * * * * *   * * * * * *
// * * * * * * * * * * * * *