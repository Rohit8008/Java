import java.util.Scanner;

public class Pattern30{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int j=n;
            while(j>=1)
            {
                System.out.print(j + " ");
                j--;
            }
            i++;
            System.out.println();
        }
    }
}

// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1