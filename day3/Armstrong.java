import java.util.Scanner;
import java.lang.Math;
public class Armstrong{

    static int count(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int p=count(n);
        int temp=n;
        int sum=0;
        while(n!=0)
        {
            int rem = n%10;
            sum=sum + (int)(Math.pow(rem,p));
            n/=10;
        }
        if(sum==temp)
            System.out.print("Armstrong");
        else
            System.out.print("Not Armstrong");

    }
}