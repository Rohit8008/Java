import java.util.Scanner;

public class Pattern26{
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
                System.out.print(j+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

//         1
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9