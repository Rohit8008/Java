import java.util.Scanner;

public class Pattern15{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int s=1;
            while(s<=2*(i-1))
            {
                System.out.print("  ");
                s++;
            }
            int j=1;
            while(j<=n-i+1)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}