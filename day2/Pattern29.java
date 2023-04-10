import java.util.Scanner;

public class Pattern29{
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
            while(j<=2*i-1)
            {
                if(j==1 || j==2*i-1)
                    System.out.print(i + " ");
                else
                    System.out.print("0 ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

//         1
//       2 0 2
//     3 0 0 0 3
//   4 0 0 0 0 0 4 
// 5 0 0 0 0 0 0 0 5