import java.util.Scanner;

public class Pattern32{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=2*i-1)
            {
                if(j%2==0)
                    System.out.print("* ");
                else
                    System.out.print(i + " ");
                j++;
            }
            j=1;
            i++;
            System.out.println();
        }
        i=n-1;
        while(i>=1)
        {
            int j=1;
            while(j<=2*i-1)
            {
                if(j%2==0)
                    System.out.print("* ");
                else
                    System.out.print(i + " ");
                j++;
            }
            i--;
            System.out.println();
        }
    }
}

// 1
// 2 * 2
// 3 * 3 * 3
// 4 * 4 * 4 * 4
// 5 * 5 * 5 * 5 * 5
// 4 * 4 * 4 * 4
// 3 * 3 * 3
// 2 * 2
// 1