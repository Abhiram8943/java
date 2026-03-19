import java.util.Scanner;

public class PrintInput {
    public static void main(String[] args)
    {
        System.out.println("enter 2  numbers: ");
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println("the numbers are"+a+"  "+b);

    }

}
