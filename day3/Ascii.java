import java.util.*;

public class Ascii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // char ch = sc.next().charAt(0);
        // System.out.print(ch);

        for(int i=0;i<=255;i++)
        {
            System.out.println(i +  " === " + (char)i);
        }
        
    }
}