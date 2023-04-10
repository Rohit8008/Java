import java.util.*;
public class StarPattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int i=n;
        while(i>=1)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*" + " ");
                j++;
            }
            i--;
            System.out.println();
        }
    }
}

// * * * * *
// * * * *
// * * *
// * *
// *