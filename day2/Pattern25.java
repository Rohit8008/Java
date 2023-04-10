import java.util.Scanner;

public class Pattern25{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        int var=1;
        while(i<=n)
        {
            int s=1;
            while(s<=n-i)
            {
                System.out.print("    ");
                s++;
            }
            int j=1;
            while(j<=2*i-1)
            {
                System.out.print(" "+var +" ");
                if(var<=9)
                System.out.print(" ");

                var++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

//                  1  
//              2   3   4
//          5   6   7   8   9
//      10  11  12  13  14  15  16
//  17  18  19  20  21  22  23  24  25