import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of element : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        // int arr[] = {1,2,3};

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

    }
}