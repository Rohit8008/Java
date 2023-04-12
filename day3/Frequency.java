import java.util.*;

public class Frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] fr = new int[arr.length];
        int visited=-1;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited)
            {
                fr[i]=count;
            }
        }
        System.out.println(" Element | Frequency"); 
        for(int i = 0; i < fr.length; i++)
        {  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
    }
}