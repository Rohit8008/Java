import java.util.Scanner;

public class Pattern28{
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
            int var=i;
            int j=1;
            while(j<=i)
            {
                System.out.print(var + " ");
                var++;
                j++;
            }
            j=1;
            var=var-2;
            while(j<i)
            {
                System.out.print(var + " ");
                var--;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

//         1
//       2 3 2
//     3 4 5 4 3
//   4 5 6 7 6 5 4 
// 5 6 7 8 9 8 7 6 5