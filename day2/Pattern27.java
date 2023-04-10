import java.util.Scanner;

public class Pattern27{
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
            int var=1;
            int j=1;
            while(j<=i)
            {
                System.out.print(var+" ");
                var++;
                j++;
            }
            int k=1;
            var=var-2;
            while(k<i)
            {
                System.out.print(var+" ");
                k++;
                var--;
            }
            i++;
            System.out.println();
        }
    }
}

//         1 
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1