package JavaNewPackage;

import java.util.Scanner;

public class IfSample {
    public static void manin(String[] ar)
    {
        System.out.println("Enter 2 numbers: ");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        if(num<0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is positive");
        }
    }

}
